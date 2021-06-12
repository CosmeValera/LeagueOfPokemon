package model.enemies;

import model.Globals;

public class Rayquaza extends Enemy {

    private double magicResistance = MagicResistance.STRONG;
    
    public static void defineRayquaza() {
        Globals.enemy = getDefinedRayquaza();
    }

    private static Rayquaza getDefinedRayquaza() {
        Rayquaza rayquaza;
        int num = (int) (Math.random() * 5 + 1);
        switch (num) {
            case 1:
                rayquaza = new Rayquaza();
                rayquaza.setAttackDamage(23);
                rayquaza.setHealth(450);
                rayquaza.setReward(860);
                System.out.println("rayquaza 1");
                break;
            case 2:
                rayquaza = new Rayquaza();
                rayquaza.setAttackDamage(24);
                rayquaza.setHealth(480);
                rayquaza.setReward(900);
                System.out.println("rayquaza 2");
                break;
            case 3:
                rayquaza = new Rayquaza();
                rayquaza.setAttackDamage(28);
                rayquaza.setHealth(540);
                rayquaza.setReward(1060);
                System.out.println("rayquaza 3");
                break;
            case 4:
                rayquaza = new Rayquaza();
                rayquaza.setAttackDamage(27);
                rayquaza.setHealth(590);
                rayquaza.setReward(1160);
                System.out.println("rayquaza 4");
                break;
            default:
                rayquaza = new Rayquaza();
                rayquaza.setAttackDamage(32);
                rayquaza.setHealth(620);
                rayquaza.setReward(1280);
                System.out.println("rayquaza 5");
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
