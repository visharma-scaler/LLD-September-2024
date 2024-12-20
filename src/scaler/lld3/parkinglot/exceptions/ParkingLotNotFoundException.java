package scaler.lld3.parkinglot.exceptions;

public class ParkingLotNotFoundException extends Exception {
    public ParkingLotNotFoundException() {
        super("Parking Lot not found");
    }
}
