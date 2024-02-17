// RandomAccessFile in java
package iostreampractice23;
import java.io.*;

public class IoStreamPractice23 {


    public static void main(String[] args) throws Exception {
        RandomAccessFile rand=new RandomAccessFile("C://MyJava/data.txt", "rw");
        // byte b[]={A,B,C,D,E,F,G,H,I,J};
        System.out.println((char)rand.read());
         System.out.println((char)rand.read());
         System.out.println((char)rand.read());
         rand.write('d');
         System.out.println((char)rand.read());
         rand.skipBytes(3);
         System.out.println((char)rand.read());
         rand.seek(3);
         System.out.println((char)rand.read());
         System.out.println(rand.getFilePointer());
         rand.seek(rand.getFilePointer()+2);
         System.out.println((char)rand.read());
         
         
        
    }
    
}
