package com.company;

public class Hero {
    private int Health;
    private int Damage;
    private String HeroesAttackType;

    public Hero(int health, int damage, String heroesAttackType) {
        Health = health;
        Damage = damage;
        HeroesAttackType = heroesAttackType;
    }

    public Hero(int health, int damage) {
        Health = health;
        Damage = damage;
    }
    public String getHeroesAttackType() {
        return HeroesAttackType;
    }
    public int getDamage() {
        return Damage;
    }
    public int getHealth() {
        return Health;
    }
}
