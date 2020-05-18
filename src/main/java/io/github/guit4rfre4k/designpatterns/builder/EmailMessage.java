package io.github.guit4rfre4k.designpatterns.builder;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.List;

public class EmailMessage {

    private final List<String> toList;
    private final List<String> ccList;
    private final List<String> bccList;
    private final String subject;
    private final String messageText;
    private final boolean highPrio;

    public EmailMessage(EmailMessageBuilder emailMessageBuilder) {
        this.toList = emailMessageBuilder.getTo();
        this.ccList = emailMessageBuilder.getCc();
        this.bccList = emailMessageBuilder.getBcc();
        this.subject = emailMessageBuilder.getSubject();
        this.messageText = emailMessageBuilder.getMessageText();
        this.highPrio = emailMessageBuilder.getPriority() == Priority.HIGH;
        validate();
    }

    public List<String> getToList() {
        return toList;
    }

    public List<String> getCcList() {
        return ccList;
    }

    public List<String> getBccList() {
        return bccList;
    }

    public String getSubject() {
        return subject;
    }

    public String getMessageText() {
        return messageText;
    }

    public boolean isHighPrio() {
        return highPrio;
    }

    private void validate() {
        boolean noReciepient = CollectionUtils.isEmpty(this.toList);
        boolean noText = StringUtils.isBlank(this.messageText);
        if (noReciepient || noText) {
            throw new IllegalArgumentException("Incorrect email message: no 'to' or 'message text'");
        }
    }
}
