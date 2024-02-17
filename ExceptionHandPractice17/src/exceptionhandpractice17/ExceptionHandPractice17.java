// Closing resources(file) with the help of try block only(try automatically release
//resources if object are created inside parenthesis of try)
package exceptionhandpractice17;
import java.io.*;
import java.util.*;



public class ExceptionHandPractice17 {
   
   static void divide() throws Exception{
       try(FileInputStream fi=new FileInputStream("D://test.txt");Scanner sc=new 
Scanner(fi)){
       int a=sc.nextInt();
       int b=sc.nextInt();
       int c=sc.nextInt();
       System.out.println("Result:"+a/c);
       }
       
   }
       

    public static void main(String[] args) throws Exception {
        try{
       divide();
        }
        catch(Exception e){
            System.out.println(e);
        }
//       int x=sc.nextInt();
//       System.out.println(x);
    }
    
}
