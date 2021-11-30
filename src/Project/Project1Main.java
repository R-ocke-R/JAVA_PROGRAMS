package Project;

import java.util.Scanner;

public class Project1Main {
    public static void main(String[] args) {
        Project1 p1 = new Project1();
        System.out.println("PRESS 0 TO EXIT");
        Scanner c = new Scanner(System.in);
        while (true) {
            System.out.println();
            System.out.println("Choose Action");
            System.out.println();
            System.out.println("Press 1 to Get Info");
            System.out.println("Press 2 to Insert Info");
            System.out.println("Press 3 to Delete Record");
            try {
                System.out.print("Enter : ");
                int a = c.nextInt();
                switch (a) {
                    case 1 -> p1.getinfo();

                    case 2 -> p1.insertinfo();

                    case 3 -> p1.del();

                    default -> System.out.println("WRONG INPUT");
                }
            } catch (Exception r) {
                System.out.println(r);
            }
        }
    }
}