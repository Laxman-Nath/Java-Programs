// Write a java program to create a class Account with necessary properties and methods
package ooppractice5;
 
class Account{
    public long accno;
    public String name;
    public double balance;
    public void deposit(int amount){
        balance=balance+amount;
        System.out.println("Successfully deposited Rs."+amount+" in your account");
        System.out.println("Your new balance is:"+balance);
   }
    public void withdraw(int amount){
         if(balance>=amount)
        {
        balance=balance-amount;
        }
        else{
            System.out.println("You dont't have enough balance in your account:");
            System.exit(0);
        }
    
    System.out.println("Succesfully withdraw Rs."+amount+" from your account:");
    System.out.println("Your remaining balance is:"+balance);
}
    public void getDetails(){
        System.out.println("The details of customer are:");
        System.out.println("Account number:"+accno);
        System.out.println("Name:"+name);
        System.out.println("Balance:"+balance);
    }
}

public class OOPPractice5 {


    public static void main(String[] args) {
        Account a=new Account();
        a.name="laxman";
        a.balance=20000;
        a.accno=1267567;
        a.deposit(2000);
        a.withdraw(1000);
        a.getDetails();
    }
    
}
