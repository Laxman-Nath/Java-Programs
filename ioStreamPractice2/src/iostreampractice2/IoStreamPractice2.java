// Writing into a file
package iostreampractice2;
import java.io.*;

public class IoStreamPractice2 {


    public static void main(String[] args) {
        try {
            FileOutputStream fos=new FileOutputStream("C:/MyJava/Test2.txt");
            String str="Learn backend development using java";
            byte b[]=str.getBytes();
            for(byte x:b)
                fos.write(x);
            System.out.println("Successfully written to the file");
            fos.close();
        } catch (FileNotFoundException e) {
        }
        catch(IOException e){
        }
        
    }
    
}
