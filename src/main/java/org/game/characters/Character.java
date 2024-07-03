package org.game.characters;

public abstract class Character {
    private String name;
    private double health;
    private double strength;

    public Character(String name, double health, double strength) {
        this.name = name;
        this.health = health;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        if (health >= 0) {
            this.health = health;
        }
    }

    public double getStrength() {
        return strength;
    }

    public void setStrength(double strength) {
        if( strength > 0) {
            this.strength = strength;
        }
    }

    public void takeDamage(double damage) {
        health -= damage;
        if(health < 0) {
            health = 0;
        }
    }

    public abstract void  performSpecialMove();
}
