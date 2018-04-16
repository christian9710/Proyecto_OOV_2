package src.proyecto.logic;

public class Error extends CaracteristicasVer {

    @Override
    public String toString() {
        return "Error [fechaReporte=" + fechaReporte + "]";
    }

    static String descripcion;
    String fechaReporte;

    public Error() {
        super(descripcion);

    }

    public Error(String descripcion, String fechaReporte) {
        super(descripcion);

        this.fechaReporte = fechaReporte;

    }

    public String getFechaReporte() {
        return fechaReporte;
    }

    public void setFechaReporte(String fechaReporte) {
        this.fechaReporte = fechaReporte;
    }

}
