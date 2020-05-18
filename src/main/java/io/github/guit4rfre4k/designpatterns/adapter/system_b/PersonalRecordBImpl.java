package io.github.guit4rfre4k.designpatterns.adapter.system_b;

import lombok.AllArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
public class PersonalRecordBImpl implements PersonalRecordB {

    private String firstAndSecondName;
    private String surname;
    private int yearOfBirth;


    @Override
    public String getFirstAndSecondName() {
        return firstAndSecondName;
    }

    @Override
    public String getFirstSecondAndSurname() {
        return firstAndSecondName + " " + surname;
    }

    @Override
    public int getAge() {
        return LocalDate.now().getYear() - yearOfBirth;
    }
}
