package model;

public class HitMonLee extends Enemy {

    private double magicResistance = MagicResistance.SLIGHTLY_WEAK;

    public static void defineHitMonLee() {
        Globals.enemy = getDefinedHitMonLee();
    }

    private static HitMonLee getDefinedHitMonLee() {
        HitMonLee hitMonLee;
        int num = (int) (Math.random() * 5 + 1);
        switch (num) {
            case 1:
                hitMonLee = new HitMonLee();
                hitMonLee.setAttackDamage(11);
                hitMonLee.setHealth(122);
                hitMonLee.setPrize(195);
                System.out.println("hitMonLee 1");
                break;
            case 2:
                hitMonLee = new HitMonLee();
                hitMonLee.setAttackDamage(14);
                hitMonLee.setHealth(105);
                hitMonLee.setPrize(245);
                System.out.println("hitMonLee 2");
                break;
            case 3:
                hitMonLee = new HitMonLee();
                hitMonLee.setAttackDamage(12);
                hitMonLee.setHealth(170);
                hitMonLee.setPrize(270);
                System.out.println("hitMonLee 3");
                break;
            case 4:
                hitMonLee = new HitMonLee();
                hitMonLee.setAttackDamage(14);
                hitMonLee.setHealth(190);
                hitMonLee.setPrize(305);
                System.out.println("hitMonLee 4");
                break;
            default:
                hitMonLee = new HitMonLee();
                hitMonLee.setAttackDamage(13);
                hitMonLee.setHealth(215);
                hitMonLee.setPrize(325);
                System.out.println("hitMonLee 5");
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
