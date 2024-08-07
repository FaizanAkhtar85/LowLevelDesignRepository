`Design Patten`
****************

`The Strategy Pattern`   
is a behavioral design pattern that defines a family of algorithms, encapsulates each algorithm, and makes them interchangeable. The strategy pattern allows the client to choose the appropriate algorithm at runtime. Here's a real-world example of the Strategy Pattern:

Real-World Example:  
Payment Processing
Consider an e-commerce system that processes payments in different ways, such as credit card payments, PayPal, and Bitcoin. Each payment method has its own algorithm for processing payments. The Strategy Pattern can be applied to encapsulate these algorithms and allow the client (e-commerce system) to choose a payment method dynamically.

`The Template Method Pattern`  
is a behavioral design pattern that defines the skeleton of an algorithm in the superclass but lets subclasses override specific steps of the algorithm without changing its structure. It is used to create a method's template, where the overall structure is defined in a base class, and specific steps can be implemented by concrete subclasses.


`The Observer Pattern`   
is a behavioral design pattern where an object, known as the subject, maintains a list of its dependents, known as observers, that are notified of any state changes, typically by calling one of their methods. This pattern is widely used in scenarios where a change in one object requires changing others, such as keeping multiple views in sync with a model.

Let's consider a real-world example to illustrate the Observer Pattern:

Real-World Example:  
Weather Station
Imagine a weather station that gathers weather data (temperature, humidity, pressure) and broadcasts this information to multiple displays, such as a current conditions display, a statistics display, and a forecast display. The weather data is the subject, and the displays are the observers.

`The Decorator Pattern`   
is a structural design pattern that allows behavior to be added to an individual object, either statically or dynamically, without affecting the behavior of other objects from the same class. It is achieved by creating a set of decorator classes that are used to wrap concrete components. This pattern is useful for adding functionalities to classes in a flexible and reusable way.

`The Factory Pattern`   
is a creational design pattern that provides an interface for creating objects in a superclass but allows subclasses to alter the type of objects that will be created. It involves defining an interface or abstract class for creating objects and letting the subclasses decide which class to instantiate. This pattern promotes loose coupling and separation of concerns.

Here's a real-world example to illustrate the Factory Pattern:

Real-World Example: Vehicle Manufacturing
Consider a scenario where a vehicle manufacturing plant produces different types of vehicles, such as cars and motorcycles. The manufacturing process involves several steps, and different models of cars and motorcycles have variations in these steps.

`The Abstract Factory Pattern`    
is a creational design pattern that provides an interface for creating families of related or dependent objects without specifying their concrete classes. It involves creating multiple factory interfaces (abstract factories), each responsible for creating a family of related products. Concrete factories implement these interfaces to produce specific product instances.


`The Chain of Responsibility Pattern`   
is a behavioral design pattern that allows an object to pass a request along a chain of handlers. Each handler in the chain decides either to process the request or to pass it to the next handler in the chain. This pattern decouples the sender of a request from its receiver and allows multiple objects to handle the request without the sender needing to know which object will ultimately process it.

`The Proxy Pattern`   
is a structural design pattern that provides a surrogate or placeholder for another object to control access to it. It involves creating a class (the proxy) that has the same interface as the real object, so the proxy can be used as a substitute for the real object. The proxy controls access to the real object, allowing additional functionality to be introduced, such as lazy loading, access control, logging, or monitoring.

`The Null Object Pattern`   
is a behavioral design pattern that provides an object as a surrogate for the lack of an object of a given type. Instead of using null to represent the absence of an object, a null object is created and used. This pattern helps avoid null checks and handles the absence of an object transparently.

`The State Design Pattern`        
is a behavioral design pattern that allows an object to alter its behavior when its internal state changes. The pattern encapsulates the object's state into separate classes and delegates the state-specific behavior to these classes.

Let's consider a real-world example of the State Pattern in the context of a vending machine.

`The Composite Design Pattern`        
is a structural design pattern that allows you to compose objects into tree-like structures to represent part-whole hierarchies. It lets clients treat individual objects and compositions of objects uniformly.

`The Adapter Design Pattern`    
is a structural design pattern that allows the interface of an existing class to be used as another interface. It is often used to make existing classes work with others without modifying their source code.

`The Facade Design Pattern`   
is a structural design pattern that provides a unified interface to a set of interfaces in a subsystem. It defines a higher-level interface that makes the subsystem easier to use.

`The Singleton Design Pattern`    
ensures that a class has only one instance and provides a global point of access to that instance. It is commonly used when exactly one object is needed to coordinate actions across the system. Here's a real-world example of a Singleton pattern with a Logger implementation:

