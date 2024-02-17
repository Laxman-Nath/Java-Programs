// Prepared statement in jdbc
package database3;
import java.sql.*;
import java.util.*;
public class Database3 {

    public static void main(String[] args) throws 
            Exception{
      Class.forName("org.sqlite.JDBC");
      Connection conn=DriverManager.getConnection("jdbc:sqlite:C://sqlite/univ.db");
      PreparedStatement ps=conn.prepareStatement("select * from student where deptno=?");
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter deptno:");
      int deptno=sc.nextInt();
      ps.setInt(1, deptno);
      ResultSet rs=ps.executeQuery();
      while(rs.next())
      {
          System.out.print(rs.getInt(1)+" ");
              System.out.print(rs.getString("name")+" "); 
              System.out.print(rs.getInt(3)+" ");
                 System.out.println(rs.getInt(4)+" ");
      }
    }
    
}
