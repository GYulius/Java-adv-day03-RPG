package org.game.characters;

public class Mage extends Character{
    public Mage(String name, double health, double strength) {
        super(name, health, strength);
    }

    @Override
    public void performSpecialMove() {
        System.out.println(getName() + " attacks with a fireball.");
    }
}
