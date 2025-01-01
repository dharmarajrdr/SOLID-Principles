### Liskov Substitution Principle (LSP)

**Purpose**:  
The Liskov Substitution Principle states that **objects of a superclass should be replaceable with objects of a subclass without affecting the correctness of the program**. In other words, subclasses should be able to stand in for their base classes without introducing unexpected behavior.

---

### Real-Life Code Example

#### Without LSP  
Here’s an [example](https://github.com/dharmarajrdr/SOLID-Principles/blob/main/3.%20Liskov%20Substitution%20Principle/WithoutLSP.java) where LSP is violated.

**Issues**:  
1. **Ostrich**, a subclass of `Bird`, cannot fly, but it's substituting for a `Bird` object that is expected to fly.
2. The `Ostrich` class breaks the behavior expected from `Bird` and throws an exception, violating LSP. This could lead to unexpected errors in the system.

---

#### With LSP  
Here’s an [example](https://github.com/dharmarajrdr/SOLID-Principles/blob/main/3.%20Liskov%20Substitution%20Principle/WithLSP.java) where LSP is followed.

**Benefits**:  
1. `FlyingBird` and `NonFlyingBird` are now separate classes, and they are **true to their intended behavior**.
2. **No exceptions** are thrown, and each subclass behaves correctly according to its capabilities.
3. The program can now substitute `Bird` with either `FlyingBird` or `NonFlyingBird` without issues.

---

### Real-World Analogy  

**Without LSP**:  
Imagine a **vehicle** superclass, with subclasses like **Car** and **Boat**. If you expect all vehicles to "drive," substituting a `Boat` (which can't drive) into a `Vehicle` object would cause a problem.

**With LSP**:  
We separate vehicles into subclasses like **LandVehicle** and **WaterVehicle**. Now, substituting a `LandVehicle` (car, bike) or `WaterVehicle` (boat, submarine) in place of a `Vehicle` works, as each class behaves according to its specific capabilities.

---

### Key Takeaways from LSP:
1. **Substituting subclasses**: Subtypes should be interchangeable with their base type without breaking functionality.
2. **Correct behavior**: The subclass should meet the expectations set by the base class. It shouldn’t violate any preconditions or postconditions established in the base class.
3. **Polymorphism**: LSP helps to ensure that polymorphism behaves as expected, avoiding unexpected errors when subclasses are used interchangeably.
