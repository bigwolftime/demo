package com.example.demo.demos.service;

import com.example.demo.demos.common.MetricConstants;
import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.stereotype.Component;

@Component
public class MetricService {

    /**
     * register counter
     */
    private final Counter registerCounter;


    public MetricService(MeterRegistry meterRegistry) {
        this.registerCounter = Counter.builder(MetricConstants.REGISTER_COUNT).description("").register(meterRegistry);
    }

    public void register() {
        this.registerCounter.increment();
    }

}
