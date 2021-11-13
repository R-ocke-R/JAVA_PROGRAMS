//                *
//              *  *
//            *  *  *
//          *  *  *  *
package Pattern;
import java.util.Scanner;


    class patt6{
        int r;
        patt6(){
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
                    System.out.print("*"+" ");
                }
                System.out.println();
            }
        }
    }
public class Pattern6 {
        public static void main(String[] args) {
            patt6 pt = new patt6();
            pt.showpattern();
        }
    }

