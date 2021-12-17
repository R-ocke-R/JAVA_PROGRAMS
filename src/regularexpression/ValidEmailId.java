package regularexpression;

import java.util.regex.Pattern;

public class ValidEmailId {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("[a-zA-Z0-9][A-Za-z0-9._]*@[a-zA-Z]+([.][a-zA-Z]+)+");
        Pattern p1 = Pattern.compile("[a-zA-Z0-9][A-Za-z0-9._]*@gmail[.]com");

    }
}
