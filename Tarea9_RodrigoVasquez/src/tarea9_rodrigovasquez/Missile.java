package tarea9_rodrigovasquez;

public abstract class Missile {
    private int velocidadDesplazamiento, poderExplosivo;

    public Missile() {
    }

    public Missile(int velocidadDesplazamiento, int poderExplosivo) {
        this.velocidadDesplazamiento = velocidadDesplazamiento;
        this.poderExplosivo = poderExplosivo;
    }

    public int getVelocidadDesplazamiento() {
        return velocidadDesplazamiento;
    }

    public void setVelocidadDesplazamiento(int velocidadDesplazamiento) {
        this.velocidadDesplazamiento = velocidadDesplazamiento;
    }

    public int getPoderExplosivo() {
        return poderExplosivo;
    }

    public void setPoderExplosivo(int poderExplosivo) {
        this.poderExplosivo = poderExplosivo;
    }

    @Override
    public String toString() {
        return "Missile{" + "velocidadDesplazamiento=" + velocidadDesplazamiento + ", poderExplosivo=" + poderExplosivo + '}';
    }
    
    public abstract void atacar();
}
