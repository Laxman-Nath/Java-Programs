// writing object of student class into a file
package serializationpractice5;
import java.io.*;

  class Student implements Serializable{
   private int roll;
   private float avg;
  private String name;
  private  String dept;
  public static int Data=10;
  public transient  int t;
  public Student(){}
  public Student (int r,float a,String n,String d){
      roll=r;
      avg=a;
      name=n;
      dept=d;
      Data=500;
      t=500;
  }
  public String toString(){
      return "\nStudent details\n"+
                 "\n Roll "+roll+
              "\nName "+name+
              "\nAverage "+avg+
              "\nDept "+dept+
              "\nData "+Data+
              "\nTransient "+t+"\n";
  }
}
public class SerializationPractice5 {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos=new FileOutputStream("C://MyJava/Student4.txt");
        ObjectOutputStream os=new ObjectOutputStream(fos);
        Student s=new Student(23,56.5f,"Laxman","CSIT");
        os.writeObject(s);
        os.close();
        fos.close();
        
        
    }
    
}
