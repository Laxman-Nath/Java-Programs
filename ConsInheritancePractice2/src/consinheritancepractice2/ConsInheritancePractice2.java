// Program for demonstrating the use of parameterized constructor in java
package consinheritancepractice2;
class Parent{
    public Parent(){
        System.out.println("This is non-parameterized constructor of Parent:");
    }
    public Parent(int x){
        System.out.println("This is parameterized constructor of Parent:"+x);
    }
}
class Child extends Parent{
    public Child(){
//        super(5);
        System.out.println("This is non-parameterized constructor of Child:");
    }
    public Child(int y){
        System.out.println("This is first parameterized constructor of Child :"+y);
    }
    public Child (int x,int y){
        super(x);// Parent class parameterized constructor will be called
        System.out.println("This is second parameterized constructor of child:"+x+","+y);
//        super(x);-> It can't be written here
    }
}
public class ConsInheritancePractice2 {

    
    public static void main(String[] args) {
//        Child c1=new Child();
//        Child c2=new Child(1);
          Child c3=new Child(1,2);
    }
    
}
