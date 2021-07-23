# JAVA DESIGN PATTERNS ❤️ 

![](https://img.shields.io/github/languages/count/CodeJamm/JAVA_Design_Patterns)   ![](https://img.shields.io/github/languages/top/CodeJamm/JAVA_Design_Patterns)

👋 I have created this module which consists of the Detailed definitions about the JAVA Design Patterns and their practical implementation through Codes.

# 🌱 History of Design Patterns

- In 1994, four authors Erich Gamma, Richard Helm, Ralph Johnson and John Vlissides published a book titled Design Patterns - Elements of Reusable Object-Oriented Software which initiated the concept of Design Pattern in Software development.
- These authors are collectively known as Gang of Four (GOF). According to these authors design patterns are primarily based on the following principles of object orientated design.
     1) Program to an interface not an implementation
     2) Favor object composition over inheritance

# 🔭 Types of Design Patterns

# Creational Patterns
- These design patterns provide a way to create objects while hiding the creation logic, rather than instantiating objects directly using new operator. 
- This gives program more flexibility in deciding which objects need to be created for a given use case.

# Structural Patterns
- These design patterns concern class and object composition. 
- Concept of inheritance is used to compose interfaces and define ways to compose objects to obtain new functionalities.

# Behavioral Patterns
- These design patterns are specifically concerned with communication between objects.

# J2EE Patterns
- These design patterns are specifically concerned with the presentation tier. 
- These patterns are identified by Sun Java Center.

# 👯 some of the most used Design Patterns available in JAVA are:

- Singleton Design Pattern
- Factory Design Pattern
- Builder Design Pattern
- Prototype Design Pattern
- Proxy Design Pattern
- Facade Design Pattern
- Composite Design Pattern
- Decorator Design Pattern
- Flyweight Design Pattern
- Adapter Design Pattern
- Bridge Design Pattern
- Observer Design Pattern 

# Singleton Design Pattern

- Singleton pattern is one of the simplest design patterns in Java. This type of design pattern comes under creational pattern as this pattern provides one of the best ways to create an object.
- This pattern involves a single class which is responsible to create an object while making sure that only single object gets created. This class provides a way to access its only object which can be accessed directly without need to instantiate the object of the class.


