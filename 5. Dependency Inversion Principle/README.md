### Dependency Inversion Principle (DIP)

#### **Purpose**:
The **Dependency Inversion Principle** states that:
- **High-level modules should not depend on low-level modules**. Both should depend on abstractions (interfaces or abstract classes).
- **Abstractions should not depend on details**. Details (concrete implementations) should depend on abstractions.

In simpler terms:
- **Don’t let your high-level code depend on low-level code directly. Instead, both should depend on common interfaces or abstractions**.
- This principle helps in achieving **loose coupling** between components of your system, making the code more **flexible**, **testable**, and **maintainable**.

### Why DIP?
- **Loose Coupling**: By depending on abstractions, the high-level module doesn’t need to know the concrete implementation details of the low-level module. This makes your system more modular and easier to modify.
- **Flexibility**: It allows you to easily change the implementation of low-level modules without affecting the high-level modules. You can swap implementations by changing the dependency injection, not the core logic.
- **Testability**: High-level modules can easily be tested by mocking dependencies.

### Real-Life Example

Let’s consider an example of a **notification system**. The system needs to send notifications to users via different channels (like Email, SMS, Push Notification, etc.).

- **Without DIP**: The high-level `NotificationService` directly depends on the low-level `EmailService` or `SMSService`.
- **With DIP**: Both the high-level `NotificationService` and low-level `EmailService`, `SMSService`, etc., depend on a common abstraction (e.g., `NotificationService` depends on `NotificationSender` interface).

### Code Examples

#### Without DIP (Violating the Principle):
Here’s an [example](https://github.com/dharmarajrdr/SOLID-Principles/blob/main/5.%20Dependency%20Inversion%20Principle/WithoutDIP.java) where DIP is violated.

In the code above:
- **`NotificationService`** directly depends on the **`EmailService`**.
- If you wanted to add SMS notifications or switch to a different email service, you would have to modify the `NotificationService` class itself, which violates the **Dependency Inversion Principle**.

---

#### With DIP (Following the Principle):
Here’s an [example](https://github.com/dharmarajrdr/SOLID-Principles/blob/main/5.%20Dependency%20Inversion%20Principle/WithDIP.java) where DIP is followed.

In the improved version:
- **`NotificationService`** no longer directly depends on the `EmailService` or `SMSService`. It depends on the **abstraction** `NotificationSender`.
- Both the `EmailService` and `SMSService` implement the `NotificationSender` interface.
- We use **constructor injection** to provide the specific implementation (either `EmailService` or `SMSService`) to the `NotificationService` class.
- Now, you can easily swap the implementation without modifying the `NotificationService` class, adhering to the **Dependency Inversion Principle**.

---

### Key Benefits of DIP:
1. **Loose Coupling**: High-level and low-level modules are decoupled through an interface, reducing dependencies.
2. **Flexibility**: You can change the low-level module’s implementation without affecting the high-level module.
3. **Testability**: You can easily mock the interface when testing the high-level module, improving unit testability.
4. **Maintainability**: The code is easier to maintain since the high-level logic doesn't need to change if you add or change the low-level implementations.
5. **Extensibility**: Adding new functionality (like a new notification channel) becomes easier without modifying the existing code.

### When to Apply DIP:
- When you need to separate **high-level logic** from **low-level implementation**.
- When you want to make your system more **modular**, **flexible**, and **testable**.
- When you want to **swap implementations** (for example, change a service) without changing the dependent code.

---

### Conclusion:
The **Dependency Inversion Principle (DIP)** promotes the use of **abstractions** (interfaces) instead of concrete classes to allow **loose coupling** between high-level and low-level modules. This makes the system **more flexible**, **easier to modify**, and **easier to test**.
