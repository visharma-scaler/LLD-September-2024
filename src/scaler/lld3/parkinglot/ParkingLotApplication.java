package scaler.lld3.parkinglot;

import scaler.lld3.parkinglot.controllers.TicketController;
import scaler.lld3.parkinglot.dtos.IssueTicketRequestDTO;
import scaler.lld3.parkinglot.dtos.IssueTicketResponseDTO;
import scaler.lld3.parkinglot.models.VehicleType;
import scaler.lld3.parkinglot.repositories.GateRepository;
import scaler.lld3.parkinglot.repositories.ParkingLotRepository;
import scaler.lld3.parkinglot.repositories.TicketRepository;
import scaler.lld3.parkinglot.repositories.VehicleRepository;
import scaler.lld3.parkinglot.services.TicketService;

public class ParkingLotApplication {
    public static void main(String[] args) {

        // TicketController -> TicketService -> PLRepo, GateRepo

        // Application Context -> Prototype Registry pattern


        ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
        GateRepository gateRepository = new GateRepository();
        VehicleRepository vehicleRepository = new VehicleRepository();
        TicketRepository ticketRepository = new TicketRepository();


        TicketService ticketService = new TicketService(gateRepository,
                vehicleRepository, ticketRepository, parkingLotRepository);


        TicketController ticketController = new TicketController(ticketService);


        System.out.println("Application started at port 8080");


        IssueTicketResponseDTO responseDTO = ticketController.issueTicket(getIssueTicketRequestDTO());

        System.out.println(responseDTO);
    }

    private static IssueTicketRequestDTO getIssueTicketRequestDTO() {
        IssueTicketRequestDTO issueTicketRequestDTO = new IssueTicketRequestDTO();
        issueTicketRequestDTO.setGateId(1L);
        issueTicketRequestDTO.setVehicleNumber("123");
        issueTicketRequestDTO.setVehicleOwnerName("Vishal");
        issueTicketRequestDTO.setVehicleType(VehicleType.TWO_WHEELER);
        return issueTicketRequestDTO;
    }
}
