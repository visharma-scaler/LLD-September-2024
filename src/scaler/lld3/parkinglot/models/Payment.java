package scaler.lld3.parkinglot.models;

import java.util.Date;

public class Payment extends BaseModel {
    private PaymentMode paymentMode;
    private double amount;
    private String referenceNumber;
    private PaymentStatus status;
    private Date time;
}
