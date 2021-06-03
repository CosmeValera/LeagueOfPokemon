package modelo;

public class Poppy extends Starter {

    private boolean llevaEscudo;
    private int proteccionEscudo;

    private final int VIDA_MAXIMA = 200;
    private final int DANO_MAXIMO = 40;
    private final int DANO_MINIMO = 6;
    private final int PROTECCIONESCUDO_MAXIMA = 30;
    private final int PROTECCIONESCUDO_MINIMA = 3;
    private final boolean POPPY_VALORESCUDOPORDEFECTO = false;

    public Poppy() {
        dano = DANO_MINIMO;
        vida = VIDA_MAXIMA;
        proteccionEscudo = PROTECCIONESCUDO_MINIMA;
        llevaEscudo = POPPY_VALORESCUDOPORDEFECTO;
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

    @Override
    public int getDanoMinimo() {
        return DANO_MINIMO;
    }

    public int getProteccionEscudoMaxima() {
        return PROTECCIONESCUDO_MAXIMA;
    }

    @Override
    public String getNombre() {
        return "Poppy";
    }

    @Override
    public String getNombreAtaquePrincipal() {
        return "Placaje con escudo";
    }

    @Override
    public String getNombreAtaqueSecundario() {
        return "Martillazo";
    }

    @Override
    public void ataquePrincipal(Enemigo enemigo) { //placaje
        enemigo.setVida(enemigo.getVida() - dano);
    }

    @Override
    public void ataqueSecundario(Enemigo enemigo) { //martillazo
        enemigo.setVida(enemigo.getVida() - dano / 2);

        int num = (int) (Math.random() * 100 + 1 + proteccionEscudo);
        if (num > 62) {
            enemigo.setConfundidoSiPosible(true);
        }
    }

    @Override
    public double obtenerDanoAtaquePrincipal() { //placaje
        return dano;
    }
    @Override
    public double obtenerDanoAtaqueSecundario() { //martillazo
        return dano/2; //AÑADIR LO DE CONFUNDIR
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
        int num = (int) (Math.random() * 100 + 1 + proteccionEscudo);
        if (num > 50) {
            return true;
        }
        return false;
    }

    @Override
    public double ajustarDanoAResistencias(double dano) {
        dano = dano - dano * proteccionEscudo / 100 * 3 / 2;
        if (isLlevaEscudo()) {
            if (dano <= proteccionEscudo) {
                return 0; //El escudo bolquea todo el dano
            } else {
                return dano - proteccionEscudo;
            }
        }
        return dano;
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
        return false;
    }

    @Override
    public boolean isInmuneAConfusion() {
        return false;
    }

    @Override
    public double getResistenciaMagica() {
        return ResistenciaMagica.MEDIO;
    }
}
