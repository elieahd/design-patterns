package com.devt.patterns.command;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Radio radio = new Radio();
        RadioInvoker remonteControl = new RadioInvoker(Arrays.asList(
                new RadioVolumeUp(radio),
                new RadioVolumeUp(radio),
                new RadioVolumeUp(radio),
                new RadioVolumeUp(radio),
                new RadioVolumeUp(radio),
                new RadioVolumeDown(radio),
                new RadioVolumeUp(radio)
        ));
        remonteControl.execute();
        System.out.println("New volume : " + radio.getVolume());
    }



}
