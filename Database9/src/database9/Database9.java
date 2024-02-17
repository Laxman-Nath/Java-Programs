
package database9;
import java.sql.*;
public class Database9 {

    
    public static void main(String[] args) throws Exception {
        Class.forName("org.sqlite.JDBC");
        Connection conn=DriverManager.getConnection("jdbc:sqlite:C://sqlite/univ.db");
        Statement stm=conn.createStatement();
        //stm.executeUpdate("create table temp(a float,b int)");
        stm.executeUpdate("drop table temp");
        stm.close();
        conn.close();
    }
    
}
