# Topic: *Creational Design Patterns*
#### Author: *Bucila Dinara*
#### Group: *FAF-193*
## Theory
Creational design patterns are concerned with the way of creating objects.These design patterns are used when a decision must be made at the time of instantiation of a class (i.e. creating an object of a class).

There are 5 types of creational design patterns:

1. Factory Method Pattern

* Factory Method Pattern allows the sub-classes to choose the type of objects to create.
* It promotes the loose-coupling by eliminating the need to bind application-specific classes into the code.


2. Abstract Factory Pattern

* Abstract Factory Pattern isolates the client code from concrete (implementation) classes.
* It eases the exchanging of object families.
*It promotes consistency among objects.

3. Sigleton Pattern

* Saves memory because object is not created at each request. Only single instance is reused again and again.


4. Prototype Pattern

* It reduces the need of sub-classing.
* It hides complexities of creating objects.
* The clients can get new objects without knowing which type of object it will be.
* It lets you add or remove objects at runtime.


5. Builder Pattern

* It provides clear separation between the construction and representation of an object.
* It provides better control over construction process.
* It supports to change the internal representation of objects.

Implementation & Explanation

In my laboratory work I have implemented 4 creational design patterns:

1. Singleton
2. Prototype
3. Factory Method
4. Abstract Factory Method

The chosen field was Hospital Management System. The models are divided in 3 subcategories:

* actors
* data
* structures


Singleton Pattern was used together with Abstract Factory Method Pattern in order to create instances of families of related classes:
AdministrationFactory, MedicineFactory and Patient Factory.

MedicineFactory Class: (The rest of Factory Classes were composed in the same way.)
[![Medicine-Factory.png](https://i.postimg.cc/DwFw77Rz/Medicine-Factory.png)](https://postimg.cc/ZC7Sczbk)

IFactory Abstraction:
[![2021-09-30-11-47-50.png](https://i.postimg.cc/mg2PWQcD/2021-09-30-11-47-50.png)](https://postimg.cc/TpFdr5JM)

ClientClass which use the Abstract Factory Pattern together with Singleton to create the objects:
[![2021-09-30-11-49-08.png](https://i.postimg.cc/C5hgn4pn/2021-09-30-11-49-08.png)](https://postimg.cc/34c6PmR3)

Prototype Pattern was used in Phone Class as this class is used in other classes and there is a need for cloning the instances:
[![2021-09-30-11-53-40.png](https://i.postimg.cc/tRKcc5M3/2021-09-30-11-53-40.png)](https://postimg.cc/fkv5txZy)

Factory Method Pattern was used in order to create different types of Medical Laboratory Tests:
I also used Singleton here:
[![2021-09-30-11-59-58.png](https://i.postimg.cc/CK0SV0r4/2021-09-30-11-59-58.png)](https://postimg.cc/4YWrzDgK)

ICreator Abstraction which contains IProduct factoryMethod:
[![2021-09-30-12-01-13.png](https://i.postimg.cc/3r08ptGm/2021-09-30-12-01-13.png)](https://postimg.cc/Z0ZzzFV5)

ClientClass where the objects are created:
[![2021-09-30-12-03-42.png](https://i.postimg.cc/GmLnMK4M/2021-09-30-12-03-42.png)](https://postimg.cc/nCPWrvY7)

Results/Conclusions

After implementing Abstract Factory Method I have obtained the following objects:

[![2021-09-30-12-09-57.png](https://i.postimg.cc/hGns8Zhj/2021-09-30-12-09-57.png)](https://postimg.cc/dhWGwB2P)

Objects obtained after implementing Factory Method:

[![2021-09-30-12-12-34.png](https://i.postimg.cc/P5CJ3dpV/2021-09-30-12-12-34.png)](https://postimg.cc/cvNd6ycf)

After completing this implementation I have reached to the conclusion that Creational Desingn
Patterns provide object creation mechanisms that can create objects in a controlled manner that are suitable to the situation.In this way, they help reduce complexities and instability, while also offering increased flexibility and allowing for the reuse of code.



