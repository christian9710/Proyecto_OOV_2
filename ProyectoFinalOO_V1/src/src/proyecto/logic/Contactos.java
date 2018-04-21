package src.proyecto.logic;

/**
 *
 * 
 * Clase contacto es para implementar el concepto de conctacto en una empresa
 * @author Christian Rodriguez y Brandon Fernandez
 */
public class Contactos {
	




	String tipoContacto, identificacion, nombre, puesto, telefono, correo;
	
   
   
    /**
     *
     * @param tipo
     * @param identificacion
     * @param nombre
     * @param puesto
     * @param telefono
     * @param correo
     */
    public Contactos(String tipo, String identificacion, String nombre, String puesto, String telefono, String correo) {
		this.tipoContacto = tipo;
		this.identificacion = identificacion;
		this.nombre = nombre;
		this.puesto = puesto;
		this.telefono = telefono;
		this.correo = correo;

	}

    /**
     *
     * @return
     */
    public String getTipo() {
		return tipoContacto;
	}

    /**
     *
     * @param tipo
     */
    public void setTipo(String tipo) {
		this.tipoContacto = tipo;
	}

    /**
     *
     * @return
     */
    public String getIdentificacion() {
		return identificacion;
	}

    /**
     *
     * @param identificacion
     */
    public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

    /**
     *
     * @return
     */
    public String getNombre() {
		return nombre;
	}

    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
		this.nombre = nombre;
	}

    /**
     *
     * @return
     */
    public String getPuesto() {
		return puesto;
	}

    /**
     *
     * @param puesto
     */
    public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

    /**
     *
     * @return
     */
    public String getTelefono() {
		return telefono;
	}

    /**
     *
     * @param telefono
     */
    public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

    /**
     *
     * @return
     */
    public String getCorreo() {
		return correo;
	}

    /**
     *
     * @param correo
     */
    public void setCorreo(String correo) {
		this.correo = correo;
	}
    
    	@Override
	public String toString() {
		return "Contactos [tipo=" + tipoContacto + ", identificacion=" + identificacion + ", nombre=" + nombre
				+ ", puesto=" + puesto + ", telefono=" + telefono + ", correo=" + correo + "]";
	}

}
