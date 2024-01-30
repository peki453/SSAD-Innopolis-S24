### Task: Implementing Custom Map and Filter Functions Using Lambda Calculus

#### Background

Understanding higher-order functions and lambda calculus is essential in modern programming, particularly in functional programming languages. In C++, lambda functions provide a concise way to write inline anonymous functions.

#### Objective

Create custom `map` and `filter` functions in C++ that take a callback function as a parameter(pointer to function). The callback function should be implemented using lambda expressions.

#### Task Description

1. **Implement a `map` Function**

   - The `map` function should take a vector and a callback function as its parameters.
   - The callback function should be capable of performing an operation on each element of the vector.
   - The `map` function should return a new vector containing the results of applying the callback function to each element in the original vector.

2. **Implement a `filter` Function**

   - The `filter` function should also take a vector and a callback function as its parameters.
   - The callback function for `filter` should be a predicate (returning a boolean value) that decides whether an element in the vector should be included in the result.
   - The `filter` function should return a new vector containing only those elements of the original vector for which the callback function returns `true`.

3. **Test Your Functions**
   - Demonstrate the use of your `map` and `filter` functions with at least two different lambda expressions for each function.
   - For `map`, you might use a lambda that squares each number.
   - For `filter`, you could use a lambda that filters out even numbers.

#### Example Usage

```cpp
vector<int> nums = {1, 2, 3, 4, 5};

// Example for map: Squaring each element
auto squared = customMap(nums, [](int x) { return x * x; });
// Example for filter: Retaining odd numbers
auto odds = customFilter(nums, [](int x) { return x % 2 != 0; });

```

#### Requirements

- Make sure to demonstrate understanding of lambda expressions by using them as callback functions.
- Provide example usages of `map` and `filter` that clearly demonstrate their functionality.
