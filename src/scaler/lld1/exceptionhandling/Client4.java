package scaler.lld1.exceptionhandling;

public class Client4 {
    public static void main(String[] args) throws Exception {
        Doer doer = new SpecialDoer();
        doer.doSomething();
    }
}
