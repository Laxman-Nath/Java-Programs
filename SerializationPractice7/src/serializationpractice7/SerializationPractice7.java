// storing float array into a file
package serializationpractice7;
import java.io.*;
public class SerializationPractice7 {


    public static void main(String[] args) throws Exception {
        float list[]={10.3f,2.9f,6.4f,3.7f};
        FileOutputStream fos =new FileOutputStream("C://MyJava/float.txt");
        DataOutputStream dos=new DataOutputStream(fos);
        dos.write(list.length);
        for(float f:list){
              dos.writeFloat(f);
            }
        dos.close();
       fos.close();
    }
    
}
