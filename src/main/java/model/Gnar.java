package model;

public class Gnar extends Starter {

    private int resistance;
    private boolean isMonster;
    private int monsterCounter;

    private final int MAXIMUM_HEALTH = 170;
    private final int MAXIMUM_ATTACK_DAMAGE = 50;
    private final int MINIMUM_ATTACK_DAMAGE = 6;
    private final int MAXIMUM_RESISTANCE = 70;
    private final int MINIMUM_RESISTANCE = 20;
    private final boolean DEFAULT_IS_GNAR_MONSTER = false;
    private final int DEFAULT_GNAR_MONSTER_COUNTER = 0;

    public Gnar() {
        attackDamage = MINIMUM_ATTACK_DAMAGE;
        health = MAXIMUM_HEALTH;
        isMonster = DEFAULT_IS_GNAR_MONSTER;
        resistance = MINIMUM_RESISTANCE;
        monsterCounter = DEFAULT_GNAR_MONSTER_COUNTER;
    }

    public Gnar(int attackDamage, double health, int goldAmount, boolean isMonster, int resistance) {
        super(attackDamage, health, goldAmount);
        this.isMonster = isMonster;
        this.resistance = resistance;
    }

    @Override
    public void mainAttack(Enemy enemy) {
        if (!isMonstruo()) {
            boomerang(enemy);
        }
        bodySlam(enemy);

    }

    private void boomerang(Enemy enemy) {
        enemy.setHealth(enemy.getHealth() - attackDamage);
    }

    private void bodySlam(Enemy enemy) {
        enemy.setHealth(enemy.getHealth() - attackDamage * 2);
    }

    @Override
    public void secondaryAttack(Enemy enemy) {
        if (!isMonstruo()) {
            jump(enemy);
        }
        throwRock(enemy);

    }

    private void jump(Enemy enemy) {
        enemy.setHealth(enemy.getHealth() - attackDamage);
    }

    private void throwRock(Enemy enemy) {
        enemy.setHealth(enemy.getHealth() - attackDamage * 2);
    }

    @Override
    public double getAttackDamageOfMainAttack() {
        if (!isMonstruo()) {
            return boomerang();
        }
        return bodySlam();

    }

    private double boomerang() {
        return attackDamage;
    }

    private double bodySlam() {
        return attackDamage * 2.2;
    }

    @Override
    public double getAttackDamageOfSecondaryAttack() {
        if (!isMonstruo()) {
            return jump();
        }
        return throwRock();

    }

    private double jump() {
        return attackDamage;
    }

    private double throwRock() {
        return attackDamage * 2;
    }

    public boolean isMonstruo() {
        return isMonster;
    }

    public void setIsMonster(boolean isMonster) {
        this.isMonster = isMonster;
    }

    public int getResistance() {
        return resistance;
    }

    public void setResistance(int resistance) {
        this.resistance = resistance;
    }

    public int getMonsterCounter() {
        return monsterCounter;
    }

    public void setMonsterCounter(int monsterCounter) {
        this.monsterCounter = monsterCounter;
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

    public int getResistenciaMaxima() {
        return MAXIMUM_RESISTANCE;
    }

    @Override
    public String getName() {
        if (!isMonster) {
            return "Gnar";
        }
        return "MegaGnar";
    }

    @Override
    public String getNameOfMainAttack() {
        if (!isMonster) {
            return "Boomerang";
        }
        return "Body Slam";
    }

    @Override
    public String getNameOfSecondaryAttack() {
        if (!isMonster) {
            return "Jump";
        }
        return "Throw Rock";
    }

    @Override
    public boolean isAbleToStrikeTwice() {
        if (!isMonster) {
            int num = (int) (Math.random() * 2 + 1);
            return num == 1;
        }
        return false;
    }

    @Override
    public boolean isAbleToMissStrike() {
        if (isMonster) {
            int num = (int) (Math.random() * 4 + 1);
            return num == 1;
        }
        return false;
    }

    @Override
    public boolean isAbleToDodge() {
        if (!isMonster) {
            double num = (Math.random() * 100 + 1 + resistance / 5);
            return num > 63; // resistance 20-> 41% || resistance 70-> 51%
        }
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
        if (!isMonstruo()) {
            return attackDamage - attackDamage * resistance / 100 / 2;
        }
        return attackDamage - attackDamage * resistance / 100;
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
    public boolean isAbleToReadTheFinalChapter(Starter starterEnemigo){
        return false;
    }
}
