package Array;

import java.util.Scanner;
public class Array1 {
    int arr1[],arr2[],size,tem,count;
    Array1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size/digit of number");
        size = sc.nextInt();
        if (size >= 2) {
            count = 0;
            arr1 = new int[size];
            arr2 = new int[size];
            System.out.println("Press \"ENTER\" after every digit");
            for (int i = 0; i < arr1.length; i++) {
                System.out.println("Enter the " + (1 + i) + " digit");
                arr1[i] = sc.nextInt();
            }
        } else
            System.out.println("Atleast need two digit number ");
    }
    public void check() {
        if (size >= 2) {
            System.out.println("You enter this number:");
            for (int i = 0; i < arr1.length; i++)
                System.out.print(arr1[i] + "");
            System.out.println("\n");
            tem = arr1.length;
            tem -= 1;
            for (int j = 0; j < arr1.length; j++) {
                arr2[j] = arr1[tem];
                tem -= 1;
            }
            for (int l = 0; l < arr1.length; l++) {
                if (arr1[l] == arr2[l])
                    count += 1;
            }
            if (count == arr1.length)
                System.out.println("Palindrome Number");
            else
                System.out.println("Not a Palindrome Number");
        }
    }
}
class s{
    public static void main(String[] args) {
        Array1 ar =new Array1();
        ar.check();
    }
}