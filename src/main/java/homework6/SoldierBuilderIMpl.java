package homework6;

public class SoldierBuilderIMpl implements SoldierBuilder {

    Soldier soldier = new Soldier();

    @Override
    public SoldierBuilder setName(String name) {
        soldier.name = name;
        return this;
    }

    @Override
    public SoldierBuilder setLastName(String lastName) {
        soldier.lastName = lastName;
        return this;
    }

    @Override
    public SoldierBuilder setRank(String rank) {
        soldier.rank = rank;
        return this;
    }

    @Override
    public SoldierBuilder setBadgeNumber(int badgeNumber) {
        soldier.badgeNumber = badgeNumber;
        return this;
    }

    @Override
    public SoldierBuilder setBloodType(String bloodType) {
        soldier.bloodType = bloodType;
        return this;
    }

    @Override
    public SoldierBuilder setTypeOfTroops(String typeOfTroops) {
        soldier.typeOfTroops = typeOfTroops;
        return this;
    }

    @Override
    public SoldierBuilder setSex(String sex) {
        soldier.sex = sex;
        return this;
    }

    @Override
    public Soldier build() {
        return soldier;
    }
}
