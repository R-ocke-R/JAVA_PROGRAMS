package Array;

import java.util.Scanner;

public class PalindromeWithArray2 {
        int arr1[],size,tem;
        PalindromeWithArray2() {
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
        public void check(){
            int f=0;
            tem=arr1.length;
            tem-=1;
            for (int i = 0;i<arr1.length;i++){
                if (arr1[i]!=arr1[tem]) {
                    f=1;
                    break;
                }
                tem -= 1;
            }
            if (f== 1)
                System.out.println("Not a Palindrome Number");
            else
                System.out.println("Palindrome Number");

        }
    }
    class y2{
        public static void main(String[] args) {
            PalindromeWithArray2 pp =new PalindromeWithArray2();
            pp.check();
        }
    }

