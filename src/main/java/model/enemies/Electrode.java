package model.enemies;

import model.Globals;

public class Electrode extends Enemy {

    private double magicResistance = MagicResistance.STRONG;
    
    public static void defineElectrode() {
        Globals.enemy = getDefinedElectrode();
    }

    private static Electrode getDefinedElectrode() {
        Electrode electrode;
        int num = (int) (Math.random() * 5 + 1);
        switch (num) {
            case 1:
                electrode = new Electrode();
                electrode.setAttackDamage(20);
                electrode.setHealth(45);
                electrode.setReward(116);
                System.out.println("Electrode 1");
                break;
            case 2:
                electrode = new Electrode();
                electrode.setAttackDamage(25);
                electrode.setHealth(50);
                electrode.setReward(144);
                System.out.println("Electrode 2");
                break;
            case 3:
                electrode = new Electrode();
                electrode.setAttackDamage(35);
                electrode.setHealth(46);
                electrode.setReward(188);
                System.out.println("Electrode 3");
                break;
            case 4:
                electrode = new Electrode();
                electrode.setAttackDamage(30);
                electrode.setHealth(65);
                electrode.setReward(216);
                System.out.println("Electrode 4");
                break;
            default:
                electrode = new Electrode();
                electrode.setAttackDamage(33);
                electrode.setHealth(70);
                electrode.setReward(228);
                System.out.println("Electrode 5");
                break;
        }
        return electrode;
    }

    @Override
    public String getName() {
        return "Electrode";
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
        int num = (int) (Math.random() * 7 + 1);
        return num == 1;
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
