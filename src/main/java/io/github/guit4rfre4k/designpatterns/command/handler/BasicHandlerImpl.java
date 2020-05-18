package io.github.guit4rfre4k.designpatterns.command.handler;

import io.github.guit4rfre4k.designpatterns.command.cmds.Command;

public class BasicHandlerImpl implements CommandHandler {

    @Override
    public void handleCommand(Command cmd) {
        cmd.execute();
    }

}
