// Retrieving float array from a file
package serializationpractice8;
import java.io.*;
public class SerializationPractice8 {


    public static void main(String[] args) throws Exception {
       FileInputStream fis=new FileInputStream("C://MyJava/float.txt");
       DataInputStream dis=new DataInputStream(fis);
       int n=dis.read();
        float data;
       for(int i=0;i<n;i++){
           data=dis.readFloat();
           System.out.println(data);
       }
//       for(int i=0;i<f.length;i++){
//           System.out.println(f[i]);
//       }
    }
    
}
