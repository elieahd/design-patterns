package com.devt.patterns.observer;

public class NewsChannel implements Channel {

    private String news;

    @Override
    public void update(Object o) {
        this.news = (String) o;
    }

}
