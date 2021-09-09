package com.company;

public class Boss {
    private String chooseBossDefence;
    private int Health;
    private int Damage;

    public String getChooseBossDefence() {
        return chooseBossDefence;
    }

    public void setChooseBossDefence(String chooseBossDefence) {
        this.chooseBossDefence = chooseBossDefence;
    }

    public int getHealth() {
        return Health;
    }

    public void setHealth(int health) {
        Health = health;
    }

    public int getDamage() {
        return Damage;
    }

    public void setDamage(int damage) {
        Damage = damage;
    }
}
