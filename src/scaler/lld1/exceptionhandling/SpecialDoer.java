package scaler.lld1.exceptionhandling;

public class SpecialDoer extends Doer {
    public void doSomething() {
        throw new RuntimeException("Throwing exception from Special Doer");
    }
}
