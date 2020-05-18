package io.github.guit4rfre4k.designpatterns.builder.ericsson;

import io.github.guit4rfre4k.designpatterns.builder.CustomerProblemEmailMessageTextBuilder;

public class EricssonProblemEmailMessageTextBuilder implements CustomerProblemEmailMessageTextBuilder {

    private EricssonProblem problem;

    public void setProblem(EricssonProblem problem) {
        this.problem = problem;
    }

    @Override
    public String getProblemHeader() {
        return "Ericsson problem detected | code=" + problem.getProblemCode();
    }

    @Override
    public String getProblemDescription() {
        StringBuilder sb = new StringBuilder();
        for (EricssonIssue issue : problem.getIssues()) {
            sb.append("Issue code: ").append(issue.getIssueCode())
                    .append("\n").append("(").append(issue.getIssueSummary()).append("):")
                    .append("\n Details:").append(issue.getIssueDetails()).append("\n\n");
        }
        return sb.toString();
    }
}
