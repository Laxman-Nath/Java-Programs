// char array writer
package iostreampractice18;
import java.io.*;
public class IoStreamPractice18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
         CharArrayWriter cr=new CharArrayWriter(20);
        cr.write('a');
        cr.write('b');
        cr.write('c');
        cr.write('d');
        char b[]=cr.toCharArray();
        for(char x: b){
            System.out.println(x);
        
        }
        cr.close();
    }
    
}
