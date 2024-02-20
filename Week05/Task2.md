### Lab Task: Exploring Smart Pointers in C++

#### Objective:

Understand and apply smart pointers in C++ (`unique_ptr`, `shared_ptr`, `weak_ptr`) to manage resources automatically and solve common memory management problems.

#### Task Description:

1. **Create class Box**

   - The class should have integer value with a constructor and a destrutor

2. **Understanding `unique_ptr` (8 minutes)**

   - Implement a function `create_unique()` that dynamically allocates an `Box` with a given value and returns `int` which is the value inside Box.
   - Demonstrate transferring ownership of the `unique_ptr` to another `unique_ptr` and the automatic deallocation of resources.

3. **Exploring `shared_ptr` (8 minutes)**

   - Implement a function `create_shared_boxes()` that creates two `shared_ptr<Box>` pointing to different `Box` instances and demonstrates shared ownership.
   - Show how the reference count changes when new `shared_ptr` instances are created or destroyed.

4. **Working with `weak_ptr` (9 minutes)**
   - Extend the `Box` class usage by introducing a `weak_ptr<Box>`. Demonstrate how to check if a `weak_ptr` points to an object (i.e., if the object is still alive) and how to convert a `weak_ptr` to a `shared_ptr` to access the object.
   - Explain the use case of `weak_ptr` to solve the problem of circular references.

#### Instructions:

- Implement each part of the task sequentially, testing your understanding of how each smart pointer type works and their respective use cases.
- Pay attention to the mechanics of ownership transfer, especially how `unique_ptr` cannot be copied but can be moved.
- For `shared_ptr`, observe how the reference count mechanism prevents premature deallocation and how it automatically cleans up when no more `shared_ptr` instances point to the object.
- Use `weak_ptr` to access resources without taking ownership and demonstrate how it helps in managing circular references by breaking dependency cycles.

#### Submission:

Submit your source code along with a brief report. The report should include:

- A summary of what you learned about each type of smart pointer.
- Examples from your code demonstrating the use of `unique_ptr`, `shared_ptr`, and `weak_ptr`.
- Reflection on how smart pointers can help manage memory more effectively in C++ applications.

#### Example Solution Outline:

```cpp
#include <iostream>
#include <memory>

class Box {
public:
    int value;
    explicit Box(int v) : value(v) {}
};

int create_unique(Box& value) {
    return // value inside box;
}

void demonstrateSharedPtr() {
    auto box1 = std::make_shared<Box>(10);
    std::shared_ptr<Box> box2 = std::make_shared<Box>(20);
    // Show reference count change
}

void demonstrateWeakPtr() {
    auto sharedBox = std::make_shared<Box>(30);
    std::weak_ptr<Box> weakBox = sharedBox;
    // Convert weak_ptr to shared_ptr to access Box
}

int main() {
    auto uniqueInt = create_unique(5);
    demonstrateSharedPtr();
    demonstrateWeakPtr();
    // Add demonstrations of ownership transfer, reference counts, and weak_ptr usage
    return 0;
}
```
