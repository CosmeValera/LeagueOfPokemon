package model.enemies;

public class Pikachu extends Enemy {

    private double magicResistance = MagicResistance.WEAK;

    public static Pikachu createRandomPikachu() {
        Pikachu pikachu = new Pikachu();
        int num = (int) (Math.random() * 5 + 1);
        System.out.println("pikachu " + num);
        switch (num) {
            case 1:
                pikachu.setAttackDamage(10);
                pikachu.setHealth(50);
                pikachu.setReward(100);
                break;
            case 2:
                pikachu.setAttackDamage(10);
                pikachu.setHealth(60);
                pikachu.setReward(120);
                break;
            case 3:
                pikachu.setAttackDamage(8);
                pikachu.setHealth(75);
                pikachu.setReward(110);
                break;
            case 4:
                pikachu.setAttackDamage(12);
                pikachu.setHealth(40);
                pikachu.setReward(115);
                break;
            default:
                pikachu.setAttackDamage(10);
                pikachu.setHealth(90);
                pikachu.setReward(160);
                break;
        }
        return pikachu;
    }

    @Override
    public String getName() {
        return "Pikachu";
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
        return true;
    }

    @Override
    public boolean isConfusionResistant() {
        return false;
    }
}
