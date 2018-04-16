package src.proyecto.logic;

public class CaracteristicasVer {

    String descripcion;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public CaracteristicasVer(String descripcion) {
        this.descripcion = descripcion;

    }

    @Override
    public String toString() {
        return "CaracteristicasVer{" + "descripcion=" + descripcion + '}';
    }

}
