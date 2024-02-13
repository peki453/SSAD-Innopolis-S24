### Task 1: Implementing a Basic Bank Account Class

#### You are given the following class structure:

1.  **`Account` Class**: Base class representing a bank account.
    
    *   Data members: `accountNumber` (int), `balance` (double), `ownerName` (string).
    *   Member functions: Constructor(s), `deposit`, `withdraw`, `getBalance`, `getAccountNumber`, `getOwnerName`.
2.  **`SavingsAccount` Class**: Derived class representing a savings account, inheriting from `Account`.
    
    *   Additional data member: `interestRate` (double).
    *   Additional member functions: Constructor(s), `calculateInterest`, `getInterestRate`.

#### Instructions:

1.  Implement the class structure above, including:
    + Constructor(s) for `Account` and `SavingsAccount` classes
    + All member functions (e.g functions to deposit and withdraw money from the account, ensuring that the balance cannot be negative)
    + The `calculateInterest` member function for the `SavingsAccount` class computes the interest accumulated based on the `interestRate` and performs a deposit to the account balance.
    + Use constant member function where necessary
2.  Demonstrate the use of the `this` pointer where necessary.
3. Defaulted constructor: The `Account` class should have a defaulted function for it's default constructor
4. Deleted functions: The `Account` class should have deleted functions for the copy constructor and assignment operator



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




