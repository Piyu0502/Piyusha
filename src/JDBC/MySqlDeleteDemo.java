package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MySqlDeleteDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/Employee";
        String username = "root";
        String password = "Kbjoshi@123";
        final String QUERY = "delete from emp where empno = ?";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, username, password);
        PreparedStatement ps = con.prepareStatement(QUERY);
        ps.setInt(1, 121);
        int no = ps.executeUpdate();
        System.out.println(no + "Row/s Affected");
    }
}
