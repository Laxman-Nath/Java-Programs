// Create a class  Cellphone and inherits another class Smartphone using class Cellphone
package inheritancepractice3;
class CellPhone{
    long phone;
    int imie;
    public void call(){
        System.out.println("Calling...");
}
    public void sms(){
        System.out.println("Sending sms.....");
    }
    public void saveContact(){
        System.out.println("Saving Contact.....");
    }
    public void deleteContact(){
        System.out.println("Deleting contat....");
    }
}
class SmartPhone extends CellPhone{
    public int mac;
    public void music(){
        System.out.println("Playing music.....");
    }
    public void capture(){
        System.out.println("Clickling .....");
    }
}
public class InheritancePractice3 {

    public static void main(String[] args) {
        SmartPhone s1 =new SmartPhone();
        s1.call();
        s1.sms();
        s1.saveContact();
        s1.deleteContact();
        s1.music();
        s1.capture();
    }
    
}
