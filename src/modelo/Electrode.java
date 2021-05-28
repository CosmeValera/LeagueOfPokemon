package modelo;

public class Electrode extends Enemigo {

    public static void definirElectrodeEnemigo() {
        Global.enemigo = obtenerElectrodeEnemigo();
    }

    private static Electrode obtenerElectrodeEnemigo() {
        Electrode electrode;
        int num = (int) (Math.random() * 5 + 1);
        switch (num) {
            case 1:
                electrode = new Electrode();
                electrode.setDano(20);
                electrode.setVida(45);
                electrode.setRecompensa(145);
                System.out.println("Electrode 1");
                break;
            case 2:
                electrode = new Electrode();
                electrode.setDano(25);
                electrode.setVida(50);
                electrode.setRecompensa(180);
                System.out.println("Electrode 2");
                break;
            case 3:
                electrode = new Electrode();
                electrode.setDano(35);
                electrode.setVida(46);
                electrode.setRecompensa(235);
                System.out.println("Electrode 3");
                break;
            case 4:
                electrode = new Electrode();
                electrode.setDano(30);
                electrode.setVida(65);
                electrode.setRecompensa(270);
                System.out.println("Electrode 4");
                break;
            default:
                electrode = new Electrode();
                electrode.setDano(33);
                electrode.setVida(70);
                electrode.setRecompensa(285);
                System.out.println("Electrode 5");
                break;
        }
        return electrode;
    }

    @Override
    public String getNombreEnemigo() {
        return "Electrode";
    }

    @Override
    public boolean isAtacaDosVeces() {
        return false;
    }

    @Override
    public boolean isPuedeAutodestruirse() {
        int num = (int) (Math.random() * 7 + 1);
        return num == 1;
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
