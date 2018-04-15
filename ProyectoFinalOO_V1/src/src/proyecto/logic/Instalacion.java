package src.proyecto.logic;

public class Instalacion {

    String estado, fecha, hora;
    Empresa empresas;
    Productos producto;
    Version version;
    Tarea tarea;

    public Instalacion() {

    }

    public Instalacion(String estado, String fecha, String hora, Empresa empresa, Productos producto, Version version,
            Tarea tarea) {
        this.estado = estado;
        this.fecha = fecha;
        this.hora = hora;
        this.empresas = empresa;
        this.producto = producto;
        this.version = version;
        this.tarea = tarea;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Empresa getEmpresas() {
        return empresas;
    }

    public void setEmpresas(Empresa empresas) {
        this.empresas = empresas;
    }

    public Productos getProducto() {
        return producto;
    }

    public void setProducto(Productos producto) {
        this.producto = producto;
    }

    public Version getVersion() {
        return version;
    }

    public void setVersion(Version version) {
        this.version = version;
    }

    public Tarea getTarea() {
        return tarea;
    }

    public void setTarea(Tarea tarea) {
        this.tarea = tarea;
    }
    
    public void agregarEmpresa(String razonSocial, String cedulaJuridica, String ubicacion, String direccion, String logo,
            String telefono){
    
    
    }

}
