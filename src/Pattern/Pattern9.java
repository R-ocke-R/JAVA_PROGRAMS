// FLOYD'S TRIANGLE
//      1
//      2 3
//      4 5 6
//      7 8 9 10
//      11 12 13 14 15

        package Pattern;

import java.util.Scanner;

class flo{
    int r;
    int n;
    flo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of rows");
        r=sc.nextInt();
    }
    public void disppatt1(){
        n=1;
        for (int i = 1; i <=r ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(n+" ");
                n+=1;
            }
            System.out.println();
        }
    }
}
public class Pattern9 {
    public static void main(String[] args) {
        flo f = new flo();
        f.disppatt1();
        }
}

