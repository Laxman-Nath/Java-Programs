// Another example for abstract class
package abstractclasspractice2;

abstract class Hospital{
     abstract void emergency();
     abstract void appointment();
     abstract void admit();
     abstract void billing();
    
}

class MyHospital extends Hospital{
    void emergency(){
        System.out.println("It is emergency ward:");
    }
    void appointment(){
        System.out.println("It is appointment ward:");
    }
    void admit(){
        System.out.println("It is admit card:");
    }
    void billing(){
        System.out.println("It is billing ward:");
    }
}
public class AbstractClassPractice2 {

    
    public static void main(String[] args) {
        Hospital h=new MyHospital();
        h.emergency();
        h.appointment();
        h.admit();
        h.billing();
    }
    
}
