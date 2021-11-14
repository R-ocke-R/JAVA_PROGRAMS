package exceptionhandling;

import java.util.Scanner;

class  Num{
    int marks[];
    String name;
    Num(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter name of the Student:");
        name=sc.nextLine();
        marks = new int[3];
        System.out.println("Enter marks of Three Subject");
        try {
            for (int i = 0; i < marks.length; i++) {
                marks[i]=sc.nextInt();
            }
        }
        catch (Exception p){
            System.out.println("Enter valid value!!!!");
        }
    }
}
public class Stu {
    public static void main(String[] args) {
        Num n1 = new Num();
        Num n2 = new Num();
    }
}
