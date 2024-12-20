package scaler.lld3.parkinglot.controllers;

import scaler.lld3.parkinglot.dtos.IssueTicketRequestDTO;
import scaler.lld3.parkinglot.dtos.IssueTicketResponseDTO;
import scaler.lld3.parkinglot.dtos.ResponseStatus;
import scaler.lld3.parkinglot.models.Ticket;
import scaler.lld3.parkinglot.services.TicketService;

public class TicketController {

    private final TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public IssueTicketResponseDTO issueTicket(IssueTicketRequestDTO requestDTO) {
        IssueTicketResponseDTO responseDTO = new IssueTicketResponseDTO();
        try {
            Ticket ticket = ticketService.issueTicket(requestDTO.getVehicleType(),
                    requestDTO.getVehicleNumber(),
                    requestDTO.getVehicleOwnerName(),
                    requestDTO.getGateId());
            responseDTO.setTicket(ticket);
            responseDTO.setStatus(ResponseStatus.SUCCESS);
            responseDTO.setMessage("Ticket generated successfully!");
        } catch (Exception e) {
            responseDTO.setStatus(ResponseStatus.FAILURE);
            responseDTO.setMessage(e.getMessage());
        }
        return responseDTO;
    }

    //DTO -> Data Transfer Object
}
