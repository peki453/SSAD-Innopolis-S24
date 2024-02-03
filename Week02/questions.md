1. The heap is used for dynamic memory allocation, where the size or the number of required objects is not known at compile time. We use `new` and `delete` (or malloc and free in C) in C++. When an object’s lifetime must extend beyond the scope in which they were created.
The stack is used for static memory allocation, which includes local variables and function parameters. Memory on the stack is automatically allocated and deallocated when the function in which they are declared is called and returns, respectively.
2. Memory leakage is when a program allocates memory on the heap and loses the reference to it without deallocating it, resulting in a situation where the allocated memory cannot be used again.
3.   
    1. Default: zero arguments. 
    2. Conversion (parameterized): pass the necessary arguments to the constructor.
    3. Copy: Constructs a new object as a copy of an existing object.
    4. Move: more about it in next lectures.
4. Destructors are used to release resources that an object may have acquired during its lifetime. This includes deallocating memory, closing file handles, etc.
5. const: Indicates that the value of a variable cannot be modified after initialization. It applies to the value of the variable.
    constexpr: Indicates that the value of a variable or the result of a function can be evaluated at compile time.
