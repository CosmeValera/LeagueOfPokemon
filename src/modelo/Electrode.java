package modelo;

public class Electrode extends Enemigo {

    public static void definirElectrodeEnemigo() {
        int num = (int) (Math.random() * 5 + 1);
        switch (num) {
            case 1:
                Personajes.enemigo = new Electrode();
                Personajes.enemigo.setDano(20);
                Personajes.enemigo.setVida(45);
                Personajes.enemigo.setRecompensa(145);
                System.out.println("Electrode 1");
                break;
            case 2:
                Personajes.enemigo = new Electrode();
                Personajes.enemigo.setDano(25);
                Personajes.enemigo.setVida(50);
                Personajes.enemigo.setRecompensa(180);
                System.out.println("Electrode 2");
                break;
            case 3:
                Personajes.enemigo = new Electrode();
                Personajes.enemigo.setDano(35);
                Personajes.enemigo.setVida(46);
                Personajes.enemigo.setRecompensa(235);
                System.out.println("Electrode 3");
                break;
            case 4:
                Personajes.enemigo = new Electrode();
                Personajes.enemigo.setDano(30);
                Personajes.enemigo.setVida(65);
                Personajes.enemigo.setRecompensa(270);
                System.out.println("Electrode 4");
                break;
            case 5:
                Personajes.enemigo = new Electrode();
                Personajes.enemigo.setDano(33);
                Personajes.enemigo.setVida(70);
                Personajes.enemigo.setRecompensa(285);
                System.out.println("Electrode 5");
                break;
        }
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
    public boolean isPuedeAutodestruirse(){
        int num = (int) (Math.random() * 7 + 1);
        return num == 1;
    }
    
    @Override
    public boolean isInmuneACegado() {
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
