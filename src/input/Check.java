package input;

public class Check {
    private static Condition condition;

    public Check() {
    }

    public boolean checkMail (String mai){
        condition=new Condition();
        boolean condition1=condition.Notification(mai);
       return condition1;
    }
}
