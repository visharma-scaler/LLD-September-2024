package scaler.lld3.parkinglot.models;

import java.util.List;

public class ParkingFloor extends BaseModel {
    private int number;
    private List<ParkingSpot> parkingSpots;
    private ParkingFloorStatus status;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public List<ParkingSpot> getParkingSpots() {
        return parkingSpots;
    }

    public void setParkingSpots(List<ParkingSpot> parkingSpots) {
        this.parkingSpots = parkingSpots;
    }

    public ParkingFloorStatus getStatus() {
        return status;
    }

    public void setStatus(ParkingFloorStatus status) {
        this.status = status;
    }
}
