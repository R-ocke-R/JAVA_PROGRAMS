package exceptionhandling;

import java.util.Scanner;

public class Try_Catch_Finally {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        try {
            System.out.println(10/a);
        }
//        catch (ArrayIndexOutOfBoundsException obj){
//
//        }
//        catch (ArithmeticException obj2){
//            System.out.println("Can't perform");
//        }
        finally {
            System.out.println("In Finally block");
        }
    }
}

//                              OR

//        try {
//                System.out.println(10/a);
//                }
//                catch (ArrayIndexOutOfBoundsException | ArithmeticException obj1){
//
//                }