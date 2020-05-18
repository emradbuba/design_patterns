package io.github.guit4rfre4k.designpatterns.builder.siemens;

public class SiemensProblem {

    private final String issueId;
    private final String issueMainDescription;
    private final String issueDetails;

    public SiemensProblem(String issueId, String issueMainDescription, String issueDetails) {
        this.issueId = issueId;
        this.issueMainDescription = issueMainDescription;
        this.issueDetails = issueDetails;
    }

    public String getProblemId() {
        return issueId;
    }

    public String getMainTopic() {
        return issueMainDescription;
    }

    public String getProblemDetails() {
        return issueDetails;
    }
}
