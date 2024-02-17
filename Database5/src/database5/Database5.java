// DML using JDBC
package database5;
import java.util.*;
import java.sql.*;
public class Database5 {

    public static void main(String[] args) throws Exception {
        Class.forName("org.sqlite.JDBC");
       Connection conn=DriverManager.getConnection("jdbc:sqlite:C://sqlite/univ.db");
       Statement stm=conn.createStatement();
  
       int x=stm.executeUpdate("insert into dept values(70,'CSE')");
       if(x==1){
           System.out.println("Record is inserted successfully");
       }
       stm.close();
       conn.close();
    }
    
}
