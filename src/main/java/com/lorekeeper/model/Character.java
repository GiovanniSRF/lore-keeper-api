package com.lorekeeper.model;

public class Character {
    private String name;
    private String characterClass;
    private int level;
    private int maxHitPoints;
    private int currentHitPoints;
    public Character(String name,String characterClass, int maxHitPoints){
        this.name = name;
        this.characterClass = characterClass;
        this.level = 1;
        this.maxHitPoints = maxHitPoints;
        this.currentHitPoints = maxHitPoints;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getCharacterClass(){
        return this.characterClass;
    }
    public int getLevel(){
        return this.level;
    }
    public void setLevel(int level){
        if (level > this.level){
            this.level = level;
        }
    }
    public int getMaxHitPoints(){
        return this.maxHitPoints;
    }
    public void setMaxHitPoints(int maxHitPoints){
        this.maxHitPoints = maxHitPoints;
    }
    public int getCurrentHitPoints(){
        return this.currentHitPoints;
    }
    public void takeDamage(int damage){
        this.currentHitPoints = this.currentHitPoints - damage;
        if (this.currentHitPoints < 0){
            this.currentHitPoints = 0;
        }
    }
    public void shortRest(){
        //toDo
    }
    public void longRest(){
        this.currentHitPoints = this.maxHitPoints;
    }
}