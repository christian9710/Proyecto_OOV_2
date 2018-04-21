   /**
     * Clase para implementar el concepto empresa dado el problema a resolver
     * 
     */

package src.proyecto.logic;

/**
 *
 * @author Christian Rodriguez y Brandon Fernandez
 */
public class Empresa {

   
       
     /**
     *
     * @return
     */
    
    
    Empresa(String nombre, String razonSocial, String cedulaJuridica, String ubicacion, String direccion, String logo, String telefono) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  private  String nombre, razonSocial, cedulaJuridica, ubicacion, direccion, logo, telefono;
  private  Contactos contacto;//listo
  private  Productos producto;//working on it
  private  Instalacion instalacion;//falta

    /**
     *
     * @param nombre
     * @param razonSocial
     * @param cedulaJuridica
     * @param ubicacion
     * @param direccion
     * @param logo
     * @param telefono
     * @param contacto
     * @param producto
     * @param instalacion
     * 
     * Constructor para inicializar las variables globales
     */
    public Empresa(String nombre, String razonSocial, String cedulaJuridica, String ubicacion, String direccion, String logo, String telefono, Contactos contacto, Productos producto, Instalacion instalacion) {
        this.nombre = nombre;
        this.razonSocial = razonSocial;
        this.cedulaJuridica = cedulaJuridica;
        this.ubicacion = ubicacion;
        this.direccion = direccion;
        this.logo = logo;
        this.telefono = telefono;
        this.contacto = contacto;
        this.producto = producto;
        this.instalacion = instalacion;
    }

   

    /**
     *
     * @param razonSocial
     * @param cedulaJuridica
     * @param ubicacion
     * @param direccion
     * @param logo
     * @param telefono
     */
    public Empresa(String razonSocial, String cedulaJuridica, String ubicacion, String direccion, String logo,
            String telefono) {
        this.razonSocial = razonSocial;
        this.cedulaJuridica = cedulaJuridica;
        this.ubicacion = ubicacion;
        this.direccion = direccion;
        this.logo = logo;
        this.telefono = telefono;
    }

    /**
     *
     * @param razonSocial
     * @param cedulaJuridica
     * @param ubicacion
     * @param direccion
     * @param logo
     * @param telefono
     * @param contacto
     * @param producto
     * @param instalacion
     */
    public Empresa(String razonSocial, String cedulaJuridica, String ubicacion, String direccion, String logo,
            String telefono, Contactos contacto, Productos producto, Instalacion instalacion) {
        this.razonSocial = razonSocial;
        this.cedulaJuridica = cedulaJuridica;
        this.ubicacion = ubicacion;
        this.direccion = direccion;
        this.logo = logo;
        this.telefono = telefono;
        this.contacto = contacto;
        this.producto = producto;
        this.instalacion = instalacion;
    }

    /**
     *
     * @param tipo
     * @param identificacion
     * @param nombre
     * @param puesto
     * @param telefono
     * @param correo
     * @throws Exception
     * 
     * Metodo para agregar el objeto contacto
     */
    public void agregarContact(String tipo, String identificacion, String nombre, String puesto, String telefono, String correo) throws Exception {

        Contactos contacto;
        contacto = (new multiContactos()).insertContact(tipo, identificacion, nombre, puesto, telefono, correo, this.getId());
    }

    /**
     *
     * @return
     * 
     * metodo para obtener la razon social
     */
    
    
    public String getRazonSocial() {
        return razonSocial;
    }

    /**
     *
     * @return
     * metodo para obtener la identificacion
     */
    
    
    public String getId() {
        return contacto.getIdentificacion();
    }

    /**
     *
     * @param razonSocial
     * 
     * metodo para setear la razon social
     */
    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    /**
     *
     * @return
     * 
     * metodo para obtener la cedula juridica
     */
    public String getCedulaJuridica() {
        return cedulaJuridica;
    }

    /**
     *
     * @return
     * 
     * metodo para obtener el nombre
     * 
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre
     * 
     * metodo para setear el nombre de la empresa
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @param cedulaJuridica
     * metodo para setaer la cedula juridica
     */
    public void setCedulaJuridica(String cedulaJuridica) {
        this.cedulaJuridica = cedulaJuridica;
    }

    /**
     *
     * @return
     * metodo para obtener la ubicacion
     */
    public String getUbicacion() {
        return ubicacion;
    }

    /**
     *
     * @param ubicacion
     * 
     * metodo para setear la ubicacion
     */
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    /**
     *
     * @return
     * metodo para obtener la direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     *
     * @param direccion
     * 
     * metodo para setear la direccion
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     *
     * @return
     * 
     * metodo para obtener el logo
     */
    public String getLogo() {
        return logo;
    }

    /**
     *
     * @param logo
     * 
     * metodo para setear el logo
     */
    public void setLogo(String logo) {
        this.logo = logo;
    }

    /**
     *
     * @return
     * 
     * metodo para obtener el telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     *
     * @param telefono
     * 
     * metodo para setear el telefono
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     *
     * @return
     */
    public Contactos getContacto() {
        return contacto;
    }

    /**
     *
     * @param contacto
     */
    public void setContacto(Contactos contacto) {
        this.contacto = contacto;
    }

    /**
     *
     * @return
     */
    public Productos getProducto() {
        return producto;
    }

    /**
     *
     * @param producto
     */
    public void setProducto(Productos producto) {
        this.producto = producto;
    }

    /**
     *
     * @return
     */
    public Instalacion getInstalacion() {
        return instalacion;
    }

    /**
     *
     * @param instalacion
     */
    public void setInstalacion(Instalacion instalacion) {
        this.instalacion = instalacion;
    }
    
    
    @Override
    public String toString() {
        return "Empresa{" + "nombre=" + nombre + ", razonSocial=" + razonSocial + ", cedulaJuridica=" + cedulaJuridica + ", ubicacion=" + ubicacion + ", direccion=" + direccion + ", logo=" + logo + ", telefono=" + telefono + ", contacto=" + contacto + ", producto=" + producto + ", instalacion=" + instalacion + '}';
    }

}
