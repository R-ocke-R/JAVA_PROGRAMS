package Pattern;
//      *
//      * *
//      * * *
//      * * * *

import java.util.Scanner;
class pat1{
    int r;
    pat1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows");
        r= sc.nextInt();
    }
    public void Printpatt(){
        for (int i = 0; i < r; i++) {
            for (int j = 0; j <(i+1); j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
public class Pattern4 {
    public static void main(String[] args) {
        pat1 pp1 = new pat1();
        pp1.Printpatt();
    }
}
