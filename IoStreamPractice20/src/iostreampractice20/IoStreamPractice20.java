// Buffered input stream in java
package iostreampractice20;
import java.io.*;
public class IoStreamPractice20 {


    public static void main(String[] args) throws Exception {
        FileInputStream fis=new FileInputStream("C://MyJava/test1.txt");
       BufferedInputStream bis=new BufferedInputStream(fis);
       System.out.println((char) bis.read());
       System.out.println((char) bis.read());
       System.out.println((char) bis.read());
        bis.mark(10);
       System.out.println((char) bis.read());
       System.out.println((char) bis.read());
       bis.reset();
       System.out.println((char) bis.read());
       System.out.println((char) bis.read());
    }
    
}
