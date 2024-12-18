package scaler.lld3.parkinglot.models;

import java.util.Date;

public class Ticket extends BaseModel {
    private String number;
    private Date entryTime;
    private ParkingSpot assignedSpot;
    private Gate generatedAt;
    private Operator generatedBy;
    private Vehicle vehicle;
}
