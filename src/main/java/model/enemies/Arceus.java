package model.enemies;

public class Arceus extends Enemy {

    private double magicResistance = MagicResistance.WEAK;

    public static Arceus createArceus() {
        Arceus arceus = new Arceus();
        arceus.setAttackDamage(50);
        arceus.setHealth(1200);
        arceus.setReward(5000);
        System.out.println("arceus 1");
        return arceus;
    }

    @Override
    public String getName() {
        return "Arceus";
    }

    @Override
    public double getMagicResistance() {
        return magicResistance;
    }

    @Override
    public boolean isAbleToStrikeTwice() {
        return false;
    }

    @Override
    public boolean isAbleToDestroyItself() {
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
