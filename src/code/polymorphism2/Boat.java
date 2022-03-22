package code.polymorphism2;

public class Boat extends Vehicle {
    public Boat () {
        // Notice we are parsing our arguments into our superclass (Vehicle) constructor
        super("Boat start", "Boat stop", "Boat direction");
    }

    public void depthFinder () {
        System.out.println("How deep is this water?");
    }

    @Override
    public void speed() {
        System.out.println("override abstract 55, Boat speed");
    }
}
