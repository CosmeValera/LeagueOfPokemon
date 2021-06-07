package model;

public abstract class Enemy extends Character {

    protected double prize;
    
    public Enemy() {
        attackDamage = 0;
        health = 0;
        prize = 0;
        poisoned = false;
        blinded = false;
        confused = false;
        poisonedTurns = 0;
    }

    public Enemy(double attackDamage, double health, double prize) {
        this.attackDamage = attackDamage;
        this.health = health;
        this.prize = prize;
        this.poisoned = false;
        this.blinded = false;
        this.confused = false;
        this.poisonedTurns = 0;
    }

    public double getPrize() {
        return prize;
    }

    public void setPrize(double prize) {
        this.prize = prize;
    }

    public abstract boolean isAbleToDestroyItself();
}
