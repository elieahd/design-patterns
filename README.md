# Design patterns

## What is a design pattern ?
Reusable solution to a commonly occurring problem within a given context in software design.
 
It is not a finished design that can be transformed directly into source or machine code.
 
Rather, it is a description or template for how to solve a problem that can be used in many different situations.

Design patterns are formalized best practices that the programmer can use to solve common problems when designing an application or system.

## Creational
A design pattern that deals with creating object in a manner suitable to a situation
| Design pattern                  | Description |
|---------------------------------|-------------|
| [Factory](/docs/factory.md)     | creating objects without having to specify the exact class of the object that will be created |
| [Builder](/docs/builder.md)     | constructing complex objects in a simplified manner |
| [Singleton](/docs/singleton.md) | restricting the instantiation of a class to one "single" instance |

## Structural
A design pattern that deals with assembling objects and classes into a flexible and efficient structure
| Design pattern                  | Description |
|---------------------------------|-------------|
| [Adapter](/docs/adapter.md)     | allowing objects with incompatible interfaces to collaborate |
| [Composite](/docs/composite.md) | composing objects into tree structures |
| [Decorator](/docs/decorator.md) | attaching new behaviors to objects |
| [Facade](/docs/facade.md)       | simplifying and restricting the code by a new wrapper class "facade" |

## Behavioural
A design pattern that deals with communications between objects
| Design pattern                | Description |
|-------------------------------|-------------|
| [Command](/docs/command.md)   | encapsulating in an object all data required to perform an action |
| [Observer](/docs/observer.md) | notifying observers about changes in its state |
| [Strategy](/docs/strategy.md) | selecting an algorithm at runtime  |
