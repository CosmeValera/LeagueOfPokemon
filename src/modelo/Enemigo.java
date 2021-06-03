package modelo;

public abstract class Enemigo extends Personaje {

    protected double recompensa;
    
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

    public double getRecompensa() {
        return recompensa;
    }

    public void setRecompensa(double recompensa) {
        this.recompensa = recompensa;
    }

    public abstract boolean isPuedeAutodestruirse();
}
