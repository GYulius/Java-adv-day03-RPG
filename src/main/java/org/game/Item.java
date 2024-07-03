package org.game;

import org.game.characters.Character;

public class Item {
    private String name;
    private String type;
    private int effect;

    public Item(String name, String type, int effect) {
        this.name = name;
        this.type = type;
        this.effect = effect;
    }

    public void useItem(Character character) {
        if(this.type.equals("health")) {
            character.setHealth(character.getHealth() + this.effect);
        }
        if(this.type.equals("strength")) {
            character.setStrength(character.getStrength() + this.effect);
        }
        System.out.println(name + " used on " + character.getName() + " with effect " + effect + " and type: " + type);
    }
}
