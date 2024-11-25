package scaler.lld2.observer;

public class Client {
    public static void main(String[] args) {
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        EmailSender emailSender = new EmailSender();
        AnalyticsSender analyticsSender = new AnalyticsSender();

        Amazon.getInstance().orderPlace();

        // We have a API to deregister
        Amazon.getInstance().deregisterOrderPlacedSubscriber(emailSender);

        System.out.println();
        Amazon.getInstance().orderPlace();
    }
}
