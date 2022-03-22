package code.inheritance;

public class Car extends Vehicle{
    public Car () {
        // Notice we are parsing our arguments into our superclass (Vehicle) constructor
        super("Car start", "Car stop", "Car speed", "Car direction");
    }
}
