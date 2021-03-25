package homework6;

public class Soldier {

    protected String name;
    protected String lastName;
    protected String rank;
    protected int badgeNumber;
    protected String bloodType;
    protected String typeOfTroops;
    protected String sex;

    @Override
    public String toString() {
        return "Soldier{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", rank='" + rank + '\'' +
                ", badgeNumber=" + badgeNumber +
                ", bloodType='" + bloodType + '\'' +
                ", typeOfTroops='" + typeOfTroops + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
