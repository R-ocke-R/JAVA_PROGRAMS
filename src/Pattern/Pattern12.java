//    *      *
//    **    **
//    ***  ***
//    ********
//    ********
//    ***  ***
//    **    **
//    *      *
package Pattern;

import java.util.Scanner;

public class Pattern12 {
    int r;
    Pattern12(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of rows");
        r= sc.nextInt();
    }
    public void dis(){
        // upper half
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }

            int sp=2*(r-i);
            for (int j = 1; j <=sp ; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = r; i >=1; i--) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }

            int sp=2*(r-i);
            for (int j = 1; j <=sp ; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
class pa{
    public static void main(String[] args) {
        Pattern12 pt = new Pattern12();
        pt.dis();
    }
}