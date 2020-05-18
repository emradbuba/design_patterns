package io.github.guit4rfre4k.designpatterns.command.cmds;

public abstract class AbstractCommand implements Command {

    private final String name;

    public AbstractCommand(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
