package Project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Project1Check {
    public static void check() {
        String  value;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException c) {
            System.out.println(c);
        }
        int arr[] = new int[100];
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project1", "root", "");
             Statement s = con.createStatement();) {
            ResultSet rs = s.executeQuery("select  * from employee LEFT JOIN  designation ON  employee.`Desig Code` = Designation.`Designation code` ;");
            while (rs.next()){
               // System.out.println(rs.getInt(1));
               value= rs.getString("Desig code");
                System.out.println(value);
//                            if (value== Project1.naman){
//                    System.out.println("True");
//                }
//                for (int i = 0; i < arr.length; i++) {
//                    arr[i]=rs.getInt("Emp No.");
                }
            }
//            for (int i = 0; i < arr.length; i++) {
//                System.out.println(arr[i]);
//            }
       // }
        catch (Exception t) {
            System.out.println(t);
        }
    }

    public static void main(String[] args) {
        check();
    }
}