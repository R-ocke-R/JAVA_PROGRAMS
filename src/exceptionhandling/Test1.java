package exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

class arr{
    int a[],s;
    Scanner sc = new Scanner(System.in);
    arr(){
        System.out.println("Enter the Size of the Array");
        s=sc.nextInt();
         a = new int[s];
        for (int i = 0; i < a.length; i++) {
            if (i==1)
            System.out.println("Enter The "+i+"st Element");
            else if (i==2)
                System.out.println("Enter The "+i+"nd Element");
            else if (i==3)
                System.out.println("Enter The "+i+"rd Element");
            else
                System.out.println("Enter The "+i+"th Element");
            try {
                a[i]= sc.nextInt();
            }
           catch (InputMismatchException |NumberFormatException oo){
               System.out.println("Please Enter Number Only By Default Zero Has Been Filled");
               break;
           }
        }
    }
    public void display(){
        System.out.println("Enter the index of the element you want to access");
        sc.next();
        int q=sc.nextInt();
        try {
            System.out.println("The Element at index "+q+"= "+a[q]);
            System.out.println("Array Element Successfully Accessed");
        }
        catch (ArrayIndexOutOfBoundsException |InputMismatchException pp){
            System.out.println("Please enter index in range");
            System.out.println("INDEX RANGE ="+(a.length-1));
        }

    }
}

public class Test1 {
    public static void main(String[] args) {
        arr aa = new arr();
        aa.display();
    }
}