package io.github.guit4rfre4k.designpatterns.adapter.modern_system;

import java.math.BigDecimal;

public interface PayrollData {

    String getNameLine();

    BigDecimal getPayrollGross();

    BigDecimal getPayrollNet();

    BigDecimal getRetirementInsuranceMandatorySum();

    BigDecimal getRetirementInsuranceOptionalSum();

    BigDecimal getIncomeTaxSum();

    BigDecimal getHealthInsuranceSum();

}
