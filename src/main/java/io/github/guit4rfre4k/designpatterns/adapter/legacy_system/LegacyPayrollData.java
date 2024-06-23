package io.github.guit4rfre4k.designpatterns.adapter.legacy_system;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class LegacyPayrollData {
    private final String personName;
    private final double grossSalary;
    private final double tax;
    private final double healthSum;
    private final double retirementSum;
}
