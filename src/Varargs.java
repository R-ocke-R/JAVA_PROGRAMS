class m{
    public void m1(int...arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");
        }
    }
}
public class Varargs {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        m o = new m();
        o.m1(arr);
    }
}
