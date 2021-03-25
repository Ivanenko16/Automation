package homework6;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = Triangle.getInstance();
        triangle.setA(1);
        triangle.setB(2);
        triangle.setC(3);

        System.out.println(triangle.calculatePerimeter());

        Triangle triangle1 = Triangle.getInstance();
        int perimeter1 = triangle1.calculatePerimeter();
        System.out.println(perimeter1);

        Soldier soldier = new SoldierBuilderIMpl().setName("Yurii")
                .setLastName("Boyko")
                .setBloodType("A (II)")
                .setBadgeNumber(1234567)
                .setRank("Major")
                .setTypeOfTroops("Special Forces")
                .setSex("male").build();
        System.out.println(soldier.toString());

        Soldier soldier1 = new SoldierBuilderIMpl().setName("Chuck").setLastName("Norris").build();
        System.out.println(soldier1.toString());
    }
}
