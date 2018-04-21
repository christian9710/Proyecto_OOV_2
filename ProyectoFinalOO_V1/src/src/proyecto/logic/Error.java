package src.proyecto.logic;

/**
 *
 * @author Christian Rodriguez y Brandon Fernandez
 */
public class Error extends CaracteristicasVer {

    static String descripcion;
    static String fechaReporte;

    /**
     *
     */
    public Error() {
        super(descripcion);

    }

    /**
     *
     * @param descripcion
     * @param fechaReporte
     */
    
    
    public Error(String descripcion, String fechaReporte) {
        super(descripcion);
        this.descripcion = descripcion;

        this.fechaReporte = fechaReporte;

    }

    @Override
    public String toString() {
        return "Error [fechaReporte=" + fechaReporte + "]";
    }

    /**
     *
     * @return
     */
    public String getFechaReporte() {
        return fechaReporte;
    }

    /**
     *
     * @param fechaReporte
     */
    public void setFechaReporte(String fechaReporte) {
        this.fechaReporte = fechaReporte;
    }

}
