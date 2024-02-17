// Writing object of student class into a file.This object is read into SerializationPractice2 Program
package serializationpractice1;
import java.io.*;
class Student{
    int roll;
    String name;
    String dept;
}
public class SerializationPractice1 {

    
    public static void main(String[] args) throws Exception {
        FileOutputStream fos=new FileOutputStream("C://MyJava/Student1.txt");
        PrintStream ps=new PrintStream(fos);
        Student s=new Student();
        s.roll=20;
        s.name="Laxman";
        s.dept="CSE";
        ps.println(s.roll);
        ps.println(s.name);
        ps.println(s.dept);
        System.out.println("Student s is successfuly written to the file");
       ps.close();
       fos.close();
    }
    
}
