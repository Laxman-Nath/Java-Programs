//Reading from a file
package iostreampractice5;
import java.io.*;
public class IoStreamPractice5 {

    public static void main(String[] args) throws Exception {
        FileInputStream fis=new FileInputStream("C:/MyJava/Test1.txt");
        byte b[]=new byte[fis.available()];
        fis.read(b);
        String str=new String(b);
        System.out.println(str);
        
    }
    
}
