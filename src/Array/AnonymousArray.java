package Array;
class Test{
    public  void printarr(int arr[]){    //parametrize method.
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
public class AnonymousArray {
    public static void main(String[] args) {
        Test t = new Test();
        t.printarr(new int[]{10,20,30,40,50}); //method calling
    }
}
