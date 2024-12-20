package scaler.lld3.parkinglot.services;

import scaler.lld3.parkinglot.exceptions.GateNotFoundException;
import scaler.lld3.parkinglot.exceptions.ParkingLotNotFoundException;
import scaler.lld3.parkinglot.factories.SpotAssignmentStrategyFactory;
import scaler.lld3.parkinglot.models.*;
import scaler.lld3.parkinglot.repositories.GateRepository;
import scaler.lld3.parkinglot.repositories.ParkingLotRepository;
import scaler.lld3.parkinglot.repositories.TicketRepository;
import scaler.lld3.parkinglot.repositories.VehicleRepository;
import scaler.lld3.parkinglot.strategy.spotassignmentstrategy.SpotAssignmentStrategy;

import java.util.Date;

public class TicketService {

    private final GateRepository gateRepository;
    private final VehicleRepository vehicleRepository;
    private final TicketRepository ticketRepository;
    private final ParkingLotRepository parkingLotRepository;

    public TicketService(GateRepository gateRepository,
                         VehicleRepository vehicleRepository,
                         TicketRepository ticketRepository,
                         ParkingLotRepository parkingLotRepository) {
        this.gateRepository = gateRepository;
        this.vehicleRepository = vehicleRepository;
        this.ticketRepository = ticketRepository;
        this.parkingLotRepository = parkingLotRepository;
    }

    public Ticket issueTicket(VehicleType vehicleType,
                              String vehicleNumber,
                              String vehicleOwnerName,
                              Long gateId) throws GateNotFoundException, ParkingLotNotFoundException {

        // 1. validate the parameters
        // Check if the vehicle has an existing entry in the system
        // 2. Create an object of Ticket
        // 3. Assigning the parking slot
        // 4. Return the ticket

//        Optional<Gate> gateOptional = gateRepository.findById(gateId);
//        if (gateOptional.isEmpty()) {
//            throw new GateNotFoundException();
//        }
//        Gate generatedAt = gateOptional.get();
//

        Gate generatedAt = gateRepository.findById(gateId)
                .orElseThrow(GateNotFoundException::new);


        Vehicle savedVehicle = vehicleRepository.findByVehicleNumber(vehicleNumber)
                .orElseGet(() -> createNewVehicle(vehicleType, vehicleNumber, vehicleOwnerName));
//        Vehicle savedVehicle;
//
//        if (vehicleOptional.isEmpty()) {
//            savedVehicle = getVehicle(vehicleType, vehicleNumber, vehicleOwnerName);
//        } else {
//            savedVehicle = vehicleOptional.get();
//        }


        ParkingLot parkingLot = parkingLotRepository.findByGate(generatedAt)
                .orElseThrow(ParkingLotNotFoundException::new);

        SpotAssignmentStrategy spotAssignmentStrategy = SpotAssignmentStrategyFactory.getSpotAssignmentStrategyForType(parkingLot.getSpotAssignmentStrategyType());
        ParkingSpot spot = spotAssignmentStrategy.getSpot(generatedAt, vehicleType);

        Ticket ticket = new Ticket();
        ticket.setEntryTime(new Date());
        ticket.setGeneratedAt(generatedAt);
        ticket.setGeneratedBy(generatedAt.getCurrentOperator());
        ticket.setVehicle(savedVehicle);
        ticket.setAssignedSpot(spot);
        return ticketRepository.save(ticket);
    }

    private Vehicle createNewVehicle(VehicleType vehicleType, String vehicleNumber, String vehicleOwnerName) {
        Vehicle vehicle = new Vehicle();
        vehicle.setNumber(vehicleNumber);
        vehicle.setOwnerName(vehicleOwnerName);
        vehicle.setType(vehicleType);

        return vehicleRepository.save(vehicle);
    }
}


// Break till 08:30 AM IST
