package src.proyecto.logic;

import static src.proyecto.logic.Error.descripcion;

/**
 *
 * @author christian Rodriguez y Brandon Fernandez
 */
public class Instalacion {

    String estado, fecha, hora;
    Empresa empresas;
    Productos producto;
    Version version;
    Tarea tarea;

    /**
     *
     */
    /**
     *
     * @param estado
     * @param fecha
     *
     * @param hora
     *
     * Metodo para inicializar cada varibale
     */
    public Instalacion(String estado, String fecha, String hora) {
        this.estado = estado;
        this.fecha = fecha;
        this.hora = hora;

    }

    /**
     *
     * @param tipo
     * @param codigo
     * @param descripcion
     * @param estado
     * @param responsable
     * @throws Exception
     * 
     * metodo para agregar una tarea
     */
    public void agregarTarea_Insta(String tipo, String codigo, String descripcion, String estado, String responsable) throws Exception {

        Tarea tarea;
        tarea = (new multiTarea()).agregarTarea(tipo, codigo, descripcion, estado, responsable, this.getId());
    }

    /**
     *
     * @param razonSocial
     * @param cedulaJuridica
     * @param ubicacion
     * @param direccion
     * @param logo
     * @param telefono
     * @throws Exception
     * 
     * metodo para agragar una empresa a la instalacion
     */
    public void agregarEmpresa(String razonSocial, String cedulaJuridica, String ubicacion, String direccion, String logo,
            String telefono) throws Exception {
        Empresa empre;

        empre = (new multiEmpresa().insertEmpresa(hora, razonSocial, cedulaJuridica, ubicacion, direccion, logo, telefono));

    }

    /**
     *
     * @param estado
     * @param fecha
     * @param hora
     * @param empresa
     * @param producto
     * @param version
     * @param tarea
     * 
     * constructo de instalacion
     */
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

    /**
     *
     * @return
     */
    public String getEstado() {
        return estado;
    }

    /**
     *
     * @return
     */
    public String getId() {
        return tarea.getEstado();
    }

    /**
     *
     * @param estado
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     *
     * @return
     */
    public String getFecha() {
        return fecha;
    }

    /**
     *
     * @param fecha
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     *
     * @return
     */
    public String getHora() {
        return hora;
    }

    /**
     *
     * @param hora
     */
    public void setHora(String hora) {
        this.hora = hora;
    }

    /**
     *
     * @return
     */
    public Empresa getEmpresas() {
        return empresas;
    }

    /**
     *
     * @param empresas
     */
    public void setEmpresas(Empresa empresas) {
        this.empresas = empresas;
    }

    /**
     *
     * @return
     */
    public Productos getProducto() {
        return producto;
    }

    /**
     *
     * @param producto
     */
    public void setProducto(Productos producto) {
        this.producto = producto;
    }

    /**
     *
     * @return
     */
    public Version getVersion() {
        return version;
    }

    /**
     *
     * @param version
     */
    public void setVersion(Version version) {
        this.version = version;
    }

    /**
     *
     * @return
     */
    public Tarea getTarea() {
        return tarea;
    }

    /**
     *
     * @param tarea
     */
    public void setTarea(Tarea tarea) {
        this.tarea = tarea;
    }

    /**
     *
     * @param nombre
     * @param logo
     * @param descripcion
     * @param version
     */
    public void agregarProducto(String nombre, String logo, String descripcion, Version version) {

    }

}
