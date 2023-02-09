package tarea9_rodrigovasquez;

public class SuperMissile extends Missile{
    private String material;

    public SuperMissile() {
        super();
    }

    public SuperMissile(String material, int velocidadDesplazamiento, int poderExplosivo) {
        super(velocidadDesplazamiento, poderExplosivo);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "SuperMissile{" + "material=" + material + '}';
    }

    @Override
    public void atacar() {
        
    }
    
    
}
