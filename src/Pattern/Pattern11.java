//N
//NN
//NNN
//NNNN

package Pattern;

import java.util.Scanner;

public class Pattern11 {
  int r;
  Pattern11(){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the no. of rows");
      r= sc.nextInt();
  }
  public  void n(){
      for (int i = 0; i < r; i++) {
          for (int j = 0; j <= i; j++) {
              System.out.print("N");
          }
          System.out.println();

      }
  }
}
class naman{
    public static void main(String[] args) {
        Pattern11 obj = new Pattern11();
        obj.n();
    }
}
