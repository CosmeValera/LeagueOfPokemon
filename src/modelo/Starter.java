package modelo;

public abstract class Starter extends Personaje {

    protected static int cantidadOro;
    protected static int enemigosVencidos;

    private final int cantidadInicialOro = 300;

    private static final int VICTORIESFORFIRSTPRIZE = 15;
    private static final int VICTORIESFORSECONDPRIZE = 40;
    private static final int VICTORIESFORTHIRDPRIZE = 65;
    private boolean teemoDisponible = false;
    private boolean poppyDisponible = false;
    private boolean gnarDisponible = false;
    private boolean yuumiDisponible = false;
    
    protected boolean seraCegado = false;

    public Starter() {
        dano = 0;
        vida = 0;
        cantidadOro = cantidadInicialOro;
        enemigosVencidos = 0;
    }

    public Starter(int dano, double vida, int cantidadOro) {
        this.dano = dano;
        this.vida = vida;
        Starter.enemigosVencidos = 0;
        Starter.cantidadOro = cantidadOro;
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

    public static int getEnemigosVencidos() {
        return enemigosVencidos;
    }

    public void setEnemigosVencidos(int enemigosVencidos) {
        this.enemigosVencidos = enemigosVencidos;
    }

    public static int getVictoriesForFirstPrize() {
        return VICTORIESFORFIRSTPRIZE;
    }

    public static int getVictoriesForSecondPrize() {
        return VICTORIESFORSECONDPRIZE;
    }

    public static int getVictoriesForThirdPrize() {
        return VICTORIESFORTHIRDPRIZE;
    }

    public boolean isTeemoDisponible() {
        return teemoDisponible;
    }

    public void setTeemoDisponible(boolean teemoDisponible) {
        this.teemoDisponible = teemoDisponible;
    }
    
    public boolean isPoppyDisponible() {
        return poppyDisponible;
    }

    public void setPoppyDisponible(boolean poppyDisponible) {
        this.poppyDisponible = poppyDisponible;
    }

    public boolean isGnarDisponible() {
        return gnarDisponible;
    }

    public void setGnarDisponible(boolean gnarDisponible) {
        this.gnarDisponible = gnarDisponible;
    }

    public boolean isYuumiDisponible() {
        return yuumiDisponible;
    }

    public void setYuumiDisponible(boolean yuumiDisponible) {
        this.yuumiDisponible = yuumiDisponible;
    }

    public boolean isSeraCegado() {
        return seraCegado;
    }

    public void setSeraCegado(boolean seraCegado) {
        this.seraCegado = seraCegado;
    }

    public abstract int getVidaMaxima();

    public abstract int getDanoMaximo();

    public abstract int getDanoMinimo();

    public abstract String getNombreAtaquePrincipal();

    public abstract String getNombreAtaqueSecundario();

    public abstract void ataquePrincipal(Enemigo enemigo);

    public abstract void ataqueSecundario(Enemigo enemigo);

    public abstract double getDanoAtaquePrincipal();

    public abstract double getDanoAtaqueSecundario();

    public abstract boolean isFallaElAtaque();

    public abstract boolean isPuedeEsquivar();

    public abstract boolean isPonerseEscudo();

    public abstract double ajustarDanoAResistencias(double dano);
}
