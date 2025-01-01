### Problem: Vehicle Management System

We need to build a system that allows different types of vehicles to be managed in a fleet. Each vehicle can either be a **Car**, **Truck**, or **Motorcycle**.

#### Key Requirements:

1. Each vehicle has some **basic properties**: make, model, license number, and fuel efficiency (kms/litre).
2. The system should allow us to **calculate fuel efficiency** based on different fuel types (e.g., petrol, diesel).
3. There should be a way to **track the fuel level** of each vehicle.
4. Each vehicle can have a **service record**, including service date and details.

#### Expected System Behavior:

1. A **Car** may have extra properties like `numberOfDoors`.
2. A **Truck** may have extra properties like `cargoCapacity`.
3. A **Motorcycle** may have extra properties like `engineType`.
4. The system should be easily extendable to add more vehicle types (e.g., electric vehicles, hybrid vehicles).

### Your Task:

- Model the **vehicle** hierarchy and ensure that the system follows **SOLID** principles.
- Create classes for **Car**, **Truck**, and **Motorcycle** that inherit from a base class (e.g., `Vehicle`).
- Ensure the **VehicleManager** class can calculate fuel efficiency for any vehicle and track the fuel level.
