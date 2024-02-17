
package menudrivenprogramforaccount;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;
import javax.swing.text.html.HTML;
class Account implements Serializable{
    int accno;
    String name;
    int balance;

    public Account() {
    }
    
   public  Account(int a,String n,int b){
        this.accno=a;
        this.name=n;
        this.balance=b;
    
   }
   @Override
   public String toString(){
      return "Account number "+this.accno+" Name "+this.name+" Amount "+this.balance;
   }
}

public class MenudrivenProgramforaccount {
    static void create_account(HashMap<Integer,Account> h1){
         int acc;
        String name;
        int balance;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter account no");
        acc=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter your name");
        name=sc.nextLine();
        System.out.println("Enter amount to be deposited");
        balance=sc.nextInt();
        Account a=new Account(acc, name, balance);
        h1.put(acc, a);
        System.out.println("Account create successfully!");
    }
    static void delete_account(HashMap<Integer,Account> h1){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your account number:");
         int acc=sc.nextInt();
        h1 .remove(acc);
        System.out.println("Account deleted successfully");
        
    }
    
    static void view_account(HashMap<Integer,Account> h1){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your account number:");
          int acc=sc.nextInt();
         System.out.println(  h1.get(acc));
        
    }
    
    static void viewall_account(HashMap<Integer,Account> h1){
        for(Account x:h1.values()){
            System.out.println(x);
    }
    }
    public static void main(String[] args) throws Exception {
         HashMap<Integer,Account> h1=new HashMap<>();
        int choice;
        Scanner sc=new Scanner(System.in);
        try{
            FileInputStream fis=new FileInputStream("D://Account.txt");
            ObjectInputStream ois=new ObjectInputStream(fis);
            int count=ois.readInt();
            for(int i=0;i<count;i++){
               Account acc =(Account)ois.readObject();
               System.out.println(acc);
               h1.put(acc.accno, acc);
            }
            ois.close();
            fis.close();
        
        }
        catch(Exception e){}
        
       do{
           System.out.println("****************************************************************************");
           System.out.println("1.Create account");
           System.out.println("2.Delete account");
           System.out.println("3.View account");
           System.out.println("4.View all account");
           System.out.println("5.Save account");
           System.out.println("6.Exit");
           System.out.println("*********************************************************************");
           System.out.println("Enter your choice:");
        choice=sc.nextInt();
        switch (choice) {
            case 1:
                create_account(h1);
                break;
            case 2:
                
                delete_account(h1);
                break;
            case 3:
           view_account(h1);
            break;
            case 4:
                viewall_account(h1);
               break;
            case 5:
            case 6:
                FileOutputStream fos=new FileOutputStream("D://Account.txt");
                ObjectOutputStream oos=new ObjectOutputStream(fos);
                oos.writeInt(h1.size());
                for(Account a:h1.values()){
                    oos.writeObject(a);
                } 
                System.out.println("Account saved successfully");
        }
       }while(choice!=6);
        
    }
    
}
