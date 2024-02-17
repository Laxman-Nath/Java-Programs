// Write a java program to overload perimeter method for square,rectangle and triangle
package methodoverloadingpractice5;


public class MethodOverloadingPractice5 {
   static int peri(int s){
       return 4*s;
   }
   static int peri(int a,int b){
       return 2*(a+b);
   }
   static int peri(int c,int d,int e){
       return c+d+e;
   }
    
    public static void main(String[] args) {
        System.out.println("The perimeter of square is:"+peri(5));
        System.out.println("The perimeter of rectangle is:"+peri(1,2));
        System.out.println("The perimeter of triangle is:"+peri(1,2,3));
    }
    
}
