package src.proyecto.logic;

import java.util.logging.Level;
import java.util.TreeMap;
import java.util.logging.Logger;
import javafx.scene.control.TextField;

public class Controller {

    public void addContac(String tipo, String identificacion, String nombre, String puesto, String telefono, String correo) {//Ingresar contactos
        try {
            Contactos conta;
            conta = (new multiContactos().insertContact(tipo, identificacion, nombre, puesto, telefono, correo));

        } catch (Exception e) {
        }

    }

    public TreeMap contactBuscar(String identificacion) throws Exception {//buscar  contactos por cedula
        TreeMap datos = null;
        Contactos conta = null;
        String nombre;
        datos = new TreeMap();
        conta = (new multiContactos()).buscar(identificacion);
        datos.put("nombre", conta.getNombre());
        datos.put("identificacion", conta.getIdentificacion());

        return datos;
    }

    public void contacActuali(String tipo, String identificacion, String nombre, String puesto, String telefono, String correo) throws Exception {
        Contactos conta;
        conta = (new multiContactos()).buscar(identificacion);
        conta.setTipo(tipo);
        conta.setNombre(nombre);
        conta.setIdentificacion(identificacion);
        conta.setPuesto(puesto);
        conta.setTelefono(telefono);
        conta.setCorreo(correo);
        (new multiContactos()).actualizarContacto(conta);
    }

    public void contacClear(String pidCliente) throws Exception {
        Contactos conta;
        conta = (new multiContactos()).buscar(pidCliente);
        (new multiContactos()).borrar(conta);
    }

    public void Error(String descripcion, String fecha) throws Exception {

        Error myError;
        myError = (new MultiError()).insertar(descripcion, fecha);

    }

    public void addEmpresa(String nombre, String razonSocial, String cedulaJuridica, String ubicacion, String direccion, String logo,
            String telefono) {//Ingresar contactos
        try {
            Empresa empre;
            empre = (new multiEmpresa().insertEmpresa(nombre,razonSocial, cedulaJuridica, ubicacion, direccion, logo, telefono));

        } catch (Exception e) {
        }
    }

    public TreeMap empretBuscar(String razonSocial) throws Exception {//buscar  contactos por cedula
        TreeMap datos = null;
        Empresa empre = null;
        String nombre;
        datos = new TreeMap();
        empre = (new multiEmpresa()).buscar(razonSocial);
        datos.put("nombre", empre.getRazonSocial());
        datos.put("identificacion", empre.getRazonSocial());

        return datos;
    }

    public void empreActua(String razonSocial, String cedulaJuridica, String ubicacion, String direccion, String logo,
            String telefono) throws Exception {
        Empresa empre;
        empre = (new multiEmpresa()).buscar(razonSocial);
        empre.setRazonSocial(razonSocial);
        empre.setCedulaJuridica(cedulaJuridica);
        empre.setUbicacion(ubicacion);
        empre.setDireccion(direccion);
        empre.setLogo(logo);
        empre.setTelefono(telefono);
        (new multiEmpresa()).actualizarEmpresa(empre);
    }

    public void empreClear(String razonSocial) throws Exception {
        Empresa empre;
        empre = (new multiEmpresa()).buscar(razonSocial);
        (new multiEmpresa()).borrar(empre);
    }

    //ingresar listar aqui
    public void listEmpre() {
        multiEmpresa.listEmpresa();
    }
    
    public void listProducto() throws Exception {
      multiProducto.listarProducto();
            
      }
    
    public void listContact() throws Exception {
      multiContactos.listContact();
            
      }
    
      public void listInsta() throws Exception {
          try {
              MultiIntalacion.listarInstalacion();
          } catch (Exception e) {
          }
            
      }

    public void crearVersion(String formato, String fecha) throws Exception {
        Version miVersion;
        miVersion = (new multiVersion()).crearVersion(formato, fecha);
    }

    public TreeMap buscarVersion(String formato) throws Exception {
        TreeMap datos = null;
        Version ver = null;
        String nombre;
        datos = new TreeMap();
        ver = (new multiVersion()).buscar(formato);
        datos.put("formato", ver.getFormato());
        datos.put("fechaCreacion", ver.getFechaCreacion());

        return datos;
    }

