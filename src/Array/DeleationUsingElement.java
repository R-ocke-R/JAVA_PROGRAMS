package Array;

import java.util.Scanner;

class test87{
    int arr[];
    Scanner sc = new Scanner(System.in);
    test87() {
        System.out.println("Enter the size of Array");
        try {
            int n = sc.nextInt();
            arr = new int[n];
        } catch (Exception u) {
            System.out.println(u);
        }
        System.out.println(":::::Enter The elements in Array:::::");
        try {
            for (int i = 0; i < arr.length; i++) {
                System.out.println("Enter Element " + (i + 1));
                arr[i] = sc.nextInt();
            }
        } catch (Exception y) {
            System.out.println(y);
        }
    }
    public void printarr() {
            System.out.println("Your Array is:");
            for (var res : arr) {
                System.out.print(res + " ");
            }
            System.out.println();
        }
        public void delete() {
            System.out.println("Enter the Element you want to delete");
            int el = sc.nextInt();
            int count=0;
            int n = arr.length;
            for (int j = 0; j <n; j++) {
                if (arr[j]==el) {
                    for (int i = j; i < n-1 ; i++) {
                        arr[i] = arr[i + 1];
                    }
                    count++;
                    n--;
                    j--;
                }
            }
            System.out.println("Now Your Array is:");
            for (int i = 0; i < arr.length-count; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
public class DeleationUsingElement {
    public static void main(String[] args) {
        test87 tt = new test87();
        tt.printarr();
        tt.delete();
    }
}
