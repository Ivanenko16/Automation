package homework4;

public class Swallow extends Bird implements FlyingBird{
    private int maxSpeedFlying = 100;
    private int maxHeightFlying = 1500;

    @Override
    public void eating() {
        System.out.println("I am eating mosquito");
    }

    @Override
    void buildingNest() {
        System.out.println("I am building the nest");
    }

    @Override
    public void fly() {
        System.out.println("I am flying in the city");
    }

    @Override
    public void upMaxHeightFlying() {
        System.out.println(maxHeightFlying + " meters");
    }

    @Override
    public void upMaxSpeed() {
        System.out.println(maxSpeedFlying + " km/h");
    }
}
