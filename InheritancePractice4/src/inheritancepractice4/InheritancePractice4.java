// Create a class Customer and inherit another class Member using class Customer
package inheritancepractice4;
class Customer{
    public String name;
    public long phone;
    public void payBill(){
        System.out.println("Paying bill........");
    }
}
class Member extends Customer{
    public int custid;
    public String address;
    public String dob;
    public void callback(){
        System.out.println("Calling back.....");
}
}
public class InheritancePractice4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Member m1=new Member();
        m1.name="Laxman";
        m1.phone=35637;
        m1.custid=12;
        m1.address="daijee";
        m1.dob="2021/2/23";
        m1.payBill();
        m1.callback();
    }
    
}
