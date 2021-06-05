package modelo;

public class Pikachu extends Enemy {

    private double magicResistance = MagicResistance.WEAK;

    public static void definePikachu() {
        Globals.enemy = getDefinedPikachu();
    }

    private static Pikachu getDefinedPikachu() {
        Pikachu pikachu;
        int num = (int) (Math.random() * 5 + 1);
        switch (num) {
            case 1:
                pikachu = new Pikachu();
                pikachu.setAttackDamage(10);
                pikachu.setHealth(50);
                pikachu.setPrize(100);
                System.out.println("pikachu 1");
                break;
            case 2:
                pikachu = new Pikachu();
                pikachu.setAttackDamage(10);
                pikachu.setHealth(60);
                pikachu.setPrize(120);
                System.out.println("pikachu 2");
                break;
            case 3:
                pikachu = new Pikachu();
                pikachu.setAttackDamage(8);
                pikachu.setHealth(75);
                pikachu.setPrize(110);
                System.out.println("pikachu 3");
                break;
            case 4:
                pikachu = new Pikachu();
                pikachu.setAttackDamage(12);
                pikachu.setHealth(40);
                pikachu.setPrize(115);
                System.out.println("pikachu 4");
                break;
            default:
                pikachu = new Pikachu();
                pikachu.setAttackDamage(10);
                pikachu.setHealth(90);
                pikachu.setPrize(160);
                System.out.println("pikachu 5");
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
    public boolean isStrikeTwice() {
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
