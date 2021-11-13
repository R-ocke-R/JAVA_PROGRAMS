package Pattern;
//      *****
//      *****
//      *****
//      *****
// Rows= 4   ,    Column=5

import java.util.Scanner;

public class Pattern1 {
    int r,c;
    Pattern1(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no. of rows");
        r=sc.nextInt();

        System.out.println("Enter the no. of column");
        c= sc.nextInt();

    }
    public void pshow(){
       for (int i=0;i<r;i++){
           for (int j=0;j<c;j++){
               System.out.print("*");
           }
           System.out.println();
       }
    }
}
class patt{
    public static void main(String[] args) {
        Pattern1 p = new Pattern1();
        p.pshow();
    }
}