# Annotation in java
Java Annotation is a tag that represents the metadata i.e. attached with class, interface, methods or fields to indicate some additional information which can be used by java compiler and JVM.

#### Built-In Java Annotations used in java code
- @Override
    * @Override annotation assures that the subclass method is overriding the parent class method. If it is not so, compile time error occurs.
- @SuppressWarnings
    * @SuppressWarnings annotation: is used to suppress warnings issued by the compiler.
- @Deprecated
    * @Deprecated annoation marks that this method is deprecated so compiler prints warning.
#### Built-In Java Annotations used in other annotations
- @Target
- @Retention
- @Inherited
- @Documented


#### Points to remember for java custom annotation signature
There are few points that should be remembered by the programmer.

1. Method should not have any throws clauses
2. Method should return one of the following: primitive data types, String, Class, enum or array of these data types.
3. Method should not have any parameter.
4. We should attach @ just before interface keyword to define annotation.
5. It may assign a default value to the method.
