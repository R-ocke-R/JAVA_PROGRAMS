package assignment;
import java.util.Arrays;
import java.util.Scanner;

    class Car1 {
        int roll;
        String name;
        int marks;
        Car1(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Roll Number");
            roll=sc.nextInt();
            sc.nextLine();
            System.out.println("Enter Name");
            name=sc.nextLine();
            System.out.println("Enter the Price");
            marks=sc.nextInt();
        }
        public void disp(){
            System.out.println(roll+"   "+name+"  "+marks);
        }
    }

public class PrintTopper {

        public static void main(String[] argh) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of Student");
            int n = sc.nextInt();

            Car1 c[] = new Car1[n];
            for (int i = 0; i < c.length; i++) {
                c[i]=new Car1();
            }

            int ar[] = new int[n];
            for (int i = 0; i < c.length; i++) {
                ar[i] = c[i].marks;
            }

            Arrays.sort(ar);
            int h = ar.length-1;
            for (int i = 0; i < ar.length ; i++) {
                if (ar[h]==c[i].marks){
                    c[i].disp();
                    break;
                }
            }

        }
    }