`The Builder Design Pattern`    
is a creational pattern that separates the construction of a complex object from its representation, allowing the same construction process to create different representations. This pattern is particularly useful when an object needs to be created with many optional parameters.

`The Prototype Design Pattern`    
is a creational pattern that involves creating new objects by copying an existing object, known as the prototype. This pattern is useful when the cost of creating a new instance of an object is more expensive or complex than copying an existing instance.

`The Bridge Pattern`    
is a structural design pattern that separates abstraction from implementation, allowing them to vary independently. It involves creating a bridge interface, which acts as a bridge between client code and the actual implementation. This pattern is useful when you want to avoid a permanent binding between an abstraction and its implementation and when both the abstraction and implementation need to evolve independently.

********************************************

LLD Topics 🔥 🔥 :
-----------------------------

S.O.L.I.D Principles    
Strategy Pattern     `Done`  
Observer Pattern     `Done`   
Design Notify-Me Button Functionality     
Decorator Pattern       
Design  Pizza Billing System     
Factory Pattern      
Design  Parking Lot     
Abstract Factory Pattern      
Design  Snake n Ladder game      
Chain of Responsibility Pattern     
Design Elevator System        
Proxy Pattern     
Design Car Rental System      
Null Object Pattern     
Design Logging System      
State Pattern        
Design Tic-Tac-Toe game    
Composite Pattern    
Design BookMyShow & Concurrency handling     
Adapter Pattern      
Design Vending Machine     
Singleton Pattern    
Design ATM     
Builder Pattern      
Design Chess game    
Prototype Pattern    
Design File System      
Bridge Pattern    
Design Splitwise     
Façade Pattern    
Splitwise Simplify Algorithm / Optimal Accounting Balancing       
Flyweight Pattern    
Design CricBuzz / CricketInfo    
Command Pattern      
Design True Caller      
Interpreter Pattern     
Design Car Booking Service like Ola, Uber    
Iterator Pattern     
Design Online Hotel Booking System     
Mediator Pattern     
Design Library Management System    
Memento Pattern         
Design  Traffic Light System        
Template Method Pattern    `Done`   
Design Meeting Scheduler         
Visitor Pattern         
Design Online Voting System      
Design Inventory Management System        
Design Cache Mechanism        
Design LinkedIn         
Design Amazon        
Design Airline Management System       
Design Stock Exchange System        
Design Learning Management System         
Design a Calendar Application       
Design (LLD) Payment System         
Design (LLD) Chat based system         
Design Food delivery app like Swiggy and Zomato       
Design Community Discussion Platform         
Design Restaurant Management System       
Design Bowling Alley Machine     
Design (LLD) Rate Limiter     

HLD topics 🔥 🔥 :
-----------------------------
Learn About Network Protocols (TCP, Websocket, HTTP etc.)         
Client-Server Vs Peer 2 Peer Architecture    
C.A.P Theorem     
Microservices Imp. Design Patterns (SAGA pattern, Strangler Pattern)    
Scale from 0 to Million Users    
Design Consistent Hashing     
Design URL Shortening      
Back of the Envelope Estimation     
Design Key-Value Store     
SQL vs NoSQL, When to Use Which DB     
Design WhatsApp      
Design Rate Limiter     
Design Search Autocomplete System / Typeahead System     
Understand Message Queue , Kafka etc.     
What is Proxy Servers      
What is CDN    
Storage types:    
(Block Storage, File Storage, Object Storage (S3) , RAID)         
File System    
(Google File System, HDFS)    
Bloom Filter         
Merkle Tree , Gossiping Protocol       
Caching     
(Cache Invalidation, Cache eviction)         
How to Scale Database      
- Sharding (Horizontal and Vertical)      
  - Partitioning  
    - Replication, Mirroring 
    - Leader Election
      - Indexing etc.         
        Design Notification System     
        Design Pastebin       
        Design Twitter     
        Design Dropbox     
        Design Instagram      
        Design YouTube     
        Design Google Drive      
        Design Web Crawler    
        Design Facebook News Feed / Newsfeed System      
        Design Ticket Master     
        Design NearByFriends or Yelp      

        
************************************************
`Java New Features`

Java 8 introduced several significant features and concepts that aimed to improve the language's expressiveness, simplicity, and support for modern programming practices. Some key concepts introduced in Java 8 include:

Lambda Expressions:

1. Lambda expressions enable the concise representation of anonymous functions (functional interfaces) in Java.
They are particularly useful for writing code in a more functional style.
   Functional Interfaces:

2. Functional interfaces are interfaces with a single abstract method and can have multiple default or static methods.
The @FunctionalInterface annotation can be used to ensure that an interface has only one abstract method.

