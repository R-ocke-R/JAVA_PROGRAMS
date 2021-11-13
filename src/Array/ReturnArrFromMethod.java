package Array;
class Test2{
    static int[] get(){
        return new int[]{1,2,3,4,5,6,7};
    }
}
public class ReturnArrFromMethod {
    public static void main(String[] args) {
        Test2 t2 = new Test2();
        int arr[];
        arr=t2.get();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
