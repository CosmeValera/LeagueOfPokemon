package modelo;

public class Arceus extends Enemigo {

    private double resistenciaMagica = 40; //Debil contra magia

    public static void definirArceusEnemigo() {
        Global.enemigo = obtenerArceusEnemigo();
    }

    private static Arceus obtenerArceusEnemigo() {
        Arceus arceus;
        int num = (int) (Math.random() * 5 + 1);
        switch (num) {
            default:
                arceus = new Arceus();
                arceus.setDano(50);
                arceus.setVida(1200);
                arceus.setRecompensa(5000);
                System.out.println("arceus 1");
                break;
        }
        return arceus;
    }

    @Override
    public String getNombreEnemigo() {
        return "Arceus";
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
        return false;
    }

    @Override
    public boolean isInmuneAConfusion() {
        return false;
    }
}
