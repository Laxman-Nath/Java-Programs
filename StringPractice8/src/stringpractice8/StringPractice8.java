// Write a program to find the number of vowels,consonents,digits and white space characters in a string.
 
package stringpractice8;


public class StringPractice8 {

    
    public static void main(String[] args) {
       String str="I love you";
       int vcount=0;
       int ccount=0;
       int wcount=0;
       for(int i=0;i<str.length();i++){
           char ch=str.charAt(i);
           if(ch=='a' || ch== 'e' || ch=='i' ||ch== 'o' || ch=='u' || ch=='A' ||ch== 'E' ||
                   ch=='I' || ch== 'O' || ch=='U'){
               
              vcount++;
           }
           
           else if(ch!=' '){
               ccount++;
           }
           else{
               wcount++;
           }
           }
               
          System.out.println("The number of vowels is:"+vcount);
          System.out.println("The number of constants is:"+ccount);
          System.out.println("The number of white spaces is:"+wcount);
    }
    
}
