package modelo;

public class Gyarados extends Enemigo {

    public static void definirGyaradosEnemigo() {
        Personajes.enemigo = obtenerGyaradosEnemigo();
    }

    private static Gyarados obtenerGyaradosEnemigo() {
        Gyarados gyarados;
        int num = (int) (Math.random() * 5 + 1);
        switch (num) {
            case 1:
                gyarados = new Gyarados();
                gyarados.setDano(21);
                gyarados.setVida(290);
                gyarados.setRecompensa(540);
                System.out.println("gyarados 1");
                break;
            case 2:
                gyarados = new Gyarados();
                gyarados.setDano(22);
                gyarados.setVida(285);
                gyarados.setRecompensa(550);
                System.out.println("gyarados 2");
                break;
            case 3:
                gyarados = new Gyarados();
                gyarados.setDano(19);
                gyarados.setVida(305);
                gyarados.setRecompensa(555);
                System.out.println("gyarados 3");
                break;
            case 4:
                gyarados = new Gyarados();
                gyarados.setDano(20);
                gyarados.setVida(320);
                gyarados.setRecompensa(580);
                System.out.println("gyarados 4");
                break;
            default:
                gyarados = new Gyarados();
                gyarados.setDano(22);
                gyarados.setVida(345);
                gyarados.setRecompensa(640);
                System.out.println("gyarados 5");
                break;
        }
        return gyarados;
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
