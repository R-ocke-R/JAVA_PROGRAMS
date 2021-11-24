package JDBC;

import java.sql.*;

public class Database1 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        // load and register driver.
        Class.forName("com.mysql.cj.jdbc.Driver");  // for mysql.
        //for oracle = "oracle.jdbc.oracleDriver"

        // setup connection
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/21M","root","");

        // Statement object
        Statement s= con.createStatement();

        // send and execute  queries
        ResultSet rs =s.executeQuery("select * from emp");

        //process result from result set.
        while (rs.next()){
            System.out.println(rs.getInt("id"));
            System.out.println(rs.getString(2));
        }
    }
}
