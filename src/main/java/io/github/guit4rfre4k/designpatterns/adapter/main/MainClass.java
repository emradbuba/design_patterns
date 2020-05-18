package io.github.guit4rfre4k.designpatterns.adapter.main;

import io.github.guit4rfre4k.designpatterns.adapter.system_a.PersonRecordA;
import io.github.guit4rfre4k.designpatterns.adapter.system_b.PersonFromSystemAAdapter;
import io.github.guit4rfre4k.designpatterns.adapter.system_b.PersonalRecordB;
import io.github.guit4rfre4k.designpatterns.adapter.system_b.PersonalRecordBImpl;
import io.github.guit4rfre4k.designpatterns.adapter.system_b.PersonalRecordsRaportGenerator;

import java.util.HashSet;
import java.util.Set;

public class MainClass {

    public static void main(String[] args) {

        Set<PersonalRecordB> recordsB =  new HashSet<>();
        recordsB.add(new PersonFromSystemAAdapter(new PersonRecordA("Gregor", "Matt", "Sitlinksy", (short) 29)));
        recordsB.add(new PersonalRecordBImpl("Radek Michal", "Mzdk", 1988));
        recordsB.add(new PersonalRecordBImpl("Angelo Micheal", "Schwarz", 1993));
        recordsB.add(new PersonalRecordBImpl("Martha Isabell", "Bright", 1998));
        recordsB.add(new PersonFromSystemAAdapter(new PersonRecordA("Arthur", "Jack", "Lemon", (short) 54)));
        PersonalRecordsRaportGenerator generator = new PersonalRecordsRaportGenerator();
        generator.printRaport(recordsB);

    }

}
