// writing array into a file
package iostreampractice16;
import java.io.*;
public class IoStreamPractice16 {
    public static void main(String[] args) throws Exception {
         ByteArrayOutputStream bos=new ByteArrayOutputStream(20);
        bos.write('a');
        bos.write('b');
        bos.write('c');
        bos.write('d');
        bos.writeTo(new FileOutputStream("C://MyJava/Array.txt"));
        bos.close();
    }
    
}
