package modelo;

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

    public void setCegadoSiPosible(boolean cegado) {
        if (!isInmuneACegado()) {
            this.cegado = cegado;
        }
    }

    public boolean isConfundido() {
        return confundido;
    }

    public void setConfundidoSiPosible(boolean confundido) {
        if (!isInmuneAConfusion()) {
            this.confundido = confundido;
        }
    }

    public boolean isEnvenenado() {
        return envenenado;
    }

    public void setEnvenenadoSiPosible(boolean envenenado) {
        if (!isInmuneAVeneno()) {
            this.envenenado = envenenado;
            if (envenenado) {
                setTurnosEnvenenado(3);
            }
        }
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

    public abstract boolean isAtacaDosVeces();

    public abstract boolean isInmuneACegado();

    public abstract boolean isInmuneAVeneno();

    public abstract boolean isInmuneAConfusion();

    public abstract boolean isPuedeAutodestruirse();
}
