// Write  a java program to create a class for cylinder using suitable properties and methods
package ooppractice3;

class Cylinder{
    public double radius;
    public double height;
    public double lidArea(){
       return Math.PI*radius*radius;
    }
    public double circumference(){
        return 2*Math.PI*radius;
    }
    public double totalSurfaceArea(){
        return  circumference()*height+2*lidArea();
    }
    public double volume(){
        return lidArea()*height;
    }
}

public class OOPPractice3 {

  
    public static void main(String[] args) {
        Cylinder c1=new Cylinder();
        c1.radius=7;
        c1.height=10;
        System.out.println("Lidarea:"+c1.lidArea());
        System.out.println("Circumference:"+c1.circumference());
        System.out.println("TotalSurfaceArea:"+c1.totalSurfaceArea());
        System.out.println("Volume:"+c1.volume());
        
    }
    
}
