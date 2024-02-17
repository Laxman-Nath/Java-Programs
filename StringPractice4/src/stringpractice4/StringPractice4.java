// Write a program to check if the letter 'e' is present in the world "umbrella";

package stringpractice4;

public class StringPractice4 {

   
    public static void main(String[] args) {
       String str="umbrella";
       int index;
       for(int i=0;i<str.length();i++){
           if(str.charAt(i)=='e'){
                System.out.println("The character e is found at index "+i);
                break;
           }
       }
       
       
       
              
    }
    
}
