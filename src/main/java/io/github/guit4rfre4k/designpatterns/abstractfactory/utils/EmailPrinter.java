package io.github.guit4rfre4k.designpatterns.abstractfactory.utils;

import io.github.guit4rfre4k.designpatterns.abstractfactory.model.Email;

public final class EmailPrinter {

    private EmailPrinter() {
        //no instances
    }

    public static void printEmail(Email email){
        StringBuilder builder = new StringBuilder(email.getGreeting())
                .append("\n\n")
                .append(email.getContent())
                .append("\n\n\n")
                .append(email.getEnding())
                .append("\n\n")
                .append(email.getSignature());
        System.out.println(builder);
    }
}
