package com.devt.patterns.command;

import lombok.Getter;
import lombok.Setter;

public class Radio {

    @Getter
    @Setter
    private int volume;

    public Radio() {
        this.volume = 0;
    }

}
