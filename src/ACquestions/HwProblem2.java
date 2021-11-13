package ACquestions;

import java.util.Scanner;

public class HwProblem2 {
    public static void main(String[] args) {
        int m;
        byte n;
        Scanner s =new Scanner(System.in);
        do {
            System.out.println("enter marks");
            m=s.nextInt();
            if (m>=90 && m<=100)
                System.out.println("This is good");
            else if (m>=60 && m<=89)
                System.out.println("This is also good");
            else if (m>=0 && m<=59)
                System.out.println("This is good as well");
            else
                System.out.println("Wrong Input");
            System.out.println("enter 1 to enter marks or 0 to exit");
            n=s.nextByte();
        }while(n==1);
    }
}
