package scaler.lld2.observer;

public class AnalyticsSender implements OrderPlacedSubscriber {

    public AnalyticsSender() {
        Amazon.getInstance().registerOrderPlacedSubscriber(this);
    }

    public void sendAnalyticsData() {
        System.out.println("Sending analytics data ...");
    }

    @Override
    public void announceOrderPlaced() {
        sendAnalyticsData();
    }
}
