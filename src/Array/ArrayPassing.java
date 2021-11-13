class Test2
{
    public static void display(int[][] tarr)
    {
        for (int i = 0; i <tarr.length ; i++) {
            for (int res:tarr[i]) {
                System.out.print(res+" ");

            }
            System.out.println();
        }
    }
}
public class ArrayPassing {
    public static void main(String[] args) {
        int arr[][] = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};
        Test2.display(arr);
    }
}
