package src.proyecto.logic;

/**
 *
 * @author Christian Rodriguez y Brandon Fernandez
 */
public class Tarea {

	String tipo, codigo, descripcion, estado, responsable;

    /**
     *
     */
    public Tarea() {

	}
	
    /**
     *
     * @param tipo
     * @param codigo
     * @param descripcion
     * @param estado
     * @para 
     * Metodo para iniicializar todos las variables
     */
    public Tarea(String tipo, String codigo, String descripcion, String estado, String responsable) {
		this.tipo=tipo;
		this.codigo=codigo;
		this.descripcion=descripcion;
		this.estado=estado;
		this.responsable=responsable;

	}

    /**
     *
     * @param codigo
     * @param descripcion
     * @param estado
     * 
     * 
     */
    public Tarea(String codigo, String descripcion, String estado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @return
     * 
     * Metodo para obtener el tipo
     */
    public String getTipo() {
		return tipo;
	}

    /**
     *
     * @param tipo
     * 
     * Metodo para setear el tipo
     */
    public void setTipo(String tipo) {
		this.tipo = tipo;
	}

    /**
     *
     * @return
     * 
     * metodo para obtener el codigo
     */
    public String getCodigo() {
		return codigo;
	}

    /**
     *
     * @param codigo
     * 
     * metodo para setear el codigo
     */
    public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

    /**
     *
     * @return
     * 
     * Metod para obtener la descripcion
     */
    public String getDescripcion() {
		return descripcion;
	}

    /**
     *
     * @param descripcion
     * 
     * metodo para setear la descripcion
     */
    public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

    /**
     *
     * @return
     * metodo para obtener el estado 
     */
    public String getEstado() {
		return estado;
	}

    /**
     *
     * @param estado
     * 
     * metodo para setear el estado 
     */
    public void setEstado(String estado) {
		this.estado = estado;
	}

    /**
     *
     * @return
     * 
     * metod para obtener el responsable
     */
    public String getResponsable() {
		return responsable;
	}

    /**
     *
     * @param responsable
     * 
     * metodo para setear el responsable
     */
    public void setResponsable(String responsable) {
		this.responsable = responsable;
	}
}
