package assignment;

import java.util.Arrays;
import java.util.Scanner;

public class CarMain {
    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of cars");
        int n = sc.nextInt();

        Car c[] = new Car[n];
        for (int i = 0; i < c.length; i++) {
            c[i] = new Car();
        }

        int ar[] = new int[n];
        for (int i = 0; i < c.length; i++) {
            ar[i] = c[i].price;
        }

        Arrays.sort(ar);
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar.length; j++) {
                if (ar[i] == c[j].price) {
                    c[j].disp();
                    break;
                }
            }

        }
    }
}
