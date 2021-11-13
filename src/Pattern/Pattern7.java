package Pattern;
//      1
//      1 2
//      1 2 3
//      1 2 3 4

import java.util.Scanner;
class pat11{
    int r;
    pat11(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows");
        r= sc.nextInt();
    }
    public void Printpatt(){
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
public class Pattern7 {
    public static void main(String[] args) {
        pat11 pp11 = new pat11();
        pp11.Printpatt();
    }
}
