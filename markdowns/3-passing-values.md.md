Primitive data types in Java are passed-by-value between methods.
If we pass a variable into another method, then the called method will
create a new variable and copy the *value* of the passed variable.
For example, consider the following code snippet:
```
public static void main(String[] args){
  int x = 5;
  printMe(x);
}

public static void printMe(int x){
    System.out.println(x);
}
```

Inside the scope of `main` we assign the value 5 to `x`.
Upon calling the `printMe` method, we create another int variable inside
`printMe` scope, also called `x`,
and we copy the value of 5 into this new variable.

In Java, this is how all primitive data types are passed between
methods.

Since the variable `x` in `printMe` is only a copy of the original `x` in
`main`, if we were to modify `x` inside the `printMe` method, then
upon  ????

@[Example 4: Pass by value]({"stubs":["src/main/java/ExampleC.java"],"command": "ExampleCTest#testMain"})

# Passing a reference to another method

I mentioned earlier that a reference is also a primitive data type

@[Example 5: Pass a reference by value]({"stubs":["src/main/java/ExampleD.java"],"command": "ExampleDTest#testMain"})
