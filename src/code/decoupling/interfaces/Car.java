package code.decoupling.interfaces;

public class Car implements Vehicle, Production{
    private String start;
    private String stop;
    private String speed;
    private String direction;
    private String type;
    private String color;
    private String loc;

    public Car (String start, String stop, String speed,
                String direction, String type, String color, String loc) {
        super();
        this.start = start;
        this.stop = stop;
        this.speed = speed;
        this.direction = direction;
        this.type = type;
        this.color = color;
        this.loc = loc;
    }

    @Override
    public void start() {
        System.out.println(start);
    }

    @Override
    public void stop() {
        System.out.println(stop);
    }

    @Override
    public void speed() {
        System.out.println(speed);
    }

    @Override
    public void direction() {
        System.out.println(direction);
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
