package modelo;

public class HitMonLee extends Enemigo {

    private double resistenciaMagica = ResistenciaMagica.LIGERAMENTE_DEBIL;

    public static void definirHitMonLeeEnemigo() {
        Global.enemigo = obtenerHitMonLeeEnemigo();
    }

    private static HitMonLee obtenerHitMonLeeEnemigo() {
        HitMonLee hitMonLee;
        int num = (int) (Math.random() * 5 + 1);
        switch (num) {
            case 1:
                hitMonLee = new HitMonLee();
                hitMonLee.setDano(11);
                hitMonLee.setVida(122);
                hitMonLee.setRecompensa(195);
                System.out.println("hitMonLee 1");
                break;
            case 2:
                hitMonLee = new HitMonLee();
                hitMonLee.setDano(14);
                hitMonLee.setVida(105);
                hitMonLee.setRecompensa(245);
                System.out.println("hitMonLee 2");
                break;
            case 3:
                hitMonLee = new HitMonLee();
                hitMonLee.setDano(12);
                hitMonLee.setVida(170);
                hitMonLee.setRecompensa(270);
                System.out.println("hitMonLee 3");
                break;
            case 4:
                hitMonLee = new HitMonLee();
                hitMonLee.setDano(14);
                hitMonLee.setVida(190);
                hitMonLee.setRecompensa(305);
                System.out.println("hitMonLee 4");
                break;
            default:
                hitMonLee = new HitMonLee();
                hitMonLee.setDano(13);
                hitMonLee.setVida(215);
                hitMonLee.setRecompensa(325);
                System.out.println("hitMonLee 5");
                break;
        }
        return hitMonLee;
    }

    @Override
    public String getNombreEnemigo() {
        return "HitMonLee";
    }

    @Override
    public double getResistenciaMagica() {
        return resistenciaMagica;
    }

    @Override
    public boolean isAtacaDosVeces() {
        int num = (int) (Math.random() * 3 + 1);
        return num == 1;
    }

    @Override
    public boolean isPuedeAutodestruirse() {
        return false;
    }

    @Override
    public boolean isInmuneACegado() {
        return true;
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
