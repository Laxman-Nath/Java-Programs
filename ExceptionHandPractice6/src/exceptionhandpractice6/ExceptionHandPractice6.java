// Checked exception in java
package exceptionhandpractice6;
import java.io.*;
public class ExceptionHandPractice6  {
  static void fun1() throws Exception{
      FileInputStream f1=new FileInputStream("D:/QuickSortUnsorted.txt");
      System.out.print("This is fun1:");
  }
  static void fun2() throws Exception{
      fun1();
  }
  static void fun3() throws Exception{
      fun2();
  }
    public static void main(String[] args) throws Exception {
        fun3();
    }
    
}
