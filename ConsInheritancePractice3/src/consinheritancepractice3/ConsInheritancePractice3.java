// Write a java program to create a class Rectangle and inherits another class Cuboid using suitable constructors
package consinheritancepractice3;

class Rectangle{
    int length,breadth;
    Rectangle(){
        length=breadth=1;
    }
    Rectangle(int l,int b){
        length=l;
        breadth=b;
    }
}
class Cuboid extends Rectangle{
    int height;
    Cuboid(){
//        super(2,3);-> This will call parameterized constructor of class Rectangle insted of non-parameterized
        height=1;
    }
    Cuboid(int h){
        super(4,5);
        height=h;
    }
    Cuboid(int l,int b, int h){
        super(l,b);
        height=h;
    }
    int volume(){
        return length*breadth*height;
    }
}
        
public class ConsInheritancePractice3 {

   
    public static void main(String[] args) {
        Cuboid c1=new Cuboid();
        Cuboid c2=new Cuboid(6);
        Cuboid c3=new Cuboid(2,3,4);
        System.out.println("Volume of cylinder c1:"+c1.volume());
        System.out.println("Volume of cylinder c2:"+c2.volume());
        System.out.println("Volume of cylinder c3:"+c3.volume());
        
    }
    
}
