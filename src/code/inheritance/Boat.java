package code.inheritance;

public class Boat extends Vehicle{
    public Boat () {
        // Notice we are parsing our arguments into our superclass (Vehicle) constructor
        super("Boat start", "Boat stop", "Boat speed", "Boat direction");
    }

    public void depthFinder () {
        System.out.println("How deep is this water?");
    }
}
