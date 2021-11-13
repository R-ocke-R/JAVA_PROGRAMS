//    1 2 3 4 5
//    1 2 3 4
//    1 2 3
//    1 2
//    1


package Pattern;

import java.util.Scanner;

class pate{
    int r;
    int t;
    pate(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows");
        r= sc.nextInt();
    }
    public void disp(){
        t=r;
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <=t ; j++) {   // we can also write= for (int j = 1; j <=r-i+1 ; j++)
                System.out.print(j+" ");
            }
            t-=1;
            System.out.println();
        }
    }
}
public class Pattern8 {
    public static void main(String[] args) {
        pate pt = new pate();
        pt.disp();
    }
}
