package src.proyecto.logic;

import java.util.logging.Level;
import java.util.TreeMap;
import java.util.logging.Logger;

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

    public void contacActuali(String identificacion, String nombre) throws Exception {
        Contactos conta;
        conta = (new multiContactos()).buscar(identificacion);
        conta.setNombre(nombre);
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

    public void addEmpresa(String razonSocial, String cedulaJuridica, String ubicacion, String direccion, String logo,
            String telefono) {//Ingresar contactos
        try {
            Empresa empre;
            empre = (new multiEmpresa().insertEmpresa(razonSocial, cedulaJuridica, ubicacion, direccion, logo, telefono));

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

    public void agregarContacEmpre(String tipo, String identificacion, String nombre, String puesto, String _telefono, String correo,
             String razonSocial, String cedulaJuridica, String ubicacion, String direccion, String logo, String telefono
    ) throws Exception {
        Empresa empre_contac;
        empre_contac = (new multiEmpresa()).insertEmpresa(razonSocial, cedulaJuridica, ubicacion, direccion, logo, telefono);
        empre_contac.agregarContact(tipo, identificacion, nombre, puesto, telefono, correo);
    }
}
