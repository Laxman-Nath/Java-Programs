// Write a java program to create a class customer with necessary properties,methods and constructors
package constructorspractice4;
class Customer{
    private int custid;
    private String name;
    private String address;
    private String phno;
    public int  getId(){
        return custid;
    }
    public String getName(){
        return name;
    }
    public void setAddress(String a){
        address=a;
    }
    public String getAddress(){
        return address;
    }
    public void setPhone(String p){
        phno=p;
    }
    public String getPhone(){
        return phno;
    }
    public Customer(int i){
        custid=i;
    }
    public Customer(int i,String n){
        custid=i;
        name=n;
    }
    public Customer(int i,String n,String a){
        custid=i;
        name=n;
        address=a;
    }
    public Customer(int i,String n,String a,String p){
        custid=i;
        name=n;
        address=a;
        phno=p;
    }
            
    
}
public class ConstructorsPractice4 {

    
    public static void main(String[] args) {
        Customer c1=new Customer(1);
        Customer c2=new Customer(2,"Laxman");
        Customer c3=new Customer(3,"Bikash","mnr");
        Customer c4=new Customer(4,"harish","Beldadi","+89066566");
    }
    
}
