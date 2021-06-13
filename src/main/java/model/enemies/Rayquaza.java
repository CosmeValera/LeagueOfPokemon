package model.enemies;

public class Rayquaza extends Enemy {

    private double magicResistance = MagicResistance.STRONG;
    
    public static Rayquaza createRandomRayquaza() {
        Rayquaza rayquaza = new Rayquaza();
        int num = (int) (Math.random() * 5 + 1);
                System.out.println("rayquaza " + num);
        switch (num) {
            case 1:
                rayquaza.setAttackDamage(23);
                rayquaza.setHealth(450);
                rayquaza.setReward(860);
                break;
            case 2:
                rayquaza.setAttackDamage(24);
                rayquaza.setHealth(480);
                rayquaza.setReward(900);
                break;
            case 3:
                rayquaza.setAttackDamage(28);
                rayquaza.setHealth(540);
                rayquaza.setReward(1060);
                break;
            case 4:
                rayquaza.setAttackDamage(27);
                rayquaza.setHealth(590);
                rayquaza.setReward(1160);
                break;
            default:
                rayquaza.setAttackDamage(32);
                rayquaza.setHealth(620);
                rayquaza.setReward(1280);
                break;
        }
        return rayquaza;
    }

    @Override
    public String getName() {
        return "Rayquaza";
    }

    @Override
    public double getMagicResistance() {
        return magicResistance;
    }

    @Override
    public boolean isAbleToStrikeTwice() {
        return true;
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
        return true;
    }

    @Override
    public boolean isPoisonResistant() {
        return true;
    }

    @Override
    public boolean isConfusionResistant() {
        return true;
    }
}
