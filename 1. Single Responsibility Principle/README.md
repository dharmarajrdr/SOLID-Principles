### Single Responsibility Principle (SRP)

**Purpose**:  
The Single Responsibility Principle states that **a class should have only one reason to change**. It ensures that **a class focuses on one functionality or responsibility**, making the code easier to maintain and less prone to errors when changes are required.

---

### Real-Life Code Example  

#### Without SRP  
Here’s an [example](https://github.com/dharmarajrdr/SOLID-Principles/blob/main/1.%20Single%20Responsibility%20Principle/WithoutSRP.java) where SRP is violated.

**Issues**:  
1. The `Invoice` class has two responsibilities:
   - Generating an invoice.
   - Sending email notifications.
2. If the email logic changes (e.g., switch from SMTP to a third-party service), the `Invoice` class will need modification, violating SRP.

---

#### With SRP  
Here’s an [example](https://github.com/dharmarajrdr/SOLID-Principles/blob/main/1.%20Single%20Responsibility%20Principle/WithSRP.pdf) where SRP is followed.

**Benefits**:
1. Each class has a single responsibility.
2. Changes to email logic won't impact invoice generation and vice versa.
3. Improved maintainability and testability.

---

### Real-World Analogy  

**Without SRP**:  
Imagine a person responsible for cooking meals **and** repairing electrical appliances in a restaurant. If the person is occupied with repairs, the meals might get delayed. 

**With SRP**:  
Assign one person to cooking and another to repairs. Each has a single focus, leading to smoother operations and better efficiency.

---
