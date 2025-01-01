### Problem: E-commerce System for Product Discounts

You are working on an e-commerce platform, and one of the features is to calculate discounts for various types of products. The system currently handles the discount calculation logic inside a single class. However, you need to ensure that the code is maintainable, extensible, and flexible.

### Current Design -> (Violates SOLID Principles):

```java
class DiscountCalculator {
    public double calculateDiscount(String productType, double price) {
        double discount = 0.0;

        if (productType.equals("Electronics")) {
            discount = price * 0.10; // 10% discount for electronics
        } else if (productType.equals("Clothing")) {
            discount = price * 0.20; // 20% discount for clothing
        } else if (productType.equals("Food")) {
            discount = price * 0.05; // 5% discount for food
        }
        
        return price - discount;
    }
}
```

### What’s wrong with the above code?
1. **Single Responsibility Principle (SRP)**: The `DiscountCalculator` class is responsible for both the calculation logic and knowing about different product types. If you add more product types in the future, you’ll have to modify this class.
2. **Open/Closed Principle (OCP)**: The `DiscountCalculator` class is not easily extendable. Adding a new product type requires modifying the class.
3. **Liskov Substitution Principle (LSP)**: If you wanted to extend the `DiscountCalculator` class for a more specific type of discount (e.g., a special discount for VIP customers), it would be hard to replace the class with a new implementation without breaking the behavior.
4. **Interface Segregation Principle (ISP)**: Not directly applicable here yet, but we are dealing with a single method, which could be separated into different interfaces if needed.
5. **Dependency Inversion Principle (DIP)**: The `DiscountCalculator` class depends directly on product types. A more flexible design would depend on abstractions.

### Your Task:
Refactor the code to follow the SOLID principles. Create an extensible, flexible design where the discount calculation logic is easy to modify and extend with new product types or discount strategies without changing existing code.
