package tarea9_rodrigovasquez;

public class PlasmaBeam extends Beam {

    private int tankSize, tempCarga, numDisparo;

    public PlasmaBeam() {
        super();
    }

    public PlasmaBeam(int tankSize, int tempCarga, int numDisparo, String tipoCarga, int peso, int potencia) {
        super(tipoCarga, peso, potencia);
        this.tankSize = tankSize;
        this.tempCarga = tempCarga;
        this.numDisparo = numDisparo;
    }

    public int getTankSize() {
        return tankSize;
    }

    public void setTankSize(int tankSize) {
        if (tankSize > 0) {
            this.tankSize = tankSize;
        }
    }

    public int getTempCarga() {
        return tempCarga;
    }

    public void setTempCarga(int tempCarga) {
        if (tempCarga > 0) {
            this.tempCarga = tempCarga;
        }
    }

    public int getNumDisparo() {
        return numDisparo;
    }

    public void setNumDisparo(int numDisparo) {
        if (numDisparo > 0) {
            this.numDisparo = numDisparo;
        }
    }

    @Override
    public String toString() {
        return "PlasmaBeam{" + "tankSize=" + tankSize + ", tempCarga=" + tempCarga + ", numDisparo=" + numDisparo + '}';
    }

    @Override
    public void ataque() {
        
    }
    
    
}
