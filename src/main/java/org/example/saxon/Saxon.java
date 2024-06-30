package org.example.saxon;

import org.example.soldier.Soldier;

public class Saxon extends Soldier {
    String msg;

    public Saxon(int health, int strength, String msg) {
        super(health, strength);
        this.msg = msg;
    }

    @Override
    public int attack() {
        return super.attack();
    }

    @Override
    public void receiveDamage(int damage) {
        super.receiveDamage(damage);
        this.setHealth(this.getHealth() - damage);
        if (this.getHealth() >= 1) {
            this.msg = "A Saxon has received" + damage + "points of damage";
        } else {
            this.msg = "A Saxon has died in combat";
        }

    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}