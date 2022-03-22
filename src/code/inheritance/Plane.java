package code.inheritance;

public class Plane extends Vehicle{
    public Plane () {
        // Notice we are parsing our arguments into our superclass (Vehicle) constructor
        super("Plane start", "Plane stop", "Plane speed", "Plane direction");
    }

    public void altitude () {
        System.out.println("How high are we?");
    }
}
