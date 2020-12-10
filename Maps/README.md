# java-resource
Refresher and resource for OOP concepts, collections, generics, conventions and more.

# Map

The java.util.Map interface represents a mapping between a key and a value. 
The Map interface is not a subtype of the Collection interface.

Few characteristics of the Map Interface are:
1. A Map cannot contain duplicate keys and each key can map to at most one value. Some implementations allow null key and null value like the HashMap and LinkedHashMap, but some do not like the TreeMap.
2. The order of a map depends on specific implementations, e.g TreeMap and LinkedHashMap have predictable order, while HashMap does not.
3. There are two interfaces for implementing Map in java: Map and SortedMap, and three classes: HashMap, TreeMap and LinkedHashMap.