# Topic: *Structural Design Patterns*
#### Author: *Bucila Dinara*
#### Group: *FAF-193*
## Theory
Structural design patterns are concerned with how classes and objects can be composed, to form larger structures.
The structural design patterns simplifies the structure by identifying the relationships.
These patterns focus on, how the classes inherit from each other and how they are composed from other classes.

There are following 7 types of structural design patterns:

1. Adapter Pattern
   
   Adapting an interface into another according to client expectation.
   
2. Bridge Pattern
   
   Separating abstraction (interface) from implementation.
   
3. Composite Pattern
   
   Allowing clients to operate on hierarchy of objects.
   
4. Decorator Pattern

   Adding functionality to an object dynamically.

5. Facade Pattern

   Providing an interface to a set of interfaces.  

6. Flyweight Pattern

   Reusing an object by sharing it.

7. proxy Pattern

   Representing another object.

Implementation & Explanation

In my Laboratory Work I have implemented 3 structural design patterns:

1. Adapter
2. Decorator
3. Facade


1. I have used the Adapter Pattern in my system to perform a laboratory test. Material is an interface which has the process method. In the class LabTestWork, I have the
   property of the material. I have the Technical Material Class which has the method of analysis performing. So, I used LabAdapter Class
   in order to combine Material interface with Technical Material Class to use its method (and not create another one) to achieve the goal.


2. Decorator Pattern was used in order to create detailed medical records for the patients.So I have 3 basic medical records in the system:
   based on patient demographics, diagnose and medications. By using decorator, the client is able to create detailed medical records for different purposes in the future, for instance
   patientDemographicsAndMedications medical record which will contain both, information about patient demographics and medications.
   

3. Facade pattern was used in order to perform similar actions  with different categories of visitors. In my system I have designed two classes of visitors based 
   on their status: registered or unregistered. Class Patient is for registered visitors and class UnregisteredVisitor is for unregistered. For both categories there is a register method and 
   getMedicalRecord method. They are implemented individually for each category. Facade pattern allows to implement just one single method which will decide the further implementation according to visitor type.


Results/Conclusions

Adapter Pattern:
[![2021-11-12-21-30-26.png](https://i.postimg.cc/ZRhrnY4r/2021-11-12-21-30-26.png)](https://postimg.cc/8FtFnSF5)

Decorator Pattern:
[![2021-11-12-21-33-40.png](https://i.postimg.cc/tJcJ1DWL/2021-11-12-21-33-40.png)](https://postimg.cc/tnhpw3r5)

Facade Pattern:
[![2021-11-12-21-35-27.png](https://i.postimg.cc/5tpxYnMn/2021-11-12-21-35-27.png)](https://postimg.cc/SX20HLRM)


In conclusion, by using adapter pattern I was able to make incompatible interfaces to work together (Material and Technical Material). 
Decorator pattern allowed me to extend functionality of medical record creation. I was able to add additional functionality dynamically.
The Facade pattern helped me create a unified interface to a set of interfaces in the subsystem.
Used properly, structural patterns can increase the efficiency of code, enhance its usability and flexibility. They reduce complexity by providing cleaner, simpler interfaces to a system that are easier to understand.