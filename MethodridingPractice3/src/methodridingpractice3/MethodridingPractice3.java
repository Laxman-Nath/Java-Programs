// Another example of method overriding
package methodridingpractice3;
class Car{
    void start(){
        System.out.println("Starting Car:");
    }
    void accelarating(){
        System.out.println("Accelerating Car:");
    }
    void changeGear(){
        System.out.println("Changing gear of Car:");
    }
}

class LuxuryCar extends Car{
   void changeGear(){
        System.out.println("Automatic gear:");
    }
   void openRoof(){
       System.out.println("Sun roof is opened:");
   }
}
public class MethodridingPractice3 {

   
    public static void main(String[] args) {
       Car l=new LuxuryCar();
       l.accelarating();
       l.start();
       l.changeGear();
//       l.openRoof(); -> This method cannot be called because Car class does not contain this method

   }
    
}
