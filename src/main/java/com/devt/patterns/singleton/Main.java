package com.devt.patterns.singleton;

public class Main {

    public static void main(String[] args) {
        MySingleton mySingleton = MySingleton.getInstance();
        mySingleton.doSomething();
    }

}
