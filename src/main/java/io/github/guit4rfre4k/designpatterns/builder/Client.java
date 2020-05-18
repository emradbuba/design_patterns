package io.github.guit4rfre4k.designpatterns.builder;

import io.github.guit4rfre4k.designpatterns.builder.ericsson.EricssonIssue;
import io.github.guit4rfre4k.designpatterns.builder.ericsson.EricssonProblem;
import io.github.guit4rfre4k.designpatterns.builder.ericsson.EricssonProblemEmailMessageTextBuilder;
import io.github.guit4rfre4k.designpatterns.builder.siemens.SiemensProblem;
import io.github.guit4rfre4k.designpatterns.builder.siemens.SiemensProblemEmailMessageTextBuilder;

import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Client {

    private static final EmailClient emailClient = new EmailClient();

    public static void main(String[] args) {

        EmailMessage emailMessageSiemens = getEmailSampleMessageForSiemens();
        emailClient.send(emailMessageSiemens);

        EmailMessage emailMessageEricsson = getSampleEmailMessageForEricsson();
        emailClient.send(emailMessageEricsson);
    }

    private static EmailMessage getSampleEmailMessageForEricsson() {
        EricssonProblem ericssonProblem = createSampleEricssonProblem();

        EricssonProblemEmailMessageTextBuilder emailMessageTextBuilder = new EricssonProblemEmailMessageTextBuilder();
        emailMessageTextBuilder.setProblem(ericssonProblem);

        CustomerProblemEmailMessageBuilder emailMessageBuilder = new CustomerProblemEmailMessageBuilder();
        emailMessageBuilder.setCustomerProblemEmailMessageTextBuilder(emailMessageTextBuilder);
        emailMessageBuilder.setTo(Stream.of("erisson-support@fuji.com", "support@fuji.com").collect(Collectors.toList()));
        emailMessageBuilder.setSubject("Ericsson problem with issues reported!");
        emailMessageBuilder.setPriority(Priority.NORMAL);

        return new EmailMessage(emailMessageBuilder);
    }

    private static EricssonProblem createSampleEricssonProblem() {
        EricssonProblem ericssonProblem = new EricssonProblem("ERICSSON-788");
        ericssonProblem.addIssue(new EricssonIssue("ERI-ISS-1", "IPv6 Suuport", "IPv6 support for basic networks does not work since Friday"));
        ericssonProblem.addIssue(new EricssonIssue("ERI-ISS-7", "Power failure", "Power supply errors in server room 34"));
        return ericssonProblem;
    }

    private static EmailMessage getEmailSampleMessageForSiemens() {
        SiemensProblem siemensProblem = createSampleSiemensProblem();

        SiemensProblemEmailMessageTextBuilder emailMessageTextBuilder = new SiemensProblemEmailMessageTextBuilder();
        emailMessageTextBuilder.setProblem(siemensProblem);

        CustomerProblemEmailMessageBuilder emailMessageBuilder = new CustomerProblemEmailMessageBuilder();
        emailMessageBuilder.setTo(Collections.singletonList("support@fuji.com"));
        emailMessageBuilder.setSubject("Siemens problem report");
        emailMessageBuilder.setCustomerProblemEmailMessageTextBuilder(emailMessageTextBuilder);
        emailMessageBuilder.setPriority(Priority.HIGH);

        return new EmailMessage(emailMessageBuilder);
    }

    private static SiemensProblem createSampleSiemensProblem() {
        return new SiemensProblem("SIM-1002", "Cooling failure", "CPU temperature raised to an critical values. Turned off!");
    }

}
