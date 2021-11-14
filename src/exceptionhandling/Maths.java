package exceptionhandling;
public class Maths {
    public static void main(String[] args) {
        int arr[] = new int[5];
        try {
            for (int i = 0; i < arr.length; i++) {
                arr[i]=Integer.parseInt(args[i]);
            }
        }
        catch (Exception p){
            System.out.println("Enter Valid Value");
        }
        int s=0;
        for (int i = 0; i < arr.length; i++) {
            s=arr[i]+s;
        }
        System.out.println("SUM OF FIRST FIVE NUMBER = "+s);
    }
}
