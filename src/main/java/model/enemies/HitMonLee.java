package model.enemies;

public class HitMonLee extends Enemy {

    private double magicResistance = MagicResistance.SLIGHTLY_WEAK;

    public static HitMonLee createRandomHitMonLee() {
        HitMonLee hitMonLee = new HitMonLee();
        int num = (int) (Math.random() * 5 + 1);
        System.out.println("hitMonLee " + num);
        switch (num) {
            case 1:
                hitMonLee.setAttackDamage(11);
                hitMonLee.setHealth(122);
                hitMonLee.setReward(195);
                break;
            case 2:
                hitMonLee.setAttackDamage(14);
                hitMonLee.setHealth(105);
                hitMonLee.setReward(245);
                break;
            case 3:
                hitMonLee.setAttackDamage(12);
                hitMonLee.setHealth(170);
                hitMonLee.setReward(270);
                break;
            case 4:
                hitMonLee.setAttackDamage(14);
                hitMonLee.setHealth(190);
                hitMonLee.setReward(305);
                break;
            default:
                hitMonLee.setAttackDamage(13);
                hitMonLee.setHealth(215);
                hitMonLee.setReward(325);
                break;
        }
        return hitMonLee;
    }

    @Override
    public String getName() {
        return "HitMonLee";
    }

    @Override
    public double getMagicResistance() {
        return magicResistance;
    }

    @Override
    public boolean isAbleToStrikeTwice() {
        int num = (int) (Math.random() * 3 + 1);
        return num == 1;
    }

    @Override
    public boolean isAbleToDestroyItself() {
        return false;
    }

    @Override
    public boolean isBlindedResistant() {
        return true;
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
