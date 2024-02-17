// Reading character by character from a file
package iostreampractice6;
import java.io.*;

public class IoStreamPractice6 {


    public static void main(String[] args) throws Exception {
        FileInputStream fis=new FileInputStream("C:/MyJava/Test2.txt");
        int x;
        do {            
            x=fis.read();
            System.out.print((char)x);
        } while (x!=-1);
    }
    
}
