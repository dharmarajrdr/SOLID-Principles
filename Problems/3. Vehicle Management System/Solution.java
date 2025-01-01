
import java.util.ArrayList;
import java.util.Date;

enum EngineType {
    SINGLE_CYLINDER, V_ENGINE, FLAT_TWIN_ENGINE, V4, FOUR_CYLINDER_ENGINE
}

class ServiceDetail {

    Date serviceDate;
    int serviceCharges;
}

interface Fuelable {

    void refillFuel();

    boolean hasFuel();

    void consumeFuel(double amountOfConsumption);
}

interface Serviceable {

    Date getLastServiceDate();
}

abstract class Vehicle {

    String model;
    String make;
    String licenseNumber;
    float fuelLevel; // The level of fuel will be indicated in the range of 0 to 10
    ArrayList<ServiceDetail> serviceRecord;

    abstract double getFuelEfficiency();

    Vehicle() {
        this.fuelLevel = 10; // Default fuel level
        this.serviceRecord = new ArrayList<>();
    }
}

class PetrolVehicle extends Vehicle {

    @Override
    double getFuelEfficiency() {
        return 35.5; // Assume: Petrol vehicles can go up to 35km per litre
    }
}

class DieselVehicle extends Vehicle {

    @Override
    double getFuelEfficiency() {
        return 40.2; // Assume: Diesel vehicles can go up to 40km per litre
    }
}

// Introduce interfaces like Fuelable or Serviceable to separate fuel-related and service-related responsibilities
class VehicleManager implements Fuelable, Serviceable {

    private final Vehicle vehicle;

    public VehicleManager(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void refillFuel() {
        vehicle.fuelLevel = 10;
        System.out.println("Fuel refilled successfully.");
    }

    @Override
    public boolean hasFuel() {
        return vehicle.fuelLevel > 0;
    }

    @Override
    public void consumeFuel(double amountOfConsumption) {
        if (vehicle.fuelLevel - amountOfConsumption <= 0) {
            vehicle.fuelLevel = 0;
            System.out.println("Fuel depleted.");
        } else {
            vehicle.fuelLevel -= amountOfConsumption;
            System.out.println("Fuel consumed.");
        }
    }

    @Override
    public Date getLastServiceDate() {
        int size = vehicle.serviceRecord.size();
        if (size == 0) {
            return null; // No services done.
        }
        return vehicle.serviceRecord.get(size - 1).serviceDate;
    }
}

class Car extends PetrolVehicle { // Later we can change to DieselVehicle by changing the superclass

    int numberOfDoors;
}

class Truck extends DieselVehicle {

    long cargoCapacity;
}

class MotorCycle extends PetrolVehicle {

    EngineType engineType;
}

public class Solution {

    public static void main(String[] args) {

        Vehicle audi = new Car();   // Also define as Car car = new car(); Thus, follows LSP.
        audi.licenseNumber = "TN 23 DP 1712";
        Vehicle pulsar = new MotorCycle();
        pulsar.model = "RS200";

        VehicleManager audiManager = new VehicleManager(audi);
        System.out.println("Fuel Efficiency: " + audi.getFuelEfficiency());
        audiManager.consumeFuel(2);
        System.out.println("Has Fuel: " + audiManager.hasFuel());

        VehicleManager pulsarManager = new VehicleManager(pulsar);
        pulsarManager.refillFuel();
        System.out.println("Last Service Date: " + pulsarManager.getLastServiceDate());
    }
}
