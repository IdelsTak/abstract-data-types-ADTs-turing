# Abstract Data Types (ADTs): The Turing Machine example

An ADT models what data types a data structure should work with. It also specifies the operations that can be applied on the data structure. Additionally, an ADT defines the types of parameters that those operations can consume or produce. An important aspect of this feature is that it does not describe *how* the specified operations will work. It instead describes *what* those operations are (Goodrich et al., 2014). This provision plays a major role in how software realizes modularity. Because modularity demands that disparate software units function separately, ADTs are pivotal since they do not expose the working internals of an interface, for instance.

Examples of common ADTs in Java include the `List` interface. Some of its concrete classes include the `ArrayList`, `LinkedList`, and `Stack`. In proper coding practice, application programming interfaces (APIs) only export their parameters using the interfaces such as `List` instead of `ArrayList`, for example. This approach affords the maintainers of the APIs the freedom to implement the concrete types of `List` that they see fit. So, if they happen to use `ArrayList` in one software version, they can switch easily to `Stack` in another release without breaking the code of their API clients. This demonstrates how ADTs help software developers to achieve modularity in their code-bases (Kalicharan, 2014).

ADTs also offer developers the opportunity to extend existing implementations with solutions that fit their use cases better. The introduction of functional capabilities with the Java 8 release, for instance, was aided by the fact that a huge swathe of its software development kit (SDK) was implemented using ADTs. Thus, whereas legacy Java versions leaned towards declarative programming, the new ones support functional programming too. Yet, this did not make interfaces such as `List` obsolete. In fact, it imbued them with enhanced capabilities—such as, support for streaming. This goes to show that ADTs create room for future innovations on existing code-bases.

### References

​	Goodrich, M. T., Tamassia, R., & Goldwasser, M. H. (2014). *Data Structures and algorithms in Java*. Wiley. 

​	Kalicharan, N. (2014). *Advanced topics in Java: Core concepts in data structures*. Apress. 
