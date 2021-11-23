package Array;

import java.util.Scanner;

class  Test44{
    int arr[];
    Scanner sc = new Scanner(System.in);
    Test44(){
        System.out.println("Enter the size of Array");
        try {
            int n = sc.nextInt();
            arr = new int[n];
        }
        catch (Exception u){
            System.out.println(u);
        }
        System.out.println(":::::Enter The elements in Array:::::");
        try {
            for (int i = 0; i < arr.length; i++) {
                System.out.println("Enter Element " + (i + 1));
                arr[i] = sc.nextInt();
            }
        }
        catch (Exception y){
            System.out.println(y);
        }

    }
    public void print() {
        System.out.println("Your Array is:");
        for (var res : arr) {
            System.out.print(res + " ");
        }
        System.out.println();
    }
    public void delete(){
        System.out.println("Enter the Index of the number you want to delete");
            int ind = sc.nextInt();
            if (ind <= arr.length) {
                for (int i = ind; i < arr.length - 1; i++) {
                    arr[i] = arr[i + 1];
                }
                System.out.println("Now Your Array is:");
                for (int i =0; i <arr.length-1 ; i++) {
                    System.out.print(arr[i]+" ");
                }
            }
            else
                System.out.println("Enter valid Index");

    }
}
public class DeleationUsingIndex {
    public static void main(String[] args) {
        Test44 n = new Test44();
        n.print();
        n.delete();
    }
}
