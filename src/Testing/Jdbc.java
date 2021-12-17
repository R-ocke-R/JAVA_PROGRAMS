package Testing;

import java.sql.*;
import java.util.Scanner;

public class Jdbc {
    public static void get(Connection c, Scanner sc) throws SQLException{
        Statement s = c.createStatement();
        System.out.println("enter employee");
        int n = sc.nextInt();
        ResultSet rs = s.executeQuery("Select * from employee where `Emp No.`="+ n);
        while (rs.next()) {
            System.out.println(rs.getInt(1) + "  | " + rs.getString(2) + " | " + rs.getDate(3));
        }
    }
    public static void insert(Connection con, Scanner sc) throws SQLException {
        {
            PreparedStatement ps = con.prepareStatement("Insert INTO prog1.employee values (?,?,?,?,?,?,?,?)");
            System.out.println("Enter Employee Code");
            int empcode= sc.nextInt();
            ps.setInt(1,empcode);

            sc.nextLine();

            System.out.println("Enter Employee Name");
            String name= sc.nextLine();
            ps.setString(2,name);

            System.out.println("Enter Employee Joining Date in yyyy-mm-dd");
            String date= sc.nextLine();
            ps.setString(3,date);

            System.out.println("Enter Employee designation Code");
            String degcode= sc.nextLine();
            ps.setString(4,degcode);

            System.out.println("Enter Employee Department");
            String dep= sc.nextLine();
            ps.setString(5,dep);

            System.out.println("Enter Employee Basic");
            int basic= sc.nextInt();
            ps.setInt(6,basic);

            System.out.println("Enter Employee HRA");
            int hra= sc.nextInt();
            ps.setInt(7,hra);

            System.out.println("Enter Employee IT");
            int it= sc.nextInt();
            ps.setInt(8,it);

            ps.executeUpdate();
            System.out.println("Added Successfully");

        }
    }
    public static void delete(Connection con, Scanner sc) throws SQLException {
        System.out.println("enter employee");
        int no = sc.nextInt();
        PreparedStatement ps= con.prepareStatement("Delete from employee where prog1.employee.`Emp No.`="+no);
        ps.execute();
        System.out.println("delete successful");
    }

    public static void main(String[] args)throws SQLException {
        Scanner sc = new Scanner(System.in);
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch (Exception r){
            System.out.println(r);
        }
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/prog1","root","naman123");
        System.out.println("what do you want to do");
        System.out.println("1-for get");
        System.out.println("2-for insert");
        System.out.println("3-for deletion");
        int choice = sc.nextInt();


        switch(choice) {
            case 1 -> get(con, sc);
            case 2 -> insert(con, sc);
            case 3 -> delete(con, sc);
        }
    }
}
