package org.game.characters;

public class Archer extends Character{
    public Archer(String name, double health, double strength) {
        super(name, health, strength);
    }

    @Override
    public void performSpecialMove() {
        System.out.println(getName() + " attacks with an bow.");
    }
}
