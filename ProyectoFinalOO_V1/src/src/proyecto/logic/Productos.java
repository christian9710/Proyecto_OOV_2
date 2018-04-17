package src.proyecto.logic;

public class Productos {

    String nombre, logo, descripcion;
    Version version;
    private String numeroVersion;

    public Productos(String nombre, String logo, String descripcion, String pnumeroVersion) {
        this.nombre = nombre;
        this.logo = logo;
        this.descripcion = descripcion;
        setNumeroVersion(pnumeroVersion);
        version = null;
    }
    
       public Productos(String nombre, String logo, String descripcion) {
        this.nombre = nombre;
        this.logo = logo;
        this.descripcion = descripcion;
        
       
    }


    public Productos() {

    }
    
      public Productos(String nombre, String logo, String descripcion, String formato, CaracteristicasVer caracteristicaVer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setVersion(Version version) {
        this.version = version;
    }

    public String getNumeroVersion() {
        return numeroVersion;
    }

    public void setNumeroVersion(String pnumeroVersion) {
        numeroVersion = pnumeroVersion;
    }

    public Version getVersion() throws Exception {
        if (version == null) {
            setVersion((new multiVersion()).buscar(numeroVersion));

        }
        return version;
    }

    @Override
    public String toString() {
        return "Productos{" + "nombre=" + nombre + ", logo=" + logo + ", descripcion=" + descripcion + ", version=" + version + '}';
    }

}
