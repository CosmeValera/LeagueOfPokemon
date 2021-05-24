package leagueofpokimon;

public class Gnar extends Starter {

    private int resistencia;
    private boolean esMonstruo;
    private int contadorMonstruo;

    private final int VIDA_MAXIMA = 150;
    private final int DANO_MAXIMO = 50;

    public Gnar() {
        dano = 6;
        vida = 150;
        cantidadOro = 0;
        esMonstruo = false;
        resistencia = 35;
        contadorMonstruo = 0;
    }

    public Gnar(int dano, double vida, int cantidadOro, boolean esMonstruo, int resistencia) {
        super(dano, vida, cantidadOro);
        this.esMonstruo = esMonstruo;
        this.resistencia = resistencia;
    }

    public boolean isMonstruo() {
        return esMonstruo;
    }

    public void setEsMonstruo(boolean esMonstruo) {
        this.esMonstruo = esMonstruo;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public int getContadorMonstruo() {
        return contadorMonstruo;
    }

    public void setContadorMonstruo(int contadorMonstruo) {
        this.contadorMonstruo = contadorMonstruo;
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
