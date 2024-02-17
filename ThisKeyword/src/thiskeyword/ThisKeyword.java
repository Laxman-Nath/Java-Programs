// Illustrating the use of this keyword in java
package thiskeyword;
class Rectangle{
    int length;
    int breadth;
    Rectangle(int length,int breadth)
    {
       this. length=length;
        this.breadth=breadth;
    }
    void display(){
        System.out.println("Length:"+this.length);
        System.out.println("Breadth:"+this.breadth);
    }
}

public class ThisKeyword {

 
    public static void main(String[] args) {
       Rectangle r1=new Rectangle(19,12);
       r1.display();
    }
    
}
