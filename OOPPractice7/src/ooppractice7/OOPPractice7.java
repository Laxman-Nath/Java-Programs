// Write a java program to create a class television with suitable property and methods
package ooppractice7;
class Television{
    private String name;
    private int CurrNo;
    private int volume;
    public void switchOn(){
        System.out.println("Switching on.....");
    }
    public void switchOff(){
        System.out.println("Switching off....");
    }
    public void changeChannel(){
        System.out.println("Changing channel:");
    }
    public void increaseVolume(){
        System.out.println("Incresing volume....");
    }
    public void getData(String n,int c,int v){
        name=n;
        CurrNo=c;
        volume=v;
    }
    public void ShowData(){
        System.out.println("Details of television are:");
        System.out.println("Name:"+name);
        System.out.println("Currentchannel number:"+CurrNo);
        System.out.println("Volume:"+volume);
}
}

public class OOPPractice7 {

    
    public static void main(String[] args) {
       Television t=new Television();
       t.getData("Svmsung", 2, 25);
       t.ShowData();
       t.switchOn();
       t.changeChannel();
       t.switchOff();
    }
    
}
