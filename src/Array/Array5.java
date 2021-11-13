import java.util.Scanner;
public class Array5 {
    int arr[],size,c;
    Array5(){
        c=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        size=sc.nextInt();
        arr = new int[size];
        for (int i = 0;i<arr.length;i++){
            System.out.println("Enter "+(i+1)+" Element");
            arr[i]=sc.nextInt();
        }
    }
    public void check(){
        for (int j = 0;j<arr.length;j++){
            if (arr[j]==1 || arr[j]==4){
                c+=1;
            }
        }
        if (c==arr.length)
            System.out.println("True");
        else
            System.out.println("False");
    }
}
class call{
    public static void main(String[] args) {
        Array5 as = new Array5();
        as.check();
    }
}