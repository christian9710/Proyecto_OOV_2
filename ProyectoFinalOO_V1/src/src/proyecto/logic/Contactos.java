package src.proyecto.logic;

public class Contactos {
	//brando

	@Override
	public String toString() {
		return "Contactos [tipo=" + tipoContacto + ", identificacion=" + identificacion + ", nombre=" + nombre
				+ ", puesto=" + puesto + ", telefono=" + telefono + ", correo=" + correo + "]";
	}

	String tipoContacto, identificacion, nombre, puesto, telefono, correo;

	public Contactos() {

	}

	public Contactos(String tipo, String identificacion, String nombre, String puesto, String telefono, String correo) {
		this.tipoContacto = tipo;
		this.identificacion = identificacion;
		this.nombre = nombre;
		this.puesto = puesto;
		this.telefono = telefono;
		this.correo = correo;

	}

	public String getTipo() {
		return tipoContacto;
	}

	public void setTipo(String tipo) {
		this.tipoContacto = tipo;
	}

	public String getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

}
