package scaler.lld3.parkinglot.models;

import java.util.List;

public class ParkingFloor extends BaseModel {
    private int number;
    private List<ParkingSpot> parkingSpots;
    private ParkingFloorStatus status;
}
