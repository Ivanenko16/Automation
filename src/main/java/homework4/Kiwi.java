package homework4;

public  class Kiwi extends Bird implements NonflyingBird {


    @Override
    public void eating() {
        System.out.println("I am eating berries");
    }

    @Override
    void buildingNest() {
        System.out.println("I am building the nest");
    }

    @Override
    public void nonFly() {
        System.out.println("I am running in the forrest");
    }
}
