package io.github.guit4rfre4k.designpatterns.abstractfactory.model;

public class Email {

    private final String greeting;
    private final String content;
    private final String ending;
    private final String signature;

    public Email(String greeting, String content, String ending, String signature) {
        this.greeting = greeting;
        this.content = content;
        this.ending = ending;
        this.signature = signature;
    }

    public String getGreeting() {
        return greeting;
    }

    public String getContent() {
        return content;
    }

    public String getEnding() {
        return ending;
    }

    public String getSignature() {
        return signature;
    }
}
