package io.github.guit4rfre4k.designpatterns.adapter.main;

import io.github.guit4rfre4k.designpatterns.adapter.modern_system.ModernPayrollData;
import io.github.guit4rfre4k.designpatterns.adapter.modern_system.PayrollData;

import java.math.BigDecimal;
import java.util.List;

public class ReportingSystem {

    public void createReportForPayrollData(final List<PayrollData> payrollDataEntries) {
        BigDecimal totalNetto = BigDecimal.ZERO;
        BigDecimal totalGross = BigDecimal.ZERO;

        for (PayrollData payrollDataEntry : payrollDataEntries) {
            System.out.println("=========================");
            System.out.println("Name: \t\t" + payrollDataEntry.getNameLine());
            System.out.println("-------------------------");
            System.out.println("Gross:\t\t\t" + payrollDataEntry.getPayrollGross());
            System.out.println("IncomeTax:\t\t" + payrollDataEntry.getIncomeTaxSum());
            System.out.println("Health:\t\t\t" + payrollDataEntry.getHealthInsuranceSum());
            System.out.println("Retire (m):\t\t" + payrollDataEntry.getRetirementInsuranceMandatorySum());
            System.out.println("Retire (o):\t\t" + payrollDataEntry.getRetirementInsuranceOptionalSum());
            System.out.println("-------------------------");
            System.out.println("NETTO: \t\t" + payrollDataEntry.getPayrollNet() + " PLN");
            System.out.println("-------------------------");

            totalNetto = totalNetto.add(payrollDataEntry.getPayrollNet());
            totalGross = totalGross.add(payrollDataEntry.getPayrollGross());
        }

        System.out.println();
        System.out.println();
        System.out.println("========= SUMMARY =========");
        System.out.println("TOTAL NETTO: \t" + totalNetto + " PLN");
        System.out.println("TOTAL BRUTTO: \t" + totalGross + " PLN");
    }
}
