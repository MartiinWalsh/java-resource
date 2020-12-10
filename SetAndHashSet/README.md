# java-resource
Refresher and resource for OOP concepts, collections, generics, conventions and more.

# Set

Set is an interface which extends Collection. It is an unordered collection of objects in which duplicate values cannot be stored.
Basically, Set is implemented by HashSet, LinkedHashSet or TreeSet (sorted representation).
Set has various methods to add, remove clear, size, etc to enhance the usage of this interface
filter_none

# HashSet

- Implements Set Interface.
- Underlying data structure for HashSet is hashtable.
- As it implements the Set Interface, duplicate values are not allowed.
- Objects that you insert in HashSet are not guaranteed to be inserted in same order. Objects are inserted based on their hash code.
- NULL elements are allowed in HashSet.
- HashSet also implements Serializable and Cloneable interfaces.

## equals() and hashcode()

The HeavenlyBody class shows an example of overriding
these methods.

We use the equals() method to compare objects in Java. In order to determine if two objects are the same. In the example
we check; 
- If the current object instance is equal to the object that has been passed.
- Whether the passed object is null, or if it’s typed as a different class. If it’s a different class then the objects are not equal.
- Compares the objects’ fields.  If two objects have the same field values, then the objects are the same.

We use the hashcode() method to optimize performance when comparing objects. Executing  hashcode() returns a unique ID for each object in your program, which makes the task of comparing the whole state of the object much easier.

If an object’s hashcode is not the same as another object’s hashcode, there is no reason to execute the equals() method: you just know the two objects are not the same. On the other hand, if the hashcode is the same, then you must execute the equals() method to determine whether the values and fields are the same.