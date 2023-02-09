package tarea9_rodrigovasquez;

public class LightBeam extends Beam {

    private int indexPhotones, velocidadDisparo, municion;

    public LightBeam() {
        super();
    }

    public LightBeam(int indexPhotones, int velocidadDisparo, int municion, String tipoCarga, int peso, int potencia) {
        super(tipoCarga, peso, potencia);
        this.indexPhotones = indexPhotones;
        this.velocidadDisparo = velocidadDisparo;
        this.municion = municion;
    }

    public int getIndexPhotones() {
        return indexPhotones;
    }

    public void setIndexPhotones(int indexPhotones) {
        if (indexPhotones > 0) {
            this.indexPhotones = indexPhotones;
        }
    }

    public int getVelocidadDisparo() {
        return velocidadDisparo;
    }

    public void setVelocidadDisparo(int velocidadDisparo) {
        if (velocidadDisparo > 0) {
            this.velocidadDisparo = velocidadDisparo;
        }
    }

    public int getMunicion() {
        return municion;
    }

    public void setMunicion(int municion) {
        if (municion > 0) {
            this.municion = municion;
        }
    }

    @Override
    public String toString() {
        return "LightBeam{" + "indexPhotones=" + indexPhotones + ", velocidadDisparo=" + velocidadDisparo + ", municion=" + municion + '}';
    }

    @Override
    public void ataque() {
        
    }
    
    
}
