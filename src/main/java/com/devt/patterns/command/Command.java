package com.devt.patterns.command;

public interface Command {
    void execute();
    void rollback();
}
