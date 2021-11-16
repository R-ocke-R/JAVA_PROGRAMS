package exceptionhandling;

import java.util.Scanner;
class NumberException extends Exception{
    NumberException(String a){
        super(a);
    }
}
public class Stu {
    static void m1(int ar) throws NumberException {
        if (ar < 0 || ar > 100) {
            throw new NumberException("Number is Negative or greater than 100::");
        } else {
            System.out.println("* NUMBER STORED SUCCESSFULLY *");
        }
    }

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        String name;
        System.out.println("Enter name of the Student:");
        name = sc.nextLine();
        int marks[];
        marks = new int[3];
        System.out.println("Enter marks of Three Subject");
        for (int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextInt();
            try {
                m1(marks[i]);
            } catch (NumberException f) {
                System.out.println("* Enter Valid Number * " + f);
            } catch (Exception p) {
                System.out.println("* Enter Valid Number * ");
            }

        }
    }
}
