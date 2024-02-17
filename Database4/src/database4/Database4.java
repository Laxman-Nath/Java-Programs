
package database4;
import java.sql.*;
import  java.util.*;
public class Database4 {

    
    public static void main(String[] args) throws Exception {
        Class.forName("org.sqlite.JDBC");
        Connection conn=DriverManager.getConnection("jdbc:sqlite:C://sqlite/univ.db");
        PreparedStatement ps=conn.prepareStatement("select * from dept where deptno=?");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of deptno:");
        int deptno=sc.nextInt();
        ps.setInt(1,deptno);
        ResultSet rs=ps.executeQuery();
        while(rs.next()){
            System.out.println(rs.getInt(1)+" "+rs.getString(2));
        }
    }
    
}
