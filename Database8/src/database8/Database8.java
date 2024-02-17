
package database8;
import java.sql.*;
import java.util.*;
public class Database8 {


    public static void main(String[] args) throws Exception {
       Class.forName("org.sqlite.JDBC");
       Connection conn=DriverManager.getConnection("jdbc:sqlite:C://sqlite/univ.db");
       PreparedStatement ps=conn.prepareStatement("insert into student values(?,?,?,?)");
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter details of student:");
       int roll=sc.nextInt();
       String name=sc.next();
       String city=sc.next();
       int deptno=sc.nextInt();
       ps.setInt(1, roll);
       ps.setString(2, name);
       ps.setString(3, city);
       ps.setInt(4, deptno);
       ps.executeUpdate();
    }
    
}
