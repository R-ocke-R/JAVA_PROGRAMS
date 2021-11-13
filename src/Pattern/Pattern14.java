//        1
//       2 2
//      3 3 3
//     4 4 4 4

package Pattern;

import java.util.Scanner;

public class Pattern14 {
    int r;
    Pattern14(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of rows");
        r= sc.nextInt();
    }
    public void disp(){
        for (int i = 1; i <=r ; i++) {
            for (int j = 1; j <=(r-i) ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
class ppt{
    public static void main(String[] args) {
        Pattern14 p = new Pattern14();
        p.disp();
    }
}
