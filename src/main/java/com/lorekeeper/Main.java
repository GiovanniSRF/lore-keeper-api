package com.lorekeeper;
import com.lorekeeper.model.Character;

public class Main {
    public static void main(String[] args) {
        Character heroN1 = new Character("Dan", "Paladin", 12);
        System.out.println("This is " + heroN1.getName() + ", the " + heroN1.getCharacterClass() + ".");
        System.out.println("Dan's HP is: " + heroN1.getCurrentHitPoints() + ".");
        System.out.println("He was hit by a fireball.");
        heroN1.takeDamage(28);
        System.out.println("Now his HP is: " + heroN1.getCurrentHitPoints() + ".");
    }
}