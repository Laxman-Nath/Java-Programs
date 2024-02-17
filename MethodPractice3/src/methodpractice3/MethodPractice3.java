// Write a java program to demonstrate that method's return type can be object also.
package methodpractice3;

public class MethodPractice3 {

    static String name(String email){
      int i=email.indexOf('@');
      String n=email.substring(0,i);
      return n;
    }
        
    public static void main(String[] args) {
        String email="Laxman@gmail.com";
        String na=name(email);
        System.out.println("The name is "+na);
    }
    
}
