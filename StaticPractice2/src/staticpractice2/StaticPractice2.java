// Static variable and static methods in java
package staticpractice2;
class Test{
    static int x;
    int y;
    void show(){
        System.out.println(+x+","+y);
    }
    static void display(){
        System.out.println(+x);
    }
}

public class StaticPractice2{
    public static void main(String[] args){
        Test t1=new Test();
        Test t2=new Test();    
        t1.x=10;
        t1.y=20;
        t2.x=30;
        t2.y=40;
        t1.show();
        t1.display();
        t2.show();
        t2.display();
    }
    
}
