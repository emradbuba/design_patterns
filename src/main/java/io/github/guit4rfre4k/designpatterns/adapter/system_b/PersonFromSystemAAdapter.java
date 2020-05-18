package io.github.guit4rfre4k.designpatterns.adapter.system_b;

import io.github.guit4rfre4k.designpatterns.adapter.system_a.PersonRecordA;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PersonFromSystemAAdapter implements PersonalRecordB {

    private final PersonRecordA personA;

    @Override
    public String getFirstAndSecondName() {
        return personA.getFirstName() + " " + personA.getSecondName();
    }

    @Override
    public String getFirstSecondAndSurname() {
        return getFirstAndSecondName() + " " + personA.getSurname();
    }

    @Override
    public int getAge() {
        return personA.getAge();
    }
}
