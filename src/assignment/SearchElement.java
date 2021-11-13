package assignment;

import java.util.Scanner;

class ser {
    public boolean m(int arr[], int n) {
        boolean bl = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                bl = true;
                break;
            }
        }
       return bl;
    }
}
public class SearchElement {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        ser s = new ser();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element You want to search");
        int q = sc.nextInt();
        boolean s1=s.m(arr,q);
        if (s1==true)
            System.out.println("True");
        else
            System.out.println("Element not found");
    }
}
