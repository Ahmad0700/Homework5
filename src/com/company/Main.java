package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(150);
        boss.setDamage(150);
        boss.setChooseBossDefence(" Ahmad");
        System.out.println(boss.getHealth() + ", " + boss.getDamage() + ", " + boss.getChooseBossDefence());
        for (int i = 0; i < createHeroes().length; i++) {
            System.out.println(createHeroes()[i].getHealth() + " " + createHeroes()[i].getDamage() + " " + createHeroes()[i].getHeroesAttackType());
        }

    }

    public static Hero[] createHeroes() {
        Hero heroMagnezie = new Hero(2090, 205, " Magnizie");
        Hero heroThor = new Hero(2010, 200, " Thor ");
        Hero heroKinetic = new Hero(2500, 1230, " Kinetic");

        Hero[] superHero = {heroMagnezie , heroThor, heroKinetic};
        return superHero;
    }
}
