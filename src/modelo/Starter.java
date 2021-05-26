package modelo;

public abstract class Starter {

    protected int dano;
    protected double vida;
    protected int cantidadOro;

    private final int cantidadInicialOro = 300;

    public Starter() {
        dano = 0;
        vida = 0;
        cantidadOro = 0;
    }

    public Starter(int dano, double vida, int cantidadOro) {
        this.dano = dano;
        this.vida = vida;
        this.cantidadOro = cantidadOro;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    public int getCantidadOro() {
        return cantidadOro;
    }

    public void setCantidadOro(int cantidadOro) {
        this.cantidadOro = cantidadOro;
    }

    public int getCantidadInicialOro() {
        return cantidadInicialOro;
    }

    public abstract int getVidaMaxima();

    public abstract int getDanoMaximo();

    public abstract int getDanoMinimo();
    
    public abstract String getNombre();

    public abstract void ataquePrincipal(Enemigo enemigo);

    public abstract void ataqueSecundario(Enemigo enemigo);

    public abstract boolean isAtacaDosVeces();

    public abstract boolean isFallaElAtaque();

    public abstract boolean isPuedeEsquivar();

    public abstract boolean isPonerseEscudo();

    public abstract double ajustarDanoAResistencias(double dano);
}
