package io.github.guit4rfre4k.designpatterns.command.cmds;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CommandB extends AbstractCommand {

    public CommandB(String name) {
        super(name);
    }

    @Override
    public void execute() {
        log.info(String.format("Executing command type B, name = %s", getName()));
    }
}
