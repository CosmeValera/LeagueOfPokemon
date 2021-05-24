package leagueofpokimon;

public abstract class Enemigo {

    protected double dano;
    protected double vida;
    protected double recompensa;
    protected boolean cegado; //Un turno sin poder golpear
    protected boolean confundido; //Un turno que se golpea a si mismo
    protected boolean envenenado; //Dano cada turno
    protected int turnosEnvenenado;

    public Enemigo() {
        dano = 0;
        vida = 0;
        recompensa = 0;
        envenenado = false;
        cegado = false;
        confundido = false;
        turnosEnvenenado = 0;
    }

    public Enemigo(double dano, double vida, double recompensa) {
        this.dano = dano;
        this.vida = vida;
        this.recompensa = recompensa;
        envenenado = false;
        cegado = false;
        confundido = false;
        turnosEnvenenado = 0;
    }

    public double getDano() {
        return dano;
    }

    public void setDano(double dano) {
        this.dano = dano;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    public double getRecompensa() {
        return recompensa;
    }

    public void setRecompensa(double recompensa) {
        this.recompensa = recompensa;
    }

    public boolean isCegado() {
        return cegado;
    }

    public void setCegado(boolean cegado) {
        this.cegado = cegado;
    }

    public boolean isConfundido() {
        return confundido;
    }

    public void setConfundido(boolean confundido) {
        this.confundido = confundido;
    }

    public boolean isEnvenenado() {
        return envenenado;
    }

    public void setEnvenenado(boolean envenenado) {
        this.envenenado = envenenado;
    }

    public int getTurnosEnvenenado() {
        return turnosEnvenenado;
    }

    public void setTurnosEnvenenado(int turnosEnvenenado) {
        this.turnosEnvenenado = turnosEnvenenado;
    }
    
    public String getNombreEnemigo() {
        return "Enemigo sin nombre";
    }
}
