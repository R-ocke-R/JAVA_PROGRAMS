package Array;

import java.util.Scanner;

//count the element occurrence.
class Test12{
    int arr[];
    Test12(){
        System.out.println("Enter the size of Array");
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        try {
            arr = new int[n];
        }
        catch (NegativeArraySizeException e){
            System.out.println("Array size can't be Negative");
        }
        System.out.println(":::::Enter The elements in Array:::::");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter Element "+(i+1));
            try {
                arr[i] = sc.nextInt();
            }
            catch (Exception t){
                System.out.println(t);
            }
        }

    }
    public  void count(){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            
        }
    }
}
public class ArrayCountNumber {
    public static void main(String[] args) {
        Test12 tt = new Test12();
    }
}
