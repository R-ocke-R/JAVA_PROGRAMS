package regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class rx1 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("[a-z]");
        Matcher m = p.matcher("naamn");
        int c = 0;
        while (m.find()){
            c++;  // count how many it occure .
            System.out.println(m.start());  // print the start index of the pattern in the string.
            System.out.println(m.end());// print the end index of the pattern in the string. ( It will return Index+1 so, it return 2 not 1)
                                           // as  ab is at 0,1 but it return 2.
            System.out.println(m.group()); // print which thing got Match.
            System.out.println("---------------");
        }
        System.out.println("Total occurrence "+c);
    }
}
