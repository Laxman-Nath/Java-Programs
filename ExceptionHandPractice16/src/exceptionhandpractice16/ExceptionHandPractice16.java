// Closing resources(file) with the help of try and finally
package exceptionhandpractice16;
import java.io.*;
import java.util.*;



public class ExceptionHandPractice16 {
   static FileInputStream fi;
    static Scanner sc;
   static void divide() throws Exception{
       fi=new FileInputStream("D://test.txt");
       try{
        sc=new Scanner(fi);
       int a=sc.nextInt();
       int b=sc.nextInt();
       int c=sc.nextInt();
       System.out.println("Result:"+a/c);
       }
       finally{
       fi.close();
       sc.close();
       }
   }
       

    public static void main(String[] args) throws Exception {
        try{
       divide();
        }
        catch(Exception e){
            System.out.println(e);
        }
       int x=sc.nextInt();
       System.out.println(x);
    }
    
}
