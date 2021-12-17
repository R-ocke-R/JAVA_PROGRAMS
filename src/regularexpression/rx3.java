package regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class rx3 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile(".");
        Matcher m = p.matcher("ab ab baba");
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
