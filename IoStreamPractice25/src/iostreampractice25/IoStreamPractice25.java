// File class in java
package iostreampractice25;
import java.io.*;
public class IoStreamPractice25 {


    public static void main(String[] args) {
        File f=new File("C://MyJava");
        File file[]=f.listFiles();
        for(File x:file){
            System.out.print(x.getName()+" ");
            System.out.print(x.getParent()+" ");
            System.out.println(x.getPath());
            
        }
    }
    
}
