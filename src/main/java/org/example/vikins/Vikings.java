package org.example.vikins;

import org.example.soldier.Soldier;

public class Vikings extends Soldier {
   protected String name;
   protected String msg;

    Vikings viking = new Vikings (name, health, strength);

    public Vikings(String name, int health, int strength) {
        super(health, strength);
        this.name = "Harald";
        this.health = 300;
        this.msg = msg;
    }

    @Override
    public void receiveDamage(int damage) {
        super.receiveDamage(damage);
        this.setHealth(this.getHealth() - damage);
        if (this.getHealth() >= 1) {
            this.msg = this.name + " has received " + damage + " points of damage";
        } else {
            this.msg = this.name + " has died in act of combat";
        }
    }

    public String battleCry() {
        return "Odin Owns You All!";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
