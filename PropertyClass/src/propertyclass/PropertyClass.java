// Properties class is inheriting from hash table
package propertyclass;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.*;
public class PropertyClass {

    public static void main(String[] args) throws Exception {
        Properties p=new Properties();
  /*     p.setProperty("Brand", "Dell");
       p.setProperty("Processor","i7");
       p.setProperty("OS", "Windows10");
       p.setProperty("Model", "Latitude");
//       System.out.println(p);
//      p.store(new FileOutputStream("D://Mydata.txt"),"Laptop");
 p.storeToXML(new FileOutputStream("D://Mydata.xml"),"Laptop");
*/
//     p.loadFromXML(new FileInputStream("D://Mydata.xml")); 
      p.load(new FileInputStream("D://Mydata.txt"));

     System.out.println(p.getProperty("Brand"));
    }
    
}
