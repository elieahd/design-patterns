package com.devt.patterns.command;

import java.util.List;

public class RadioInvoker implements Command {

    private List<Command> commands;

    public RadioInvoker(List<Command> commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        commands.forEach(Command::execute);
    }

    @Override
    public void rollback() {
        commands.forEach(Command::rollback);
    }
}
