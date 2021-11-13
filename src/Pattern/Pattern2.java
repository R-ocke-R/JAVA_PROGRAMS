package Pattern;//
// (1,1) * * * * *(1,5)
//      *       *
//      *       *
//      * * * * *
// Rows= 4   ,    Column=5

import java.util.Scanner;

public class Pattern2{
    int r,c;
    Pattern2(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no. of rows");
        r=sc.nextInt();

        System.out.println("Enter the no. of column");
        c= sc.nextInt();

    }
    public void pshow(){
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                if(i==0 || j==0 || i==r-1 || j==c-1) {
                    System.out.print("*" + " ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }
    }
}
class patt2{
    public static void main(String[] args) {
        Pattern2 p2 = new Pattern2();
        p2.pshow();
    }
}