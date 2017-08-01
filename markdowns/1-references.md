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
int i = 10;
```
then you can

![i == 10](/images/i10.svg)

How about the memory required when you create an object of a Java class?
You can create a
