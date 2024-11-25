package scaler.lld2.strategy;

public class GoogleMaps {
    public void findPath(String source, String destination, TravelMode mode) {
//        if (mode == TravelMode.CAR) {
//            //...
//        }
//
//        if (mode == TravelMode.BIKE) {
//            //...
//        }

        PathCalculatorFactory pathCalculatorFactory = new PathCalculatorFactory();
        pathCalculatorFactory
                .getPathCalculator(mode)
                .findPath(source, destination);
    }
}
