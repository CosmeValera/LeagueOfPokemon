package modelo;

public class Pikachu extends Enemigo {

    public static void definirPikachuEnemigo() {
        int num = (int) (Math.random() * 5 + 1); //1,2,3
        switch (num) {
            case 1:
                Personajes.enemigo = new Pikachu();
                Personajes.enemigo.setDano(10);
                Personajes.enemigo.setVida(50);
                Personajes.enemigo.setRecompensa(100);
                System.out.println("pikachu 1");
                break;
            case 2:
                Personajes.enemigo = new Pikachu();
                Personajes.enemigo.setDano(10);
                Personajes.enemigo.setVida(60);
                Personajes.enemigo.setRecompensa(120);
                System.out.println("pikachu 2");
                break;
            case 3:
                Personajes.enemigo = new Pikachu();
                Personajes.enemigo.setDano(8);
                Personajes.enemigo.setVida(75);
                Personajes.enemigo.setRecompensa(110);
                System.out.println("pikachu 3");
                break;
            case 4:
                Personajes.enemigo = new Pikachu();
                Personajes.enemigo.setDano(12);
                Personajes.enemigo.setVida(40);
                Personajes.enemigo.setRecompensa(115);
                System.out.println("pikachu 4");
                break;
            case 5:
                Personajes.enemigo = new Pikachu();
                Personajes.enemigo.setDano(10);
                Personajes.enemigo.setVida(90);
                Personajes.enemigo.setRecompensa(160);
                System.out.println("pikachu 5");
                break;
        }
    }

    @Override
    public String getNombreEnemigo() {
        return "Pikachu";
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
