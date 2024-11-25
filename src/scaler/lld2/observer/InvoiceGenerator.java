package scaler.lld2.observer;

public class InvoiceGenerator implements OrderPlacedSubscriber {

    public InvoiceGenerator() {
        Amazon.getInstance().registerOrderPlacedSubscriber(this);
    }

    public void generateInvoice() {
        System.out.println("Generating invoice ...");
    }

    @Override
    public void announceOrderPlaced() {
        generateInvoice();
    }
}
