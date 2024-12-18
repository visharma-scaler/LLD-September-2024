package scaler.lld3.parkinglot.models;

import scaler.lld3.parkinglot.strategy.FeeCalculationStrategy;
import scaler.lld3.parkinglot.strategy.SpotAssignmentStrategy;

import java.util.List;

public class ParkingLot extends BaseModel {

    private List<ParkingFloor> parkingFloors;
    private List<Gate> gates;
    private List<VehicleType> supportedVehicleTypes;
    private ParkingLotStatus status;
    private List<SpotAssignmentStrategy> spotAssignmentStrategies;
    private List<FeeCalculationStrategy> feeCalculationStrategies;

}
