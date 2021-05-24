package leagueofpokimon;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class Gnar extends Starter {

    private int resistencia;
    private boolean esMonstruo;
    private int contadorMonstruo;

    private final int VIDA_MAXIMA = 150;
    private final int DANO_MAXIMO = 50;

    public Gnar() {
        dano = 6;
        vida = 150;
        cantidadOro = 0;
        esMonstruo = false;
        resistencia = 35;
        contadorMonstruo = 0;
    }

    public Gnar(int dano, double vida, int cantidadOro, boolean esMonstruo, int resistencia) {
        super(dano, vida, cantidadOro);
        this.esMonstruo = esMonstruo;
        this.resistencia = resistencia;
    }

    @Override
    public void ataquePrincipal(Enemigo enemigo) {
        if (!isMonstruo()) {
            boomerangMiniGnar(enemigo);
        } else {
            golpeMegaGnar(enemigo);
        }
    }

    private void boomerangMiniGnar(Enemigo enemigo) {
        int num = (int) (Math.random() * 2 + 1);
        if (num == 1) {
            enemigo.setVida(enemigo.getVida() - dano);
        } else {
            enemigo.setVida(enemigo.getVida() - dano * 2);
        }
    }

    private void golpeMegaGnar(Enemigo enemigo) throws HeadlessException {
        enemigo.setVida(enemigo.getVida() - dano * 2);
    }

    @Override
    public void ataqueSecundario(Enemigo enemigo) {
        if (!isMonstruo()) {
            salto(enemigo);
        } else {
            lanzarRoca(enemigo);
        }
    }

    private void salto(Enemigo enemigo) {
        enemigo.setVida(enemigo.getVida() - dano);
    }
    private void lanzarRoca(Enemigo enemigo) {
        enemigo.setVida(enemigo.getVida() - dano * 2);
    }
    
    public boolean isMonstruo() {
        return esMonstruo;
    }

    public void setEsMonstruo(boolean esMonstruo) {
        this.esMonstruo = esMonstruo;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public int getContadorMonstruo() {
        return contadorMonstruo;
    }

    public void setContadorMonstruo(int contadorMonstruo) {
        this.contadorMonstruo = contadorMonstruo;
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
    public boolean isAtacaDosVeces() {
        if (!esMonstruo) {
            int num = (int) (Math.random() * 2 + 1);
            return num == 1;
        }
        return false;
    }

    @Override
    public boolean isFallaElAtaque() {
        if (esMonstruo) {
            int num = (int) (Math.random() * 4 + 1);
            return num == 1;
        }
        return false;
    }
    
    @Override
    public boolean isPuedeEsquivar(){
        if (!esMonstruo) {
            int num = (int) (Math.random() * 2 + 1);
            return num == 1;
        }
        return false;
    }

    @Override
    public boolean isPonerseEscudo() {
        return false;
    }
}
