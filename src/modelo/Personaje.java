package modelo;

public abstract class Personaje {
    
    protected double dano;
    protected double vida;
    
    protected boolean cegado; //Un turno sin poder golpear
    protected boolean visionTorpe; //Un turno sin poder golpear
    protected boolean confundido; //Un turno que se golpea a si mismo
    protected boolean envenenado; //Dano cada turno
    protected int turnosEnvenenado;
    
    protected class ResistenciaMagica {
        public static final double DEBIL = 35;
        public static final double LIGERAMENTE_DEBIL = 45;
        public static final double MEDIO = 50;
        public static final double LIGERAMENTE_FUERTE = 55;
        public static final double FUERTE = 65;
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
    
    public boolean isCegado() {
        return cegado;
    }

    public void setCegadoSiPosible(boolean cegado) {
        if (!isInmuneACegado()) {
            this.cegado = cegado;
        }
    }

    public boolean isVisionTorpe() {
        return visionTorpe;
    }

    public void setVisionTorpeSiPosible(boolean visionTorpe) {
        if (!isInmuneAVisionTorpe()) {
            this.visionTorpe = visionTorpe;
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

    public abstract String getNombre();

    public abstract double getResistenciaMagica();

    public abstract boolean isAtacaDosVeces();

    public abstract boolean isInmuneACegado();
    
    public abstract boolean isInmuneAVisionTorpe();

    public abstract boolean isInmuneAVeneno();

    public abstract boolean isInmuneAConfusion();
}
