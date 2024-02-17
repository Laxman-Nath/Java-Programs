// First jdbc program
package database1;
import java.sql.*;
public class Database1 {

    public static void main(String[] args) throws Exception {
       Class.forName("org.sqlite.JDBC");
       Connection conn=DriverManager.getConnection("jdbc:sqlite:C://sqlite//univ.db");
       Statement stm=conn.createStatement();
       ResultSet rs=stm.executeQuery("select * from student");
       while(rs.next()){
           System.out.print(rs.getInt(1)+" ");
              System.out.print(rs.getString("name")+" "); 
              System.out.print(rs.getInt(3)+" ");
                 System.out.println(rs.getInt(4)+" ");
              
       }
       stm.close();
       conn.close();
    }
    
}
