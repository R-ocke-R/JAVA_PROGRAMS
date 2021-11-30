package Project;

import java.sql.*;
import java.util.Scanner;

public class Project1 extends Project1Insert{
    public void getinfo()  {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException c) {
            System.out.println(c);
        }
        Scanner sc = new Scanner(System.in);
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project1", "root", "");
             Statement s = con.createStatement();){
            System.out.println();
            System.out.println("Enter Emp Number:");
            int a = sc.nextInt();
            System.out.println();
            if (a == 1001) {
                ResultSet r1 = s.executeQuery("select * from employee where `Emp No.`='1001'");
                while (r1.next()) {
                    System.out.println("Emp No." + "   " + "Emp Name" + "    " + " Departement" + "     " + "Designation" + "    " + "Salary");
                    System.out.print(r1.getInt("Emp No.") + "       " + r1.getString("Emp Name") + "         " + r1.getString("Dept") + "       ");

                    switch (r1.getString("Desig Code")) {
                        case "e" -> {
                            Statement s1 = con.createStatement();
                            ResultSet r2 = s1.executeQuery("select * from designation where `Designation code`='e'");
                            while (r2.next()) {
                                int sal = r1.getInt("Basic") + r1.getInt("HRA") + r2.getInt("DA") - r1.getInt("IT");
                                System.out.print(r2.getString("Designation") + "     " + sal);
                            }
                        }
                        case "c" -> {
                            Statement s1 = con.createStatement();
                            ResultSet r2 = s1.executeQuery("select * from designation where `Designation code`='c'");
                            while (r2.next()) {
                                int sal = r1.getInt("Basic") + r1.getInt("HRA") + r2.getInt("DA") - r1.getInt("IT");
                                System.out.print(r2.getString("Designation") + "    " + sal);
                            }
                        }
                        case "k" -> {
                            Statement s1 = con.createStatement();
                            ResultSet r2 = s1.executeQuery("select * from designation where `Designation code`='k'");
                            while (r2.next()) {
                                int sal = r1.getInt("Basic") + r1.getInt("HRA") + r2.getInt("DA") - r1.getInt("IT");
                                System.out.print(r2.getString("Designation") + "    " + sal);
                            }
                        }
                        case "r" -> {
                            Statement s1 = con.createStatement();
                            ResultSet r2 = s1.executeQuery("select * from designation where `Designation code`='r'");
                            while (r2.next()) {
                                int sal = r1.getInt("Basic") + r1.getInt("HRA") + r2.getInt("DA") - r1.getInt("IT");
                                System.out.print(r2.getString("Designation") + "    " + sal);
                            }
                        }
                        case "m" -> {
                            Statement s1 = con.createStatement();
                            ResultSet r2 = s1.executeQuery("select * from designation where `Designation code`='m'");
                            while (r2.next()) {
                                int sal = r1.getInt("Basic") + r1.getInt("HRA") + r2.getInt("DA") - r1.getInt("IT");
                                System.out.print(r2.getString("Designation") + "    " + sal);
                            }
                        }
                    }
                }
            } else if (a == 1002) {
                ResultSet r1 = s.executeQuery("select * from employee where `Emp No.`='1002'");
                while (r1.next()) {
                    System.out.println("Emp No." + "   " + "Emp Name" + "    " + " Departement" + "     " + "Designation" + "    " + "Salary");
                    System.out.print(r1.getInt("Emp No.") + "       " + r1.getString("Emp Name") + "         " + r1.getString("Dept") + "           ");

                    switch (r1.getString("Desig Code")) {
                        case "e" -> {
                            Statement s1 = con.createStatement();
                            ResultSet r2 = s1.executeQuery("select * from designation where `Designation code`='e'");
                            while (r2.next()) {
                                int sal = r1.getInt("Basic") + r1.getInt("HRA") + r2.getInt("DA") - r1.getInt("IT");
                                System.out.print(r2.getString("Designation") + "     " + sal);
                            }
                        }
                        case "c" -> {
                            Statement s1 = con.createStatement();
                            ResultSet r2 = s1.executeQuery("select * from designation where `Designation code`='c'");
                            while (r2.next()) {
                                int sal = r1.getInt("Basic") + r1.getInt("HRA") + r2.getInt("DA") - r1.getInt("IT");
                                System.out.print(r2.getString("Designation") + "    " + sal);
                            }
                        }
                        case "k" -> {
                            Statement s1 = con.createStatement();
                            ResultSet r2 = s1.executeQuery("select * from designation where `Designation code`='k'");
                            while (r2.next()) {
                                int sal = r1.getInt("Basic") + r1.getInt("HRA") + r2.getInt("DA") - r1.getInt("IT");
                                System.out.print(r2.getString("Designation") + "    " + sal);
                            }
                        }
                        case "r" -> {
                            Statement s1 = con.createStatement();
                            ResultSet r2 = s1.executeQuery("select * from designation where `Designation code`='r'");
                            while (r2.next()) {
                                int sal = r1.getInt("Basic") + r1.getInt("HRA") + r2.getInt("DA") - r1.getInt("IT");
                                System.out.print(r2.getString("Designation") + "    " + sal);
                            }
                        }
                        case "m" -> {
                            Statement s1 = con.createStatement();
                            ResultSet r2 = s1.executeQuery("select * from designation where `Designation code`='m'");
                            while (r2.next()) {
                                int sal = r1.getInt("Basic") + r1.getInt("HRA") + r2.getInt("DA") - r1.getInt("IT");
                                System.out.print(r2.getString("Designation") + "    " + sal);
                            }
                        }
                    }
                }
            } else if (a == 1003) {
                ResultSet r1 = s.executeQuery("select * from employee where `Emp No.`='1003'");
                while (r1.next()) {
                    System.out.println("Emp No." + "   " + "Emp Name" + "    " + " Departement" + "     " + "Designation" + "    " + "Salary");
                    System.out.print(r1.getInt("Emp No.") + "       " + r1.getString("Emp Name") + "         " + r1.getString("Dept") + "           ");

                    switch (r1.getString("Desig Code")) {
                        case "e" -> {
                            Statement s1 = con.createStatement();
                            ResultSet r2 = s1.executeQuery("select * from designation where `Designation code`='e'");
                            while (r2.next()) {
                                int sal = r1.getInt("Basic") + r1.getInt("HRA") + r2.getInt("DA") - r1.getInt("IT");
                                System.out.print(r2.getString("Designation") + "     " + sal);
                            }
                        }
                        case "c" -> {
                            Statement s1 = con.createStatement();
                            ResultSet r2 = s1.executeQuery("select * from designation where `Designation code`='c'");
                            while (r2.next()) {
                                int sal = r1.getInt("Basic") + r1.getInt("HRA") + r2.getInt("DA") - r1.getInt("IT");
                                System.out.print(r2.getString("Designation") + "    " + sal);
                            }
                        }
                        case "k" -> {
                            Statement s1 = con.createStatement();
                            ResultSet r2 = s1.executeQuery("select * from designation where `Designation code`='k'");
                            while (r2.next()) {
                                int sal = r1.getInt("Basic") + r1.getInt("HRA") + r2.getInt("DA") - r1.getInt("IT");
                                System.out.print(r2.getString("Designation") + "    " + sal);
                            }
                        }
                        case "r" -> {
                            Statement s1 = con.createStatement();
                            ResultSet r2 = s1.executeQuery("select * from designation where `Designation code`='r'");
                            while (r2.next()) {
                                int sal = r1.getInt("Basic") + r1.getInt("HRA") + r2.getInt("DA") - r1.getInt("IT");
                                System.out.print(r2.getString("Designation") + "    " + sal);
                            }
                        }
                        case "m" -> {
                            Statement s1 = con.createStatement();
                            ResultSet r2 = s1.executeQuery("select * from designation where `Designation code`='m'");
                            while (r2.next()) {
                                int sal = r1.getInt("Basic") + r1.getInt("HRA") + r2.getInt("DA") - r1.getInt("IT");
                                System.out.print(r2.getString("Designation") + "    " + sal);
                            }
                        }
                    }
                }
            } else if (a == 1004) {
                ResultSet r1 = s.executeQuery("select * from employee where `Emp No.`='1004'");
                while (r1.next()) {
                    System.out.println("Emp No." + "   " + "Emp Name" + "    " + " Departement" + "     " + "Designation" + "    " + "Salary");
                    System.out.print(r1.getInt("Emp No.") + "       " + r1.getString("Emp Name") + "         " + r1.getString("Dept") + "           ");

                    switch (r1.getString("Desig Code")) {
                        case "e" -> {
                            Statement s1 = con.createStatement();
                            ResultSet r2 = s1.executeQuery("select * from designation where `Designation code`='e'");
                            while (r2.next()) {
                                int sal = r1.getInt("Basic") + r1.getInt("HRA") + r2.getInt("DA") - r1.getInt("IT");
                                System.out.print(r2.getString("Designation") + "     " + sal);
                            }
                        }
                        case "c" -> {
                            Statement s1 = con.createStatement();
                            ResultSet r2 = s1.executeQuery("select * from designation where `Designation code`='c'");
                            while (r2.next()) {
                                int sal = r1.getInt("Basic") + r1.getInt("HRA") + r2.getInt("DA") - r1.getInt("IT");
                                System.out.print(r2.getString("Designation") + "    " + sal);
                            }
                        }
                        case "k" -> {
                            Statement s1 = con.createStatement();
                            ResultSet r2 = s1.executeQuery("select * from designation where `Designation code`='k'");
                            while (r2.next()) {
                                int sal = r1.getInt("Basic") + r1.getInt("HRA") + r2.getInt("DA") - r1.getInt("IT");
                                System.out.print(r2.getString("Designation") + "    " + sal);
                            }
                        }
                        case "r" -> {
                            Statement s1 = con.createStatement();
                            ResultSet r2 = s1.executeQuery("select * from designation where `Designation code`='r'");
                            while (r2.next()) {
                                int sal = r1.getInt("Basic") + r1.getInt("HRA") + r2.getInt("DA") - r1.getInt("IT");
                                System.out.print(r2.getString("Designation") + "    " + sal);
                            }
                        }
                        case "m" -> {
                            Statement s1 = con.createStatement();
                            ResultSet r2 = s1.executeQuery("select * from designation where `Designation code`='m'");
                            while (r2.next()) {
                                int sal = r1.getInt("Basic") + r1.getInt("HRA") + r2.getInt("DA") - r1.getInt("IT");
                                System.out.print(r2.getString("Designation") + "    " + sal);
                            }
                        }
                    }
                }
            } else if (a == 1005) {
                ResultSet r1 = s.executeQuery("select * from employee where `Emp No.`='1005'");
                while (r1.next()) {
                    System.out.println("Emp No." + "   " + "Emp Name" + "    " + " Departement" + "     " + "Designation" + "    " + "Salary");
                    System.out.print(r1.getInt("Emp No.") + "       " + r1.getString("Emp Name") + "         " + r1.getString("Dept") + "           ");

                    switch (r1.getString("Desig Code")) {
                        case "e" -> {
                            Statement s1 = con.createStatement();
                            ResultSet r2 = s1.executeQuery("select * from designation where `Designation code`='e'");
                            while (r2.next()) {
                                int sal = r1.getInt("Basic") + r1.getInt("HRA") + r2.getInt("DA") - r1.getInt("IT");
                                System.out.print(r2.getString("Designation") + "     " + sal);
                            }
                        }
                        case "c" -> {
                            Statement s1 = con.createStatement();
                            ResultSet r2 = s1.executeQuery("select * from designation where `Designation code`='c'");
                            while (r2.next()) {
                                int sal = r1.getInt("Basic") + r1.getInt("HRA") + r2.getInt("DA") - r1.getInt("IT");
                                System.out.print(r2.getString("Designation") + "    " + sal);
                            }
                        }
                        case "k" -> {
                            Statement s1 = con.createStatement();
                            ResultSet r2 = s1.executeQuery("select * from designation where `Designation code`='k'");
                            while (r2.next()) {
                                int sal = r1.getInt("Basic") + r1.getInt("HRA") + r2.getInt("DA") - r1.getInt("IT");
                                System.out.print(r2.getString("Designation") + "    " + sal);
                            }
                        }
                        case "r" -> {
                            Statement s1 = con.createStatement();
                            ResultSet r2 = s1.executeQuery("select * from designation where `Designation code`='r'");
                            while (r2.next()) {
                                int sal = r1.getInt("Basic") + r1.getInt("HRA") + r2.getInt("DA") - r1.getInt("IT");
                                System.out.print(r2.getString("Designation") + "    " + sal);
                            }
                        }
                        case "m" -> {
                            Statement s1 = con.createStatement();
                            ResultSet r2 = s1.executeQuery("select * from designation where `Designation code`='m'");
                            while (r2.next()) {
                                int sal = r1.getInt("Basic") + r1.getInt("HRA") + r2.getInt("DA") - r1.getInt("IT");
                                System.out.print(r2.getString("Designation") + "    " + sal);
                            }
                        }
                    }
                }
            } else if (a == 1006) {
                ResultSet r1 = s.executeQuery("select * from employee where `Emp No.`='1006'");
                while (r1.next()) {
                    System.out.println("Emp No." + "   " + "Emp Name" + "    " + " Departement" + "     " + "Designation" + "    " + "Salary");
                    System.out.print(r1.getInt("Emp No.") + "       " + r1.getString("Emp Name") + "         " + r1.getString("Dept") + "           ");

                    switch (r1.getString("Desig Code")) {
                        case "e" -> {
                            Statement s1 = con.createStatement();
                            ResultSet r2 = s1.executeQuery("select * from designation where `Designation code`='e'");
                            while (r2.next()) {
                                int sal = r1.getInt("Basic") + r1.getInt("HRA") + r2.getInt("DA") - r1.getInt("IT");
                                System.out.print(r2.getString("Designation") + "     " + sal);
                            }
                        }
                        case "c" -> {
                            Statement s1 = con.createStatement();
                            ResultSet r2 = s1.executeQuery("select * from designation where `Designation code`='c'");
                            while (r2.next()) {
                                int sal = r1.getInt("Basic") + r1.getInt("HRA") + r2.getInt("DA") - r1.getInt("IT");
                                System.out.print(r2.getString("Designation") + "    " + sal);
                            }
                        }
                        case "k" -> {
                            Statement s1 = con.createStatement();
                            ResultSet r2 = s1.executeQuery("select * from designation where `Designation code`='k'");
                            while (r2.next()) {
                                int sal = r1.getInt("Basic") + r1.getInt("HRA") + r2.getInt("DA") - r1.getInt("IT");
                                System.out.print(r2.getString("Designation") + "    " + sal);
                            }
                        }
                        case "r" -> {
                            Statement s1 = con.createStatement();
                            ResultSet r2 = s1.executeQuery("select * from designation where `Designation code`='r'");
                            while (r2.next()) {
                                int sal = r1.getInt("Basic") + r1.getInt("HRA") + r2.getInt("DA") - r1.getInt("IT");
                                System.out.print(r2.getString("Designation") + "    " + sal);
                            }
                        }
                        case "m" -> {
                            Statement s1 = con.createStatement();
                            ResultSet r2 = s1.executeQuery("select * from designation where `Designation code`='m'");
                            while (r2.next()) {
                                int sal = r1.getInt("Basic") + r1.getInt("HRA") + r2.getInt("DA") - r1.getInt("IT");
                                System.out.print(r2.getString("Designation") + "    " + sal);
                            }
                        }
                    }
                }
            } else if (a == 1007) {
                ResultSet r1 = s.executeQuery("select * from employee where `Emp No.`='1007'");
                while (r1.next()) {
                    System.out.println("Emp No." + "   " + "Emp Name" + "    " + " Departement" + "     " + "Designation" + "    " + "Salary");
                    System.out.print(r1.getInt("Emp No.") + "       " + r1.getString("Emp Name") + "         " + r1.getString("Dept") + "           ");

                    switch (r1.getString("Desig Code")) {
                        case "e" -> {
                            Statement s1 = con.createStatement();
                            ResultSet r2 = s1.executeQuery("select * from designation where `Designation code`='e'");
                            while (r2.next()) {
                                int sal = r1.getInt("Basic") + r1.getInt("HRA") + r2.getInt("DA") - r1.getInt("IT");
                                System.out.print(r2.getString("Designation") + "     " + sal);
                            }
                        }
                        case "c" -> {
                            Statement s1 = con.createStatement();
                            ResultSet r2 = s1.executeQuery("select * from designation where `Designation code`='c'");
                            while (r2.next()) {
                                int sal = r1.getInt("Basic") + r1.getInt("HRA") + r2.getInt("DA") - r1.getInt("IT");
                                System.out.print(r2.getString("Designation") + "    " + sal);
                            }
                        }
                        case "k" -> {
                            Statement s1 = con.createStatement();
                            ResultSet r2 = s1.executeQuery("select * from designation where `Designation code`='k'");
                            while (r2.next()) {
                                int sal = r1.getInt("Basic") + r1.getInt("HRA") + r2.getInt("DA") - r1.getInt("IT");
                                System.out.print(r2.getString("Designation") + "    " + sal);
                            }
                        }
                        case "r" -> {
                            Statement s1 = con.createStatement();
                            ResultSet r2 = s1.executeQuery("select * from designation where `Designation code`='r'");
                            while (r2.next()) {
                                int sal = r1.getInt("Basic") + r1.getInt("HRA") + r2.getInt("DA") - r1.getInt("IT");
                                System.out.print(r2.getString("Designation") + "    " + sal);
                            }
                        }
                        case "m" -> {
                            Statement s1 = con.createStatement();
                            ResultSet r2 = s1.executeQuery("select * from designation where `Designation code`='m'");
                            while (r2.next()) {
                                int sal = r1.getInt("Basic") + r1.getInt("HRA") + r2.getInt("DA") - r1.getInt("IT");
                                System.out.print(r2.getString("Designation") + "    " + sal);
                            }
                        }
                    }
                }
            }
            else if (a==0){
                sc.close();
                System.exit(0);
            } else
                System.out.println("There is no employee with empId : " + a);
        } catch (SQLException s) {
            System.out.println(s);
        }
    }
}