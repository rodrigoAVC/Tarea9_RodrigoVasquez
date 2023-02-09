package tarea9_rodrigovasquez;

import java.util.ArrayList;

public class MissileLauncher {
    private int capMisiles;
    private ArrayList<Missile> misilesCargados = new ArrayList();
    private boolean regularMissile, superMissile;

    public MissileLauncher() {
    }

    public MissileLauncher(int capMisiles, boolean regularMissile, boolean superMissile) {
        this.capMisiles = capMisiles;
        this.regularMissile = regularMissile;
        this.superMissile = superMissile;
    }

    public int getCapMisiles() {
        return capMisiles;
    }

    public void setCapMisiles(int capMisiles) {
        this.capMisiles = capMisiles;
    }

    public ArrayList<Missile> getMisilesCargados() {
        return misilesCargados;
    }

    public void setMisilesCargados(ArrayList<Missile> misilesCargados) {
        this.misilesCargados = misilesCargados;
    }

    public boolean isRegularMissile() {
        return regularMissile;
    }

    public void setRegularMissile(boolean regularMissile) {
        this.regularMissile = regularMissile;
    }

    public boolean isSuperMissile() {
        return superMissile;
    }

    public void setSuperMissile(boolean superMissile) {
        this.superMissile = superMissile;
    }

    @Override
    public String toString() {
        return "MissileLauncher{" + "capMisiles=" + capMisiles + ", misilesCargados=" + misilesCargados + ", regularMissile=" + regularMissile + ", superMissile=" + superMissile + '}';
    }
        
}
