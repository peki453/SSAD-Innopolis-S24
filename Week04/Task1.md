### Task 1: Implementing a Basic Bank Account Class

#### Class Structure:

1.  **`Account` Class**: Base class representing a bank account.
    
    *   Data members: `accountNumber` (int), `balance` (double), `ownerName` (string).
    *   Member functions: Constructor(s), `deposit`, `withdraw`, `getBalance`, `getAccountNumber`, `getOwnerName`.
2.  **`SavingsAccount` Class**: Derived class representing a savings account, inheriting from `Account`.
    
    *   Additional data member: `interestRate` (double).
    *   Additional member functions: Constructor(s), `calculateInterest`, `getInterestRate`.

#### Requirements:

1.  Implement `Account` and `SavingsAccount` classes. Additionally, implement constructors for both classes, utilizing delegation where appropriate.
5.  Demonstrate the use of the `this` pointer where necessary.
2.  Implement functions to deposit and withdraw money from the account, ensuring that the balance cannot be negative.
6. The `Account` class should have a defaulted function for it's default constructor
6. The `Account` class should have deleted functions for the copy constructor and assignment operator
3.  Implement constant member function where necessary.
4.  Implement a function to calculate interest for the `SavingsAccount` class.



#### How to run:

```cpp
int main() {
    // Usage example
    SavingsAccount savings(123456, 1000.0, "John Doe", 2.5);
    savings.deposit(500.0);
    savings.withdraw(200.0);
    savings.calculateInterest();

    cout << "Account Number: " << savings.getAccountNumber() << endl;
    cout << "Owner's Name: " << savings.getOwnerName() << endl;
    cout << "Current Balance: " << savings.getBalance() << endl;
    cout << "Interest Rate: " << savings.getInterestRate() << "%" << endl;

    return 0;
}
```




