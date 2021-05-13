package com.devt.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency {

    private String news;
    private List<Channel> channels;

    public NewsAgency() {
        channels = new ArrayList<>();
    }

    public void add(Channel channel) {
        channels.add(channel);
    }

    public void updateNews(String news) {
        this.news = news;
        channels.forEach(channel -> channel.update(news)); // notifying all channels
    }

}
