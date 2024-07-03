package org.game.characters;

public class SimpleBattle implements Battle {

    @Override
    public void startFight(Character character1, Character character2) {
        System.out.println(character1.getName() + " fight with " + character2.getName());
        character1.performSpecialMove();
        character2.performSpecialMove();

        if(character1.getStrength() > character2.getStrength()) {
            character2.takeDamage(character1.getStrength());
            System.out.println(character2.getName() + "is defeated.");
        } else {
            character1.takeDamage(character2.getStrength());
            System.out.println(character1.getName() + " is defeated.");
        }
    }
}