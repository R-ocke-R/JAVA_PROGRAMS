package Project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Project1Delete {
    public void del() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch (ClassNotFoundException c){
            System.out.println(c);
        }
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project1", "root", "");
            System.out.println("Enter the emp no. to delete the record; ");
            int n = new Scanner(System.in).nextInt();
            PreparedStatement ps = con.prepareStatement("delete from employee where `Emp No.`="+n);
            ps.executeUpdate();
        }
        catch (Exception r){
            System.out.println(r);
        }
    }
}
