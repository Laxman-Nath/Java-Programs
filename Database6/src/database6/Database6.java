// Deleting from table
package database6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author Aum com mnr
 */
public class Database6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
             Class.forName("org.sqlite.JDBC");
       Connection conn=DriverManager.getConnection("jdbc:sqlite:C://sqlite/univ.db");
       Statement stm=conn.createStatement();
  
       stm.executeUpdate("delete from dept where deptno>50");
       
       stm.close();
       conn.close();
    
    }
    
}
