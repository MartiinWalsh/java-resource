# java-resource
Refresher and resource for OOP concepts, collections, generics, conventions and more.

# Abstraction
Abstraction is a process of hiding the 
implementation details and showing only functionality to the user.

Abstract classes cannot be instantiated, but they can be subclassed. 
An abstract method is declared without an implementation.
If a class includes abstract methods, then the class itself 
must be declared abstract.

## Interface vs Abstract Class
This example shows why Interface may be used alongside abstract classes. Originally 
the Bird class had a fly method but other animals can fly, such as a bat. Therefore,
flying was implemented as an interface.

An abstract class permits you to make functionality that subclasses can 
implement or override whereas an interface only permits you to state 
functionality but not to implement it. A class can extend only one 
abstract class while a class can implement multiple interfaces.