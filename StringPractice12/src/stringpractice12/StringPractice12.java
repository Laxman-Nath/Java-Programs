//Write a java program to remove white spaces from a string
package stringpractice12;


public class StringPractice12 {

   
    public static void main(String[] args) {
       String str="  J  a   v   a  ";
       System.out.println(str.replaceAll("\\s",""));
    }
    
}
