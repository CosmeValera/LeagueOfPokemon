package model.starters;

import model.enemies.Enemy;
import model.Randomizer;

public class Poppy extends Starter {
    private final int MAXIMUM_HEALTH = 200;
    private final int MAXIMUM_ATTACK_DAMAGE = 40;
    private final int MINIMUM_ATTACK_DAMAGE = 6;
    private final int MAXIMUM_SHIELD_PROTECTION = 30;
    private final int MINIMUM_SHIELD_PROTECTION = 3;
    private final boolean DEFAULT_POPPY_SHIELD_VALUE = false;

    private boolean carriesShield;
    private int shieldProtection;

    private Randomizer randomizer;
    
    public Poppy(Randomizer randomizer) {
        attackDamage = MINIMUM_ATTACK_DAMAGE;
        health = MAXIMUM_HEALTH;
        shieldProtection = MINIMUM_SHIELD_PROTECTION;
        carriesShield = DEFAULT_POPPY_SHIELD_VALUE;
        this.randomizer = randomizer;
    }

    public Poppy(int attackDamage, double health, int goldAmount, boolean carriesShield, int shieldProtection, Randomizer randomizer) {
        super(attackDamage, health, goldAmount);
        this.carriesShield = carriesShield;
        this.shieldProtection = shieldProtection;
        this.randomizer = randomizer;
    }

    public boolean isCarriesShield() {
        return carriesShield;
    }

    public void setCarriesShield(boolean carriesShield) {
        this.carriesShield = carriesShield;
    }

    public int getShieldProtection() {
        return shieldProtection;
    }

    public void setShieldProtection(int shieldProtection) {
        this.shieldProtection = shieldProtection;
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

    public int getProteccionEscudoMaxima() {
        return MAXIMUM_SHIELD_PROTECTION;
    }

    @Override
    public String getName() {
        return "Poppy";
    }

    @Override
    public String getNameOfMainAttack() {
        return "Tackle With Shield";
    }

    @Override
    public String getNameOfSecondaryAttack() {
        return "Strike";
    }

    @Override
    public void mainAttack(Enemy enemy) { //Tackle With Shield
        enemy.setHealth(enemy.getHealth() - attackDamage);
    }

    @Override
    public void secondaryAttack(Enemy enemy) { //Strike
        enemy.setHealth(enemy.getHealth() - attackDamage / 2);

        int num = (int) (randomizer.getRandom() * 100 + 1 + shieldProtection);
        if (num > 62) {
            enemy.setConfusedIfPossible(true);
        }
    }

    @Override
    public double getAttackDamageOfMainAttack() { //Tackle With Shield
        return attackDamage;
    }
    @Override
    public double getAttackDamageOfSecondaryAttack() { //Strike
        return attackDamage/2;
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
        int num = (int) (randomizer.getRandom() * 100 + 1 + shieldProtection);
        if (num > 50) {
            return true;
        }
        return false;
    }

    @Override
    public boolean isAbleToConfuse(Starter enemyStarter){
        int num = (int) (randomizer.getRandom() * 100 + 1 + shieldProtection);
        if (num > 62) {
            return true;
        }
        return false;
    }
    
    @Override
    public double adjustAttackDamageRegardingResistance(double attackDamage) {
        attackDamage = attackDamage - attackDamage * shieldProtection / 100 * 3 / 2;
        if (isCarriesShield()) {
            if (attackDamage <= shieldProtection) {
                return 0; //Shield blocks all enemy's damage
            } else {
                return attackDamage - shieldProtection;
            }
        }
        return attackDamage;
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
    public boolean isAbleToUseBlowPipe(Starter starterEnemigo){
        return false;
    }

    @Override
    public boolean isAbleToHide(Starter starterEnemigo) {
        return false;
    }
    
    @Override
    public boolean isAbleToReadTheFinalChapter(Starter starterEnemigo){
        return false;
    }
}
