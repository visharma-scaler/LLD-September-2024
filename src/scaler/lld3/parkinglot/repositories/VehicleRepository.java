package scaler.lld3.parkinglot.repositories;

import scaler.lld3.parkinglot.models.Vehicle;

import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

public class VehicleRepository {

    //List
    //Map

    Map<Long, Vehicle> vehicleMap = new TreeMap<>();

    private long previousId = 0;

    public Optional<Vehicle> findByVehicleNumber(String vehicleNumber) {
        return vehicleMap.values()
                .stream()
                .filter(vehicle -> vehicle.getNumber().equals(vehicleNumber))
                .findFirst();
    }

    public Vehicle save(Vehicle vehicle) {
        previousId = previousId + 1;
        vehicle.setId(previousId);
        vehicleMap.put(previousId, vehicle);
        return vehicle;
    }
}
