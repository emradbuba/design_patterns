package io.github.guit4rfre4k.designpatterns.builder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EmailClient {

    private static final Logger LOG = LoggerFactory.getLogger(EmailClient.class);

    public void send(EmailMessage message) {
        LOG.info("Sending email message");
        logMessageBeingSent(message);
    }

    private void logMessageBeingSent(EmailMessage msg) {
        LOG.info("Sending email to {}", msg.getToList());
        LOG.info("Subject: {}", msg.getSubject());
        LOG.info(msg.getMessageText() + "\n\n\n");
    }

}
