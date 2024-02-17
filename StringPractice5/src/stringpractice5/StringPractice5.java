// Write a program to check if the word "orange" is present in the "This is orange juice".
package stringpractice5;

public class StringPractice5 {


    public static void main(String[] args) {
      String str="This is orange juice";
      int i;
      String str3="orange";
      String str2[]=str.split(" ");
//      System.out.println(str2.length);
     for( i=0;i<str2.length;i++){
         if(str2[i].equals(str3)){
             System.out.println("it is found:");
             break;
         }
     }
     if(i==str2.length){
         System.out.println("it is not found:");
    }
    }
    
}
