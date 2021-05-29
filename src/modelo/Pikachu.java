package modelo;

public class Pikachu extends Enemigo {

    private double resistenciaMagica = 35; //Debil contra magia

    public static void definirPikachuEnemigo() {
        Global.enemigo = obtenerPikachuEnemigo();
    }

    private static Pikachu obtenerPikachuEnemigo() {
        Pikachu pikachu;
        int num = (int) (Math.random() * 5 + 1);
        switch (num) {
            case 1:
                pikachu = new Pikachu();
                pikachu.setDano(10);
                pikachu.setVida(50);
                pikachu.setRecompensa(100);
                System.out.println("pikachu 1");
                break;
            case 2:
                pikachu = new Pikachu();
                pikachu.setDano(10);
                pikachu.setVida(60);
                pikachu.setRecompensa(120);
                System.out.println("pikachu 2");
                break;
            case 3:
                pikachu = new Pikachu();
                pikachu.setDano(8);
                pikachu.setVida(75);
                pikachu.setRecompensa(110);
                System.out.println("pikachu 3");
                break;
            case 4:
                pikachu = new Pikachu();
                pikachu.setDano(12);
                pikachu.setVida(40);
                pikachu.setRecompensa(115);
                System.out.println("pikachu 4");
                break;
            default:
                pikachu = new Pikachu();
                pikachu.setDano(10);
                pikachu.setVida(90);
                pikachu.setRecompensa(160);
                System.out.println("pikachu 5");
                break;
        }
        return pikachu;
    }

    @Override
    public String getNombreEnemigo() {
        return "Pikachu";
    }

    @Override
    public double getResistenciaMagica() {
        return resistenciaMagica;
    }

    @Override
    public boolean isAtacaDosVeces() {
        return false;
    }

    @Override
    public boolean isPuedeAutodestruirse() {
        return false;
    }

    @Override
    public boolean isInmuneACegado() {
        return false;
    }

    @Override
    public boolean isInmuneAVisionTorpe() {
        return false;
    }

    @Override
    public boolean isInmuneAVeneno() {
        return true;
    }

    @Override
    public boolean isInmuneAConfusion() {
        return false;
    }
}
