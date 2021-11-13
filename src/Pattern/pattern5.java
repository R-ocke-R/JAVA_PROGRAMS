package Pattern;
//                *
//              * *
//            * * *
//          * * * *

import java.util.Scanner;

class patt5{
    int r;
    patt5(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows");
        r= sc.nextInt();
    }
    public void showpattern(){
        for (int i = 1; i <=r; i++) {
            for (int j = 1; j <=(r-1*i) ; j++) {
                System.out.print(" ");
            }
            for (int q = 1; q <=i ; q++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
public class pattern5 {
    public static void main(String[] args) {
        patt5 pt = new patt5();
        pt.showpattern();
    }
}
