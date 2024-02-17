// Reading one by one elements from byte array using bytearrayinputstream
package iostreampractice12;
import java.io.*;
public class IoStreamPractice12 {

    
    public static void main(String[] args) throws Exception{
        byte b[]={'a','b','c','d','e','f','g','h','i'};
        ByteArrayInputStream bis=new ByteArrayInputStream(b);
        int x;
        while((x=bis.read())!=-1){
            System.out.println((char)x);
        }
        bis.close();
    }
    
}
