// Write a java program to create a class named car with suitable properties and methods
package ooppractice6;
class Car{
    private String name;
    private String reg;
    private String color;
    private double fuelQty;
    public void setData(String n,String r,String c,double f){
        name=n;
        reg=r;
        color=c;
        fuelQty=f;
    }
    
    public void ShowData(){
        System.out.println("Details of car are:");
        System.out.println("Name:"+name);
        System.out.println("Regno:"+reg);
        System.out.println("Color:"+color);
        System.out.println("Fuel Quantity:"+fuelQty);
    }
}
public class OOPPractice6 {

    public static void main(String[] args) {
        Car c=new Car();
        c.setData("Laxman", "1Ad45", "blue", 100.0);
        c.ShowData();
    }
    
}
