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


1. I have used the Adapter Pattern in my system to perform a laboratory test. 
   
   Material is an interface which has the process method.
   
   [![2021-11-24-18-18-18.png](https://i.postimg.cc/QMpKGmbt/2021-11-24-18-18-18.png)](https://postimg.cc/hJttV9NW)    


   In the class LabTestWork, I have the property of the material.

   [![2021-11-24-18-20-38.png](https://i.postimg.cc/G2mL7xg6/2021-11-24-18-20-38.png)](https://postimg.cc/3yzQWmTZ)


   I have the Technical Material Class which has the method of analysis performing.

   [![2021-11-24-18-22-41.png](https://i.postimg.cc/YSsrPWc9/2021-11-24-18-22-41.png)](https://postimg.cc/Z96zB05t)


   So, I used MedicalLab Class in order to combine Material interface with Technical Material Class to use its method (and not create another one) to achieve the goal.

   [![2021-11-24-18-23-36.png](https://i.postimg.cc/7hXQBSct/2021-11-24-18-23-36.png)](https://postimg.cc/RJ6RhJvw)

2. Decorator Pattern was used in order to create detailed medical records for the patients.So I have 3 basic medical records in the system:
   based on patient demographics, diagnose and medications. 
   
   Patient Demographics:

   [![2021-11-24-18-25-26.png](https://i.postimg.cc/Dw4BsV2M/2021-11-24-18-25-26.png)](https://postimg.cc/Mnx72Ff7)

   Patient Diagnose:

   [![2021-11-24-18-27-20.png](https://i.postimg.cc/9XxpnX0k/2021-11-24-18-27-20.png)](https://postimg.cc/Z0dp9SrP)

   Patient Medications:

   [![2021-11-24-18-28-28.png](https://i.postimg.cc/xj7mmXc9/2021-11-24-18-28-28.png)](https://postimg.cc/kDQD3XQH)

   By using decorator, the client is able to create detailed medical records for different purposes in the future, for instance
   patientDemographicsAndMedications medical record which will contain both, information about patient demographics and medications. 

   [![2021-11-24-18-30-39.png](https://i.postimg.cc/pVnfqQNm/2021-11-24-18-30-39.png)](https://postimg.cc/YjMLSWC7)


   After the medical record is created, it will be set to a specific patient.
   

3. Facade pattern was used in order to perform similar actions  with different categories of visitors. In my system I have designed two classes of visitors based 
   on their status: registered or unregistered. 
   
   Registered Visitor:

   [![2021-11-24-18-33-37.png](https://i.postimg.cc/FzmHbQ5g/2021-11-24-18-33-37.png)](https://postimg.cc/34Sh7Vwd)


   Unregistered Visitor:

   [![2021-11-24-18-34-54.png](https://i.postimg.cc/C1CFx6BZ/2021-11-24-18-34-54.png)](https://postimg.cc/WF3R987j)


   For both categories there is a register method and getInformation method. 
   
   (implemented in IPatientStaff which is in package abstractions) :

   [![2021-11-24-18-50-38.png](https://i.postimg.cc/RZrJh2qd/2021-11-24-18-50-38.png)](https://postimg.cc/LnT80Ctg)

   Methods were implemented individually for each category.
   
   Registered Visitor (Patient):

      1. register method:

   [![2021-11-24-18-45-27.png](https://i.postimg.cc/nLbrVmRP/2021-11-24-18-45-27.png)](https://postimg.cc/xX5ntXSv)

     2. getInformation method:

     [![2021-11-24-18-47-01.png](https://i.postimg.cc/4yVZS2Z4/2021-11-24-18-47-01.png)](https://postimg.cc/T5dZy9pB)


   Unregistered Visitor:

      1. register method:

   [![2021-11-24-18-48-12.png](https://i.postimg.cc/sDmbgCnd/2021-11-24-18-48-12.png)](https://postimg.cc/0b6VVFRc)
   
      2. getInformation method:

   [![2021-11-24-18-49-40.png](https://i.postimg.cc/3NRmjpHZ/2021-11-24-18-49-40.png)](https://postimg.cc/9R6DCD04)
  
  
   After the client was registered as patient or as simple visitor, the appointment to a doctor could be set.


Results/Conclusions

In conclusion, by using adapter pattern I was able to make incompatible interfaces to work together (Material and Technical Material). 
Decorator pattern allowed me to extend functionality of medical record creation. I was able to add additional functionality dynamically.
The Facade pattern helped me create a unified interface to a set of interfaces in the subsystem.
Used properly, structural patterns can increase the efficiency of code, enhance its usability and flexibility. They reduce complexity by providing cleaner, simpler interfaces to a system that are easier to understand.
