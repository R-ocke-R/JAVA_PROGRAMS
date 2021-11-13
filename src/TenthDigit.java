import java.util.Scanner;

public class TenthDigit {
    private int x;
    TenthDigit(){
        Scanner sc = new Scanner(System.in);
        x=sc.nextInt();
    }
    public void display(){
        x=x/10;
        x=x%10;
        System.out.println(x);
    }
}
class ex{
    public static void main(String[] args) {
        TenthDigit t =new TenthDigit();
        t.display();
    }
}