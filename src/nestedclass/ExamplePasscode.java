package nestedclass;

import java.util.Scanner;

class Door1 {
    public static void isCorrect(String s) {
        class Check
        {

           public void chek(String s)
           {
                String sr="naman";
               if (s.equals(sr))
                   System.out.println("right Passcode");
               else
                   System.out.println("Wrong Passcode");
           }
        }
        Check ob = new Check();
        ob.chek(s);
    }
}
public class ExamplePasscode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Enter the Key");
        str= sc.nextLine();
        Door1.isCorrect(str);
    }
}
