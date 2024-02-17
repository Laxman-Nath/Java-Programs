
package iostreampractice11;
import java.io.*;
public class IoStreampractice11 {

    
    public static void main(String[] args) throws Exception {
      FileInputStream fis1=new FileInputStream("C://MyJava/source1.txt");
      FileInputStream fis2=new FileInputStream("C://MyJava/source2.txt");
      FileOutputStream fos=new FileOutputStream("C://MyJava/destination2.txt");
      SequenceInputStream s=new SequenceInputStream(fis1,fis2);
      int x;
      while((x=s.read())!=-1){

              fos.write(x);
          
      }

        fos.close();
        fis1.close();
        fis2.close();
        
    }
    
}
