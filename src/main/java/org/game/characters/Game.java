package org.game.characters;

import org.game.Item;

public class Game {
    public static void main(String[] args) {
        Character warrior = new Warrior("Warrior", 100,50);
        Character archer = new Archer("Archer", 100,40);
        Character mage = new Mage("Mage",100,90);

        Item strengthPotion = new Item("Strength Potion", "strength", 5);

        System.out.println("Strength before use of potion: " + archer.getStrength() + " on the character: " + archer.getName());
        strengthPotion.useItem(archer);
        System.out.println("Strength after use of potion: " + archer.getStrength() + " on the character: " + archer.getName());

        Battle myBattle = new SimpleBattle();

        myBattle.startFight(warrior,archer);

    }
}
