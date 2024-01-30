### Task: Create a Simple Zoo Animal Hierarchy

#### Background

You are creating a simple model for animals in a zoo. There are different types of animals, each with their unique behaviors and characteristics. Your goal is to use C++ features like multiple inheritance, polymorphism, access modifiers, and abstraction to model this scenario.

#### Instructions

1. **Define a Base Class `Animal`**

   - Include common attributes like `name` and `age` (protected access modifiers).
   - Define a virtual function `makeSound()` that each animal will implement.

2. **Create Two Interface Classes: `LandAnimal` and `WaterAnimal`**

   - These interfaces should have at least one pure virtual function each. For example, `walk()` for `LandAnimal` and `swim()` for `WaterAnimal`.

3. **Implement Derived Classes**

   - Create at least two derived classes (e.g., `Lion` and `Dolphin`) that inherit from `Animal` and one of the interfaces.
   - Implement the interface methods and `makeSound()` in each derived class.

4. **Demonstrate Multiple Inheritance**

   - Create a class `Amphibian` that inherits from both `LandAnimal` and `WaterAnimal`.
   - Implement the necessary functions.

5. **Test Polymorphism**

   - In your main function, create an array or a vector of `Animal` pointers.
   - Instantiate objects of your derived classes and add them to your collection.
   - Loop through the collection and call `makeSound()` for each animal.

6. **Discuss Abstraction**
   - Highlight how the base class and interfaces provide an abstract layer for the derived classes.

#### Requirements

- Make sure to use appropriate access specifiers for class members.
- Demonstrate the use of virtual functions and polymorphism.
- Show how multiple inheritance can be implemented.

#### Expected Output

Your program should create instances of different animals and demonstrate polymorphism by calling a common function like `makeSound()`. It should also show how an amphibian class can inherit features from both land and water animals.
