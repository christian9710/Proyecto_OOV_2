package src.proyecto.logic;


public class CaracteristicasVer {

	@Override
	public String toString() {
		return "CaracteristicasVer [descripcion=" + descripcion + ", miError=" + miError + ", miMejora=" + miMejora
				+ "]";
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Error getMiError() {
		return miError;
	}

	public void setMiError(Error miError) {
		this.miError = miError;
	}

	public Mejora getMiMejora() {
		return miMejora;
	}

	public void setMiMejora(Mejora miMejora) {
		this.miMejora = miMejora;
	}

	String descripcion;
	private Error miError;
	private Mejora miMejora;

	public CaracteristicasVer(Error miError, Mejora miMejora) {
		this.miError = miError;
		this.miMejora = miMejora;
	}

	public CaracteristicasVer(String descripcion) {
		this.descripcion = descripcion;

	}

}
