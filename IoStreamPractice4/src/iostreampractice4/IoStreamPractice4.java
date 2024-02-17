// Writing into a file
package iostreampractice4;
import java.io.*;

public class IoStreamPractice4 {


    public static void main(String[] args) throws Exception {
            try (FileOutputStream fos = new FileOutputStream("C:/MyJava/Test4.txt")) {
                String str="Learn backend development using java";
                byte b[]=str.getBytes();
//                for(byte x:b)
                    fos.write(b);
                System.out.println("Successfully written to the file");
            }
        
        
    }
    
}
