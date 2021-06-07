package model;

public class Gyarados extends Enemy {

    private double magicResistance = MagicResistance.SLIGHTLY_STRONG;
    
    public static void defineGyarados() {
        Globals.enemy = getDefinedGyarados();
    }

    private static Gyarados getDefinedGyarados() {
        Gyarados gyarados;
        int num = (int) (Math.random() * 5 + 1);
        switch (num) {
            case 1:
                gyarados = new Gyarados();
                gyarados.setAttackDamage(21);
                gyarados.setHealth(290);
                gyarados.setPrize(540);
                System.out.println("gyarados 1");
                break;
            case 2:
                gyarados = new Gyarados();
                gyarados.setAttackDamage(22);
                gyarados.setHealth(285);
                gyarados.setPrize(550);
                System.out.println("gyarados 2");
                break;
            case 3:
                gyarados = new Gyarados();
                gyarados.setAttackDamage(19);
                gyarados.setHealth(305);
                gyarados.setPrize(555);
                System.out.println("gyarados 3");
                break;
            case 4:
                gyarados = new Gyarados();
                gyarados.setAttackDamage(20);
                gyarados.setHealth(320);
                gyarados.setPrize(580);
                System.out.println("gyarados 4");
                break;
            default:
                gyarados = new Gyarados();
                gyarados.setAttackDamage(22);
                gyarados.setHealth(345);
                gyarados.setPrize(640);
                System.out.println("gyarados 5");
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
