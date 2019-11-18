# Creation GoF Design Patterns

- Simple Factory - It is responsible for generating an instance for the client without exposing the internal logic. **Usage Examples:** When the creation of the objects involves some logic, it is better to use a dedicated factory rather than to repeating the same code in many places.

- Factory Method - Create objects without specifying the exactly class of the object that will be created. **Usage Examples:** When there is some generic processing in the class, but the subclass is dynamically dedicated at runtime.

- Abstract Factory - Group factories that create objects from related classes without specifying the concrete class. **Usage Examples:** When there is dependency among the objects, encapsulating the creation logic of the an individuals factories group. 

- Builder - It is responsible for creating different types of objects **Usage Examples:** When there is different features of the objects or when creating involves many steps.

- Prototype - Create an object based in another exiting object (clone). **Usagen Examples:** When you need to create an object similar to an existing object.

- Sigleton - It is responsible for restricting only one instance of a given object from determinated class. **Usage Examples** When it is necessary to ensure that there is only one object of a class.

## References
Erich Gamma, Richard Helm, Ralph Johnson and John Vlissides (1994) - *Design Patterns: Elements of Reusable Object-Oriented Software.*	United States: Addison-Wesley Professional Computing Series.
