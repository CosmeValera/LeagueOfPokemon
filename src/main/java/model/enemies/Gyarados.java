package model.enemies;

public class Gyarados extends Enemy {

    private double magicResistance = MagicResistance.SLIGHTLY_STRONG;
    
    public static Gyarados createRandomGyarados() {
        Gyarados gyarados = new Gyarados();
        int num = (int) (Math.random() * 5 + 1);
                System.out.println("gyarados " + num);
        switch (num) {
            case 1:
                gyarados.setAttackDamage(21);
                gyarados.setHealth(290);
                gyarados.setReward(540);
                break;
            case 2:
                gyarados.setAttackDamage(22);
                gyarados.setHealth(285);
                gyarados.setReward(550);
                break;
            case 3:
                gyarados.setAttackDamage(19);
                gyarados.setHealth(305);
                gyarados.setReward(555);
                break;
            case 4:
                gyarados.setAttackDamage(20);
                gyarados.setHealth(320);
                gyarados.setReward(580);
                break;
            default:
                gyarados.setAttackDamage(22);
                gyarados.setHealth(345);
                gyarados.setReward(640);
                break;
        }
        return gyarados;
    }

    @Override
    public String getName() {
        return "Gyarados";
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
        return true;
    }

    @Override
    public boolean isPoisonResistant() {
        return false;
    }

    @Override
    public boolean isConfusionResistant() {
        return true;
    }
}
