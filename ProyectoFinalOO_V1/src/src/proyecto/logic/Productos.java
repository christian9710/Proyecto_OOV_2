package src.proyecto.logic;

public class Productos {



	String nombre, logo, descripcion;
	Version version;

	public Productos(String nombre, String logo, String descripcion, Version version) {
		this.nombre = nombre;
		this.logo = logo;
		this.descripcion = descripcion;
		this.version = version;
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

	public Version getVersion() {
		return version;
	}

    @Override
    public String toString() {
        return "Productos{" + "nombre=" + nombre + ", logo=" + logo + ", descripcion=" + descripcion + ", version=" + version + '}';
    }

	public void setVersion(Version version) {
		this.version = version;
	}

}
