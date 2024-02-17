// Bufferd input stream in java
package iostreampractice19;
import java.io.*;

public class IoStreamPractice19 {

    
    public static void main(String[] args) throws Exception {
       FileInputStream fis=new FileInputStream("C://MyJava/test1.txt");
       BufferedInputStream bis=new BufferedInputStream(fis);
       System.out.println(fis.markSupported());
       System.out.println(bis.markSupported());
       int x;
       while((x=bis.read())!=-1){
           System.out.println((char) x);
       }
    }
    
}
