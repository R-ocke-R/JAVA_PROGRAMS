import java.util.Scanner;

class add{
    int a;
    int b;
    add(){
        Scanner sc = new Scanner(System.in);
        a= sc.nextInt();
        b= sc.nextInt();
    }
    public void show(){
        System.out.println(a+b);
    }
}
public class Sum {
    public static void main(String[] args) {
        add obj =new add();
        obj.show();
    }

}
