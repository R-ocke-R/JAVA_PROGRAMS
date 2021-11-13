package Pattern;
//     * * * *
//     * * *
//     * *
//     *

import java.util.Scanner;
class pat{
    int r;
    int c;
    pat(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows");
        r= sc.nextInt();
    }
    public void Printpatt(){
        for (int i = 0; i < r; i++) {       // we can also change this condition instead of inner loop.
            for (int j = 4; j >=(i+1); j--) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
public class pattern3 {
    public static void main(String[] args) {
        pat pp = new pat();
        pp.Printpatt();
    }
}