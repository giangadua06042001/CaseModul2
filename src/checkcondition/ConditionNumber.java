package checkcondition;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ConditionNumber {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String NUMBER_REGEX="^(0|\\+84)(\\s|\\.)?((3[2-9])|(5[689])|(7[06-9])|(8[1-689])|(9[0-46-9]))(\\d)(\\s|\\.)?(\\d{3})(\\s|\\.)?(\\d{3})$";

    public ConditionNumber() {
        pattern=Pattern.compile(NUMBER_REGEX);
    }
    public boolean conditionNumber(String number){
        matcher = pattern.matcher(number);
        return matcher.matches();
    }
}
