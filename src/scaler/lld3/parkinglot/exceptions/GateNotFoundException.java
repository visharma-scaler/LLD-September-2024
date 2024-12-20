package scaler.lld3.parkinglot.exceptions;

public class GateNotFoundException extends Exception {
    public GateNotFoundException() {
        super("Gate not found");
    }
}
