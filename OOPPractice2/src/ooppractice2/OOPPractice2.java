// Write a suitable class named rectangle using appropriate properties and methods in java
package ooppractice2;
class Rectangle{
    public int length;
    public int breadth;
    public int area(){
        return length*breadth;
    }
    public int perimeter(){
        return 2*(length+breadth);
    }
    public boolean isSquare(){
        if(length==breadth){
            return true;
        }
        else{
            return false;
        }
    }
}
public class OOPPractice2 {

        public static void main(String[] args) {
        Rectangle r1=new Rectangle();
        r1.length=2;
        r1.breadth=3;
        System.out.println("Area:"+r1.area());
        System.out.println("Perimeter:"+r1.perimeter());
        System.out.println("Is it a square:"+r1.isSquare());
    }
    
}
