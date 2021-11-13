package Array;

import java.util.Scanner;

class Test3{
    int arr[][];
    Test3(){
        Scanner sc = new Scanner(System.in);
        arr = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]= sc.nextInt();
            }
        }
    }
    public void show(){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
        }
    }
}
public class TwoDArray {
    public static void main(String[] args) {
        Test3 t3 = new Test3();
        t3.show();
    }
}
