### Interface Segregation Principle (ISP)

#### **Purpose**:
- The **Interface Segregation Principle (ISP)** states that **clients should not be forced to depend on interfaces they do not use**.
- In simpler terms, it's better to have **smaller, specific interfaces** rather than a **large, general-purpose interface**. Clients should only implement the methods that are relevant to them.

#### **Why ISP?**
- Large interfaces with many methods lead to problems, especially when classes are forced to implement methods they don’t need. This leads to **tight coupling** and **bloating**.
- By adhering to ISP, you can create **smaller, more focused interfaces** that **clients** will only need to implement the methods they care about, keeping your code more **modular**, **flexible**, and **maintainable**.

### Real-Life Example

Let’s take the example of a **printer system**.

1. Imagine a `MultiFunctionPrinter` interface that handles **printing**, **scanning**, **faxing**, etc. 
2. Now, if you have a **simple printer** that only prints and doesn’t scan or fax, it shouldn’t be forced to implement scanning and faxing methods just because they are part of the `MultiFunctionPrinter` interface. This is where ISP helps — by separating the **printing functionality** from the **scanning functionality**.

### Code Examples

#### Without ISP (Violating ISP):
Here’s an [example](https://github.com/dharmarajrdr/SOLID-Principles/blob/main/4.%20Interface%20Segregation%20Principle/WithoutISP.java) where ISP is violated.

In the code above:
- The `SimplePrinter` class is forced to implement the methods `scan()` and `fax()` from the `MultiFunctionPrinter` interface, even though it doesn't **need** them.
- This results in unnecessary **empty implementations** (like printing a message that scanning or faxing isn’t supported) and **violates ISP**.

---

#### With ISP (Following the Principle):
Here’s an [example](https://github.com/dharmarajrdr/SOLID-Principles/blob/main/4.%20Interface%20Segregation%20Principle/WithISP.java) where ISP is followed.

In this improved version:
- We **split the interfaces** into smaller, more focused ones: `Printer`, `Scanner`, and `Fax`.
- Now, `SimplePrinter` only implements the `Printer` interface, so it **doesn’t have to implement scanning or faxing**. This adheres to ISP.
- The `MultiFunctionPrinter` class, which supports all functionalities (printing, scanning, and faxing), implements all three interfaces.
- This keeps the code **clean**, **modular**, and **follows ISP**.

### Key Benefits of ISP:
1. **Reduced Unnecessary Dependencies**: Classes are *not forced to implement methods they don't need*.
2. **Better Maintainability**: It’s easier to *modify or extend smaller interfaces without affecting unrelated clients*.
3. **Improved Flexibility**: Clients can choose which interfaces to implement based on their needs. You can add new functionality without changing existing code.
4. **Separation of Concerns**: Each interface is focused on a **single responsibility**.

### When to Apply ISP:
- **When you have large interfaces with unrelated methods**.
- **When a class doesn’t need all the functionality provided by an interface**.
- **When you want to avoid "fat" interfaces**.

---

### Conclusion:
- The **Interface Segregation Principle (ISP)** encourages *splitting large, generalized interfaces into smaller, more focused ones*.
- This helps to ensure that clients only depend on the methods that are relevant to them, leading to **cleaner, more maintainable, and modular** code.
