package code.enumerations;

public class StopLight2 {
    enum StopLight {
        RED,
        YELLOW,
        GREEN
    }
    public static void main (String[] args) {
        StopLight myStopLight = StopLight.RED;
        System.out.println(myStopLight);
    }
}
