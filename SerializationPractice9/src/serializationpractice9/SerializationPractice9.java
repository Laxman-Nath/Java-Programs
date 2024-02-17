// Create a class customer,create it's array and store it in a file
package serializationpractice9;
import java.io.*;
import java.util.Scanner;
class customer implements Serializable{
    String custId;
    String name;
    String phoneNo;
    static int count=0;
    public customer(){}
    public customer(String n,String p){
        custId="C"+count;
        count++;
        name=n;
        phoneNo=p;
    }
    @Override
    public String toString(){
        return "custId:"+custId+" name:"+name+" phone no "+phoneNo;
    }
    
}
public class SerializationPractice9 {
//    public static void main(String[] args) throws Exception {
//        customer c1=new customer("Laxman","8589");
//        customer c2=new customer("Rohit","8579");
//        customer c3=new customer("Bikash","8509");
//        customer c4=new customer("Bibek","8529");
//        customer list[]={c1,c2,c3,c4};
//        FileOutputStream fos=new FileOutputStream("C://MyJava/customers.txt");
//        ObjectOutputStream oos=new ObjectOutputStream(fos);
//        oos.writeInt(list.length);
//        for(customer c:list)
//             oos.writeObject(c);
//        
//        oos.close();
//        fos.close();
//        
//    }
    
        public static void main(String[] args) throws Exception {
        FileInputStream fis=new FileInputStream("C://MyJava/customers.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        int length=ois.readInt();
        customer c[]=new customer[length];
        for(int i =0;i<length;i++){
            c[i]=(customer) ois.readObject();
        }
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name of customer:");
        String name=sc.nextLine();
        
        for(int i=0;i<length;i++){
            if(name.equalsIgnoreCase(c[i].name)){
                System.out.println(c[i]);
            }
        }
        
        
        
        \
        
        
        ois.close();
        fis.close();
        
    }
    
}
