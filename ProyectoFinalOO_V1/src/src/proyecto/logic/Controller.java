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

}

    public void Error(String descripcion, String fecha) throws Exception {

                Error myError ;
               myError =(new MultiError()).insertar(descripcion, fecha);
                
        
    }

   
}
