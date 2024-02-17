// File class in java
package iostreampractice24;
import java.io.*;
public class IoStreamPractice24 {

  
    public static void main(String[] args) {
       File f=new File("C://MyJava");
       System.out.println(f.isDirectory());
       String str[]=f.list();
       for(String x:str)
          System.out.println(x);
    }
    
}
