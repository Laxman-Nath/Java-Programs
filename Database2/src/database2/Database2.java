/* There are three types of statement in jdbc:
1.Statement
2.PreparedStatement
3.CallableStatement
*/
package database2;
import java.sql.*;

public class Database2 {

    public static void main(String[] args) throws  Exception{
        Class.forName("org.sqlite.JDBC");
        Connection conn=DriverManager.getConnection("jdbc:sqlite:C://sqlite/univ.db");
        Statement stm=conn.createStatement();
        
        ResultSet rs =stm.executeQuery("select * from dept");
        while(rs.next()){
            System.out.println(rs.getInt(1)+" "+rs.getString(2));
        }
    }
    
}
