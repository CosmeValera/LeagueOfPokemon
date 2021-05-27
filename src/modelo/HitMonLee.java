package modelo;

public class HitMonLee extends Enemigo {

    public static void definirHitMonLeeEnemigo() {
        int num = (int) (Math.random() * 5 + 1);
        switch (num) {
            case 1:
                Personajes.enemigo = new HitMonLee();
                Personajes.enemigo.setDano(11);
                Personajes.enemigo.setVida(122);
                Personajes.enemigo.setRecompensa(195);
                System.out.println("hitMonLee 1");
                break;
            case 2:
                Personajes.enemigo = new HitMonLee();
                Personajes.enemigo.setDano(14);
                Personajes.enemigo.setVida(95);
                Personajes.enemigo.setRecompensa(230);
                System.out.println("hitMonLee 2");
                break;
            case 3:
                Personajes.enemigo = new HitMonLee();
                Personajes.enemigo.setDano(12);
                Personajes.enemigo.setVida(170);
                Personajes.enemigo.setRecompensa(270);
                System.out.println("hitMonLee 3");
                break;
            case 4:
                Personajes.enemigo = new HitMonLee();
                Personajes.enemigo.setDano(14);
                Personajes.enemigo.setVida(190);
                Personajes.enemigo.setRecompensa(305);
                System.out.println("hitMonLee 4");
                break;
            case 5:
                Personajes.enemigo = new HitMonLee();
                Personajes.enemigo.setDano(13);
                Personajes.enemigo.setVida(215);
                Personajes.enemigo.setRecompensa(325);
                System.out.println("hitMonLee 5");
                break;
        }
    }

    @Override
    public String getNombreEnemigo() {
        return "HitMonLee";
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
