// Write a java code to create a class Rectangle with suitable properties to demonstrate constructors
package constructorspractice1;
class Rectangle{
    private int length;
    private int breadth;
    public Rectangle(){
        length=1;
        breadth=1;
    }
    public Rectangle(int l,int b){
        if(l<0 || b<0)
        {
            length=0;
            breadth=0;
        }
        else{
        length=l;
        breadth=b;
        }
    }
    public Rectangle(int s){
        if(s<0)
        {
         length=0;
         breadth=0;
        }
        else{
        length=s;
        breadth=s;
        }
    }
    public int area(){
        return length*breadth;
    }
}
public class ConstructorsPractice1 {

    
    public static void main(String[] args) {
        Rectangle r1=new Rectangle();
        Rectangle r2=new Rectangle(-2,3);
        Rectangle r3=new Rectangle(-4);
        System.out.println("The area for rectangle r1 is:"+r1.area());
        System.out.println("The area for rectangle r2 is:"+r2.area());
        System.out.println("The area for rectangle r3 is:"+r3.area());
    }
    
}
