### Task 2: Implementing a Vector Library with Cast Operations

#### Class Structure:

1.  **`Vector` Class**: Represents a mathematical vector.
    *   Data members: `x`, `y`, `z` (double).
    *   Member functions: Constructors, `magnitude`, `normalize`.

#### Requirements:

1.  Create a file Vector.h for class member declarations. This should include constructors for the `Vector` class to initialize its components.
2. Create a file Vector.cpp for class member definitions (implementations). 
2.  Implement a function to calculate the magnitude of the vector.
3.  Implement a function to normalize the vector.
4.  Demonstrate the use of static cast to perform type conversions.
5.  Utilize dynamic cast for runtime type checking (though not necessary in this particular example).
6.  Use const cast to remove the const qualifier from a member function.
7.  Utilize reinterpret cast to reinterpret the bit pattern of a variable.


#### How to run:

```cpp
int main()
{
    Vector vec(3.0, 4.0, 5.0);

    cout << "Magnitude of vector: " << vec.magnitude() << endl;

    vec.normalize();

    cout << "Normalized vector: (" << vec.staticCast(1) << ", "
         << vec.staticCast(2) << ", " << vec.staticCast(3) << ")" << endl;

    cout << "Magnitude after const cast: " << vec.getMagnitude() << endl;

    double value = 3.14;
    int intValue = vec.reinterpretCast(value);
    cout << "Reinterpreted value: " << intValue << endl;

    return 0;
}
```