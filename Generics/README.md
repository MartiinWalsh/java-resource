# java-resource
Refresher and resource for OOP concepts, collections, generics, conventions and more.

# Generics
 The idea is to allow type (Integer, String, … etc and user defined types) 
 to be a parameter to methods, classes and interfaces. For example,
 classes like HashSet, ArrayList, HashMap, etc use generics very well. 
 We can use them for any type.

## Example 
***GenericsExample Folder***

The Team class accepts a Generic type parameter in multiple places 
represented by \<T>. When the Team class is instantiated, the \<T> will be 
replaced by the real class. The generic type also extends the Player class
to ensure only this type will be accepted.

The comparable interface was implemented to compare Teams for rankings. Generic 
type parameter is also used to ensure only the same types of teams are 
compared.
