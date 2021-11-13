//      * * * *
//     * * * *
//    * * * *
//   * * * *

package Pattern;

import java.util.Scanner;

public class Pattern13 {
    int r;
    Pattern13(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of rows");
        r= sc.nextInt();
    }
    public void disp(){
        for (int i = 1; i <=r ; i++) {
            for (int j = 1; j <=(r-i) ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=r ; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
class paa{
    public static void main(String[] args) {
        Pattern13 pa = new Pattern13();
        pa.disp();
    }
}
