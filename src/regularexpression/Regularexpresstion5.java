package regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regularexpresstion5 {
    public static void main(String[] args) {
        String target = "dbms bhjbf758vh dbms bfjhb33567f d485bm3533s876 nkjkhiu75683dbms";
        Pattern p = Pattern.compile("\\s"); //two digit together
        // Pattern p1 = Pattern.compile("dbmc",Pattern.CASE_INSENSITIVE);    same as above
        Matcher m = p.matcher(target);
        int c = 0;
        while (m.find()) {// we can also give index in find method as start flag.
            System.out.println(m.start()+"--"+m.end()+m.group());
            c++;
        }
        System.out.println(c);
    }
}
