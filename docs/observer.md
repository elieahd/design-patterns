# Observer

## Description
Notifying observers about the changes in its state 

## Diagram
<p align="center">
  <img src="diagrams/observer.png">
</p>

## Code
Check code [here](../src/main/java/com/devt/patterns/observer)

```java
public interface Channel {
    void update(Object o);
}
public class NewsChannel implements Channel {
    private String news;
    @Override
    public void update(Object o) {
        this.news = (String) o;
    }
}
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
```

To access the instance
```java
NewsAgency observable = new NewsAgency();
NewsChannel observer = new NewsChannel();
observable.add(observer);
observable.updateNews("news");
```
