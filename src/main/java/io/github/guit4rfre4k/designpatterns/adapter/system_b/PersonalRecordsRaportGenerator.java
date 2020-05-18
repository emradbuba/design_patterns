package io.github.guit4rfre4k.designpatterns.adapter.system_b;

import java.util.Set;

public class PersonalRecordsRaportGenerator {

    public void printRaport(Set<PersonalRecordB> records) {
        System.out.println("== This is the final report of all personal records ==");
        records.stream().map(r -> generateReportLine(r)).forEach(System.out::println);
        System.out.println("== end of the report ==");
    }

    private String generateReportLine(PersonalRecordB record) {
        StringBuilder sb = new StringBuilder();
        sb.append(" >> Person: ")
                .append(record.getFirstSecondAndSurname())
                .append(" (age: ").append(record.getAge()).append(")");
        return sb.toString();
    }

}
