package io.github.guit4rfre4k.designpatterns.adapter.modern_system;

import io.github.guit4rfre4k.designpatterns.adapter.modern_system.ModernPayrollData;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ModernPayrollDataProvider {

    public List<PayrollData> getPayrollData() {
        return Stream.of(
                        ModernPayrollData.builder()
                                .firstName("Jack")
                                .secondName("Andrew")
                                .surname("Russel")
                                .payrollGross(BigDecimal.valueOf(21_750))
                                .healthInsurancePercentage(BigDecimal.valueOf(8.5))
                                .incomeTaxInPercentage(BigDecimal.valueOf(19.0))
                                .retirementInsuranceMandatoryPercentage(BigDecimal.valueOf(10.0))
                                .retirementInsuranceOptionalPercentage(BigDecimal.valueOf(4.0))
                                .build(),
                        ModernPayrollData.builder()
                                .firstName("Thomas")
                                .surname("Kross")
                                .payrollGross(BigDecimal.valueOf(11_750))
                                .healthInsurancePercentage(BigDecimal.valueOf(8.5))
                                .incomeTaxInPercentage(BigDecimal.valueOf(19.0))
                                .retirementInsuranceMandatoryPercentage(BigDecimal.valueOf(10.0))
                                .retirementInsuranceOptionalPercentage(BigDecimal.valueOf(1.0))
                                .build(),
                        ModernPayrollData.builder()
                                .firstName("Michaela")
                                .surname("Weinberg")
                                .payrollGross(BigDecimal.valueOf(30750))
                                .healthInsurancePercentage(BigDecimal.valueOf(8.5))
                                .incomeTaxInPercentage(BigDecimal.valueOf(32.0))
                                .retirementInsuranceMandatoryPercentage(BigDecimal.valueOf(10.0))
                                .retirementInsuranceOptionalPercentage(BigDecimal.valueOf(3.5))
                                .build()
                )
                .collect(Collectors.toList());
    }
}
