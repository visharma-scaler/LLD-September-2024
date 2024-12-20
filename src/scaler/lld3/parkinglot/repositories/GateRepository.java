package scaler.lld3.parkinglot.repositories;

import scaler.lld3.parkinglot.models.Gate;

import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

public class GateRepository {

    private Map<Long, Gate> gateMap = new TreeMap<>();

    public Optional<Gate> findById(Long gateId) {
        return Optional.ofNullable(gateMap.get(gateId));
    }
}
