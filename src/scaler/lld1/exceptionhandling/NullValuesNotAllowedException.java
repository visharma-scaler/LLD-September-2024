package scaler.lld1.exceptionhandling;

public class NullValuesNotAllowedException extends RuntimeException {

    public NullValuesNotAllowedException() {
        super("Null values are not allowed in Pair");
    }

    public NullValuesNotAllowedException(String message) {
        super(message);
    }
}