    public void VersionClear(String formato) throws Exception {
        Version miVersion;
        miVersion = (new multiVersion()).buscar(formato);
        (new multiVersion()).borrar(miVersion);
    }

    public void VersionActu(String formato, String fecha) throws Exception {
        Version miVersion;

        miVersion = (new multiVersion()).buscar(formato);
        miVersion.setFormato(formato);
        miVersion.setFechaCreacion(fecha);
        (new multiVersion()).actualizarVersion(miVersion);
    }

    public void agregarContacEmpre(String tipo, String identificacion, String nombre, String puesto, String _telefono, String correo,String _nombre,
            String razonSocial, String cedulaJuridica, String ubicacion, String direccion, String logo, String telefono
    ) throws Exception {
        Empresa empre_contac;
        empre_contac = (new multiEmpresa()).insertEmpresa(_nombre,razonSocial, cedulaJuridica, ubicacion, direccion, logo, telefono);
        empre_contac.agregarContact(tipo, identificacion, nombre, puesto, telefono, correo);
    }

    public void addInsta(String estado, String fecha, String hora) {//Ingresar contactos
        try {
            Instalacion insta;
            insta = (new MultiIntalacion().insertInstalacion(estado, fecha, hora));

        } catch (Exception e) {
        }

    }

    public TreeMap buscarInsta(String estado) throws Exception {
        TreeMap datos = null;
        Instalacion insta = null;

        datos = new TreeMap();
        insta = (new MultiIntalacion()).buscar(estado);
        datos.put("estado", insta.getEstado());
        datos.put("fecha", insta.getFecha());
        datos.put("hora", insta.getHora());

        return datos;
    }

    public void instaClear(String estado) throws Exception {
        Instalacion insta;
        insta = (new MultiIntalacion()).buscar(estado);
        (new MultiIntalacion()).borrar(insta);
    }

    public void instaAct(String estado,String fecha,String  hora) throws Exception {
           Instalacion insta;
        insta = (new MultiIntalacion()).buscar(estado);

        insta.setEstado(estado);
        insta.setFecha(fecha);
        insta.setHora(hora);

        (new MultiIntalacion()).actualizarInstalacion(insta);
    }

    public void agregarProducto(String nombre, String logo, String descripcion) throws Exception {
        Productos miProducto;
        miProducto = (new multiProducto()).agregarProducto(nombre, logo, descripcion);
    }

    public TreeMap buscarProducto(String nombre) throws Exception {
        TreeMap datos = null;
        Productos produc = null;

        datos = new TreeMap();
        produc = (new multiProducto()).buscar(nombre);
        datos.put("nombre", produc.getNombre());
        datos.put("logo", produc.getLogo());
        datos.put("descripcion", produc.getDescripcion());

        return datos;
    }

    public void produClear(String nombre) throws Exception {
        Productos miProductos;
        miProductos = (new multiProducto()).buscar(nombre);
        (new multiProducto()).borrar(miProductos);
    }

    public void productAct(String nombre, String logo, String descripcion) throws Exception {
        Productos miProductos;
        miProductos = (new multiProducto()).buscar(nombre);

        miProductos.setNombre(nombre);
        miProductos.setLogo(logo);
        miProductos.setDescripcion(descripcion);

        (new multiProducto()).actualizarProducto(miProductos);
    }

    public void addTareas(String tipo, String codigo, String descripcion, String estado, String responsable) throws Exception {
        Tarea miTarea;
        miTarea = (new multiTarea()).agregarTarea(tipo, codigo, descripcion, estado, responsable);
    }

    public void tareaAc(String codigo, String estado) throws Exception {
        Tarea miTarea;
        miTarea = (new multiTarea()).buscarTarea(codigo);

        miTarea.setCodigo(codigo);
        miTarea.setEstado(estado);

        (new multiTarea()).actualizarTareaEstado(miTarea);
    }

    

}
