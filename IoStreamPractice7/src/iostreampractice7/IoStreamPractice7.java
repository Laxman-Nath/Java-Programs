// Reading character by character from a file
package iostreampractice7;
import java.io.*;

public class IoStreamPractice7 {


    public static void main(String[] args) throws Exception {
        FileInputStream fis=new FileInputStream("C:/MyJava/Test4.txt");
        int x;
        while((x=fis.read()) !=-1) {            
            if(x!=-1)
                System.out.print((char)x);
        } 
    }
    
}
