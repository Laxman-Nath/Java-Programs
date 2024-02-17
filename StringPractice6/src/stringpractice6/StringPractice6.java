// Write a program to find the first and last occurences of the letter 'o' and character ',' in "Hello,World".
package stringpractice6;

public class StringPractice6 {

    
    public static void main(String[] args) {
       String str="Hello,World";
        System.out.println("The first occurance of 'o' is:"+str.indexOf('o'));
        System.out.println("The last occurance of 'o' is:"+str.lastIndexOf('o'));
         System.out.println("The first occurance of ',' is:"+str.indexOf(','));
        System.out.println("The last occurance of ',' is:"+str.lastIndexOf(','));
    }
    
}
