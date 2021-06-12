package model.starters;

import model.enemies.Enemy;
import model.Randomizer;

public class Yuumi extends Starter {
    private final int MAXIMUM_HEALTH = 150;
    private final int MAXIMUM_ATTACK_DAMAGE = 36;
    private final int MINIMUM_ATTACK_DAMAGE = 4;
    private final int MAXIMUM_HEALING = 34;
    private final int MINIMUM_HEALING = 3;

    private int healing;

    private Randomizer randomizer;

    public Yuumi(Randomizer randomizer) {
        attackDamage = MINIMUM_ATTACK_DAMAGE;
        health = MAXIMUM_HEALTH;
        healing = MINIMUM_HEALING;
        this.randomizer = randomizer;
    }

    public Yuumi(int attackDamage, double health, int goldAmount, int healing, Randomizer randomizer) {
        super(attackDamage, health, goldAmount);
        this.healing = healing;
        this.randomizer = randomizer;
    }

    public int getHealing() {
        return healing;
    }

    public void setHealing(int healing) {
        this.healing = healing;
    }

    @Override
    public int getMaximumHealth() {
        return MAXIMUM_HEALTH;
    }

    @Override
    public int getMaximumAttackDamage() {
        return MAXIMUM_ATTACK_DAMAGE;
    }

    @Override
    public int getMinimumAttackDamage() {
        return MINIMUM_ATTACK_DAMAGE;
    }

    public int getMaximumHealing() {
        return MAXIMUM_HEALING;
    }

    @Override
    public String getName() {
        return "Yuumi";
    }

    @Override
    public String getNameOfMainAttack() {
        return "Healing";
    }

    @Override
    public String getNameOfSecondaryAttack() {
        return "Final Chapter";
    }

    @Override
    public void mainAttack(Enemy enemy) { //Healing
        double baseAttackDamage = attackDamage * 2;
        double appliedAttackDamage = baseAttackDamage - baseAttackDamage * enemy.getMagicResistance() / 100;
        enemy.setHealth(enemy.getHealth() - appliedAttackDamage);

        heal(healing);
    }

    @Override
    public void secondaryAttack(Enemy enemy) { //Final Chapter
        double baseAttackDamage = attackDamage * 3;
        double appliedAttackDamage = baseAttackDamage - baseAttackDamage * enemy.getMagicResistance() / 100;
        enemy.setHealth(enemy.getHealth() - appliedAttackDamage);

        int num = (int) (randomizer.getRandom() * 100 + 1 + healing / 2);
        if (num > 50) { //Blind
            enemy.setBlindedIfPossible(true);
        }

        heal(healing / 4);
    }

    @Override
    public double getAttackDamageOfMainAttack() { //Healing
        heal(healing);
        return attackDamage;
    }

    @Override
    public double getAttackDamageOfSecondaryAttack() { //Final Chapter
        heal(healing / 4);
        return attackDamage * 1.5;
    }

    private void heal(double healingAmount) {
        health = health + healingAmount;
        if (health > MAXIMUM_HEALTH) {
            health = MAXIMUM_HEALTH;
        }
    }

    @Override
    public boolean isAbleToStrikeTwice() {
        return false;
    }

    @Override
    public boolean isAbleToMissStrike() {
        return false;
    }

    @Override
    public boolean isAbleToDodge() {
        return false;
    }

    @Override
    public boolean isAbleToEquipAShield() {
        return false;
    }

    @Override
    public boolean isAbleToConfuse(Starter enemyStarter) {
        return false;
    }

    @Override
    public double adjustAttackDamageRegardingResistance(double attackDamage) {
        return attackDamage - attackDamage * this.healing / 150;
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

    @Override
    public double getMagicResistance() {
        return MagicResistance.NORMAL;
    }

    @Override
    public boolean isAbleToUseBlowPipe(Starter starterEnemigo) {
        return false;
    }

    @Override
    public boolean isAbleToHide(Starter starterEnemigo) {
        return false;
    }

    @Override
    public boolean isAbleToReadTheFinalChapter(Starter starterEnemigo) {
        int num = (int) (randomizer.getRandom() * 100 + 1 + healing / 2);
        if (num > 50) { //Blinded
            starterEnemigo.setWillBeBlinded(true);
        }
        return true;
    }
}
