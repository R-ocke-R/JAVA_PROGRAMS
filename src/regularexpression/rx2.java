package regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class rx2 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("[^a-zA-Z0-9]");
        Matcher m = p.matcher("a$5g^41rtb58c#@");
        int c = 0;
        while (m.find()){
            c++;
            System.out.println(m.start());
            System.out.println(m.end());
            System.out.println(m.group());
            System.out.println("---------------");
        }
        System.out.println("Total occurrence "+c);
    }
}
