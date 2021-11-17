package exceptionhandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TryResourse {
    public static void main(String[] args) throws IOException {

        try (Scanner sc = new Scanner(System.in);
             BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){

        }

        catch (IOException obj){

        }

         try(Scanner s = new Scanner(System.in)) {
            System.out.println("ju");                    // we can write without catch
        }
    }
}