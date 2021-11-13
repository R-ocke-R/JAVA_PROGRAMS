import java.util.Scanner;
public class Array2 {
    int arr1[],size,num,flag;
    Array2(){
        Scanner sc = new Scanner(System.in);
        flag=0;
        System.out.println("Enter the size/digit of number");
        size = sc.nextInt();
        arr1 = new int[size];
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Enter the " + (1 + i) + " digit");
            arr1[i] = sc.nextInt();
        }
    }

    public void setNum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to check");
        num=sc.nextInt();
    }
    public  void che(){
        for (int i=0;i<arr1.length;i++){
            if (arr1[i]==num) {
                System.out.println("Index =" + i);
                flag+=1;
            }
            if (flag==0)
                System.out.println("-1");
        }

    }
}
class Pri{
    public static void main(String[] args) {
       Array2 arr = new Array2();
       arr.setNum();
       arr.che();
    }
}
