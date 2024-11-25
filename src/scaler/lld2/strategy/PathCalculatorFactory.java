package scaler.lld2.strategy;

public class PathCalculatorFactory {
    CarPathCalculatorStrategy carPathCalculatorStrategy = new CarPathCalculatorStrategy();
    WalkPathCalculatorStrategy walkPathCalculatorStrategy = new WalkPathCalculatorStrategy();

    public PathCalculatorStrategy getPathCalculator(TravelMode mode) {
        return switch (mode) {
            case CAR -> carPathCalculatorStrategy;
            case BIKE -> BikePathCalculatorStrategy.getInstance();
            case WALK -> walkPathCalculatorStrategy;
        };
    }
}
