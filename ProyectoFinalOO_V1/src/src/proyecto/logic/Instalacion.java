package src.proyecto.logic;

import static src.proyecto.logic.Error.descripcion;

public class Instalacion {

    String estado, fecha, hora;
    Empresa empresas;
    Productos producto;
    Version version;
    Tarea tarea;

    public Instalacion() {

    }

    public Instalacion(String estado, String fecha, String hora) {
        this.estado = estado;
        this.fecha = fecha;
        this.hora = hora;

    }

    public void agregarTarea_Insta(String tipo, String codigo, String descripcion, String estado, String responsable) throws Exception {

        Tarea tarea;
        tarea = (new multiTarea()).agregarTarea(tipo, codigo, descripcion, estado, responsable, this.getId());
    }

    public void agregarEmpresa(String razonSocial, String cedulaJuridica, String ubicacion, String direccion, String logo,
            String telefono) {
        Empresa myEmpresa = new Empresa();

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

    public String getId() {
        return tarea.getEstado();
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

    public void agregarProducto(String nombre, String logo, String descripcion, Version version) {

    }

}
