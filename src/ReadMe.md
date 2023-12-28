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

