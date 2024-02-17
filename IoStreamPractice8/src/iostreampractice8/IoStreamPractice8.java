// Reading character by character from a file
package iostreampractice8;
import java.io.*;

public class IoStreamPractice8 {


    public static void main(String[] args) throws Exception {
        FileInputStream fis=new FileInputStream("C:/MyJava/Test4.txt");
        int x;
        while(x=fis.read()!=-1) {            
            x=fis.read();
            System.out.print((char)x);
        } 
    }
    
}
