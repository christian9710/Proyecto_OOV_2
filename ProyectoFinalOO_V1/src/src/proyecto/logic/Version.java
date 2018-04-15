package src.proyecto.logic;

public class Version {

	String formato;
	CaracteristicasVer caracteristicaVer;

	
	public Version(String formato, CaracteristicasVer caracteristicaVer) {
		this.formato=formato;
		this.caracteristicaVer=caracteristicaVer;
	}
	public Version() {

	}

    public Version(String formato) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
	
	public String getFormato() {
		return formato;
	}
	public void setFormato(String formato) {
		this.formato = formato;
	}
	public CaracteristicasVer getCaracteristicaVer() {
		return caracteristicaVer;
	}
	public void setCaracteristicaVer(CaracteristicasVer caracteristicaVer) {
		this.caracteristicaVer = caracteristicaVer;
	}
	
	@Override
	public String toString() {
		return "Version [formato=" + formato + ", caracteristicaVer=" + caracteristicaVer + "]";
	}
	

	
}

