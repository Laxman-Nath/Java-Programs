// Create a class Account and inherits two classes SavingsAccount and LoanAccount from class Account
package inheritancepractice2;
class Account{
    public int accno;
    public String name;
    public String address;
    public long phoneno;
    public String dob;
    public double balance;
    public Account(){
    }
    public Account(int a,String n,String ad){
        accno=a;
        name=n;
        address=ad;
    }
      public Account(int a,String n,String ad,long ph,String date,double blnc){
        accno=a;
        name=n;
        address=ad;
        phoneno=ph;
        dob=date;
        balance=blnc;
    }
    public int getAcc(){
        return accno;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public long getPhoneNO(){
        return phoneno;
    }
    public String getDate(){
        return dob;
    }
    public double getBalance(){
        return balance;
    }
    public void setAddress(String A){
        address=A;
    }
    public void setPhoneNo(long p){
        phoneno=p;
    }
    public void setBalance(double b){
        balance=b;
    }
    public void closeAccount(){
        System.out.println("Your account have been closed:");
    }
}

class SavingsAccount extends Account{
    public void deposit(int amount){
        balance=balance+amount;
        System.out.println("Congratulations,you have successfully deposited "+amount+" in your account:");
        System.out.println("Your new balance is:"+amount);
    }
    public void withdraw(int amount){
        balance=balance-amount;
        System.out.println("Congratulations,you have successfully withdraw "+amount+" from your account:");
        System.out.println("Your remaining balance is:"+amount);
    }
    public void fixedDeposit(int amount){
        System.out.println("Congratulations, you have fixed deposited Rs."+amount);
    }
}
class LoanAccount extends Account{
    public void payEMI(int amount){
        System.out.println("Congratulations you have paid:Rs"+amount);
    }
    public void topUpLoan(int loan){
        System.out.println("Congratulations,you have been grant the loan of amount Rs."+loan);
    }
}

public class InheritancePractice2 {

   
    public static void main(String[] args) {
        Account a2=new Account(123,"laxman","daijee",8778,"2020-7-23",7899.23);
       SavingsAccount a1=new SavingsAccount();
       a1.setAddress("mnr");
       System.out.println(a1.getAcc());
       System.out.println(a2.getAcc());
       System.out.println(a2.getAddress());
       System.out.println(a1.getAddress());
       
    }
    
}
