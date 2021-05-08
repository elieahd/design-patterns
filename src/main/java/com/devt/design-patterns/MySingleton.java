package com.devt.design-patterns;

@Slf4j
public class MySingleton {

    private static final MySingleton INSTANCE = new MySingleton();

    private MySingleton() {
    }

    public MySingleton getInstance() {
        return INSTANCE;
    }

    public void doSomething() {

    }

}