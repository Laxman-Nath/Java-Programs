// Write a java program to overload method to calculate area of different shapes.
package methodoverloadingpractice2;
public class MethodOverloadingPractice2 {
    static int area(int l,int b){
        return l*b;
    }
    static double area(float r){
        return Math.PI*r*r;
    }
    static double area(int a,int b,float h){
        return 0.5*(a+b)*h;
    }
    public static void main(String[] args) {
         System.out.println("The area of rectangle is:"+area(2,3));
         System.out.println("The area of circle is:"+area(2.5f));
         System.out.println("The area of trapezium is:"+area(1,2,3.0f));
    }
    
}
