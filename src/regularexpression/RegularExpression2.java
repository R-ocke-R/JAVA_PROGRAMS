package regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression2 {
    public static void main(String[] args) {
        String target = "dbms bhjbfvh dbms bfjhbf dbms876 nkjkhiudbms";
        Pattern p = Pattern.compile("[a-z]{4}");
        // Pattern p1 = Pattern.compile("dbmc",Pattern.CASE_INSENSITIVE);    same as above
        Matcher m = p.matcher(target);
        int c = 0;
        while (m.find()) {    // we can also give index in find method as start flag.
            c++;
        }
        System.out.println(c);
    }
}
