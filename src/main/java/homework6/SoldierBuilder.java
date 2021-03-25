package homework6;

public interface SoldierBuilder {
    SoldierBuilder setName(String name);
    SoldierBuilder setLastName(String lastName);
    SoldierBuilder setRank(String rank);
    SoldierBuilder setBadgeNumber(int badgeNumber);
    SoldierBuilder setBloodType(String bloodType);
    SoldierBuilder setTypeOfTroops(String typeOfTroops);
    SoldierBuilder setSex(String sex);
    Soldier build();
}
