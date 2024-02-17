// Reading object student from a file
package serializationpractice2;
import java.io.*;

class Student{
    int roll;
    String name;
    String dept;
}
public class SerializationPractice2 {
    public static void main(String[] args) throws Exception {
       FileInputStream fis=new FileInputStream("C://MyJava/Student1.txt");
       BufferedReader br=new BufferedReader(new InputStreamReader(fis));
       Student s=new Student();
       s.roll=Integer.parseInt(br.readLine());
       s.name=br.readLine();
       s.dept=br.readLine();
       System.out.println("The details of student are:");
       System.out.println("Roll no:"+s.roll);
       System.out.println("Name:"+s.name);
       System.out.println("Department:"+s.dept);
       fis.close();
       br.close();
       
    }
    
}
