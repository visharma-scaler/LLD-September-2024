package scaler.lld1.multithreading.addersubtractor.atomicdatatypes;

import java.util.concurrent.atomic.*;

public class Counter {

    private AtomicInteger value;

    public Counter(AtomicInteger value) {
        this.value = value;
    }

    public AtomicInteger getValue() {
        return value;
    }
}
