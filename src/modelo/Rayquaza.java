package modelo;

public class Rayquaza extends Enemigo {

    private double resistenciaMagica = 60; //Fuerte contra magia
    
    public static void definirRayquazaEnemigo() {
        Global.enemigo = obtenerRayquazaEnemigo();
    }

    private static Rayquaza obtenerRayquazaEnemigo() {
        Rayquaza rayquaza;
        int num = (int) (Math.random() * 5 + 1);
        switch (num) {
            case 1:
                rayquaza = new Rayquaza();
                rayquaza.setDano(23);
                rayquaza.setVida(450);
                rayquaza.setRecompensa(860);
                System.out.println("rayquaza 1");
                break;
            case 2:
                rayquaza = new Rayquaza();
                rayquaza.setDano(24);
                rayquaza.setVida(480);
                rayquaza.setRecompensa(900);
                System.out.println("rayquaza 2");
                break;
            case 3:
                rayquaza = new Rayquaza();
                rayquaza.setDano(28);
                rayquaza.setVida(540);
                rayquaza.setRecompensa(1060);
                System.out.println("rayquaza 3");
                break;
            case 4:
                rayquaza = new Rayquaza();
                rayquaza.setDano(27);
                rayquaza.setVida(590);
                rayquaza.setRecompensa(1160);
                System.out.println("rayquaza 4");
                break;
            default:
                rayquaza = new Rayquaza();
                rayquaza.setDano(32);
                rayquaza.setVida(620);
                rayquaza.setRecompensa(1280);
                System.out.println("rayquaza 5");
                break;
        }
        return rayquaza;
    }

    @Override
    public String getNombreEnemigo() {
        return "Rayquaza";
    }

    @Override
    public double getResistenciaMagica() {
        return resistenciaMagica;
    }

    @Override
    public boolean isAtacaDosVeces() {
        return true;
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
        return true;
    }

    @Override
    public boolean isInmuneAVeneno() {
        return true;
    }

    @Override
    public boolean isInmuneAConfusion() {
        return true;
    }
}
