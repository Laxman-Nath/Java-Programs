// Writing object of student class into a file My.txt
package serializationpractice3;
import java.io.*;
class Student{
    int roll;
    float avg;
    String name;
    String dept;
}
public class SerializationPractice3 {


    public static void main(String[] args) throws Exception {
        FileOutputStream fos=new FileOutputStream("C://MyJava/Student2.txt");
        DataOutputStream dos=new DataOutputStream(fos);
        Student s=new Student();
        s.roll=23;
        s.avg=80.5f;
        s.name="laxman";
        s.dept="CSIT";
        dos.writeInt(s.roll);
        dos.writeFloat(s.avg);
        dos.writeUTF(s.name);
        dos.writeUTF(s.dept);
        System.out.println("Student s is successfully written to the file named Student.txt");
        fos.close();
        dos.close();
        
    }
    
}
