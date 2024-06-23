package io.github.guit4rfre4k.designpatterns.adapter.main;

import io.github.guit4rfre4k.designpatterns.adapter.legacy_system.LegacyPayrollData;
import io.github.guit4rfre4k.designpatterns.adapter.legacy_system.LegacyPayrollDataProvider;
import io.github.guit4rfre4k.designpatterns.adapter.legacy_system.LegacyToModernPayrollDataAdapter;
import io.github.guit4rfre4k.designpatterns.adapter.modern_system.ModernPayrollData;
import io.github.guit4rfre4k.designpatterns.adapter.modern_system.ModernPayrollDataProvider;
import io.github.guit4rfre4k.designpatterns.adapter.modern_system.PayrollData;
import org.apache.commons.collections4.CollectionUtils;

import java.util.List;
import java.util.stream.Collectors;

public class MainClass {

    public static void main(String[] args) {
        final ModernPayrollDataProvider modernPayrollDataProvider = new ModernPayrollDataProvider();
        final LegacyPayrollDataProvider legacyPayrollDataProvider = new LegacyPayrollDataProvider();

        final List<PayrollData> payrollDataEntriesToReport = modernPayrollDataProvider.getPayrollData();

        final List<PayrollData> legacyPayrollDataEntries = legacyPayrollDataProvider.getPayrollData()
                .stream()
                .map(LegacyToModernPayrollDataAdapter::new)
                .collect(Collectors.toList());

        payrollDataEntriesToReport.addAll(legacyPayrollDataEntries);

        final ReportingSystem reportingSystem = new ReportingSystem();
        reportingSystem.createReportForPayrollData(payrollDataEntriesToReport);
    }
}
