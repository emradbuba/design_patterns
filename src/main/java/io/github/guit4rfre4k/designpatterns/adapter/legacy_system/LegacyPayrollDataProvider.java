package io.github.guit4rfre4k.designpatterns.adapter.legacy_system;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LegacyPayrollDataProvider {

    public List<LegacyPayrollData> getPayrollData() {
        return Stream.of(
                new LegacyPayrollData("Andrew Timmons", 10000.0, 1900.0, 1200.0, 750.0),
                new LegacyPayrollData("Kathrine Milevic", 15000.0, 2700.0, 2400.0, 1050.0),
                new LegacyPayrollData("Sophie Rene", 7000.0, 750.0, 0.0, 0.0)
        ).collect(Collectors.toList());
    }
}
