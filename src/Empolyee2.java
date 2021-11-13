import java.util.Scanner;

public class Empolyee2 {
    int sal;
    int hour;
    public void getInfo(int sal,int hour){
        this.sal=sal;
        this.hour=hour;
    }
    public void addSal(){
        sal=sal+10;
    }
    public void addWork(){
        sal=sal+5;
    }
    public void display(){
        System.out.println(sal);
    }
}
class emp2{
    public static void main(String[] args) {
        Empolyee2 e = new Empolyee2();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter salary");
        int a=s.nextInt();
        System.out.println("Enter work hour per day");
        int h=s.nextInt();
        e.getInfo(a,h);
        if (e.sal<500){
            e.addSal();
        }
        if (e.hour>6){
            e.addWork();
        }
        e.display();
    }
}