package org.example.soldier;

public class Soldier {
    protected int health;
    protected int strength;

    public Soldier(int health , int strength) {
        this.health = 300;
        this.strength = 150;
    }

    public int attack() {
        return this.strength;
    }

    public void receiveDamage(int damage) {
        this.health -= damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
}
