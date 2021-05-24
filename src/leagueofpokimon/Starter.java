package leagueofpokimon;

public abstract class Starter implements IValoresMaximos{

    protected int dano;
    protected double vida;
    protected int cantidadOro;

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
    
    public abstract void ataquePrincipal(Enemigo enemigo) ;
    public abstract void ataqueSecundario(Enemigo enemigo) ;
}
