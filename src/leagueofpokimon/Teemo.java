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
}
