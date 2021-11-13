// 0-1 triangle
//        1
//        0 1
//        1 0 1
//        0 1 0 1
//        1 0 1 0 1

        package Pattern;

import java.util.Scanner;

class p{
    int r;
    int sum;
    p(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of rows");
        r=sc.nextInt();
    }
    public void d(){
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <=i ; j++) {
                sum=i+j;
                if (sum%2==0)
                    System.out.print("1 ");
                else
                    System.out.print("0 ");

            }
            System.out.println();
        }
    }
}
public class Pattern10 {
    public static void main(String[] args) {
        p p =new p();
        p.d();
    }
}
