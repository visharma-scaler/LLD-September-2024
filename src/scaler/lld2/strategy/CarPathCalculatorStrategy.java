package scaler.lld2.strategy;

public class CarPathCalculatorStrategy implements PathCalculatorStrategy {

    @Override
    public void findPath(String source, String destination) {
        System.out.println("Finding the best path using the car mode");
    }
}
