package belajaran.InterfaceTutorial.tutorial;

import belajaran.InterfaceTutorial.hero.Hero;

public class Interfes {
    public static void main(String[] args) {
        Hero hero1 = new Hero("putriirans", 100);
        Hero hero2 = new Hero("aku", 50);
        hero1.attack(hero2);
    }
}
