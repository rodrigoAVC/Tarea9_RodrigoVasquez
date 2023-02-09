package tarea9_rodrigovasquez;

public class RegularMissile extends Missile{
    private int size;

    public RegularMissile() {
        super();
    }

    public RegularMissile(int size, int velocidadDesplazamiento, int poderExplosivo) {
        super(velocidadDesplazamiento, poderExplosivo);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "RegularMissile{" + "size=" + size + '}';
    }

    @Override
    public void atacar() {
        
    }
    
    
}
