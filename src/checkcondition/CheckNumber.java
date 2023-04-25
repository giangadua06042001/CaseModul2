package checkcondition;

public class CheckNumber {
    private static ConditionNumber conditionNumber;

    public CheckNumber() {
    }
    public boolean checkNumber(String number){
        conditionNumber=new ConditionNumber();
        boolean condition=conditionNumber.conditionNumber(number);
        return condition;
    }
}
