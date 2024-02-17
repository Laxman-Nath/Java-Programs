// Write a program to delete all consonents from the string "Hello,have a good day".

package stringpractice9;

public class StringPractice9 {

    
    public static void main(String[] args) {
        String str="Hello,have a good day";
         str=str.replaceAll("[^aeiou' ',]","");
        System.out.println("The string after removing consonants becomes:"+str);
    }
    
}
