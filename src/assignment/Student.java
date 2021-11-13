package assignment;

import java.util.Scanner;

class stu {
    String name;
    int age;
    String address;

    stu() {
        name = "UNKNOWN";
        age = 0;
        address = "not available";
    }

    public void setinfo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setinfo(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void displ2() {
        System.out.println(name + "  " + age + "  " + address);
    }
}
public class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        stu s[];
        s =new stu[3];
        for (int i = 0; i < s.length; i++) {
            s[i]=new stu();
        }
        for (int i = 0; i < s.length; i++) {
            System.out.println("Enter name of "+(i+1)+ " student");
            String n=sc.nextLine();
            System.out.println("Enter age of "+(i+1)+ " student");
            int a= sc.nextInt();
            sc.nextLine();
            System.out.println("Enter address of "+(i+1)+ " student");
            String ad = sc.nextLine();
            s[i].setinfo(n,a,ad);
        }
        for (int i = 0; i < s.length; i++) {
            s[i].displ2();
        }
    }
}
