package io.github.guit4rfre4k.designpatterns.command;

import io.github.guit4rfre4k.designpatterns.command.cmds.Command;
import io.github.guit4rfre4k.designpatterns.command.cmds.CommandA;
import io.github.guit4rfre4k.designpatterns.command.cmds.CommandB;
import io.github.guit4rfre4k.designpatterns.command.handler.HandlerReflection;

public class Context {
    public static void main(String[] args) {


        CommandContainer commandContainer = new CommandContainer();
        //commandContainer.setHandler(new BasicHandlerImpl());
        commandContainer.setHandler(new HandlerReflection());
        //
        Command commandA1 = new CommandA("Command A1");
        Command commandA2 = new CommandA("Command A2");
        Command commandB1 = new CommandB("Command B1");
        //
        commandContainer.addCommand(commandA1);
        commandContainer.addCommand(commandA2);
        commandContainer.addCommand(commandB1);
        //
        commandContainer.executeCommands();
    }

}
