package model;

public class Arceus extends Enemy {

    private double magicResistance = MagicResistance.WEAK;

    public static void defineArceus() {
        Globals.enemy = getDefinedArceus();
    }

    private static Arceus getDefinedArceus() {
        Arceus arceus;
        int num = (int) (Math.random() * 5 + 1);
        switch (num) {
            default:
                arceus = new Arceus();
                arceus.setAttackDamage(50);
                arceus.setHealth(1200);
                arceus.setPrize(5000);
                System.out.println("arceus 1");
                break;
        }
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
