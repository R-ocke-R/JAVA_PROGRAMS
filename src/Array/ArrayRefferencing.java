class Test3
{
    public static void display(int[][] tarr)
    {
        tarr[1][1]=9000;
        for (int i = 0; i <tarr.length ; i++) {
            for (int res:tarr[i]) {
                System.out.print(res+" ");

            }
            System.out.println();
        }
    }
}
public class ArrayRefferencing {
    public static void main(String[] args) {
        int arr[][]={{10,20,30},{40,50,60},{70,80,90}};
        Test3.display(arr);
        arr[0][0]=1000;
        for (int i = 0; i <arr.length ; i++) {
            for (int res:arr[i]) {
                System.out.print(res+" ");

            }
            System.out.println();
        }
        Test3.display(arr);
    }
}
