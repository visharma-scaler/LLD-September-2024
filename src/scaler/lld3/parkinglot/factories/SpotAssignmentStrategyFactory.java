package scaler.lld3.parkinglot.factories;

import scaler.lld3.parkinglot.models.SpotAssignmentStrategyType;
import scaler.lld3.parkinglot.strategy.spotassignmentstrategy.NearestFirstSpotAssignmentStrategy;
import scaler.lld3.parkinglot.strategy.spotassignmentstrategy.RandomSpotAssignmentStrategy;
import scaler.lld3.parkinglot.strategy.spotassignmentstrategy.SpotAssignmentStrategy;

public class SpotAssignmentStrategyFactory {

    public static SpotAssignmentStrategy getSpotAssignmentStrategyForType(SpotAssignmentStrategyType type) {
        return switch (type) {
            case RANDOM -> new RandomSpotAssignmentStrategy();
            case NEAREST_FIRST -> new NearestFirstSpotAssignmentStrategy();
            default -> new RandomSpotAssignmentStrategy();
        };
    }
}
