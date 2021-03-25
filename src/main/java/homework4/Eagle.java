package homework4;

public class Eagle extends Bird implements FlyingBird{

    private int maxSpeedFlying = 150;
    private int maxHeightFlying = 2000;
    private String type;

    public void setSpeed(int speed) {
        this.speedFlying = speed;
    }

    public void setHeightFlying(int heightFlying) {
        this.heightFlying = heightFlying;
    }

    public int getSpeed() {
        return speedFlying;
    }

    public int getHeightFlying() {
        return heightFlying;
    }

    public Eagle(String type) {
        this.type = type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public void eating() {
        System.out.println("I am eating gopher");
    }

    @Override
    void buildingNest() {
        System.out.println("I am building the nest");
    }

    @Override
    public void fly() {
        System.out.println("I am flying in the field");
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