![image](https://user-images.githubusercontent.com/43011442/117574182-83d43580-b0f9-11eb-8cc9-c799a659f0e8.png)


# Factory Design Pattern

- Factory pattern is one of the most used design patterns in Java. This type of design pattern comes under creational pattern as this pattern provides one of the best ways to create an object.
- In Factory pattern, we create object without exposing the creation logic to the client and refer to newly created object using a common interface.


![image](https://user-images.githubusercontent.com/43011442/117574213-abc39900-b0f9-11eb-9cc3-f601b8c2c223.png)


# Builder Design Pattern

- Builder pattern builds a complex object using simple objects and using a step by step approach. This type of design pattern comes under creational pattern as this pattern provides one of the best ways to create an object.
- A Builder class builds the final object step by step. This builder is independent of other objects.


![image](https://user-images.githubusercontent.com/43011442/117574235-c990fe00-b0f9-11eb-8b8d-5c20c5388047.png)


# Prototype Design Pattern

- Prototype pattern refers to creating duplicate object while keeping performance in mind. This type of design pattern comes under creational pattern as this pattern provides one of the best ways to create an object.
- This pattern involves implementing a prototype interface which tells to create a clone of the current object. This pattern is used when creation of object directly is costly. For example, an object is to be created after a costly database operation. We can cache the object, returns its clone on next request and update the database as and when needed thus reducing database calls.


![image](https://user-images.githubusercontent.com/43011442/117574418-9b5fee00-b0fa-11eb-9143-880e563fc020.png)


# Proxy Design Pattern

- In proxy pattern, a class represents functionality of another class. This type of design pattern comes under structural pattern.
- In proxy pattern, we create object having original object to interface its functionality to outer world.


![image](https://user-images.githubusercontent.com/43011442/117574433-ae72be00-b0fa-11eb-8d4a-5bbea4c4a744.png)


# Facade Design Pattern

- Facade pattern hides the complexities of the system and provides an interface to the client using which the client can access the system. This type of design pattern comes under structural pattern as this pattern adds an interface to existing system to hide its complexities.
- This pattern involves a single class which provides simplified methods required by client and delegates calls to methods of existing system classes.


![image](https://user-images.githubusercontent.com/43011442/117574467-d4985e00-b0fa-11eb-96fe-69a3218f9952.png)


# Composite Design Pattern

- Composite pattern is used where we need to treat a group of objects in similar way as a single object. Composite pattern composes objects in term of a tree structure to represent part as well as whole hierarchy. This type of design pattern comes under structural pattern as this pattern creates a tree structure of group of objects.
- This pattern creates a class that contains group of its own objects. This class provides ways to modify its group of same objects.


![image](https://user-images.githubusercontent.com/43011442/117574495-ef6ad280-b0fa-11eb-9ce1-8153da0059c6.png)


# Decorator Design Pattern

- Decorator pattern allows a user to add new functionality to an existing object without altering its structure. This type of design pattern comes under structural pattern as this pattern acts as a wrapper to existing class.
- This pattern creates a decorator class which wraps the original class and provides additional functionality keeping class methods signature intact.


![image](https://user-images.githubusercontent.com/43011442/117574697-ef1f0700-b0fb-11eb-9d88-794867df11a3.png)


# Flyweight Design Pattern

- Flyweight pattern is primarily used to reduce the number of objects created and to decrease memory footprint and increase performance. This type of design pattern comes under structural pattern as this pattern provides ways to decrease object count thus improving the object structure of application.
- Flyweight pattern tries to reuse already existing similar kind objects by storing them and creates new object when no matching object is found.


![image](https://user-images.githubusercontent.com/43011442/117574668-dadb0a00-b0fb-11eb-957b-b51b1dc3450d.png)


# Adapter Design Pattern

- Adapter pattern works as a bridge between two incompatible interfaces. This type of design pattern comes under structural pattern as this pattern combines the capability of two independent interfaces.
- This pattern involves a single class which is responsible to join functionalities of independent or incompatible interfaces. A real life example could be a case of card reader which acts as an adapter between memory card and a laptop. 
- You plugin the memory card into card reader and card reader into the laptop so that memory card can be read via laptop.


![image](https://user-images.githubusercontent.com/43011442/117574817-8c7a3b00-b0fc-11eb-844f-fd823476f330.png)


# Bridge Design Pattern

- Bridge is used when we need to decouple an abstraction from its implementation so that the two can vary independently. This type of design pattern comes under structural pattern as this pattern decouples implementation class and abstract class by providing a bridge structure between them.
- This pattern involves an interface which acts as a bridge which makes the functionality of concrete classes independent from interface implementer classes. 
- Both types of classes can be altered structurally without affecting each other.


![image](https://user-images.githubusercontent.com/43011442/117574800-72d8f380-b0fc-11eb-813b-b229aacfed71.png)


# Observer Design Pattern

- Observer pattern is used when there is one-to-many relationship between objects such as if one object is modified, its depenedent objects are to be notified automatically.
- Observer pattern falls under behavioral pattern category.


![image](https://user-images.githubusercontent.com/43011442/117574853-bfbcca00-b0fc-11eb-8e46-c0126653f38f.png)


# Some of the Other Common Design Patterns are :

- Filter Design Pattern
- Command Design Pattern
- Interpreter Design Pattern
- Iterator Design Pattern
- Mediator Design Pattern
- Momento Design Pattern
- State Design Pattern
- Null Object Design Pattern
- Stratergy Design Pattern
- Template Design Pattern
- Visitor Design pattern
- MVC pattern
- Business Deligate Pattern
- Composite Entity Pattern
- Data Access object Pattern
- Front Controller Pattern
- Intercepting Filter Pattern
- Service Locator Pattern
- Transfer Object Pattern

# Filter Design Pattern

- Filter pattern or Criteria pattern is a design pattern that enables developers to filter a set of objects using different criteria and chaining them in a decoupled way through logical operations. 
- This type of design pattern comes under structural pattern as this pattern combines multiple criteria to obtain single criteria.


![image](https://user-images.githubusercontent.com/43011442/117575193-66559a80-b0fe-11eb-91f3-2e03430e06de.png)


# Command Design Pattern

- Command pattern is a data driven design pattern and falls under behavioral pattern category. 
- A request is wrapped under an object as command and passed to invoker object. 
- Invoker object looks for the appropriate object which can handle this command and passes the command to the corresponding object which executes the command.


![image](https://user-images.githubusercontent.com/43011442/117575212-7d948800-b0fe-11eb-8377-02eb5a13e6be.png)


# Interpreter Design Pattern

- Interpreter pattern provides a way to evaluate language grammar or expression. 
- This type of pattern comes under behavioral pattern. This pattern involves implementing an expression interface which tells to interpret a particular context. 
- This pattern is used in SQL parsing, symbol processing engine etc.


![image](https://user-images.githubusercontent.com/43011442/117607829-6dba8980-b17a-11eb-9385-05eefaf0331b.png)


# Iterator Design Pattern

- Iterator pattern is very commonly used design pattern in Java and .Net programming environment.
- This pattern is used to get a way to access the elements of a collection object in sequential manner without any need to know its underlying representation.


![image](https://user-images.githubusercontent.com/43011442/117607920-9f335500-b17a-11eb-80d6-35078ff9fe57.png)


# Mediator Design Pattern

- Mediator pattern is used to reduce communication complexity between multiple objects or classes.
- This pattern provides a mediator class which normally handles all the communications between different classes and supports easy maintenance of the code by loose coupling.
- Mediator pattern falls under behavioral pattern category.

![image](https://user-images.githubusercontent.com/43011442/117607974-c2f69b00-b17a-11eb-9cbc-5e66ffff9110.png)


# Momento Design Pattern

- Memento pattern is used to restore state of an object to a previous state.
- Memento pattern falls under behavioral pattern category.


![image](https://user-images.githubusercontent.com/43011442/117608015-dbff4c00-b17a-11eb-91e0-1548b8fa5328.png)


# State Design Pattern

- In State pattern a class behavior changes based on its state. 
- This type of design pattern comes under behavior pattern.
- In State pattern, we create objects which represent various states and a context object whose behavior varies as its state object changes.


![image](https://user-images.githubusercontent.com/43011442/117608086-f9ccb100-b17a-11eb-9e15-6fe58d85c4d9.png)


# Null Object Design Pattern

- In Null Object pattern, a null object replaces check of NULL object instance. 
- Instead of putting if check for a null value, Null Object reflects a do nothing relationship. 
- Such Null object can also be used to provide default behaviour in case data is not available.
- In Null Object pattern, we create an abstract class specifying various operations to be done, concrete classes extending this class and a null object class providing do nothing implemention of this class and will be used seemlessly where we need to check null value.


![image](https://user-images.githubusercontent.com/43011442/117608151-1cf76080-b17b-11eb-9789-a72eda69c333.png)


# Stratergy Design Pattern

- In Strategy pattern, a class behavior or its algorithm can be changed at run time. This type of design pattern comes under behavior pattern.
- In Strategy pattern, we create objects which represent various strategies and a context object whose behavior varies as per its strategy object. 
- The strategy object changes the executing algorithm of the context object.


![image](https://user-images.githubusercontent.com/43011442/117608202-38fb0200-b17b-11eb-9706-98a80b55982b.png)


# Template Design Pattern

- In Template pattern, an abstract class exposes defined way(s)/template(s) to execute its methods. 
- Its subclasses can override the method implementation as per need but the invocation is to be in the same way as defined by an abstract class. 
- This pattern comes under behavior pattern category.


![image](https://user-images.githubusercontent.com/43011442/117608252-55973a00-b17b-11eb-8dc6-3f2d0ac9854d.png)


# Visitor Design pattern

- In Visitor pattern, we use a visitor class which changes the executing algorithm of an element class. 
- By this way, execution algorithm of element can vary as and when visitor varies. 
- This pattern comes under behavior pattern category. As per the pattern, element object has to accept the visitor object so that visitor object handles the operation on the element object.


![image](https://user-images.githubusercontent.com/43011442/117608294-6e075480-b17b-11eb-9905-68dbc3978507.png)


# MVC pattern

- MVC Pattern stands for Model-View-Controller Pattern. 
- This pattern is used to separate application's concerns.
      
      1) Model - Model represents an object or JAVA POJO carrying data. It can also have logic to update controller if its data changes.
      2) View - View represents the visualization of the data that model contains
      3) Controller - Controller acts on both model and view. It controls the data flow into model object and updates the view whenever data changes. It keeps view and model separate.


![image](https://user-images.githubusercontent.com/43011442/117608598-07366b00-b17c-11eb-9973-a2547873a617.png)


# Business Deligate Pattern

- Business Delegate Pattern is used to decouple presentation tier and business tier. 
- It is basically use to reduce communication or remote lookup functionality to business tier code in presentation tier code. 
- In business tier we have following entities:

      1) Client - Presentation tier code may be JSP, servlet or UI java code.
      2) Business Delegate - A single entry point class for client entities to provide access to Business Service methods.
      3) LookUp Service - Lookup service object is responsible to get relative business implementation and provide business object access to business delegate object.
      4) Business Service - Business Service interface. Concrete classes implement this business service to provide actual business implementation logic.


![image](https://user-images.githubusercontent.com/43011442/117609033-dd317880-b17c-11eb-947a-927ab3cedf3c.png)


# Composite Entity Pattern

- Composite Entity pattern is used in EJB persistence mechanism. 
- A Composite entity is an EJB entity bean which represents a graph of objects. 
- When a composite entity is updated, internally dependent objects beans get updated automatically as being managed by EJB entity bean. 
- Following are the participants in Composite Entity Bean:

      1) Composite Entity - It is primary entity bean. It can be coarse grained or can contain a coarse grained object to be used for persistence purpose.
      2) Coarse-Grained Object - This object contains dependent objects. It has its own life cycle and also manages life cycle of dependent objects.
      3) Dependent Object - Dependent object is an object which depends on coarse grained object for its persistence lifecycle.
      4) Strategies - Strategies represents how to implement a Composite Entity.


![image](https://user-images.githubusercontent.com/43011442/117609115-08b46300-b17d-11eb-9c0f-c71eca6aa876.png)


# Data Access object Pattern

- Data Access Object Pattern or DAO pattern is used to separate low level data accessing API or operations from high level business services. 
- Following are the participants in Data Access Object Pattern:

      1) Data Access Object Interface - This interface defines the standard operations to be performed on a model object(s).
      2) Data Access Object concrete class - This class implements above interface. This class is responsible to get data from a data source which can be database / xml or any other storage mechanism.
      3) Model Object or Value Object - This object is simple POJO containing get/set methods to store data retrieved using DAO class.


![image](https://user-images.githubusercontent.com/43011442/117610670-c0e30b00-b17f-11eb-8436-396d15d4db6f.png)


# Front Controller Pattern

- The front controller design pattern is used to provide a centralized request handling mechanism so that all requests will be handled by a single handler. 
- This handler can do the authentication/ authorization/ logging or tracking of request and then pass the requests to corresponding handlers. 
- Following are the entities of this type of design pattern:

      1) Front Controller - Single handler for all kinds of requests coming to the application (either web based/ desktop based).
      2) Dispatcher - Front Controller may use a dispatcher object which can dispatch the request to corresponding specific handler.
      3) View - Views are the object for which the requests are made.


![image](https://user-images.githubusercontent.com/43011442/117610745-dfe19d00-b17f-11eb-89f5-42943b264e4a.png)


# Intercepting Filter Pattern

- The intercepting filter design pattern is used when we want to do some pre-processing / post-processing with request or response of the application. 
- Filters are defined and applied on the request before passing the request to actual target application. 
- Filters can do the authentication/ authorization/ logging or tracking of request and then pass the requests to corresponding handlers. 
- Following are the entities of this type of design pattern:

      1) Filter - Filter which will performs certain task prior or after execution of request by request handler.
      2) Filter Chain - Filter Chain carries multiple filters and help to execute them in defined order on target.
      3) Target - Target object is the request handler
      4) Filter Manager - Filter Manager manages the filters and Filter Chain.
      5) Client - Client is the object who sends request to the Target object


![image](https://user-images.githubusercontent.com/43011442/117610867-16b7b300-b180-11eb-80d2-db2874db67e8.png)


# Service Locator Pattern

- The service locator design pattern is used when we want to locate various services using JNDI lookup. 
- Considering high cost of looking up JNDI for a service, Service Locator pattern makes use of caching technique. 
- For the first time a service is required, Service Locator looks up in JNDI and caches the service object. 
- Further lookup or same service via Service Locator is done in its cache which improves the performance of application to great extent. 
- Following are the entities of this type of design pattern:

      1) Service - Actual Service which will process the request. Reference of such service is to be looked upon in JNDI server.
      2) Context / Initial Context - JNDI Context carries the reference to service used for lookup purpose.
      3) Service Locator - Service Locator is a single point of contact to get services by JNDI lookup caching the services.
      4) Cache - Cache to store references of services to reuse them
      5) Client - Client is the object that invokes the services via ServiceLocator.


![image](https://user-images.githubusercontent.com/43011442/117610959-3bac2600-b180-11eb-8a66-901c8feb46a9.png)


# Transfer Object Pattern

- The Transfer Object pattern is used when we want to pass data with multiple attributes in one shot from client to server. 
- Transfer object is also known as Value Object. 
- Transfer Object is a simple POJO class having getter/setter methods and is serializable so that it can be transferred over the network. 
- It does not have any behavior. 
- Server Side business class normally fetches data from the database and fills the POJO and send it to the client or pass it by value. 
- For client, transfer object is read-only. 
- Client can create its own transfer object and pass it to server to update values in database in one shot. 
- Following are the entities of this type of design pattern:

      1) Business Object - Business Service fills the Transfer Object with data.
      2) Transfer Object - Simple POJO having methods to set/get attributes only.
      3) Client - Client either requests or sends the Transfer Object to Business Object.


