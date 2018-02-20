# eMusicStore
Music Store from Spring MVC

**Model View Controller:** 

- Model - directly manages the data ,logic, and rules of the applications
- View - can be any output representation of information 
- Controller - accepts input and converts it to commands for the model view 
 
Spring Web MVC Framework 

The Spring Web MVC framework provides the MVC architecture and ready components that can be used to develop flexible and loosley coupled web applications. 
- The model encapsulates the application data and in general they will consist of POJO
- The view is responsible for rendering the model data and in general it generates HTML output that the clients browser can interpret
- The controller is responsble for processing user requests and building appropriate model and passes it to the view for rendering 

**Mapping**

Each object is saves as a row in a database
Each row is retrieved as an object in application 

ORM Provider

- JPA (Java Persistence API) is a java application programming interface specification that describes the management of relation data in applications
- Hibernate provides an open source ORM framework for Java. Version 3.2 and later provide an implementation for JPA
- Spring framework supports integration with Hibernate and JPA for resource management, data access object (DAO) implementation, and transaction management

