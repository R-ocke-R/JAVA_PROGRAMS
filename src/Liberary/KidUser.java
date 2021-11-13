package Liberary;

import java.util.Scanner;

public class KidUser implements LibraryUser {
    String booktype;
    Scanner input = new Scanner(System.in);
    @Override
    public void registerAccount() {
        System.out.println("You have SUCCESSFULLY register under kids Account");
    }

    @Override
    public void requestBook() {
        System.out.println("Please enter Book type:");
        System.out.println("Enter K/k for Kids  OR  Enter F/f for Friction");
        this.booktype=input.next();
        if (booktype.equals("K") || booktype.equals("k"))
            System.out.println("Book Issued successfully, please return the book within 10 days");
        else if (booktype.equals("F") || booktype.equals("f"))
            System.out.println("Oops, you are allowed to take only kids books");
        else
            System.out.println("Wrong input");
    }
}
