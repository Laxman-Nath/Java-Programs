// Reading object of student from file named My.txt
package serializationpractice4;
import java.io.*;
class Student{
    int roll;
    float avg;
    String name;
    String dept;
}
public class SerializationPractice4 {


    public static void main(String[] args) throws Exception {
        FileInputStream fis=new FileInputStream("C://MyJava/Student2.txt");
        DataInputStream dis=new DataInputStream(fis);
        Student s=new Student();
        s.roll=dis.readInt();
        s.avg=dis.readFloat();
        s.name=dis.readUTF();
        s.dept=dis.readUTF();
        System.out.println(s.roll);
        System.out.println(s.avg);
        System.out.println(s.name);
        System.out.println(s.dept);
        fis.close();
        dis.close();
        
    }
    
}
