package modelo;

public abstract class Character {
    
    protected double attackDamage;
    protected double health;
    
    protected boolean blinded; //Un turno sin poder golpear
    protected boolean poorSight; //Un turno sin poder golpear
    protected boolean confused; //Un turno que se golpea a si mismo
    protected boolean poisoned; //Dano cada turno
    protected int poisonedTurns;
    
    protected class MagicResistance {
        public static final double WEAK = 35;
        public static final double SLIGHTLY_WEAK = 45;
        public static final double NORMAL = 50;
        public static final double SLIGHTLY_STRONG = 55;
        public static final double STRONG = 65;
    }

    public double getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(double attackDamage) {
        this.attackDamage = attackDamage;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }
    
    public boolean isBlinded() {
        return blinded;
    }

    public void setBlindedIfPossible(boolean blinded) {
        if (!isBlindedResistant()) {
            this.blinded = blinded;
        }
    }

    public boolean isPoorSight() {
        return poorSight;
    }

    public void setPoorSightIfPossible(boolean poorSight) {
        if (!isPoorSightResistant()) {
            this.poorSight = poorSight;
        }
    }

    public boolean isConfused() {
        return confused;
    }

    public void setConfusedIfPossible(boolean confused) {
        if (!isConfusionResistant()) {
            this.confused = confused;
        }
    }

    public boolean isPoisoned() {
        return poisoned;
    }

    public void setPoisonedIfPossible(boolean poisoned) {
        if (!isPoisonResistant()) {
            this.poisoned = poisoned;
            if (poisoned) {
                setPoisonedTurns(3);
            }
        }
    }

    public int getPoisonedTurns() {
        return poisonedTurns;
    }

    public void setPoisonedTurns(int poisonedTurns) {
        this.poisonedTurns = poisonedTurns;
    }

    public abstract String getName();

    public abstract double getMagicResistance();

    public abstract boolean isStrikeTwice();

    public abstract boolean isBlindedResistant();
    
    public abstract boolean isPoorSightResistant();

    public abstract boolean isPoisonResistant();

    public abstract boolean isConfusionResistant();
}
