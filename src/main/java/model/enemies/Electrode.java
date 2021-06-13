package model.enemies;

public class Electrode extends Enemy {

    private double magicResistance = MagicResistance.STRONG;
    
    public static Electrode createRandomElectrode() {
        Electrode electrode = new Electrode();
        int num = (int) (Math.random() * 5 + 1);
                System.out.println("Electrode " + num);
        switch (num) {
            case 1:
                electrode.setAttackDamage(20);
                electrode.setHealth(45);
                electrode.setReward(116);
                break;
            case 2:
                electrode.setAttackDamage(25);
                electrode.setHealth(50);
                electrode.setReward(144);
                break;
            case 3:
                electrode.setAttackDamage(35);
                electrode.setHealth(46);
                electrode.setReward(188);
                break;
            case 4:
                electrode.setAttackDamage(30);
                electrode.setHealth(65);
                electrode.setReward(216);
                break;
            default:
                electrode.setAttackDamage(33);
                electrode.setHealth(70);
                electrode.setReward(228);
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
