package code.polymorphism;

public class Car extends Vehicle {
    protected String start;
    protected String stop;
    protected String speed;
    protected String direction;

    public Car () {
        // Notice we are parsing our arguments into our superclass (Vehicle) constructor
        super("Car start", "Car stop", "Car speed", "Car direction");
    }
}
