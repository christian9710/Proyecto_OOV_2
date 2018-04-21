/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.proyecto.logic;

import java.sql.*;
import java.util.*;
import src.conection.Conector;


/***
 * 
 * @author Brandon y CHristian
 */


public class multiContactos {

    /**
     *
     * @param tipo
     * @param identificacion
     * @param nombre
     * @param puesto
     * @param telefono
     * @param correo
     * @return
     * @throws SQLException
     * @throws Exception
     */
    public Contactos insertContact(String tipo, String identificacion, String nombre, String puesto, String telefono, String correo) throws
            java.sql.SQLException, Exception {
        String id=null;
        Contactos conta = null;
        String sql;

        sql = "INSERT INTO contacto "
                + "VALUES ('" + tipo + "','" + identificacion + "','" + nombre + "','" + puesto + "','" + telefono + "','" + correo + "');";

        try {

            Conector.getConector().ejecutarSQL(sql);
            conta = new Contactos(tipo, identificacion, nombre, puesto, telefono, correo);

            //con.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            throw new Exception("El contacto ya ha sido registrado previamente, por favor ingrese otro");
        }
        return conta;
    }

    /**
     *
     * @param identificacion
     * @return
     * @throws SQLException
     *  
     * @throws Exception
     * Metodo para buscar cada contacto ,se declara una variable de resultSet
     */
    public Contactos buscar(String identificacion) throws
            java.sql.SQLException, Exception {
        Contactos conta = null;
        java.sql.ResultSet rs;
        String sql;
        sql = "SELECT tipo,identificacion,nombre,puesto,telefono,correo "
                + "FROM contacto "
                + "WHERE identificacion='" + identificacion + "';";
        rs = Conector.getConector().ejecutarSQL(sql, true);
        if (rs.next()) {
            conta = new Contactos(
                    rs.getString("tipo"),
                    rs.getString("identificacion"),
                    rs.getString("nombre"),
                    rs.getString("puesto"),
                    rs.getString("telefono"),
                    rs.getString("correo"));
        } else {
            throw new Exception("El contacto no se ha registrado");
        }
        rs.close();
        return conta;
    }

    /**
     *
     * @param contacto
     * @throws SQLException
     * @throws Exception
     * metodo para borrar cada contacto
     */
    public void borrar(Contactos contacto) throws
            java.sql.SQLException, Exception {
        java.sql.ResultSet rs;
        String sql;
        sql = "DELETE FROM contacto "
                + "WHERE identificacion='" + contacto.getIdentificacion() + "';";
        try {
            Conector.getConector().ejecutarSQL(sql);
        } catch (Exception e) {
            throw new Exception("No se ha realizado la limpieza de la tabla");
        }
    }

    /**
     *
     * @param contacto
     * @throws SQLException
     * @throws Exception
     * 
     * Metodo para hacer update del objeto contacto
     */
    public void actualizarContacto(Contactos contacto) throws
            java.sql.SQLException, Exception {
        String sql;
        sql = "UPDATE contacto "
                + "SET tipo=" + contacto.getTipo() + ", "
                + "identificacion='" + contacto.getIdentificacion() + "', "
                + "nombre='" + contacto.getNombre() + "', "
                + "puesto='" + contacto.getPuesto() + "', "
                + "telefono='" + contacto.getTelefono() + "', "
                + "correo='" + contacto.getCorreo() + "' "
                + "WHERE identificacion='" + contacto.getIdentificacion() + "';";
        try {
            Conector.getConector().ejecutarSQL(sql);
        } catch (Exception e) {
            throw new Exception("No se logro actualizar.");
        }
    }

    Contactos insertContact(String tipo, String identificacion, String nombre, String puesto, String telefono, String correo, String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *Metodo para listar el objeto contacto 
     * por medio de una consulta a la base de datos
     */
    public static void listContact() {
        try {

            String sql;
            java.sql.ResultSet rs;
            sql = "SELECT * FROM contacto";
            rs = Conector.getConector().ejecutarSQL(sql, true);
            List<Map<String, String>> listContacto = new ArrayList<>();
            while (rs.next()) {

                Map<String, String> dicContacto = new HashMap<>();
                dicContacto.put("tipo", rs.getString("tipo"));
                dicContacto.put("identificacion", rs.getString("identificacion"));
                dicContacto.put("nombre", rs.getString("nombre"));
                dicContacto.put("puesto", rs.getString("puesto"));
                dicContacto.put("telefono", rs.getString("telefono"));
                dicContacto.put("correo", rs.getString("correo"));
               // System.out.println(rs.getString("listContacto"));

                listContacto.add(dicContacto);
            }
            String prueba = "it works!!";
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }
}
