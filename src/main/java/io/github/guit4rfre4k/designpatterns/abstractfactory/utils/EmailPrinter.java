package io.github.guit4rfre4k.designpatterns.abstractfactory.utils;

import io.github.guit4rfre4k.designpatterns.abstractfactory.model.Email;

public class EmailPrinter {

    private final Email email;

    public EmailPrinter(Email email) {
        this.email = email;
    }

    public void printEmail(){
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
