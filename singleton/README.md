# Singleton

## Description
Creating an object while making sure that only single object gets created.

Poviding a way to access it without the need to instantiate the object of the class.

## Diagram
<p align="center">
  <img src="imgs/diagram.png">
</p>

## Code
```java
public class MySingleton {
  // static member, instance of the singleton class
  private static final MySingleton INSTANCE = new MySingleton();  
  // private constructor, to prevent to instantiate the singleton class
  private MySingleton() {}
  // static public method that provide the access to the singleton object
  public static MySingleton getInstance() {
    return INSTANCE;
  }
}
```

To access the instance 
```java
  MySingleton mySingletonInstance = MySingleton.getInstance();
```

## Use cases
- Loggers 
- JDBC connections
- ...
