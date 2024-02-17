// Another example for abstract class
package abstractclasspractice4;
abstract class Shape{
   abstract void area();
   abstract void perimeter();
   void intro(){
       System.out.println("I'm laxman nath..");
   }
}   
class Circle extends Shape{
    float radius;
    void getRadius(float r){
        radius =r;
    }
    void area(){
        System.out.println("The area of circle is:"+Math.PI*radius*radius);
    }
    void perimeter(){
        System.out.println("The perimeter of a circle is:"+2*Math.PI*radius);
    }
}
class Rectangle extends Shape{
    int length, breadth;
    void getData(int l,int b){
        length=l;
        breadth=b;
    }
    void area(){
        System.out.println("The area of a rectangle is:"+length*breadth);
    }
    void perimeter(){
        System.out.println("The perimeter of a rectangle is:"+2*(length+breadth));
    }
}
public class AbstractClassPractice4 {

    
    public static void main(String[] args) {
       Shape s=new Circle();
       Circle c=new Circle();
       Rectangle r=new Rectangle();
       c.getRadius(2.5f);
       c.area();
       c.perimeter();
       r.getData(2,3);
       r.area();
       r.perimeter();
       
    }
    
}
