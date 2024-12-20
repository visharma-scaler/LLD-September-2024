package scaler.lld3.parkinglot.strategy.spotassignmentstrategy;

import scaler.lld3.parkinglot.exceptions.GateNotFoundException;
import scaler.lld3.parkinglot.models.Gate;
import scaler.lld3.parkinglot.models.ParkingSpot;
import scaler.lld3.parkinglot.models.VehicleType;

public interface SpotAssignmentStrategy {

    ParkingSpot getSpot(Gate gate, VehicleType vehicleType) throws GateNotFoundException;

}
