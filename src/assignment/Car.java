package assignment;

import java.util.Scanner;

public class Car {
    String manufacturer;
    int price;
    Car(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Manufacturer");
        manufacturer=sc.nextLine();
        System.out.println("Enter the Price");
        price=sc.nextInt();
    }
    public void disp(){
        System.out.println(manufacturer+"    "+price);
    }
}
