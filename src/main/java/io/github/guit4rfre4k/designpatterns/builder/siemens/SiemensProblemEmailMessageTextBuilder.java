package io.github.guit4rfre4k.designpatterns.builder.siemens;

import io.github.guit4rfre4k.designpatterns.builder.CustomerProblemEmailMessageTextBuilder;

public class SiemensProblemEmailMessageTextBuilder implements CustomerProblemEmailMessageTextBuilder {

    private SiemensProblem problem;

    public void setProblem(SiemensProblem problem) {
        this.problem = problem;
    }

    @Override
    public String getProblemHeader() {
        return new StringBuilder()
                .append("[").append(problem.getProblemId()).append("] ")
                .append(problem.getMainTopic())
                .toString();
    }

    @Override
    public String getProblemDescription() {
        return problem.getProblemDetails();
    }
}
