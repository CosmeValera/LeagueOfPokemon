package model;

public class Teemo extends Starter {

    private final int MAXIMUM_HEALTH = 120;
    private final int MAXIMUM_ATTACK_DAMAGE = 60;
    private final int MINIMUM_ATTACK_DAMAGE = 10;
    private final int MAXIMUM_POISON_DAMAGE = 30;
    private final int MINIMUM_POISON_DAMAGE = 3;

    private int poisonDamage;

    private Randomizer randomizer;

    public Teemo(Randomizer randomizer) {
        this.attackDamage = MINIMUM_ATTACK_DAMAGE;
        this.health = MAXIMUM_HEALTH;
        this.poisonDamage = MINIMUM_POISON_DAMAGE;
        this.randomizer = randomizer;
    }

    public Teemo(int attackDamage, double health, int goldAmount, int poisonDamage, Randomizer randomizer) {
        super(attackDamage, health, goldAmount);
        this.poisonDamage = poisonDamage;
        this.randomizer = randomizer;
    }

    public int getPoisonDamage() {
        return poisonDamage;
    }

    public void setPoisonDamage(int poisonDamage) {
        this.poisonDamage = poisonDamage;
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

    public int getDanoVenenoMaximo() {
        return MAXIMUM_POISON_DAMAGE;
    }

    public int getDanoVenenoMinimo() {
        return MINIMUM_POISON_DAMAGE;
    }

    @Override
    public String getName() {
        return "Teemo";
    }

    @Override
    public String getNameOfMainAttack() {
        return "Scratch";
    }

    @Override
    public String getNameOfSecondaryAttack() {
        return "Poisonous dart";
    }

    @Override
    public void mainAttack(Enemy enemy) { //Scratch
        enemy.setHealth(enemy.getHealth() - attackDamage * 1.5);

        lifeSteal(poisonDamage * 1.5);

        int num = ((int) (randomizer.getRandom() * 100 + 1)) + ((Teemo) Globals.starter).getPoisonDamage() / 2;
        if (num > 70) { //Hide
            enemy.setPoorSightIfPossible(true);
        }
    }

    @Override
    public void secondaryAttack(Enemy enemigo) { //Poisonous dart
        enemigo.setHealth(enemigo.getHealth() - attackDamage);

        lifeSteal(poisonDamage);

        int num = ((int) (Math.random() * 100 + 1)) + ((Teemo) Globals.starter).getPoisonDamage();
        if (num > 50 && num < 75) { //Poison
            enemigo.setPoisonedIfPossible(true);
        } else if (num >= 75 && num < 90) { //Blind
            enemigo.setBlindedIfPossible(true);
        } else if (num >= 90) { //Poison & blind
            enemigo.setPoisonedIfPossible(true);
            enemigo.setBlindedIfPossible(true);
        }
    }

    @Override
    public double getAttackDamageOfMainAttack() { //Scratch
        if (!isBlinded() && !isPoorSight()) {
            lifeSteal(poisonDamage * 1.5);
        }
        return attackDamage * 1.5;
    }

    @Override
    public double getAttackDamageOfSecondaryAttack() { //Poisonous dart
        if (!isBlinded() && !isPoorSight()) {
            lifeSteal(poisonDamage);
        }
        return attackDamage;
    }

    private void lifeSteal(double poisonDamage) {
        health = health + poisonDamage / 5;
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
        return attackDamage - attackDamage * this.poisonDamage / 100;
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
        int num = ((int) (Math.random() * 100 + 1)) + poisonDamage;
        if (num > 50 && num < 75) { //Poisoned
            starterEnemigo.setWillBePoisoned(true);
        } else if (num >= 75 && num < 90) { //Blinded
            starterEnemigo.setWillBeBlinded(true);
        } else if (num >= 90) { //Poisoned and blinded
            starterEnemigo.setWillBePoisoned(true);
            starterEnemigo.setWillBeBlinded(true);
        }
        return true;
    }

    @Override
    public boolean isAbleToHide(Starter starterEnemigo) {
        int num = ((int) (Math.random() * 100 + 1)) + poisonDamage / 2;
        if (num > 70) { //Hide
            starterEnemigo.setWillBePoorSight(true);
        }
        return true;
    }

    @Override
    public boolean isAbleToReadTheFinalChapter(Starter starterEnemigo) {
        return false;
    }
}
