This solution addresses the core **SOLID** principles effectively:

1. **Single Responsibility Principle (SRP)**: Each product class (like `Electronics`, `Food`) is responsible only for its own discount logic.
2. **Open/Closed Principle (OCP)**: You can add new products without modifying the `DiscountCalculator`, which is open for extension but closed for modification.
3. **Liskov Substitution Principle (LSP)**: Any new product implementing the `Product` interface can be used in place of existing products without breaking the system.
4. **Interface Segregation Principle (ISP)**: The `Product` interface is minimal and specific, ensuring that products only implement what they need (i.e., `getDiscount()`).
5. **Dependency Inversion Principle (DIP)**: The `DiscountCalculator` depends on the abstraction (`Product`) rather than concrete implementations (`Electronics`, `Food`), reducing tight coupling.

So, **yes**, our solution has effectively solved all the SOLID issues! 🎉
