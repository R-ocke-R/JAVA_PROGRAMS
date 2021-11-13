import java.util.Scanner;
class PalindromeExample {
    int r, sum, temp;
    int n;
    PalindromeExample() {
        Scanner sc = new Scanner(System.in);
        sum = 0;
        n = sc.nextInt();
        temp = n;
    }
    public void disp() {
        while (n > 0) {
            r = n % 10;
            sum = (sum * 10) + r;
            n = n / 10;
        }
        if (temp == sum)
            System.out.println("palindrome number ");
        else
            System.out.println("not palindrome");
    }
}
public class Palindrome {
    public static void main(String[] args) {
        PalindromeExample p =new PalindromeExample();
        p.disp();
    }
}
