// Writing into a file
package iostreampractice3;
import java.io.*;
public class IoStreamPractice3 {

    
    public static void main(String[] args) throws Exception {
        FileOutputStream f1=new FileOutputStream("C:/MyJava/Test3.txt");
        String str="Learn java programming";
        byte b[]=str.getBytes();
        f1.write(b,6,str.length()-6);
        System.out.println("Successfully written to the file");
        f1.close();
    }
    
}
