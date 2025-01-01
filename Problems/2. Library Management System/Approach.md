This solution addresses the core **SOLID** principles effectively:

1. **SRP**: Each class has a clear, singular responsibility, such as handling common book details, managing book types, or managing the creation of books.
2. **OCP**: The system allows you to easily extend book types by creating new subclasses, without modifying existing code.
3. **LSP**: All subclasses of `Book` can be used interchangeably, ensuring that a `PrintedBook` can be replaced with an `AudioBook` or `E_Book` without breaking the functionality.
4. **ISP**: Although no interfaces were added, your design already supports future segregation of responsibilities. Additional methods for each book type can be introduced without forcing all book types to implement them.
5. **DIP**: The high-level code (like a potential `LibraryService`) would depend on the abstract `Book` class rather than the concrete `PrintedBook`, `E_Book`, or `AudioBook`.

We’ve successfully applied the SOLID principles to this problem. The design is now scalable, maintainable, and easy to extend.