package code.polymorphism2;

public class Plane extends Vehicle {
    public Plane () {
        // Notice we are parsing our arguments into our superclass (Vehicle) constructor
        super("Plane start", "Plane stop", "Plane direction");
    }

    public void altitude () {
        System.out.println("How high are we?");
    }

    @Override
    public void speed () {
        System.out.println("override abstract 55, Plane speed");
    }
}
