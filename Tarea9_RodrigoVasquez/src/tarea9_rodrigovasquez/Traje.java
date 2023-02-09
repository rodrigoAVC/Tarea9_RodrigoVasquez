package tarea9_rodrigovasquez;

import java.util.ArrayList;

public class Traje {

    private double medidorDMG, medidorCarga, medidorOxido, medidorFuerza;
    private Beam beam;
    private MissileLauncher missileLauncher;
    private ArrayList<AddOn> addOns = new ArrayList();

    public Traje() {
    }

    public Traje(double medidorDMG, double medidorCarga, double medidorOxido, double medidorFuerza, Beam beam, MissileLauncher missileLauncher) {
        this.medidorDMG = 100;
        this.medidorCarga = 100;
        this.medidorOxido = 100;
        this.medidorFuerza = 100;
        this.beam = beam;
        this.missileLauncher = missileLauncher;
    }

    public double getMedidorDMG() {
        return medidorDMG;
    }

    public void setMedidorDMG(double medidorDMG) {
        if (medidorDMG > 0) {
            this.medidorDMG = medidorDMG;
        }
    }

    public double getMedidorCarga() {
        return medidorCarga;
    }

    public void setMedidorCarga(double medidorCarga) {
        if (medidorCarga > 0) {
            this.medidorCarga = medidorCarga;
        }
    }

    public double getMedidorOxido() {
        return medidorOxido;
    }

    public void setMedidorOxido(double medidorOxido) {
        if (medidorOxido > 0) {
            this.medidorOxido = medidorOxido;
        }
    }

    public double getMedidorFuerza() {
        return medidorFuerza;
    }

    public void setMedidorFuerza(double medidorFuerza) {
        if (medidorFuerza > 0) {
            this.medidorFuerza = medidorFuerza;
        }
    }

    public Beam getBeam() {
        return beam;
    }

    public void setBeam(Beam beam) {
        this.beam = beam;
    }

    public MissileLauncher getMissileLauncher() {
        return missileLauncher;
    }

    public void setMissileLauncher(MissileLauncher missileLauncher) {
        this.missileLauncher = missileLauncher;
    }

    public ArrayList<AddOn> getAddOns() {
        return addOns;
    }

    public void setAddOns(ArrayList<AddOn> addOns) {
        this.addOns = addOns;
    }

}
