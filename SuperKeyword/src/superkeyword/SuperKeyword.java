// Illustrating the use of super keyword in java
package superkeyword;
class Rectangle{
    int length;
    int breadth;
    int x=10;
    Rectangle(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    void display(){
        System.out.println("Length:"+this.length);
        System.out.println("Breadth:"+this.breadth);
    }
}

class Cuboid extends Rectangle{
    int height;
    int x=5;
    Cuboid(int l,int b,int height){
        super(l,b);
        this.height=height;
    }
    void show(){
        System.out.println("x="+super.x);
        System.out.println("x="+x);
    }
}

public class SuperKeyword {

   
    public static void main(String[] args) {
        Cuboid c1=new Cuboid(1,2,3);
        c1.display();
        c1.show();
    }
    
}
