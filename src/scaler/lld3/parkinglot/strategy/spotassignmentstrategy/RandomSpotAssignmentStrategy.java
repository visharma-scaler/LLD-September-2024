package scaler.lld3.parkinglot.strategy.spotassignmentstrategy;

import scaler.lld3.parkinglot.exceptions.GateNotFoundException;
import scaler.lld3.parkinglot.models.Gate;
import scaler.lld3.parkinglot.models.ParkingSpot;
import scaler.lld3.parkinglot.models.ParkingSpotStatus;
import scaler.lld3.parkinglot.models.VehicleType;
import scaler.lld3.parkinglot.repositories.ParkingLotRepository;

public class RandomSpotAssignmentStrategy implements SpotAssignmentStrategy {

    private ParkingLotRepository parkingLotRepository;

    @Override
    public ParkingSpot getSpot(Gate gate, VehicleType vehicleType) throws GateNotFoundException {
//        ParkingLot parkingLot = parkingLotRepository.findByGate(gate)
//                .orElseThrow(GateNotFoundException::new);

//        for (ParkingFloor parkingFloor : parkingLot.getParkingFloors()) {
//            for (ParkingSpot spot : parkingFloor.getParkingSpots()) {
//                if (spot.getStatus().equals(ParkingSpotStatus.EMPTY) && spot.getSupportedVehicleTypes().contains(vehicleType)) {
//                    return spot;
//                }
//            }
//        }

        return parkingLotRepository.findByGate(gate)
                .flatMap(parkingLot ->
                        parkingLot.getParkingFloors()
                                .stream()
                                .flatMap(parkingFloor -> parkingFloor.getParkingSpots().stream())
                                .filter(parkingSpot -> parkingSpot.getStatus() == ParkingSpotStatus.EMPTY)
                                .filter(parkingSpot -> parkingSpot.getSupportedVehicleTypes().contains(vehicleType))
                                .findFirst()
                ).get();
    }
}
