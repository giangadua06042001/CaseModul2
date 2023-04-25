package input;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Condition {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String Email_Regex="^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";

    public Condition() {
        pattern=Pattern.compile(Email_Regex);
    }
    public boolean Notification(String email){
        matcher = pattern.matcher(email);
        return matcher.matches();

    }
}
