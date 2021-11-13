import java.util.Scanner;

public class Student2 {
    Student2(String name){
        if (name.equals(""))
            System.out.println("Unknown");
        else
            System.out.println(name);
    }
}
class print{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st;
        st=sc.nextLine();
        Student2 s = new Student2(st);
    }
}
