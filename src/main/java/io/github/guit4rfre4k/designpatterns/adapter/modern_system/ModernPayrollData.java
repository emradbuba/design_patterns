package io.github.guit4rfre4k.designpatterns.adapter.modern_system;

import lombok.Builder;
import lombok.Getter;

import java.math.BigDecimal;

@Builder
public class ModernPayrollData implements PayrollData {

    private final String firstName;
    private final String secondName;
    private final String surname;

    @Getter
    private final BigDecimal payrollGross;
    private final BigDecimal incomeTaxInPercentage;
    private final BigDecimal retirementInsuranceMandatoryPercentage;
    private final BigDecimal retirementInsuranceOptionalPercentage;
    private final BigDecimal healthInsurancePercentage;

    public String getNameLine() {
        return String.format("%s%s %s", firstName, secondName == null ? "" : " " + secondName, surname);
    }

    public BigDecimal getPayrollNet() {
        return this.getPayrollGross()
                .subtract(this.getIncomeTaxSum())
                .subtract(this.getRetirementInsuranceMandatorySum())
                .subtract(this.getRetirementInsuranceOptionalSum())
                .subtract(this.getHealthInsuranceSum());
    }

    public BigDecimal getRetirementInsuranceMandatorySum() {
        BigDecimal percentageAsDecimal = this.retirementInsuranceMandatoryPercentage.divide(BigDecimal.valueOf(100));
        return this.getPayrollGross().multiply(percentageAsDecimal);
    }

    public BigDecimal getRetirementInsuranceOptionalSum() {
        BigDecimal percentageAsDecimal = this.retirementInsuranceOptionalPercentage.divide(BigDecimal.valueOf(100));
        return this.getPayrollGross().multiply(percentageAsDecimal);
    }

    public BigDecimal getIncomeTaxSum() {
        BigDecimal percentageAsDecimal = this.incomeTaxInPercentage.divide(BigDecimal.valueOf(100));
        return this.getPayrollGross().multiply(percentageAsDecimal);
    }

    public BigDecimal getHealthInsuranceSum() {
        BigDecimal percentageAsDecimal = this.healthInsurancePercentage.divide(BigDecimal.valueOf(100));
        return this.getPayrollGross().multiply(percentageAsDecimal);
    }
}
