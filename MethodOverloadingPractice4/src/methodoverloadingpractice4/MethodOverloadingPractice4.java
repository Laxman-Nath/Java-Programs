// Write a overloaded method in java to validate name and age
package methodoverloadingpractice4;

public class MethodOverloadingPractice4 {
  static  boolean validate(String name){
      return name.matches("[a-zA-Z\\s]+");
  }
  static boolean validate(int age){
      return age>=3 && age<=15;
  }
   
    public static void main(String[] args) {
      System.out.println(validate("laxman"));
      System.out.println(validate(13));
    }
    
}
