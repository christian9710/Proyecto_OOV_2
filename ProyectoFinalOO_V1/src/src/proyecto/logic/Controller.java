package src.proyecto.logic;

import java.util.logging.Level;
import java.util.logging.Logger;
import src.conection.Conector1;

public class Controller {

    Conector1 cn = new Conector1();

    public Controller() {

    }

    public void registrarEmpresa(String razonSocial, String cedulaJuridica, String ubicacion, String direccion,
            String logo, String telefono) {

        try {
            Empresa em = new Empresa(razonSocial, cedulaJuridica, ubicacion, direccion, logo, telefono);
            cn.insertEmpresa(em);
        } catch (Exception ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void crearContactos(String tipo, String identificacion, String nombre, String puesto, String telefono,
            String correo) {

        try {
            Contactos conta = new Contactos(tipo, identificacion, nombre, puesto, telefono, correo);
            cn.insertContact(conta);
        } catch (Exception ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void crearProductos(String nombre, String logo, String descripcion, String formato,
            CaracteristicasVer caracteristicaVer) {

        try {
            Productos produ = new Productos(nombre, logo, descripcion, formato, caracteristicaVer);
            cn.insertProducto(produ);

        } catch (Exception ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    public void crearInstalacion(String estado, String fecha, String hora, Empresa empresa, Productos producto, Version version,
            Tarea tarea){
    
    
    }
    

    public void crearTarea(String tipo, String codigo, String descripcion, String estado, String responsable) {

        try {
            Tarea tarea = new Tarea(codigo, descripcion, estado);
            cn.insertTareas(tarea);
        } catch (Exception ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    

    public void crearVersion(String formato, CaracteristicasVer caracteristicaVer) {

        try {

            Version version = new Version(formato);
            cn.insertVersion(version);

        } catch (Exception ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void Error(String descripcion, String fecha) throws Exception {

                Error myError ;
               myError =(new MultiError()).insertar(descripcion, fecha);
                
        
    }

    /*
	 * public void crearError(String descripcion, String fechaReporte) {
	 * cl.crearError(descripcion, fechaReporte);
	 * 
	 * }
     */
    // public void crearMejora(String descripcion) {
    // cl.crearMejora(descripcion);
    // }
    //
    // public void crearInstalacion(String estado, String fecha, String hora,
    // Clientes cliente, Productos producto,
    // Version version, Tarea tarea) {
    // cl.crearInstalacion(estado, fecha, hora, cliente, producto, version, tarea);
    // }
    //
    //
    // public String[] getCliente() {
    // return cl.listClientes();
    // }
    //
    // public String[] getContacto() {
    // return cl.listContacto();
    // }
    //
    // public String[] getProductos() {
    // return cl.listProductos();
    // }
    //
    // public String[] getInstalacion() {
    // return cl.listInstalacion();
    // }
    //
    // public void clearProductos() {
    // cl.clearProductos();
    // }
}
