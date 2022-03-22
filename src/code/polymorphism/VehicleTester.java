package code.polymorphism;

/*
 * The example of polymorphism
 * A car is a car, and also a vehicle.
 */
public class VehicleTester {
    public static void main (String[] args) {

        // We can create an array of vehicles
        Vehicle[] vehicles = new Vehicle[3];

        // Add a Car, Plane and Boat objects to the array
        vehicles[0] = new Car();
        vehicles[1] = new Boat();
        vehicles[2] = new Plane();

        for (int i=0; i<vehicles.length; i++) {
            Vehicle vehicle = vehicles[i];
            vehicle.speed();
        }
    }
}
