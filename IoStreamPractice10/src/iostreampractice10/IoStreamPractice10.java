
package iostreampractice10;
import java.io.*;
public class IoStreamPractice10 {

    
    public static void main(String[] args) throws Exception {
      FileInputStream fis1=new FileInputStream("C://MyJava/source1.txt");
      FileInputStream fis2=new FileInputStream("C://MyJava/source2.txt");
      FileOutputStream fos=new FileOutputStream("C://MyJava/destination.txt");
      int x;
      while((x=fis1.read())!=-1){

              fos.write(x);
          
      }
      int y;
        while((y=fis2.read())!=-1){

              fos.write(y);
          
      }
        fos.close();
        fis1.close();
        fis2.close();
        
    }
    
}
