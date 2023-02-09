package tarea9_rodrigovasquez;

public class AddOn {
    private String nombre, funcion, parteCuerpo;

    public AddOn() {
    }

    public AddOn(String nombre, String funcion, String parteCuerpo) {
        this.nombre = nombre;
        this.funcion = funcion;
        this.parteCuerpo = parteCuerpo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFuncion() {
        return funcion;
    }

    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }

    public String getParteCuerpo() {
        return parteCuerpo;
    }

    public void setParteCuerpo(String parteCuerpo) {
        this.parteCuerpo = parteCuerpo;
    }

    @Override
    public String toString() {
        return "AddOn{" + "nombre=" + nombre + ", funcion=" + funcion + ", parteCuerpo=" + parteCuerpo + '}';
    }
    
    
}
