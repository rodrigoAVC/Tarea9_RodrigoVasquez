package tarea9_rodrigovasquez;

public class DarkBeam extends Beam {

    private int velodicadDisparo, municion;

    public DarkBeam() {
        super();
    }

    public DarkBeam(int velodicadDisparo, int municion, String tipoCarga, int peso, int potencia) {
        super(tipoCarga, peso, potencia);
        this.velodicadDisparo = velodicadDisparo;
        this.municion = municion;
    }

    public int getVelodicadDisparo() {
        return velodicadDisparo;
    }

    public void setVelodicadDisparo(int velodicadDisparo) {
        if (velodicadDisparo > 0) {
            this.velodicadDisparo = velodicadDisparo;
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
        return "DarkBeam{" + "velodicadDisparo=" + velodicadDisparo + ", municion=" + municion + '}';
    }

    @Override
    public void ataque() {
        
    }
    
}
