
package staticpractice3;
import java.util.*;
class Student{
    private String rollNo;
    private static int count=1;
    private String generateRollNo(){
        Date d=new Date();
        String rn="Univ-"+(d.getYear()+1900)+"-"+count;
        count++;
        return rn;
    }
    public Student(){
        rollNo=generateRollNo();
    }
    void display(){
        System.out.println("The rollno of student "+(count-1)+ " is:"+rollNo);
    }
}
public class StaticPractice3 {
    public static void main(String[] args) {
        Student s=new Student();
        s.display();
        Student s1=new Student();
        s1.display();
        Student s2=new Student();
        s2.display();
    }
    
}
