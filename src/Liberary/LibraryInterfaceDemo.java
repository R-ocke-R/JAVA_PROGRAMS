package Liberary;

import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class LibraryInterfaceDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        KidUser kid = new KidUser();
        AdultUser adult = new AdultUser();
        SetVal set = new SetVal();
        while (true) {
            System.out.println("Welcome");
            System.out.println("Please Enter Your Name:");
            StringBuilder name= new StringBuilder(sc.nextLine());
            set.age();
            if (set.age <= 12 && set.age > 0) {
                kid.registerAccount();
                kid.requestBook();
            } else if (set.age > 12 && set.age < 100) {
                adult.registerAccount();
                adult.requestBook();
            }
            else {
                System.out.println("Wrong Input");
            }
            System.out.println("Do you Want to continue press Y/y for \"YES\" press N/n for \"NO\"");
            String c= sc.next();
            if (c.equals("Y") || c.equals("y")) {
                continue;
            }
            else
                break;
        }

    }
}