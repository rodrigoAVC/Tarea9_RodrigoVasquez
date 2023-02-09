package tarea9_rodrigovasquez;

public abstract class Beam {

    private String tipoCarga;
    private int peso, potencia;

    public Beam() {
    }

    public Beam(String tipoCarga, int peso, int potencia) {
        this.tipoCarga = tipoCarga;
        this.peso = peso;
        this.potencia = potencia;
    }

    public String getTipoCarga() {
        return tipoCarga;
    }

    public void setTipoCarga(String tipoCarga) {
        this.tipoCarga = tipoCarga;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        if (peso > 0) {
            this.peso = peso;
        }
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        if (potencia > 0) {
            this.potencia = potencia;
        }
    }

    @Override
    public String toString() {
        return "Beam{" + "tipoCarga=" + tipoCarga + ", peso=" + peso + ", potencia=" + potencia + '}';
    }
    
    public abstract void ataque();
}
