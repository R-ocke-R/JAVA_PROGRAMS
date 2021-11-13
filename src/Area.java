import java.util.Scanner;

public class Area {
    int length1,length2;
    int breath1,breath2;
    Area(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter l1");
        length1=s.nextInt();
        System.out.println("Enter b1");
        breath1=s.nextInt();

        System.out.println("Enter l2");
        length2=s.nextInt();
        System.out.println("Enter b2");
        breath2=s.nextInt();
    }
    public void cal(){
        System.out.println("Area of 1st rectangle is "+ (length1*breath1));
        System.out.println("Area of 2nd rectangle is "+ (length2*breath2));
    }
}
class show{
    public static void main(String[] args) {
        Area a = new Area();
        a.cal();
    }
}
