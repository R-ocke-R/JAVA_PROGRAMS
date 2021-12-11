package Project;

import java.sql.*;
import java.util.Scanner;

public class Project1Insert extends Project1Delete {
    public  void insertinfo() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException c) {
            System.out.println(c);
        }
        Scanner sc = new Scanner(System.in);
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project1", "root", "");
             PreparedStatement ps = con.prepareStatement("insert into employee values (?,?,?,?,?,?,?,?)");){

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
        catch (SQLException e){
            System.out.println(e);
        }
    }
}
