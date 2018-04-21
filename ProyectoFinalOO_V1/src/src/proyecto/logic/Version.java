package src.proyecto.logic;

/**
 *
 * @author Brandon Fernadez y Christian Rodriguez
 */
public class Version {

    private String formato, fechaCreacion;

    /**
     *
     * @param formato
     * @param fechaCreacion
     * @param caracteristicaVer
     *
     * Constructor para inicializar los parametos,en este caso se inicializa el
     * objeto
     */
    public Version(String formato, String fechaCreacion, CaracteristicasVer caracteristicaVer) {
        this.formato = formato;
        this.fechaCreacion = fechaCreacion;
        this.caracteristicaVer = caracteristicaVer;
    }

    Version(String formato, String fechaCreacion) {
        this.formato = formato;
        this.fechaCreacion = fechaCreacion;
    }

    /**
     *
     * @return
     */
    public String getFechaCreacion() {
        return fechaCreacion;
    }

    /**
     *
     * @param fechaCreacion
     */
    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    CaracteristicasVer caracteristicaVer;

    /**
     *
     */
    public Version() {

    }

    /**
     *
     * @param formato
     */
    public Version(String formato) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @return
     */
    public String getFormato() {
        return formato;
    }

    /**
     *
     * @param formato
     */
    public void setFormato(String formato) {
        this.formato = formato;
    }

    /**
     *
     * @return
     */
    public CaracteristicasVer getCaracteristicaVer() {
        return caracteristicaVer;
    }

    /**
     *
     * @param caracteristicaVer
     */
    public void setCaracteristicaVer(CaracteristicasVer caracteristicaVer) {
        this.caracteristicaVer = caracteristicaVer;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Version{" + "formato=" + formato + ", fechaCreacion=" + fechaCreacion + ", caracteristicaVer=" + caracteristicaVer + '}';
    }

}
