package modelo;

public abstract class Starter extends Character {

    protected static int goldAmount;
    protected static int defeatedEnemies;

    private final int initialGoldAmount = 300;

    private static final int VICTORIESFORFIRSTPRIZE = 15;
    private static final int VICTORIESFORSECONDPRIZE = 40;
    private static final int VICTORIESFORTHIRDPRIZE = 65;
    private boolean teemoAvailable = false;
    private boolean poppyAvailable = false;
    private boolean gnarAvailable = false;
    private boolean yuumiAvailable = false;

    protected boolean willBeBlinded = false;
    protected boolean willBeConfused = false;
    protected boolean willBePoorSight = false;
    protected boolean willBePoisoned = false;

    public Starter() {
        attackDamage = 0;
        health = 0;
        goldAmount = initialGoldAmount;
        defeatedEnemies = 0;
    }

    public Starter(int attackDamage, double health, int goldAmount) {
        this.attackDamage = attackDamage;
        this.health = health;
        Starter.defeatedEnemies = 0;
        Starter.goldAmount = goldAmount;
    }

    public int getGoldAmount() {
        return goldAmount;
    }

    public void setGoldAmount(int goldAmount) {
        this.goldAmount = goldAmount;
    }

    public int getInitialGoldAmount() {
        return initialGoldAmount;
    }

    public static int getDefeatedEnemies() {
        return defeatedEnemies;
    }

    public void setDefeatedEnemies(int defeatedEnemies) {
        this.defeatedEnemies = defeatedEnemies;
    }

    public static int getVictoriesForFirstPrize() {
        return VICTORIESFORFIRSTPRIZE;
    }

    public static int getVictoriesForSecondPrize() {
        return VICTORIESFORSECONDPRIZE;
    }

    public static int getVictoriesForThirdPrize() {
        return VICTORIESFORTHIRDPRIZE;
    }

    public boolean isTeemoAvailable() {
        return teemoAvailable;
    }

    public void setTeemoAvailable(boolean teemoAvailable) {
        this.teemoAvailable = teemoAvailable;
    }

    public boolean isPoppyAvailable() {
        return poppyAvailable;
    }

    public void setPoppyAvailable(boolean poppyAvailable) {
        this.poppyAvailable = poppyAvailable;
    }

    public boolean isGnarAvailable() {
        return gnarAvailable;
    }

    public void setGnarAvailable(boolean gnarAvailable) {
        this.gnarAvailable = gnarAvailable;
    }

    public boolean isYuumiAvailable() {
        return yuumiAvailable;
    }

    public void setYuumiAvailable(boolean yuumiAvailable) {
        this.yuumiAvailable = yuumiAvailable;
    }

    public boolean isWillBeBlinded() {
        return willBeBlinded;
    }

    public void setWillBeBlinded(boolean willBeBlinded) {
        this.willBeBlinded = willBeBlinded;
    }

    public boolean isWillBeConfused() {
        return willBeConfused;
    }

    public void setWillBeConfused(boolean willBeConfused) {
        this.willBeConfused = willBeConfused;
    }

    public boolean isWillBePoorSight() {
        return willBePoorSight;
    }

    public void setWillBePoorSight(boolean willBePoorSight) {
        this.willBePoorSight = willBePoorSight;
    }

    public boolean isWillBePoisoned() {
        return willBePoisoned;
    }

    public void setWillBePoisoned(boolean willBePoisoned) {
        this.willBePoisoned = willBePoisoned;
    }

    public abstract int getMaximumHealth();

    public abstract int getMaximumAttackDamage();

    public abstract int getMinimumAttackDamage();

    public abstract String getNameOfMainAttack();

    public abstract String getNameOfSecondaryAttack();

    public abstract void mainAttack(Enemy enemy);

    public abstract void secondaryAttack(Enemy enemy);

    public abstract double getAttackDamageOfMainAttack();

    public abstract double getAttackDamageOfSecondaryAttack();

    public abstract boolean isAbleToMissStrike();

    public abstract boolean isAbleToDodge();

    public abstract boolean isAbleToEquipAShield();

    public abstract boolean isAbleToConfuse(Starter starterEnemigo);

    public abstract double adjustAttackDamageRegardingResistance(double attackDamage);
}
