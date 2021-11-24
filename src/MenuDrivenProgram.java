import java.util.Scanner;

public class MenuDrivenProgram {
    public static void main(String[] args) {
        while (true) {
            System.out.println();
            Scanner sc = new Scanner(System.in);
            System.out.println("1- ArithmeticException");
            System.out.println("2- NullPointerException");
            System.out.println("3- StringIndexOutOfBoundsException");
            System.out.println("4- Array Index Out Of Bounds Exception");
            System.out.println("5- NumberFormatException");
            System.out.println();
            System.out.println("Enter Your Choice:::");
            int a = sc.nextInt();
            switch (a) {
                case 1 -> {
                    try {
                        System.out.println(10 / 0);
                    } catch (ArithmeticException q) {
                        System.out.println(q);
                    }
                }
                case 2 -> {
                    try {
                        Integer i1 = null;
                        int i2;
                        i2 = i1;
                        System.out.println(i2);
                    } catch (NullPointerException w) {
                        System.out.println(w);

                    }
                }
                case 3 -> {
                    try {
                        System.out.println("gla".charAt(5));
                    } catch (StringIndexOutOfBoundsException e) {
                        System.out.println(e);
                    }
                }
                case 4 -> {
                    try {
                        System.out.println(args[1]);
                    } catch (ArrayIndexOutOfBoundsException r) {
                        System.out.println(r);
                    }
                }
                case 5 -> {
                    try {
                        Integer i1 = new Integer(" ");
                    } catch (NumberFormatException t) {
                        System.out.println(t);
                    }
                }
            }
            if (a>5 ||a<0) {
                System.out.println("You Enter Invalid Number");
                break;
            }
            else
                continue;
        }
    }
}