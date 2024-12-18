package scaler.lld3.parkinglot.models;

import java.util.Date;
import java.util.List;

public class Bill extends BaseModel {
    private Date exitTime;
    private BillStatus status;
    private double amount;
    private Ticket ticket;
    private int billNumber;
    private Operator collectedBy;
    private Gate collectedAt;
    private List<Payment> payments;

    public Bill(Ticket ticket) {
        exitTime = new Date();
        status = BillStatus.UNPAID;
        this.ticket = ticket;
    }

    public Date getExitTime() {
        return exitTime;
    }

    public void setExitTime(Date exitTime) {
        this.exitTime = exitTime;
    }

    public BillStatus getStatus() {
        return status;
    }

    public void setStatus(BillStatus status) {
        this.status = status;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public int getBillNumber() {
        return billNumber;
    }

    public void setBillNumber(int billNumber) {
        this.billNumber = billNumber;
    }

    public Operator getCollectedBy() {
        return collectedBy;
    }

    public void setCollectedBy(Operator collectedBy) {
        this.collectedBy = collectedBy;
    }

    public Gate getCollectedAt() {
        return collectedAt;
    }

    public void setCollectedAt(Gate collectedAt) {
        this.collectedAt = collectedAt;
    }

    public List<Payment> getPayments() {
        return payments;
    }

    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }
}
