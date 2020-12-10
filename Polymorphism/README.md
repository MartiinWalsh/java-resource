# java-resource
Refresher and resource for OOP concepts, collections, generics, conventions and more.

# Polymorphism
Polymorphism is the ability of an object to take on many forms. The most common use of polymorphism in OOP occurs when a parent class reference is used to refer to a child class object.

Any Java object that can pass more than one IS-A test is considered to be polymorphic.

Inheritance lets us inherit attributes and methods from another class. Polymorphism uses those methods to perform different tasks. 
This allows us to perform a single action in different ways.

## Example 

For this example, in the main method, Java is looking at the object called movie (line 78) and 
checking if it has a 'plot' method. Different functionality is being assigned depending on the
type of object being created. Also, the Unknown class doesnt have this method defined so Java 
checks the extended class Movie, and executes the 'plot' method from that class instead.

