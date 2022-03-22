package code.inheritance;

public class VehicleTester {
    public static void main (String[] args) {
        Car car = new Car();
        car.start();

        Boat boat = new Boat();
        boat.start();
        boat.depthFinder();;

        Plane plane = new Plane();
        plane.start();
        plane.altitude();

        System.out.println(plane);
    }
}
