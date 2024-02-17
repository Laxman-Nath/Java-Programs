// Reading the byte using bytearrayinputstream array and storing it into a string
package iostreampractice13;
import java.io.*;

public class IoStreamPractice13 {


    public static void main(String[] args) {
         byte b[]={'a','b','c','d','e','f','g','h','i'};
        ByteArrayInputStream bis=new ByteArrayInputStream(b);
        String str=new String(bis.readAllBytes());
        System.out.println(str);
    }
    
}
