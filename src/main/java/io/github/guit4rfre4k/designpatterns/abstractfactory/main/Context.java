package io.github.guit4rfre4k.designpatterns.abstractfactory.main;

import java.net.URL;

import io.github.guit4rfre4k.designpatterns.abstractfactory.factory.AbstractEmailPartsFactory;
import io.github.guit4rfre4k.designpatterns.abstractfactory.model.Email;
import io.github.guit4rfre4k.designpatterns.abstractfactory.model.EmailType;
import io.github.guit4rfre4k.designpatterns.abstractfactory.utils.EmailPrinter;

public class Context {

    public static void main(String[] args) {

        URL officialEmainFileUrl = Context.class.getClassLoader().getResource("official-email-content.txt");
        URL friendlyEmailFileUrl = Context.class.getClassLoader().getResource("friendly-email-content.txt");

        AbstractEmailPartsFactory emailPartsFactoryForFriendlyMail = AbstractEmailPartsFactory.getFactory(EmailType.FRIENDLY);
        AbstractEmailPartsFactory emailPartsFactoryForOfficialMail = AbstractEmailPartsFactory.getFactory(EmailType.OFFICIAL);

        Email friendlyEmail = EmailGenerator.generateEmail(emailPartsFactoryForFriendlyMail, friendlyEmailFileUrl);
        Email officialEmail = EmailGenerator.generateEmail(emailPartsFactoryForOfficialMail, officialEmainFileUrl);

        EmailPrinter.printEmail(friendlyEmail);
        System.out.println("\n\n=========================\n\n");
        EmailPrinter.printEmail(officialEmail);
    }
}
