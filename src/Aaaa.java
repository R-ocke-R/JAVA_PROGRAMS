import java.util.Scanner;
public class Aaaa {
    int a[][];
    public static void main(String[] args) {
        int a[][]= new int[2][3];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = Integer.parseInt(args[2*i+j]);
            }

        }
        for (int i = 1; i >=0; i--) {
            for (int j=2; j >=0; j--) {
                System.out.print(a[i][j]+" ");
            }
            System.out.print("\n");

        }
    }
}