![image](https://user-images.githubusercontent.com/43011442/117611244-c856e400-b180-11eb-9b63-6a7032902b0a.png)


# ⚡ Links on Design Patterns

- [Design Patterns - Wikipeida](https://en.wikipedia.org/wiki/Software_design_pattern) 

- [Java Programming/Design Patterns](https://en.wikibooks.org/wiki/Java_Programming/Design_Patterns)

- [The JavaTM Tutorials](https://docs.oracle.com/javase/tutorial/)

- [JavaTM 2 SDK, Standard Edition](https://docs.oracle.com/javase/1.4.2/docs/)

- [Java DesignPatterns](https://www.javaworld.com/category/design-patterns/)

# 📺 Youtube Videos

- [Telusko Learning](https://www.youtube.com/playlist?list=PLsyeobzWxl7r2ZX1fl-7CKnayxHJA_1ol)

- [coding Simplified](https://www.youtube.com/playlist?list=PLt4nG7RVVk1h9lxOYSOGI9pcP3I5oblbx)

- [KK Java Tutorials](https://www.youtube.com/playlist?list=PLzS3AYzXBoj8t5hPykr5VU7jG-kEim-LX)

- [Derek Beans](https://www.youtube.com/playlist?list=PLF206E906175C7E07)

- [Christopher Okrhavi](https://www.youtube.com/playlist?list=PLrhzvIcii6GNjpARdnO4ueTUAVR9eMBpc)

- [Rajesh Kumar](https://www.youtube.com/playlist?list=PLZ0uoluqqCdcAln2Hu9J3BlIUHQIMClEN)

- [Tutorials Point](https://www.youtube.com/playlist?list=PLWPirh4EWFpGeQoTYL5YpzBz8Gjw-sxJb)

- [Edurekha](https://www.youtube.com/watch?v=C_oPLDaSy-8)

# 🥅 Useful Books on Java Design Patterns

[<img src="https://user-images.githubusercontent.com/43011442/117611995-1a4c3980-b182-11eb-88f2-c9dcdd76e547.png" />](https://www.amazon.com/exec/obidos/ASIN/0201485397/httpwwwtuto0a-20)


[<img src="https://user-images.githubusercontent.com/43011442/117612066-38b23500-b182-11eb-864f-f61553e79012.png" />](https://www.amazon.com/exec/obidos/ASIN/0596007124/httpwwwtuto0a-20)


[<img src="https://user-images.githubusercontent.com/43011442/117612165-5bdce480-b182-11eb-90ec-38779baad7bf.png" />](https://www.amazon.com/exec/obidos/ASIN/0956575803/httpwwwtuto0a-20)


[<img src="https://user-images.githubusercontent.com/43011442/117612189-67301000-b182-11eb-8691-84b5f15ba957.png" />](https://www.amazon.com/exec/obidos/ASIN/0201633612/httpwwwtuto0a-20)


[<img src="https://user-images.githubusercontent.com/43011442/117612211-71520e80-b182-11eb-94bf-1abbee657ce6.png" />](https://www.amazon.com/exec/obidos/ASIN/0321333020/httpwwwtuto0a-20)


[<img src="https://user-images.githubusercontent.com/43011442/117612238-7ca53a00-b182-11eb-952d-8627c6add62e.png" />](https://www.amazon.com/exec/obidos/ASIN/0201743973/httpwwwtuto0a-20)

<br><br>
**For more queries, reach me through gowthamraj692@gmail.com or whatsapp @ 9698382306**

<br><br>
<div align="center">
  
# Show some ❤️ by starring this repository !!!
  
</div>

## Organization Created & Maintained By 

# ![](https://img.shields.io/static/v1?style=for-the-badge&message=Gowthamraj+K&color=007396&label=) 😄

![](https://img.shields.io/static/v1?style=for-the-badge&message=Fullstack+Web+Developer&color=0b3d36&label=)  ![](https://img.shields.io/static/v1?style=for-the-badge&message=UI+Designer&color=d92323&label=) ![](https://img.shields.io/static/v1?style=for-the-badge&message=Learning+new+things&color=0c0c4f&label=)  ![](https://img.shields.io/static/v1?style=for-the-badge&message=Design+Thinker&color=0b3d17&label=) 

### Connect with me 👋:

[<img align="left" alt="code-Jamm.in" width="22px" src="https://raw.githubusercontent.com/iconic/open-iconic/master/svg/globe.svg" />][website1]
[<img align="left" alt="GowthamRaj | YouTube" width="22px" src="https://cdn.jsdelivr.net/npm/simple-icons@v3/icons/youtube.svg" />][youtube]
[<img align="left" alt="GowthamRaj " width="22px" src="https://www.iconfinder.com/data/icons/logos-and-brands/512/160_Hackerrank_logo_logos-512.png" />][hackerrank]
[<img align="left" alt="GowthamRaj  | Twitter" width="22px" src="https://cdn.jsdelivr.net/npm/simple-icons@v3/icons/twitter.svg" />][twitter]
[<img align="left" alt="GowthamRaj  | LinkedIn" width="22px" src="https://cdn.jsdelivr.net/npm/simple-icons@v3/icons/linkedin.svg" />][linkedin]
[<img align="left" alt="GowthamRaj  | Instagram" width="22px" src="https://cdn.jsdelivr.net/npm/simple-icons@v3/icons/instagram.svg" />][instagram]
[![](https://img.shields.io/badge/9698382306-25D366?style=social&logo=whatsapp&logoColor=green)]()

## Copyright-and-license 📌

Code and documentation Copyright 2021 : **Gowthamraj K**


[website1]: https://gowthamrajk.github.io/gowthamrajk-portfolio/
[hackerrank]: https://www.hackerrank.com/gowthamraj692
[website]: https://github.com/gowthamrajk
[twitter]: https://twitter.com/Gowtham29341737
[youtube]: https://www.youtube.com/channel/UC_Q5Zet9Oz-UVAeJ-oE_uGQ?view_as=subscriber
[instagram]: https://instagram.com/gow_t_h_a_m_r_a_j
[linkedin]: https://www.linkedin.com/in/gowtham-kittusamy-54b835174/
