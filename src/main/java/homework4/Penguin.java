package homework4;

public class Penguin extends Bird implements NonflyingBird{

    @Override
    public void eating() {
        System.out.println("I am eating fish");
    }

    @Override
    void buildingNest() {
        System.out.println("I am building the nest");
    }

    @Override
    public void nonFly() {
        System.out.println("I am swimming in the ocean");
    }
}
