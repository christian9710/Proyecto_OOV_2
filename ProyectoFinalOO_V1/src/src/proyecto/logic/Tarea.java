package src.proyecto.logic;

public class Tarea {

	String tipo, codigo, descripcion, estado, responsable;

	public Tarea() {

	}
	
	public Tarea(String tipo, String codigo, String descripcion, String estado, String responsable) {
		this.tipo=tipo;
		this.codigo=codigo;
		this.descripcion=descripcion;
		this.estado=estado;
		this.responsable=responsable;

	}

    public Tarea(String codigo, String descripcion, String estado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getResponsable() {
		return responsable;
	}

	public void setResponsable(String responsable) {
		this.responsable = responsable;
	}
}
