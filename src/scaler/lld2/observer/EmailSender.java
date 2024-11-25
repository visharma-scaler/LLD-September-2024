package scaler.lld2.observer;

public class EmailSender implements OrderPlacedSubscriber {

    public EmailSender() {
        Amazon.getInstance().registerOrderPlacedSubscriber(this);
    }

    public void sendEmail() {
        System.out.println("Sending email ...");
    }

    @Override
    public void announceOrderPlaced() {
        sendEmail();
    }
}
