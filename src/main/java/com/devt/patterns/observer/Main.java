package com.devt.patterns.observer;

public class Main {

    public static void main(String[] args) {
        NewsAgency observable = new NewsAgency();
        NewsChannel observer = new NewsChannel();
        observable.add(observer);
        observable.updateNews("news");
    }

}
