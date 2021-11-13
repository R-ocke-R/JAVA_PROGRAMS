package assignment;
import java.util.Random;

public class TestCompartment {
    public static void main(String[] args) {
       Compartment arr[];
       arr = new Compartment[10];
        Random ran = new Random();
        for (int i = 0; i < arr.length; i++) {
            int r = ran.nextInt(4) + 1;
            if (r == 1) {
                arr[i] = new FirstClass();
            } else if (r == 2) {
                arr[i] = new Ladies();
            } else if (r == 3) {
                arr[i] = new Generel();
            } else{
                arr[i] = new Luggage();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print((i+1)+" ");
            arr[i].m();
        }
    }
}
