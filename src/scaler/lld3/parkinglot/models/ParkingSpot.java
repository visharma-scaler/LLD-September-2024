package scaler.lld3.parkinglot.models;

import java.util.List;

public class ParkingSpot extends BaseModel {

    private List<VehicleType> supportedVehicleTypes;
    private int number;
    private ParkingSpotStatus status;
    private ParkingFloor parkingFloor;

}
