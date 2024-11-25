package scaler.lld2.observer;

import java.util.ArrayList;
import java.util.List;

public class Amazon {

    private static Amazon instance;
    List<OrderPlacedSubscriber> orderPlacedSubscribers;

    private Amazon() {
        orderPlacedSubscribers = new ArrayList<>();
    }

    public static Amazon getInstance() {
        if (instance == null) {
            instance = new Amazon();
        }
        return instance;
    }

    public void registerOrderPlacedSubscriber(OrderPlacedSubscriber subscriber) {
        orderPlacedSubscribers.add(subscriber);
    }

    public void deregisterOrderPlacedSubscriber(OrderPlacedSubscriber subscriber) {
        orderPlacedSubscribers.remove(subscriber);
    }

    public void orderPlace() {
        // inventory update
        // email notification

//        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
//        EmailSender emailSender = new EmailSender();
//        AnalyticsSender analyticsSender = new AnalyticsSender();

//        invoiceGenerator.generateInvoice();
//        emailSender.sendEmail();
//        analyticsSender.sendAnalyticsData();

        orderPlacedSubscribers.forEach(OrderPlacedSubscriber::announceOrderPlaced);

    }
}
