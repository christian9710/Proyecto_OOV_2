/**
 *
 * Clase para conceptualizar el concepto de mejora en una caracteristica
 */
package src.proyecto.logic;

/**
 *
 * @author christian Rodriguez y Brandon Fernandez
 */
public class Mejora extends CaracteristicasVer {

    String descripcion;

    /**
     *
     * @param descripcion
     */
    public Mejora(String descripcion) {
        super(descripcion);
    }

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
}
