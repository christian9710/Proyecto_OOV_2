/*
 * Esta clase esta definida para hacer todo el  acceso y salida de datos
 * de la clase Empresa.
 * 
 */
package src.proyecto.logic;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import src.conection.Conector;

/**
 *
 * @author Brandon Fernandez y Christian Rodriguez
 */
public class multiEmpresa {

    /**
     *
     * @param nombre
     * @param razonSocial
     * @param cedulaJuridica
     * @param ubicacion
     * @param direccion
     * @param logo
     * @param telefono
     * @return
     * @throws SQLException
     * @throws Exception
     * 
     * 
     * 
     * 
     * metodo para registrar cada empresa en la base de datos haciendo uso de un string 
     * para escribir codigo sql en este caso un insert
     * 
     */
    public Empresa insertEmpresa(String nombre, String razonSocial, String cedulaJuridica, String ubicacion, String direccion, String logo,
            String telefono) throws
            java.sql.SQLException, Exception {
        Empresa empre = null;
        String id;
        id = null;

        String sql;

        sql = "INSERT INTO empresa "
                + "VALUES ('" + nombre + "','" + razonSocial + "','" + cedulaJuridica + "','" + ubicacion + "','" + direccion + "','" + logo + "','" + telefono + "');";

        try {

            Conector.getConector().ejecutarSQL(sql);
            empre = new Empresa(nombre, razonSocial, cedulaJuridica, ubicacion, direccion, logo, telefono);

            //con.close();
        } catch (Exception ex) {

            throw new Exception("La empresa ya ha sido registrado previamente, por favor ingrese otro dato");

        }
        return empre;
    }

    /**
     *
     * @param razonSocial
     * @return
     * @throws SQLException
     * @throws Exception
     * 
     * 
     * 
     * Metodo para buscar cada Empresa en la base de datos 
     * mediante una razon social proporcionada por el usuario.
     */
    public Empresa buscar(String razonSocial) throws
            java.sql.SQLException, Exception {
        Empresa empre = null;
        java.sql.ResultSet rs;
        String sql;
        sql = "SELECT nombre,razonSocial, cedulaJuridica, ubicacion, direccion, logo, telefono "
                + "FROM empresa "
                + "WHERE razonSocial='" + razonSocial + "';";
        rs = Conector.getConector().ejecutarSQL(sql, true);
        if (rs.next()) {
            empre = new Empresa(
                    rs.getString("nombre"),
                    rs.getString("razonSocial"),
                    rs.getString("cedulaJuridica"),
                    rs.getString("ubicacion"),
                    rs.getString("direccion"),
                    rs.getString("logo"),
                    rs.getString("telefono"));
        } else {
            throw new Exception("La empresa no se ha registrado");
        }
        rs.close();
        return empre;
    }

    /**
     *
     * @param empre
     * @throws SQLException
     * @throws Exception
     * 
     * MÃ©todo para actualizar una Empresa ,se recibe el objeto empresa
     * como parametro ,para despuÃ©s descomponerlo con los mÃ©todos get.
     * El parametro Empresa es enviado desde la clase controller.
     */
    public void actualizarEmpresa(Empresa empre) throws
            java.sql.SQLException, Exception {
        String sql;
        sql = "UPDATE empresa "
                + "nombre='" + empre.getNombre() + "',"
                + "razonSocial=" + empre.getRazonSocial() + ", "
                + "cedulaJuridica='" + empre.getCedulaJuridica() + "', "
                + "ubicacion='" + empre.getUbicacion() + "', "
                + "direccion='" + empre.getDireccion() + "', "
                + "logo='" + empre.getLogo() + "', "
                + "telefono='" + empre.getTelefono() + "' "
                + "WHERE cedulaJuridica='" + empre.getCedulaJuridica() + "';";
        try {
            Conector.getConector().ejecutarSQL(sql);
        } catch (Exception e) {
            throw new Exception("No se logro actualizar.");
        }
    }

    /**
     *
     * @param empre
     * @throws SQLException
     * @throws Exception
     * 
     * Metodo para borrar una empresa 
     * se hace uso de codigo sql empleado en un string para hacer un delete en
     * base de datos.
     */
    public void borrar(Empresa empre) throws
            java.sql.SQLException, Exception {
        java.sql.ResultSet rs;
        String sql;
        sql = "DELETE FROM empresa "
                + "WHERE razonSocial='" + empre.getRazonSocial() + "';";
        try {
            Conector.getConector().ejecutarSQL(sql);
        } catch (Exception e) {
            throw new Exception("No se ha realizado la limpieza de la tabla");
        }
    }

    /**
     *
     * 
     * Metodo para listar una empresa en este metodo se hace uso de una coleccion
     * llamada map para colocar cada dato como si fuera un campo de una matriz
     * 
     */
    public static void listEmpresa() {
        try {

            String sql;
            java.sql.ResultSet rs;

            sql = "SELECT * FROM empresa";
            rs = Conector.getConector().ejecutarSQL(sql, true);
            List<Map<String, String>> listEmpresa = new ArrayList<>();
            while (rs.next()) {

                Map<String, String> dicContacto = new HashMap<>();
                dicContacto.put("nombre", rs.getString("nombre"));
                dicContacto.put("razonSocial", rs.getString("razonSocial"));
                dicContacto.put("cedulaJuridica", rs.getString("cedulaJuridica"));
                dicContacto.put("ubicacion", rs.getString("ubicacion"));
                dicContacto.put("direccion", rs.getString("direccion"));
                dicContacto.put("logo", rs.getString("logo"));
                dicContacto.put("telefonos", rs.getString("telefonos"));
                listEmpresa.add(dicContacto);
                //System.out.println(rs.getString("listEmpresa"));
                
                for (Map<String, String> map : listEmpresa) {
                    System.out.println(rs.getString("nombre"));
                    System.out.println(rs.getString("razonSocial"));
                    System.out.println(rs.getString("cedulaJuridica"));
                    System.out.println(rs.getString("ubicacion"));
                    System.out.println(rs.getString("direccion"));
                    System.out.println(rs.getString("logo"));
                    System.out.println(rs.getString("telefonos"));
                    
                }
           
            }
            String prueba = "it works!!";
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        
        

    }

}
