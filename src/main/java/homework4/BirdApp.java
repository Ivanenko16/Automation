package homework4;

public class BirdApp {
    public static void main(String[] args) {
        Eagle berkut = new Eagle("Berkut");
        Eagle sokol = new Eagle("Sokol");
        Swallow swallow = new Swallow();
        Penguin penguin = new Penguin();
        Kiwi kiwi = new Kiwi();

        berkut.eating();
        swallow.eating();
        penguin.eating();
        kiwi.eating();
        kiwi.buildingNest();

        berkut.upMaxHeightFlying();
        swallow.upMaxSpeed();

        berkut.fly();
        swallow.fly();
        penguin.nonFly();
        kiwi.nonFly();

        berkut.setSpeed(135);
        System.out.println(berkut.getSpeed());
        berkut.upMaxHeightFlying();
        sokol.setSpeed(120);
        sokol.setHeightFlying(1800);
        kiwi.layEggs();
        System.out.println(sokol.getType() + " flying with speed " + sokol.getSpeed() + " km/h on height " + sokol.getHeightFlying() + " meters");


    }
}
