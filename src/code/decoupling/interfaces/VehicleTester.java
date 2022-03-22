package code.decoupling.interfaces;

/*
 * The example of polymorphism
 * A car is a car, and also a vehicle.
 */
public class VehicleTester {
    public static void main (String[] args) {

        // We can create an array of vehicles
        Vehicle[] vehicles = new Vehicle[3];

        // Add a Car, Plane and Boat objects to the array
        vehicles[0] = new Car("Car start", "Car stop", "middle","Car direction",
                "car", "red", "sh");
        vehicles[1] = new Boat("Boat start", "Boat stop", "slow", "Boat direction",
                "boat", "blue", "bj");
        vehicles[2] = new Plane("Plane start", "Plane stop", "fast", "Plane direction",
                "plane", "white", "sz");

        for (int i=0; i<vehicles.length; i++) {
            Vehicle vehicle = vehicles[i];
            vehicle.speed();
        }
    }
}
