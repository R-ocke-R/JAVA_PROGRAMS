import java.util.Scanner;

public class Empolyee {
    String name,address;
    int year;
    public void get(){
        Scanner sc= new Scanner(System.in);
        name=sc.nextLine();
        year=sc.nextInt();
        sc.nextLine();
        address= sc.nextLine();
    }
    public void display(){
        System.out.println(name+"    "+year+"    "+address);
    }
}
class emp{
    public static void main(String[] args) {
        Empolyee obj1 = new Empolyee();
        Empolyee obj2= new Empolyee();
        Empolyee obj3 = new Empolyee();
        obj1.get();
        obj2.get();
        obj3.get();
        System.out.println("Name"+"    "+"Year"+"    "+"Address");
        obj1.display();
        obj2.display();
        obj3.display();
    }
}