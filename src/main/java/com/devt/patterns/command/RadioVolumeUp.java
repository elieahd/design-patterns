package com.devt.patterns.command;

public class RadioVolumeUp implements Command {
    private Radio radio;

    public RadioVolumeUp(Radio radio) {
        this.radio = radio;
    }

    @Override
    public void execute() {
        this.radio.setVolume(this.radio.getVolume() + 1);
    }

    @Override
    public void rollback() {
        this.radio.setVolume(this.radio.getVolume() - 1);
    }

}
