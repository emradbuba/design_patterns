package io.github.guit4rfre4k.designpatterns.builder.ericsson;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EricssonProblem {

    private final String problemCode;

    private final List<EricssonIssue> issues = new ArrayList<>();


    public EricssonProblem(String problemCode) {
        this.problemCode = problemCode;
    }

    public void addIssue(EricssonIssue issue) {
        if (issue != null) {
            issues.add(issue);
        }
    }

    public String getProblemCode() {
        return problemCode;
    }

    public List<EricssonIssue> getIssues() {
        return Collections.unmodifiableList(issues);
    }
}
