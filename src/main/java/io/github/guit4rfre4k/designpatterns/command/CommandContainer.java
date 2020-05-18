package io.github.guit4rfre4k.designpatterns.command;

import io.github.guit4rfre4k.designpatterns.command.cmds.Command;
import io.github.guit4rfre4k.designpatterns.command.handler.CommandHandler;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class CommandContainer {

    private Set<Command> commands;
    private CommandHandler commandHandler;

    public void addCommand(Command c) {
        if(commands == null) {
            commands = new HashSet<>();
        }
        commands.add(c);
    }

    public void executeCommands() {
        CommandHandler handler = Objects.requireNonNull(commandHandler);
        for (Command command : commands) {
            handler.handleCommand(command);
        }
        commands.clear();
    }

    public void setHandler(CommandHandler cmdHandler) {
        this.commandHandler = Objects.requireNonNull(cmdHandler);
    }
}
