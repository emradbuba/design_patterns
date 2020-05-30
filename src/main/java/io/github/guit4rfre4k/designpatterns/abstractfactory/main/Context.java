package io.github.guit4rfre4k.designpatterns.abstractfactory.main;

import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;

import io.github.guit4rfre4k.designpatterns.abstractfactory.factory.AbstractEmailPartsFactory;
import io.github.guit4rfre4k.designpatterns.abstractfactory.model.Email;
import io.github.guit4rfre4k.designpatterns.abstractfactory.model.EmailType;
import io.github.guit4rfre4k.designpatterns.abstractfactory.utils.EmailPrinter;

public class Context {

    public static void main(String[] args) {

        URL officialResource = Context.class.getClassLoader().getResource("official-email-content.txt");
        URL friendlyResource = Context.class.getClassLoader().getResource("friendly-email-content.txt");

        AbstractEmailPartsFactory emailComposerFactory = AbstractEmailPartsFactory.getFactory(EmailType.FRIENDLY);
        Client client = new Client();
        Email friendlyEmail = client.generateEmail(emailComposerFactory, friendlyResource);
        EmailPrinter printer = new EmailPrinter(friendlyEmail);
        printer.printEmail();
        System.out.println("\n\n=========================\n\n");
        emailComposerFactory = AbstractEmailPartsFactory.getFactory(EmailType.OFFICIAL);
        Email officialEmail = client.generateEmail(emailComposerFactory, officialResource);
        printer = new EmailPrinter(officialEmail);
        printer.printEmail();
    }


}
