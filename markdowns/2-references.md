If we were to simplify a computer to by separating its components, then there are
three main parts:
* the CPU to do the computation
* the memory to store data and program instructions
* the input and output system to communicate with the user

> _The above architecture is an overview what we know as the von Neumann architecture,_
> _which you can read more about_
> _[on Wikipedia here](https://en.wikipedia.org/wiki/Von_Neumann_architecture)_

Indeed most devices nowadays are characterised by these three components; the processor power,
the memory it has, and how the user interacts with it (touchscreen, keyboard, etc).
Let us consider how memory is used in more details.

# Memory allocation in Java

Each variable in Java that you create requires a memory space to be allocated to it.
In the case of primitive data types, the amount of memory allocated to it is fixed.
For example, a `char` variable in Java requires 16 bits of memory, whereas each
`int` variable requires 32 bits of memory and each `double` variable requires 64 bits
of memory.

> _recall that 1 byte = 8 bits, and 1 GB = 1,073,741,824 bytes, so that is a lot of integers_
> _you can have on your phone!_

If you declare an `int` variable, and assign a value to it, for example
```
int i;
i = 9;
```
then Java allocates 32 bits (4 bytes) of memory for you,
and then set the bits to correspond to the integer 9 as illustrated below.
Of course the integer 9 would be represented in its binary representation,
but let us just write 9 in there to avoid overcomplicating things.
Each time you use `i` in your code, Java will inspect or modify this
memory space accordingly.

![i == 9](/images/i9.svg)

That is simple enough, but how about the memory required when you create an object of a Java class?
What if you create a class that contains two `int` variables in it?
Before we consider Java classes, let us think about something simpler: arrays.

# Creating arrays in Java

Suppose we declare an array of `int` called `arr`,
```
int arr[5] = {1,2,3,4,5}
```
then what is the value of `arr`? Does it contain five values? How much memory space does Java
need to allocate for the variable `arr`?

![a == ???](/images/arr.svg)

You can test this in the following code snippet.

@[Example 2: What is stored inside an array variable?]({"stubs":["src/main/java/ExampleB.java"],"command": "ExampleBTest#testMain"})

You may find it surprising that you do not see any integers at all when you print out `arr`.
Instead you should see some strange sequence of characters such as `2d38eb89`.
This is an example of a Java reference.

Whenever you call `new` to create an object, Java allocates memory (in the heap if you know
what this is) and return a reference on where this memory is.
You can think of reference as the address of the memory space that was allocated to you.

When we declare the array `arr`, Java allocates enough memory to contain five integers
and return the reference to you. Hence, `arr` is the start of this memory block.
`arr[0]` means return the contents inside the first 32 bits, `arr[1]` means return
the contents inside the next 32 bits, and so on.

![references](/images/array.svg)

# Creating objects in Java

In Java, every object of a non-primitive data type is allocated in similar way to how
arrays are allocated above: Java reserve a memory block that is large enough to contain
the object, and then return the reference to you.

For example, suppose we have a simple Point class with three attributes, two integers and
a String.
When we create a new Point object using `new`, Java allocates enough memory space to contain
these three variables and return you the reference on where they can be found.
The specific workings is not something you need to worry about since Java will take care of it.
What is important is to understand that your Point variable contains a reference, not the
actual Point itself.

You can run the following code to see how this works.

@[Example 3: Reference to an object]({"stubs":["src/main/java/Point.java"],"command": "PointTest#testMain"})
```
