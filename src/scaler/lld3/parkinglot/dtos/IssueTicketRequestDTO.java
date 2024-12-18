package scaler.lld3.parkinglot.dtos;

import scaler.lld3.parkinglot.models.ParkingSpot;
import scaler.lld3.parkinglot.models.Vehicle;

public class IssueTicketRequestDTO {
    private Vehicle vehicle;
    private ParkingSpot parkingSpot;

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }
}