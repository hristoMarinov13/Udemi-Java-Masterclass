package com.company;

public class EnhancedPlayer {
    private String name;
    private int health = 100;
    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;

        if (health > 0 && health < 100){
            this.health = health;
        }
        this.weapon = weapon;
    }

    public void looseHealth(int damage){
        if (damage >= this.health){
            this.health = 0;
            System.out.println("The player was knocked out");
        }else{
            this.health -= damage;
            System.out.println("Player was damaged, health remaining: " + this.health);
        }
    }

    public int getHealth() {
        return health;
    }
}
