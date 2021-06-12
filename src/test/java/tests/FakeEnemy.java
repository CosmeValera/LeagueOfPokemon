package tests;

import model.enemies.Enemy;

public class FakeEnemy extends Enemy {

    public FakeEnemy() {
        attackDamage = 10;
        health = 100;
        reward = 150;
    }

    public FakeEnemy(double attackDamage, double health, double reward) {
        super(attackDamage, health, reward);
    }

    @Override
    public double getMagicResistance() {
        return MagicResistance.NORMAL;
    }

    @Override
    public String getName() {
        return "fakeEnemy";
    }

    @Override
    public boolean isAbleToDestroyItself() {
        return false;
    }

    @Override
    public boolean isAbleToStrikeTwice() {
        return false;
    }

    @Override
    public boolean isBlindedResistant() {
        return false;
    }

    @Override
    public boolean isPoorSightResistant() {
        return false;
    }

    @Override
    public boolean isPoisonResistant() {
        return false;
    }

    @Override
    public boolean isConfusionResistant() {
        return false;
    }

}
