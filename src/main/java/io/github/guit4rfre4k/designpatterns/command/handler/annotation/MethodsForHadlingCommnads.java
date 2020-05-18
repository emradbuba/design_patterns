package io.github.guit4rfre4k.designpatterns.command.handler.annotation;

import io.github.guit4rfre4k.designpatterns.command.cmds.Command;
import io.github.guit4rfre4k.designpatterns.command.cmds.CommandA;
import io.github.guit4rfre4k.designpatterns.command.cmds.CommandB;
import lombok.extern.slf4j.Slf4j;

/**
 * These methods are user to handle command using the reflection logic programmed in
 * the {@link io.github.guit4rfre4k.designpatterns.command.handler.HandlerReflection} class.
 */
@Slf4j
public class MethodsForHadlingCommnads {

    public MethodsForHadlingCommnads() {
    }

    @HandlerMethod
    public void handleCommandA(CommandA commandA) {
        log.info("Executing command for command A...");
        executeCommand(commandA);
    }

    @HandlerMethod
    public void handleCommandB(CommandB commandB) {
        log.info("Executing command for command B...");
        executeCommand(commandB);
    }

    @HandlerMethod
    public void handleAllCommands(Command c) {
        log.info("Executing command for Command interface...");
        executeCommand(c);
    }

    private void executeCommand(Command c) {
        c.execute();
        log.info("Execution finished...");
    }

}
