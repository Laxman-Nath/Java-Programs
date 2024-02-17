// Program for demonstrating the use of non-parameterized constructor in Inheritance
package consinheritancepractice1;
 class grandParent{
     public grandParent()
     {
         System.out.println("This is Grandparent class constructor:");
     }
 }
 class Parent extends grandParent{
     public Parent(){
         System.out.println("This is parent class constructor:");
     }
 }
class Child extends Parent{
    public Child(){
        System.out.println("This is child class constructor:");
    }
}
        

public class ConsInheritancePractice1 {

   
    public static void main(String[] args){
        Child c=new Child();
 // When the child class object is created ,the child class constructor is called first and then parent construcor
    }
    
}
