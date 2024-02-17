
package iostreampractice9;
import java.io.*;
public class IoStreamPractice9 {

    
    public static void main(String[] args) throws Exception {
      FileInputStream fis=new FileInputStream("C://MyJava/source1.txt");
      FileOutputStream fos=new FileOutputStream("C://MyJava/source2.txt");
      int x;
      while((x=fis.read())!=-1){
          if(x>=65 && x<=90){
              fos.write(x+32);
          }
          else{
              fos.write(x);
          }
      }
        fos.close();
        fis.close();
        
    }
    
}
