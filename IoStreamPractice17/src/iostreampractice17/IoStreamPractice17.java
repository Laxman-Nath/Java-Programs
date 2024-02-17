// chararrayreader
package iostreampractice17;
import java.io.*;
/**
 *
 * @author Aum com mnr
 */
public class IoStreamPractice17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
           char c[]={'a','b','c','d','e','f','g','h','i'};
        CharArrayReader cr=new CharArrayReader(c);
        int x;
        while((x=cr.read())!=-1){
            System.out.println((char)x);
        }
        cr.close();
    }
    
}
