// Write a java program to write a class for circle using suitable properties and methods
package ooppractice1;
class circle{
   public double  radius;
    public double area(){
        return Math.PI * radius* radius;
    }
    public double perimeter(){
        return 2*Math.PI*radius;
    }
    public double circumference(){
        return perimeter();
    }
}
public class OOPPractice1 {

    
    public static void main(String[] args) {
        circle c1=new circle();
        circle c2=new circle();
        c1.radius=7;
        c2.radius=14;
        System.out.println("Area1:"+c1.area());
        System.out.println("Perimeter1:"+c1.perimeter());
        System.out.println("Circumference1:"+c1.circumference());
         System.out.println("Area2:"+c2.area());
        System.out.println("Perimeter2:"+c2.perimeter());
        System.out.println("Circumference2:"+c2.circumference());
         }
    
}
