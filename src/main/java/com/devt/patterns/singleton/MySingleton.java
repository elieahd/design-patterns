package com.devt.patterns.singleton;

public class MySingleton {

    // static member, instance of the singleton class
    private static final MySingleton INSTANCE = new MySingleton();

    // private constructor, to prevent to instantiate the singleton class
    private MySingleton() {
    }

    // static public method that provide the access to the singleton object
    public static MySingleton getInstance() {
        return INSTANCE;
    }

    public void doSomething() {
        System.out.println("Doing something in MySingleton class");
    }

}
