package modelo;

public class Gyarados extends Enemigo {

    public static void definirGyaradosEnemigo() {
        int num = (int) (Math.random() * 5 + 1);
        switch (num) {
            case 1:
                Personajes.enemigo = new Gyarados();
                Personajes.enemigo.setDano(21);
                Personajes.enemigo.setVida(290);
                Personajes.enemigo.setRecompensa(540);
                System.out.println("gyarados 1");
                break;
            case 2:
                Personajes.enemigo = new Gyarados();
                Personajes.enemigo.setDano(22);
                Personajes.enemigo.setVida(285);
                Personajes.enemigo.setRecompensa(550);
                System.out.println("gyarados 2");
                break;
            case 3:
                Personajes.enemigo = new Gyarados();
                Personajes.enemigo.setDano(19);
                Personajes.enemigo.setVida(305);
                Personajes.enemigo.setRecompensa(555);
                System.out.println("gyarados 3");
                break;
            case 4:
                Personajes.enemigo = new Gyarados();
                Personajes.enemigo.setDano(20);
                Personajes.enemigo.setVida(320);
                Personajes.enemigo.setRecompensa(580);
                System.out.println("gyarados 4");
                break;
            case 5:
                Personajes.enemigo = new Gyarados();
                Personajes.enemigo.setDano(22);
                Personajes.enemigo.setVida(345);
                Personajes.enemigo.setRecompensa(640);
                System.out.println("gyarados 5");
                break;
        }
    }

    @Override
    public String getNombreEnemigo() {
        return "Gyarados";
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
        return true;
    }

    @Override
    public boolean isInmuneAVeneno() {
        return false;
    }

    @Override
    public boolean isInmuneAConfusion() {
        return true;
    }
}
