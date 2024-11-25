package scaler.lld2.strategy;

public class BikePathCalculatorStrategy implements PathCalculatorStrategy {

    private static BikePathCalculatorStrategy instance = new BikePathCalculatorStrategy();

    private BikePathCalculatorStrategy() {

    }

    public static BikePathCalculatorStrategy getInstance() {
        return instance;
    }

    @Override
    public void findPath(String source, String destination) {
        System.out.println("Finding the best path using the bike mode");
    }
}
