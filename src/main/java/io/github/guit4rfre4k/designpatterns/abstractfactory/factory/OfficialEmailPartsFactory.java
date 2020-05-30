package io.github.guit4rfre4k.designpatterns.abstractfactory.factory;

public class OfficialEmailPartsFactory extends AbstractEmailPartsFactory {

    @Override
    public String getGreeting() {
        return "Dear Sir or Madam,";
    }

    @Override
    public String getSignature() {
        return "Christian Brown";
    }

    @Override
    public String getEnding() {
        return "Your faithfully,";
    }
}
