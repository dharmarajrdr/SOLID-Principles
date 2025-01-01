1. **Single Responsibility Principle (SRP)**  
   - **Problem:** Initially, the `Vehicle` class would have been responsible for multiple responsibilities like fuel management and service tracking, which violates SRP.  
   - **Solution:**  
     - Created interfaces `Fuelable` and `Serviceable` to handle fuel-related operations and service history separately.  
     - The `VehicleManager` class implements these interfaces, encapsulating fuel and service-related logic, thus keeping the `Vehicle` class focused on being a generic representation of a vehicle.

2. **Open/Closed Principle (OCP)**  
   - **Problem:** Extending or modifying the `Vehicle` class to accommodate different fuel types or vehicle types might have required changes in existing code.  
   - **Solution:**  
     - Used abstract `Vehicle` with `getFuelEfficiency()` method, allowing specific implementations (`PetrolVehicle` and `DieselVehicle`) to define their behavior without altering existing code.  
     - Added flexibility to extend new vehicle types like electric vehicles without modifying core classes.

3. **Liskov Substitution Principle (LSP)**  
   - **Problem:** If a subclass like `Car` or `Truck` did not properly inherit or adhere to the behavior of `Vehicle`, it could break the program.  
   - **Solution:**  
     - Subclasses like `Car`, `Truck`, and `MotorCycle` inherit from `PetrolVehicle` or `DieselVehicle`, ensuring they can be used interchangeably with their parent types (`Vehicle`) without breaking functionality.  
     - For example, a `Car` can substitute a `Vehicle` in `VehicleManager` without issues.

4. **Interface Segregation Principle (ISP)**  
   - **Problem:** A single large interface might have forced classes to implement methods they do not use.  
   - **Solution:**  
     - Introduced two smaller interfaces, `Fuelable` for fuel-related operations and `Serviceable` for service tracking, ensuring classes only implement methods they need.

5. **Dependency Inversion Principle (DIP)**  
   - **Problem:** High-level classes (`VehicleManager`) would directly depend on low-level classes (`Vehicle` subclasses) without abstraction.  
   - **Solution:**  
     - `VehicleManager` depends on the abstraction `Vehicle` and interacts with vehicles through the `Fuelable` and `Serviceable` interfaces. This decouples `VehicleManager` from specific vehicle implementations, allowing flexibility and easy testing.

---

### Benefits Achieved:
- **Flexibility:** Adding new vehicle types (e.g., ElectricVehicle) requires minimal changes.
- **Reusability:** `VehicleManager` handles common operations for any `Vehicle` without code duplication.
- **Maintainability:** Clear separation of responsibilities makes the code easier to read, debug, and maintain.
- **Extensibility:** New features or types can be added without altering existing classes, adhering to OCP.

This design demonstrates adherence to the SOLID principles while keeping the code scalable and robust for future requirements.