### Task 2: Implementing a Shape Hierarchy with Casting Techniques

#### You are given the following class structure:

1.  **`Shape` Class**: Base class representing a generic shape.
    *   Pure virtual member functions: `area` and `perimeter`.

2.  **`Rectangle` Class**: Derived class representing a rectangle.
    *   Data members: `width` and `height` (double).
    *   Member functions: Constructor, `area`, `perimeter`.

3.  **`Circle` Class**: Derived class representing a circle.
    *   Data member: `radius` (double).
    *   Member functions: Constructor, `area`, `perimeter`.

#### Instructions:

1.  Implement the class structure above, including:
    + Constructors for `Rectangle` and `Circle` classes to initialize their dimensions.
    + Virtual functions for `area` and `perimeter` in the `Shape` class and override them in the derived classes.
2.  Given an instance of the `Rectangle` and `Circle` classes, demonstrate the use of static casting to perform type conversions.
    + Suppose we wish to create a pointer to the `Rectangle` type called `rectPtr` and initialize it with `shape` a pointer to the `Shape` type, how will this be done? (Write your answer below [1])
3.  At runtime, check if the type of `shape` a pointer to the `Shape` type changed dynamically into a pointer to the `Circle` type. Print `shape is a Circle` or `shape is not a Circle` depending on the check. (Write your answer below [2])
5.  `area` and `perimeter` member functions return double constants. Use const cast to remove the const qualifier from `area` member function accessible via `rectPtr` a pointer to the `Rectangle` type described in 2 above. (Write your answer below [3])
6.  Utilize reinterpret cast to reinterpret the bit pattern of `intValue` variable as a `double`. (Write your answer below [4])

NB: You can use `M_PI` a constant from the cmath library


#### How to run:

```cpp
int main()
{
    Rectangle rectangle(5.0, 3.0);
    Circle circle(4.0);

    Shape *shape = &rectangle;

    // Demonstrate static casting [1]
    

    // Demonstrate dynamic casting [2]
    

    // Demonstrate const casting [3]


    int intValue = 42;
    // Demonstrate reinterpret casting [4]

    return 0;
}
```