package regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Quantifiers3 {
    public static void main(String[] args) {
        String target = "dbmms bhjbf758vh dbms bfjhb33567f d485bm3533s876 nmmmmkjkhiu75683dbms";
        Pattern p = Pattern.compile("m?"); //two digit together

        Matcher m = p.matcher(target);
        int c = 0;
        while (m.find()) {
            System.out.println(m.start()+"--"+m.end()+m.group());
            c++;
        }
        System.out.println(c);
    }
}
