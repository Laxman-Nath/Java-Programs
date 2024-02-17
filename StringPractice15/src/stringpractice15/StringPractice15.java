// Write a java program to replace any character with number of occurances
package stringpractice15;
import java.util.Arrays;

public class StringPractice15 {

    public static void main(String[] args) {
        String str="opentext";
        char chrep='t';
        char A[]=str.toCharArray();
        if(str.indexOf(chrep)==-1){
            System.out.println("This character is not present in string:");
        }
        int count=1;
//        for(int i=0;i<A.length;i++){
//                 if(A[i]==chrep){
////                     A[i]=String.valueOf(count).charAt(0);
//                     
//                     count++;
//                 }
//        }
////        System.out.println(Arrays.toString(A));
//          System.out.println(new String(A));

    
     for(int i=0;i<str.length();i++){   
         char ch=str.charAt(i);
         if(ch==chrep){
             str=str.replaceFirst(String.valueOf(chrep),String.valueOf(count));
             count++;
     }
    }
     System.out.println(str);
    }
    
}
