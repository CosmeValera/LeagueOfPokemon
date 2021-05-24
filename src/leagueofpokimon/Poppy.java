package leagueofpokimon;

public class Poppy extends Starter {

    private boolean llevaEscudo;
    private int proteccionEscudo;

    private final int VIDA_MAXIMA = 200;
    private final int DANO_MAXIMO = 40;

    public Poppy() {
        dano = 6;
        vida = 200;
        cantidadOro = 0;
        llevaEscudo = false;
        proteccionEscudo = 3;
    }

    public Poppy(int dano, double vida, int cantidadOro, boolean llevaEscudo, int proteccionEscudo) {
        super(dano, vida, cantidadOro);
        this.llevaEscudo = llevaEscudo;
        this.proteccionEscudo = proteccionEscudo;
    }

    public boolean isLlevaEscudo() {
        return llevaEscudo;
    }

    public void setLlevaEscudo(boolean llevaEscudo) {
        this.llevaEscudo = llevaEscudo;
    }

    public int getProteccionEscudo() {
        return proteccionEscudo;
    }

    public void setProteccionEscudo(int proteccionEscudo) {
        this.proteccionEscudo = proteccionEscudo;
    }

    @Override
    public int getVidaMaxima() {
        return VIDA_MAXIMA;
    }

    @Override
    public int getDanoMaximo() {
        return DANO_MAXIMO;
    }

}
