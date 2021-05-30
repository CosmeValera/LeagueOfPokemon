package modelo;

public abstract class Starter {

    protected int dano;
    protected double vida;
    protected static int cantidadOro; //PARA FICHEROS
    protected static int enemigosVencidos; //PARA FICHEROS

    private final int cantidadInicialOro = 300;

//    private static final int VICTORIESFORFIRSTPRIZE = 15;
//    private static final int VICTORIESFORSECONDPRIZE = 40;
//    private static final int VICTORIESFORTHIRDPRIZE = 65;
    private static final int VICTORIESFORFIRSTPRIZE = 1;
    private static final int VICTORIESFORSECONDPRIZE = 2;
    private static final int VICTORIESFORTHIRDPRIZE = 3;
    private static boolean teemoDisponible = false; //PARA FICHEROS
    private static boolean poppyDisponible = false; //PARA FICHEROS
    private static boolean gnarDisponible = false; //PARA FICHEROS
    private static boolean yuumiDisponible = false; //PARA FICHEROS

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

    public static boolean isTeemoDisponible() {
        return teemoDisponible;
    }

    public static void setTeemoDisponible(boolean teemoDisponible) {
        Starter.teemoDisponible = teemoDisponible;
    }

    public static boolean isPoppyDisponible() {
        return poppyDisponible;
    }

    public static void setPoppyDisponible(boolean poppyDisponible) {
        Starter.poppyDisponible = poppyDisponible;
    }

    public static boolean isGnarDisponible() {
        return gnarDisponible;
    }

    public static void setGnarDisponible(boolean gnarDisponible) {
        Starter.gnarDisponible = gnarDisponible;
    }

    public static boolean isYuumiDisponible() {
        return yuumiDisponible;
    }

    public static void setYuumiDisponible(boolean yuumiDisponible) {
        Starter.yuumiDisponible = yuumiDisponible;
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
