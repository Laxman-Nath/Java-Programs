
package iostreampractice21;
import java.io.*;
public class IoStreamPractice21 {

    
    public static void main(String[] args) throws Exception {
   FileReader fr=new FileReader("C://MyJava/test1.txt");
   BufferedReader br=new BufferedReader(fr);
//  int x;
//  while((x=br.read())!=-1){
//      System.out.println((char)x);
//  }
    System.out.println(br.readLine());
}
   
    }
    
           
