# Welcome!

In this series of pages we are going to learn the basics of Java references with the final aim
of creating a linked list data structure.
This lesson is designed for a beginning computing student who is learning Java for the first time,
and thus it covers only standard references (i.e. strong references).

For this tutorial, I assume that you have the basic understanding of Java classes and objects,
and this includes being able to write your own classes.
We are going to start with a short refreshers on data types.

# Primitive and non-primitive data types

If you have played around with Java a bit, then you have definitely encountered
basic data types which include `int`, `char`, `float`, `double`, `long`, and `boolean`.
These data types are the basic building block that exist in most programming languages,
and so they are often referred to as the primitive data types.

The non-primitive (or composite) data types in Java include classes like `String`, `Integer`, `Character`,
plus any class that you have written yourself.
In fact, for each primitive type, there is a Java built-in type for it, so Java comes with built-in
`Float`, `Double`, `Long`, and `Boolean` classes as well.
By the way, recall that the convention in Java is to have class names starting
with an uppercase letter.

If you are using Eclipse or other IDEs with code suggestion, then you would have also noticed
that variables of these non-primitive types have pre-defined class methods,
triggered when you type `.` after the variable name.
For example, all of the built-in classes like `Integer` would have the `toString()` method.
Perhaps something even more conspicuous is that you call the constructor of these classes
using the `new` keyword, for example:

```java
// The Integer class has a constructor that we can call to create a new
// Integer object
Integer i = new Integer(100);   

// However, primitive objects do not have constructors
// (or any methods/attributes for that matter)
int i = new int(100); // syntax error
```

In contrast, the primitive data types will not have any class methods or attributes, because well,
they are not a class. Here is a code you can play around with:

@[Integer vs int]({"stubs":["src/main/java/ExampleA.java"],"command": "ExampleATest#testMain"})



# Visual and Interactive Content

Tech.io provides all the tools to embed visual and interactive content like a Web app or a Unix terminal within your contribution. Please refer to the [documentation](https://tech.io/doc) to learn more about the viewer integrations.
