package model;

public abstract class Enemy extends Character {

    protected double reward;
    
    public Enemy() {
        attackDamage = 0;
        health = 0;
        reward = 0;
        poisoned = false;
        blinded = false;
        confused = false;
        poisonedTurns = 0;
    }

    public Enemy(double attackDamage, double health, double reward) {
        this.attackDamage = attackDamage;
        this.health = health;
        this.reward = reward;
        this.poisoned = false;
        this.blinded = false;
        this.confused = false;
        this.poisonedTurns = 0;
    }

    public double getReward() {
        return reward;
    }

    public void setReward(double reward) {
        this.reward = reward;
    }

    public abstract boolean isAbleToDestroyItself();
}
