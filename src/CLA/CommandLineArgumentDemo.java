package CLA;

import java.util.Scanner;

public class CommandLineArgumentDemo {
    public static void main(String[] args) {
    ert e=new ert();
    String s1;
    s1=args[0];
    int s2=Integer.parseInt(args[1]);
    e.naman(s1,s2);
    }
}
class ert {
    public void naman(String s11,int s22) {
        if ((s11.equals("female")) && s22 >= 1 && s22 <= 58) {
            System.out.println("Intrest rate is 8.2%");
        }
        else if ((s11.equals("female")) && s22 >= 59 && s22 <= 100) {
            System.out.println("Intrest rate is 9.2%");
        }
        else if ((s11.equals("Male")) && s22 >= 1 && s22 <= 58) {
            System.out.println("Intrest rate is 8.4%");
        } else if ((s11.equals("Male")) && s22 >= 59 && s22 <= 100) {
            System.out.println("Intrest rate is 10.5%");
        } else {
            System.out.println("error");
        }
    }
}
