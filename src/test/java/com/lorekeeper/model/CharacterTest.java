package com.lorekeeper.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class CharacterTest {
    @Test
    public void testCharacterCreation(){
        Character hero = new Character("Conan", "Barbarian", 13);
        Assertions.assertEquals("Conan", hero.getName());
    }
    @Test
    public void testTakeDamage(){
        Character hero = new Character("Conan", "Barbarian", 10);
        hero.takeDamage(5);
        Assertions.assertEquals(5, hero.getCurrentHitPoints());
    }
    @Test
    public void testFatalDamage(){
        Character hero = new Character("Conan", "Barbarian", 13);
        hero.takeDamage(999);
        Assertions.assertEquals(0, hero.getCurrentHitPoints());
    }
}