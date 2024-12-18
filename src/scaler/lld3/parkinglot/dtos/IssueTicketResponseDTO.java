package scaler.lld3.parkinglot.dtos;

import scaler.lld3.parkinglot.models.Ticket;

public class IssueTicketResponseDTO {
    private Ticket ticket;
    private ResponseStatus status;
    private String message;

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public ResponseStatus getStatus() {
        return status;
    }

    public void setStatus(ResponseStatus status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
