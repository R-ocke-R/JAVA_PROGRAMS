package Array;

import java.util.Scanner;

public class PalndromeWithArray {
    int arr1[],size,tem;
    ///////////////////////////////////////////////////
    PalndromeWithArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size/digit of number");
        size = sc.nextInt();
        if (size >= 2) {
            arr1 = new int[size];
            System.out.println("Press \"ENTER\" after every digit");
            for (int i = 0; i < arr1.length; i++) {
                System.out.println("Enter the " + (1 + i) + " digit");
                arr1[i] = sc.nextInt();
            }
        } else
            System.out.println("Atleast need two digit number ");
    }
    //////////////////////////////////////////////////
    public void check(){
        int f=0;
        tem=arr1.length;
        tem-=1;
        for (int i = 0;i<arr1.length;i++){
            if (arr1[i]==arr1[tem]) {
                tem -= 1;
                f+=1;
            }
        }
        if (f== arr1.length)
            System.out.println("Palindrome Number");
        else
            System.out.println("Not a Palindrome Number");

    }
}
/////////////////////////////////////////////////////////////////
class y{
    public static void main(String[] args) {
        PalndromeWithArray pp =new PalndromeWithArray();
        pp.check();
    }
}