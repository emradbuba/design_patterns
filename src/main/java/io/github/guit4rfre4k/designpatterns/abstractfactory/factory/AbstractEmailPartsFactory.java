package io.github.guit4rfre4k.designpatterns.abstractfactory.factory;

import io.github.guit4rfre4k.designpatterns.abstractfactory.model.EmailType;

public abstract class AbstractEmailPartsFactory {

    public static AbstractEmailPartsFactory getFactory(EmailType emailType) {
        switch (emailType) {
            case FRIENDLY:
                return new FriendlyEmailPartsFactory();
            case OFFICIAL:
                return new OfficialEmailPartsFactory();
            default:
                throw new IllegalArgumentException("No factory for email type " + emailType.name());
        }
    }

    public abstract String getGreeting();

    public abstract String getSignature();

    public abstract String getEnding();
}
