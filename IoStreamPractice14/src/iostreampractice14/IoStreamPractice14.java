
package iostreampractice14;
import java.io.*;

public class IoStreamPractice14 {
    public static void main(String[] args) {
      byte b[]={'a','b','c','d','e','f','g','h','i'};
        ByteArrayInputStream bis=new ByteArrayInputStream(b);
        String str=new String(bis.readAllBytes());
        System.out.println(bis.markSupported());
    }
    
}
