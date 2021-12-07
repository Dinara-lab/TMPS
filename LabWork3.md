# Topic: *Behavioral Design Patterns*
#### Author: *Bucila Dinara*
#### Group: *FAF-193*
## Theory
In software engineering, behavioral design patterns are design patterns that identify common communication patterns between objects and realize these patterns.
By doing so, these patterns increase flexibility in carrying out this communication.
Behavioral patterns are concerned with the assignment of responsibilities between objects, or, encapsulating behavior in an object and delegating requests to it.
Unlike the Creational and Structural patterns, which deal with the instantiation process and the blueprint of objects and classes, the central idea here is to concentrate on the way objects are interconnected.

1. Mediator Design Pattern

Mediator helps in establishing loosely coupled communication between objects and helps in reducing the direct references to each other.

2. Observer Design Pattern

Observer pattern defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.
It is also referred to as the publish-subscribe pattern.

3. State Design Pattern

A state allows an object to alter its behavior when its internal state changes. The object will appear to change its class.

4. Memento Design Pattern

Memento pattern is used to restore state of an object to a previous state. It is also known as snapshot pattern.
The intent of memento pattern is to capture the internal state of an object without violating encapsulation and thus providing a mean for restoring the object into initial state when needed.

5. Iterator Design Pattern
   
An iterator design pattern provides a way to access the elements of an aggregate object sequentially without exposing its underlying representation.

6. Command Design Pattern

Command pattern is a behavioral design pattern which is useful to abstract business logic into discrete actions i.e. commands. It motivates loose coupling.

7. Strategy Design Pattern

Strategy design pattern is behavioral design pattern where we choose a specific implementation of algorithm or task in run time – out of multiple other implementations for same task.

8. Template Method Design Pattern

Template method design pattern is widely accepted behavioral design pattern to enforce some sort of algorithm (fixed set of steps) in the context of programming.
It defines the sequential steps to execute a multi-step algorithm and optionally can provide a default implementation as well (based on requirements).

9. Visitor Design Pattern

The visitor design pattern is a way of separating an algorithm from an object structure on which it operates.
A practical result of this separation is the ability to add new operations to existing object structures without modifying those structures.

10. Chain of Responsibility Design Pattern

The main objective of this pattern is that it avoids coupling the sender of the request to the receiver, giving more than one object the opportunity to handle the request. 

Implementation & Explanation

In my laboratory work I have used state design pattern in order to describe patient's condition.
From medical perspective, there are several conditions that a patient can have:

1. Undetermined  - Patient awaiting physician and/or assessment.
   
2. Good - Vital signs are stable and within normal limits. Patient is conscious and comfortable. Indicators are excellent.
   
3. Serious - Vital signs may be unstable and not within normal limits. Patient is seriously ill. Indicators are questionable.
   
4. Critical - Vital signs are unstable and not within normal limits. Patient may be unconscious. Indicators are unfavorable.

5. Fair -  Vital signs are stable and within normal limits. Patient is conscious, but may be uncomfortable. Indicators are favorable.

Every state can move to another state depending on the patient’s condition.

Each state is represented by a class :

Undetermined:

[![2021-12-07-17-46-30.png](https://i.postimg.cc/cLDWc65q/2021-12-07-17-46-30.png)](https://postimg.cc/hX7ND4BM)

Good:

[![2021-12-07-18-05-37.png](https://i.postimg.cc/d0x4nKYt/2021-12-07-18-05-37.png)](https://postimg.cc/jWyHdm2G)

Serious:

[![2021-12-07-18-06-40.png](https://i.postimg.cc/85dfchtQ/2021-12-07-18-06-40.png)](https://postimg.cc/CB1x6n3m)

Critical:

[![2021-12-07-18-07-24.png](https://i.postimg.cc/0jWQKZS3/2021-12-07-18-07-24.png)](https://postimg.cc/PvDhBW2z)

Fair:

[![2021-12-07-18-08-33.png](https://i.postimg.cc/mgx4X0Tj/2021-12-07-18-08-33.png)](https://postimg.cc/2Vxg39bL)

All states implement PatientState interface which contains the handle method which is implemented
individually according to the state:

[![2021-12-07-18-11-19.png](https://i.postimg.cc/9QNng9Ph/2021-12-07-18-11-19.png)](https://postimg.cc/HrXzVVPZ)

PatientCondition class represents the context. It maintains the instance of a concrete patient state (Undetermined, Good, Serious etc.)
subclass that defines the current state:

[![2021-12-07-18-30-55.png](https://i.postimg.cc/nLXvCMPV/2021-12-07-18-30-55.png)](https://postimg.cc/JyWyF78S)

Results/Conclusions

In the client, the PatientCondition object with the current patient state was created and after that, the doctor could 
assign this state to the patient. Additionally, the state is handled according to its type.

Client:

[![2021-12-07-18-33-48.png](https://i.postimg.cc/L6shHw72/2021-12-07-18-33-48.png)](https://postimg.cc/c6Vdh90b)

Result:

[![2021-12-07-18-33-37.png](https://i.postimg.cc/nzZcNPB8/2021-12-07-18-33-37.png)](https://postimg.cc/gwSWZ4g4)

In conclusion, behavioral design patterns  identify common communication patterns between objects and realize these patterns.
By doing so, these patterns increase flexibility in carrying out this communication.


