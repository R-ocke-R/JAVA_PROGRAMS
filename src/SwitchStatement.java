import java.util.Scanner;
// In this new way of switch we do not need to write break statement.
public class SwitchStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int a=sc.nextInt();
        switch (a){
            case 1 -> System.out.println("case 1");
            case 2 -> System.out.println("case 2");
            case 3 -> System.out.println("case 3");
            case 4 -> System.out.println("case 4");
            case 5 -> System.out.println("case 5");
            default -> System.out.println("error");
        }
    }
}
