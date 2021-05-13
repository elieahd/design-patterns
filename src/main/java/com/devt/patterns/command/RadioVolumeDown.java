package com.devt.patterns.command;

public class RadioVolumeDown implements Command {
    private Radio radio;

    public RadioVolumeDown(Radio radio) {
        this.radio = radio;
    }

    @Override
    public void execute() {
        this.radio.setVolume(this.radio.getVolume() - 1);
    }

    @Override
    public void rollback() {
        this.radio.setVolume(this.radio.getVolume() + 1);
    }

}
