package code.polymorphism2;

public class Car extends Vehicle {
    public Car () {
        // Notice we are parsing our arguments into our superclass (Vehicle) constructor
        super("Car start", "Car stop", "Car direction");
    }

    @Override
    public void speed() {
        System.out.println("override abstract 55, Car speed");
    }
}
