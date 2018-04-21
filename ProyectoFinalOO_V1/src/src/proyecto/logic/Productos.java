package src.proyecto.logic;

/**
 *
 * @author Christian Rodriguez y Brandon Fernandez
 */
public class Productos {

   private String nombre, logo, descripcion;
   private Version version;
    private String numeroVersion;

    /**
     *
     * @param nombre
     * @param logo
     * @param descripcion
     * @param pnumeroVersion
     * 
     * Constructor que inicializa todas las variables  declaradas como private y los objetos
     */
    public Productos(String nombre, String logo, String descripcion, String pnumeroVersion) {
        this.nombre = nombre;
        this.logo = logo;
        this.descripcion = descripcion;
        setNumeroVersion(pnumeroVersion);
        version = null;
    }
    
    /**
     *
     * @param nombre
     * @param logo
     * @param descripcion
     * 
     * Constructor que inicializa las variables que no son objetos
     */
    public Productos(String nombre, String logo, String descripcion) {
        this.nombre = nombre;
        this.logo = logo;
        this.descripcion = descripcion;
        
       
    }

    
    /**
     *
     * @param nombre
     * @param logo
     * @param descripcion
     * @param formato
     * @param caracteristicaVer
     */
    public Productos(String nombre, String logo, String descripcion, String formato, CaracteristicasVer caracteristicaVer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @return
     * 
     * 
     * Metodo para obtener la variable nombre 
     * 
     */
    
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param metodo para inicializar la variable nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @metodo para obtener la variable logo
     */
    public String getLogo() {
        return logo;
    }

    /**
     *
     * @param metodo para setear la variable logo
     */
    public void setLogo(String logo) {
        this.logo = logo;
    }

    /**
     *
     * @return
     * 
     * metodo para obtener la variable descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     *
     * @param  metodo para setear  descripcion
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     *
     * @param version 
     * 
     * metodo para setear el objeto Version
     */
    public void setVersion(Version version) {
        this.version = version;
    }

    /**
     *
     * @return
     * metodo para obtener la variable numero de version
     */
    public String getNumeroVersion() {
        return numeroVersion;
    }

    /**
     *
     * @param pnumeroVersion
     * 
     * 
     * metod para setear la variable numero de version
     */
    public void setNumeroVersion(String pnumeroVersion) {
        numeroVersion = pnumeroVersion;
    }

    /**
     *
     * @return
     * @throws Exception
     * 
     * metodo para obtener el objetdo version
     */
    public Version getVersion() throws Exception {
        if (version == null) {
            setVersion((new multiVersion()).buscar(numeroVersion));

        }
        return version;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Productos{" + "nombre=" + nombre + ", logo=" + logo + ", descripcion=" + descripcion + ", version=" + version + '}';
    }

}
