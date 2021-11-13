class Test4
{
    public static void display(int[] tarr)
    {
        for (int i = 0; i <tarr.length ; i++) {

                System.out.print(tarr[i]+" ");
        }
    }
}
public class ArrayPassing1d {
    public static void main(String[] args) {
        int arr[] = {10, 20,30,40};
        Test4.display(arr);
    }

}
