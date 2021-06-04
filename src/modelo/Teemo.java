package modelo;

public class Teemo extends Starter {

    private int danoVeneno;

    private final int VIDA_MAXIMA = 120;
    private final int DANO_MAXIMO = 60;
    private final int DANO_MINIMO = 10;
    private final int DANOVENENO_MAXIMO = 30;
    private final int DANOVENENO_MINIMO = 3;

    public Teemo() {
        dano = DANO_MINIMO;
        vida = VIDA_MAXIMA;
        danoVeneno = DANOVENENO_MINIMO;
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
    public int getDanoMinimo() {
        return DANO_MINIMO;
    }

    public int getDanoVenenoMaximo() {
        return DANOVENENO_MAXIMO;
    }

    public int getDanoVenenoMinimo() {
        return DANOVENENO_MINIMO;
    }

    @Override
    public String getNombre() {
        return "Teemo";
    }

    @Override
    public String getNombreAtaquePrincipal() {
        return "Arañazo";
    }

    @Override
    public String getNombreAtaqueSecundario() {
        return "Dardo Venenoso";
    }

    @Override
    public void ataquePrincipal(Enemigo enemigo) { //Aranazo
        enemigo.setVida(enemigo.getVida() - dano * 1.5);

        lifeSteal(danoVeneno * 1.5);

        int num = ((int) (Math.random() * 100 + 1)) + ((Teemo) Global.starter).getDanoVeneno() / 2;
        if (num > 70) { //Camuflarse
            enemigo.setVisionTorpeSiPosible(true);
        }
    }

    @Override
    public void ataqueSecundario(Enemigo enemigo) { //Dardo venenoso
        enemigo.setVida(enemigo.getVida() - dano);

        lifeSteal(danoVeneno);

        int num = ((int) (Math.random() * 100 + 1)) + ((Teemo) Global.starter).getDanoVeneno();
        if (num > 45 && num < 73) { //Envenenado
            enemigo.setEnvenenadoSiPosible(true);
        } else if (num >= 73 && num < 90) { //Cegado
            enemigo.setCegadoSiPosible(true);
        } else if (num >= 90) { //Envenenado y cegado
            enemigo.setEnvenenadoSiPosible(true);
            enemigo.setCegadoSiPosible(true);
        }
    }

    @Override
    public double getDanoAtaquePrincipal() { //Aranazo
        lifeSteal(danoVeneno * 1.5);
        return dano * 1.5;
    }

    @Override
    public double getDanoAtaqueSecundario() { //Dardo venenoso
        lifeSteal(danoVeneno);
        return dano;
    }

    private void lifeSteal(double danoVeneno) {
        vida = vida + danoVeneno / 5;
        if (vida > VIDA_MAXIMA) {
            vida = VIDA_MAXIMA;
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

    @Override
    public boolean isPuedeConfundir(Starter starterEnemigo){
        return false;
    }
    
    @Override
    public double ajustarDanoAResistencias(double dano) {
        return dano - dano * this.danoVeneno / 100;
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
