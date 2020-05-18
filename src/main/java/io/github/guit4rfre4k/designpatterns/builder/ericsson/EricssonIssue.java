package io.github.guit4rfre4k.designpatterns.builder.ericsson;

public class EricssonIssue {

    private final String issueCode;
    private final String issueSummary;
    private final String issueDetails;

    public EricssonIssue(String issueCode, String issueSummary, String issueDetails) {
        this.issueCode = issueCode;
        this.issueSummary = issueSummary;
        this.issueDetails = issueDetails;
    }

    public String getIssueCode() {
        return issueCode;
    }

    public String getIssueSummary() {
        return issueSummary;
    }

    public String getIssueDetails() {
        return issueDetails;
    }
}
