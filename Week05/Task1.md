### Lab Task: Implementing a Generic Stack in C++

#### Objective:

Implement a generic stack in C++ that can store elements of any data type. Use templates to achieve generality and constructors for initialization. Extend the functionality through inheritance to customize the stack for specific data types.

#### Task Description:

1. **Generic Stack Implementation (15 minutes)**

   - Implement a class template named `GenericStack` that supports basic stack operations: `push()`, `pop()`, and `peek()`.
   - The `push()` method should insert an element at the top of the stack.
   - The `pop()` method should remove and return the element at the top of the stack. If the stack is empty, it should throw an exception or return a default value.
   - The `peek()` method should return the element at the top of the stack without removing it. If the stack is empty, it should throw an exception or return a default value.
   - Include a constructor that initializes the stack's capacity. The stack should dynamically adjust its size as elements are added.
   - Ensure proper memory management to avoid leaks.

2. **Inheritance for Customization (10 minutes)**
   - Create a subclass of `GenericStack` named `StringStack` that is specifically designed for handling strings.
   - Override the `push()` method in `StringStack` to include a check that rejects empty strings (i.e., the method should not allow pushing empty strings onto the stack).
   - Add a new method `concatTopTwo()` in `StringStack` that pops the top two strings, concatenates them, and then pushes the result back onto the stack. If there are not enough elements in the stack, throw an exception.

#### Instructions:

- Start by planning your implementation and sketching out the class structure.
- Implement the `GenericStack` class template, focusing on correctly handling generic data types with templates.
- After testing your `GenericStack`, proceed to implement the `StringStack` class, paying attention to how inheritance can be used to extend and customize behavior.
- Include error handling for edge cases, such as popping from an empty stack or pushing invalid elements.
- Write a simple main function to demonstrate the functionality of your stack implementation, particularly showcasing the features of the `StringStack`.

#### Submission:

Submit your source code files along with a brief report. The report should include:

- A description of your implementation approach.
- Challenges faced and how you overcame them.
- Any assumptions made during the implementation.
