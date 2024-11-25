package scaler.lld2.strategy;

public class WalkPathCalculatorStrategy implements PathCalculatorStrategy {

    @Override
    public void findPath(String source, String destination) {
        System.out.println("Finding the best path using the walk mode");
    }
}
