// Writing into a file
package iostreampractice1;
import java.io.*;

public class IoStreamPractice1 {


    public static void main(String[] args) {
        try {
            FileOutputStream fos=new FileOutputStream("C:/MyJava/Test1.txt");
            String str="Learn java programming";
            fos.write(str.getBytes());
            System.out.println("Sucessfully written to the file");
            fos.close();
        } catch (FileNotFoundException e) {
        }
        catch(IOException e){
        }
        }
        
    }
    

