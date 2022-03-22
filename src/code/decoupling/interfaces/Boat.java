package code.decoupling.interfaces;

public class Boat implements Vehicle, Production {
    private String start;
    private String stop;
    private String speed;
    private String direction;
    private String type;
    private String color;
    private String loc;

    public Boat (String start, String stop, String speed,
                 String direction, String type, String color, String loc) {
        // Notice we are parsing our arguments into our superclass (Vehicle) constructor
        super();
        this.start = start;
        this.stop = stop;
        this.speed = speed;
        this.direction = direction;
        this.type = type;
        this.color = color;
        this.loc = loc;
    }

    public void depthFinder () {
        System.out.println("How deep is this water?");
    }

    @Override
    public void start() {
        System.out.println(start);;
    }

    @Override
    public void stop() {
        System.out.println(stop);;
    }

    @Override
    public void speed() {
        System.out.println(speed);
    }

    @Override
    public void direction() {
        System.out.println(direction);;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public String getColor () {
        return color;
    }

    @Override
    public String location () {
        return loc;
    }
}
