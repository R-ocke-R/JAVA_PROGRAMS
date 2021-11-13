import java.util.Scanner;
public class Array3 {
    int arr[],size;
    Array3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        size=sc.nextInt();
        arr = new int[size];
        for (int j = 0; j < arr.length; j++) {
            System.out.println("Enter " + (j + 1) + " Element");
            arr[j] = sc.nextInt();
        }
    }
        public void sho(){
        char c;
        for (int i = 0; i < arr.length; i++) {
            c = (char) arr[i];
            System.out.print(c + " ");
        }
    }
}
class rt{
    public static void main(String[] args) {
        Array3 aw =new Array3();
        aw.sho();
    }
}