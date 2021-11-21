package Testing;

import java.io.*;
class Result {

    public static void solve(double meal_cost, int tip_percent, int tax_percent) {
        // Write your code here
        double tip=( (double) tip_percent/100)*meal_cost;
        System.out.println(tip);
        double tax= ((double) tax_percent/100)*meal_cost;
        System.out.println(tax);
        double total=tip+tax+meal_cost;
        System.out.println((Math.round(total)));
    }
}
public class t2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        double meal_cost = 10.25;

        int tip_percent = 17;

        int tax_percent = 5;

        Result.solve(meal_cost, tip_percent, tax_percent);

        bufferedReader.close();
    }
}
