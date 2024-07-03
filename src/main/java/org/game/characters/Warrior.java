package org.game.characters;

public class Warrior extends Character{

    public Warrior(String name, double health, double strength) {
        super(name, health, strength);
    }

    @Override
    public void performSpecialMove() {
        System.out.println(getName() + " attacks with a sword.");
    }
}
