package code.enumerations;

public class Light {
    public Light () {

    }

    public void changeLight (StopLight currentLight) {
        if (StopLight.GREEN == currentLight) {
            System.out.println("Green means Go!");
        } else if (StopLight.YELLOW == currentLight) {
            System.out.println("Slow down!");
        } else if (StopLight.RED == currentLight) {
            System.out.println("Stop!");
        }
    }
}
