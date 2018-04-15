/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.proyecto.logic;

import java.sql.*;
import java.util.*;
import src.conection.Conector;

public class multiContactos {

    public Contactos insertContact(String tipo, String identificacion, String nombre, String puesto, String telefono, String correo) throws
            java.sql.SQLException, Exception {
        Contactos conta = null;
        String sql;

        sql = "INSERT INTO contacto "
                + "VALUES ('" + tipo + "','" + identificacion + "','" + nombre + "','" + puesto + "','" + telefono + "','" + correo + "');";

        try {

            Conector.getConector().ejecutarSQL(sql);
            conta = new Contactos(tipo, identificacion, nombre, puesto, telefono, correo);

            //con.close();
        } catch (Exception ex) {
            throw new Exception("El contacto ya ha sido registrado previamente, por favor ingrese otro");
        }
        return conta;
    }

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

}
