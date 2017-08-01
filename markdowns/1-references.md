# Memory and arrays

Before we go any further, let us consider the very basic idea of a programmable computer.
If we were to simplify a computer to by separating its components, then there are
three main classes of components:
* the CPU to do the computation
* the memory to store data and program instructions
* the input and output system to communicate with the user

> _The above architecture is an overview what we know as the von Neumann architecture,_
> _which you can read more about_
> _[on Wikipedia here](https://en.wikipedia.org/wiki/Von_Neumann_architecture)_

Indeed most devices nowadays are characterised by these three components; the processor power,
the memory it has, and how the user interacts with it (touchscreen, keyboard, etc).
For our purposes, let us consider how memory is used in more details.

Each variable in Java that you create requires a memory space to be allocated to it.
In the case of primitive data types, the amount of memory allocated to it is fixed.
For example, an `char` variable in Java requires 16 bits of memory, whereas each
`int` variable requires 32 bits of memory and each `long` variable requires 64 bits
of memory.

> _recall that 1 byte = 8 bits, and 1 GB = 1,073,741,824 bytes, so that is a lot of integers_
> _you can have on your phone!_

If you declare an `int` variable, and assign a value to it, for example
```
int i;
i = 10;
```
then Java allocates 32 bits for you that you can refer to as `i`, and each time you
use `i` in your program, Java will inspect or modify these 32 bits.
One way to think about this is that Java creates a box for you that can contain up to 32
bits and store the value of 10 inside it (in binary representation, but let us just
write 10 inside the box).

![i == 10](/images/i10.svg)

This is simple enough, but how about the memory required when you create an object of a Java class?
What if you create a class that contains two `int` variables in it?
Before we consider Java classes, let us first see what happens when we declare an array of
`int`. Suppose we declare an array of `int` called `arr`,
```
int arr[5] = {1,2,3,4,5}
```
then what is the value of `arr`? Does it contain five values? How much memory space does Java
need to allocate for the variable `arr`?

![a == ???](/images/arr.svg)

You can test this in the following code snippet.

@[What's the output?]({"stubs":["src/main/java/ExampleB.java"],"command": "ExampleBTest#testMain"})

Some of you may find it surprising that you do not see any integers at all when you print out `arr`.
Instead you should see some strange sequence of characters such as `2d38eb89`. The actual value
does not matter,

![references](/images/array.svg)
