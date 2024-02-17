
package database7;
import java.sql.*;
public class Database7 {


    public static void main(String[] args) throws Exception{
                    Class.forName("org.sqlite.JDBC");
       Connection conn=DriverManager.getConnection("jdbc:sqlite:C://sqlite/univ.db");
       Statement stm=conn.createStatement();
  
       stm.executeUpdate("update dept set dname='CSE' where deptno=10");
       
       stm.close();
       conn.close();

    }
    
}
