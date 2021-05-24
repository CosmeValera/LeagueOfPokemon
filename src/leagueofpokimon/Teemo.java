package leagueofpokimon;

public class Teemo extends Starter {

    private int danoVeneno;

    private final int VIDA_MAXIMA = 120;
    private final int DANO_MAXIMO = 60;

    public Teemo() {
        dano = 10;
        vida = 120;
        cantidadOro = 0;
        danoVeneno = 3;
    }

    public Teemo(int dano, double vida, int cantidadOro, int danoVeneno) {
        super(dano, vida, cantidadOro);
        this.danoVeneno = danoVeneno;
    }

    public int getDanoVeneno() {
        return danoVeneno;
    }

    public void setDanoVeneno(int danoVeneno) {
        this.danoVeneno = danoVeneno;
    }

    @Override
    public int getVidaMaxima() {
        return VIDA_MAXIMA;
    }

    @Override
    public int getDanoMaximo() {
        return DANO_MAXIMO;
    }

    @Override
    public void ataquePrincipal(Enemigo enemigo) { //Aranazo
        enemigo.setVida(enemigo.getVida() - dano);
    }

    @Override
    public void ataqueSecundario(Enemigo enemigo) { //Dardo venenoso
        enemigo.setVida(enemigo.getVida() - dano / 2);

        int num = ((int) (Math.random() * 100 + 1)) + ((Teemo) Personajes.starter).getDanoVeneno();
        if (num > 50 && num < 75) { //Envenenado
            enemigo.setEnvenenado(true);
            enemigo.setTurnosEnvenenado(3);
        } else if (num >= 75 && num < 90) { //Cegado
            enemigo.setCegado(true);
        } else if (num >= 90) { //Envenenado y cegado
            enemigo.setEnvenenado(true);
            enemigo.setTurnosEnvenenado(3);
            enemigo.setCegado(true);
        }
    }

    @Override
    public boolean isAtacaDosVeces() {
        return false;
    }

    @Override
    public boolean isFallaElAtaque() {
        return false;
    }

    @Override
    public boolean isPuedeEsquivar() {
        return false;
    }

    @Override
    public boolean isPonerseEscudo() {
        return false;
    }
}
