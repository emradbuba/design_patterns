package io.github.guit4rfre4k.designpatterns.abstractfactory.factory;

public class FriendlyEmailPartsFactory extends AbstractEmailPartsFactory {

    @Override
    public String getGreeting() {
        return "Hi,";
    }

    @Override
    public String getSignature() {
        return "Chris";
    }

    @Override
    public String getEnding() {
        return "Cheers,";
    }
}
