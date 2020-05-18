package io.github.guit4rfre4k.designpatterns.builder;

import java.util.List;

public interface EmailMessageBuilder {

    public List<String> getTo();

    public List<String> getCc();

    public List<String> getBcc();

    public String getSubject();

    public String getMessageText();

    public Priority getPriority();

}
