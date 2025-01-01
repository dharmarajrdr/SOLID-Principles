### Open/Closed Principle (OCP)

**Purpose**:  
The Open/Closed Principle states that software entities (classes, modules, functions) should be **open for extension but closed for modification**.  
- **Open for extension**: You can add new functionality.
- **Closed for modification**: Avoid altering existing code, as it can introduce bugs or affect other parts of the system.

This principle promotes maintainability and reduces the risk of breaking existing functionality when adding new features.

---

### Real-Life Code Example  

#### Without OCP  
Here’s an [example](https://github.com/dharmarajrdr/SOLID-Principles/blob/main/2.%20Open-Closed%20Principle/WithoutOCP.java) where OCP is violated.

**Issues**:  
1. Every time a new invoice type is introduced (e.g., `SMS`, `PushNotification`), the `InvoiceProcessor` class must be modified.
2. This violates OCP as the class is **not closed for modification**.
3. Adding a new type increases the risk of introducing bugs in existing functionality.

---

#### With OCP  
Here’s an [example](https://github.com/dharmarajrdr/SOLID-Principles/blob/main/2.%20Open-Closed%20Principle/WithOCP.java) where OCP is followed.

**Benefits**:  
1. Adding a new invoice type (e.g., `SMSInvoice`) only requires creating a new class implementing the `Invoice` interface.
2. The `InvoiceProcessor` class is **open for extension** (can process new types) but **closed for modification** (no changes required to handle new types).

---

### Real-World Analogy  

**Without OCP**:  
A restaurant menu is printed on paper. If a new dish is added, you must reprint the entire menu, risking errors and delays.

**With OCP**:  
A digital menu screen allows adding new dishes dynamically without rewriting the entire menu.
