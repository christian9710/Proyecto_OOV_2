package src.proyecto.logic;

/**
 *clase para implementar el concepto de una caracteristica de una version
 * @author christian rodriguez y Brandon Fernandez
 */
public class CaracteristicasVer {

    String descripcion;

    /**
     *
     * @return
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     *
     * @param descripcion
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     *
     * @param descripcion
     */
    public CaracteristicasVer(String descripcion) {
        this.descripcion = descripcion;

    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "CaracteristicasVer{" + "descripcion=" + descripcion + '}';
    }

}
