package io.github.guit4rfre4k.designpatterns.adapter.legacy_system;

import io.github.guit4rfre4k.designpatterns.adapter.modern_system.PayrollData;
import lombok.AllArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
public class LegacyToModernPayrollDataAdapter implements PayrollData {

    private final LegacyPayrollData legacyPayrollData;

    @Override
    public String getNameLine() {
        return legacyPayrollData.getPersonName();
    }

    @Override
    public BigDecimal getPayrollGross() {
        return BigDecimal.valueOf(legacyPayrollData.getGrossSalary());
    }

    @Override
    public BigDecimal getPayrollNet() {
        return getPayrollGross()
                .subtract(getRetirementInsuranceMandatorySum())
                .subtract(getHealthInsuranceSum())
                .subtract(getIncomeTaxSum());
    }

    @Override
    public BigDecimal getRetirementInsuranceMandatorySum() {
        return BigDecimal.valueOf(legacyPayrollData.getRetirementSum());
    }

    @Override
    public BigDecimal getRetirementInsuranceOptionalSum() {
        // Legacy system does not support optional retirement
        return BigDecimal.ZERO;
    }

    @Override
    public BigDecimal getIncomeTaxSum() {
        return BigDecimal.valueOf(legacyPayrollData.getTax());
    }

    @Override
    public BigDecimal getHealthInsuranceSum() {
        return BigDecimal.valueOf(legacyPayrollData.getHealthSum());
    }
}
