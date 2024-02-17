// writing object of student class into a file
package serializationpractice6;
import java.io.*;

  class Student implements Serializable{
   private int roll;
   private float avg;
  private String name;
  private  String dept;
  public static int Data=10;
  public transient  int t;
  public Student(){
  }
  public Student (int r,float a,String n,String d){
      roll=r;
      avg=a;
      name=n;
      dept=d;
      Data=500;
      t=500;
  }
  @Override
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
public class SerializationPractice6 {
    public static void main(String[] args) throws Exception {
        FileInputStream fis=new FileInputStream("C://MyJava/Student4.txt");
         ObjectInputStream ois=new ObjectInputStream(fis);
        Student s=(Student) ois.readObject();
         System.out.println(s);
        ois.close();
        fis.close();
        
        
    }
    
}
