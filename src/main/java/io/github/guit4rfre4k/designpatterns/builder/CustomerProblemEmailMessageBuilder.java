package io.github.guit4rfre4k.designpatterns.builder;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CustomerProblemEmailMessageBuilder implements EmailMessageBuilder {

    private List<String> to;
    private List<String> cc;
    private List<String> bcc;
    private String subject;
    private CustomerProblemEmailMessageTextBuilder customerProblemEmailMessageTextBuilder;
    private Priority priority;

    public void setTo(List<String> to) {
        this.to = to;
    }

    public void setCc(List<String> cc) {
        this.cc = cc;
    }

    public void setBcc(List<String> bcc) {
        this.bcc = bcc;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setCustomerProblemEmailMessageTextBuilder(CustomerProblemEmailMessageTextBuilder customerProblemEmailMessageTextBuilder) {
        this.customerProblemEmailMessageTextBuilder = customerProblemEmailMessageTextBuilder;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    @Override
    public List<String> getTo() {
        return this.to;
    }

    @Override
    public List<String> getCc() {
        return this.cc;
    }

    @Override
    public List<String> getBcc() {
        return this.bcc;
    }

    @Override
    public String getSubject() {
        if (priority == Priority.HIGH) {
            return "[IMPORTANT!]" + this.subject;
        }
        return this.subject;
    }

    @Override
    public Priority getPriority() {
        return this.priority;
    }

    @Override
    public String getMessageText() {
        String header = customerProblemEmailMessageTextBuilder.getProblemHeader();
        StringBuilder sb = new StringBuilder()
                .append("\n" + IntStream.range(0, header.length()).mapToObj(i -> "=").collect(Collectors.joining("")))
                .append("\n" + customerProblemEmailMessageTextBuilder.getProblemHeader().toUpperCase())
                .append("\n" + IntStream.range(0, header.length()).mapToObj(i -> "=").collect(Collectors.joining("")))
                .append("\n\n")
                .append(customerProblemEmailMessageTextBuilder.getProblemDescription());
        return sb.toString();
    }
}
