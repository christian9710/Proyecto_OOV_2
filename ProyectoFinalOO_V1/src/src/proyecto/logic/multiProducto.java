/*
 *Esta clase esta definida para hacer toda  acceso y salida de datos
 * de la clase producto.
 * and open the template in the editor.
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
 * @author  Brandon Fernandez y Christian Rodriguez
 */
public class multiProducto {

    /**
     *
     * @param nombre
     * @param logo
     * @param descripcion
     * @return
     * @throws Exception
     * 
     * 
     * 
     * Metodo para agregar cada producto en este metodo se reciben los atributos de la clase producto
     * para registrarlos  como un producto en la base de datos
     */
    
    
    public Productos agregarProducto(String nombre, String logo, String descripcion) throws Exception {
        String sql;
        Productos miProducto = null;

        sql = "INSERT INTO producto "
                + "(nombre,logo,descripcion)"
                + "VALUES( '" + nombre + "','" + logo + "','" + descripcion + "')";

        try {

            Conector.getConector().ejecutarSQL(sql);
            miProducto = new Productos(nombre, logo, descripcion);
        } catch (Exception ex) {
           System.out.println(ex.getMessage());
            throw new Exception("Se agregÃ³ correctamente");

        }

        return miProducto;
    }

    /**
     *
     * @param nombre
     * @return
     * @throws SQLException
     * @throws Exception
     * 
     * 
     * El metodo buscar ,es usado para busar cada producto 
     * en la base de datos mediante el nombre recibido como parametro.
     */
    public Productos buscar(String nombre) throws
            java.sql.SQLException, Exception {
        Productos prod = null;
        java.sql.ResultSet rs;
        String sql;
        sql = "SELECT nombre,logo,descripcion"
                + "FROM producto "
                + "WHERE nombre='" + nombre + "';";
        rs = Conector.getConector().ejecutarSQL(sql, true);
        if (rs.next()) {
            prod = new Productos(
                    rs.getString("nombre"),
                    rs.getString("logo"),
                    rs.getString("descripcion"));

        } else {
            throw new Exception("El producto no se ha registrado");
        }
        rs.close();
        return prod;
    }

    /**
     *
     * @param miProduc
     * @throws SQLException
     * @throws Exception
     * 
     * Metodo para borrar cada producto en la base de datos.
     */
    public void borrar(Productos miProduc) throws
            java.sql.SQLException, Exception {
        java.sql.ResultSet rs;
        String sql;
        sql = "DELETE FROM producto "
                + "WHERE nombre='" + miProduc.getNombre() + "';";
        try {
            Conector.getConector().ejecutarSQL(sql);
        } catch (Exception e) {
            throw new Exception("No se ha realizado la limpieza de la tabla");
        }
    }

    /**
     *
     * @param pro
     * @throws SQLException
     * @throws Exception
     * 
     * Metodo para actualizar cada producto 
     * se usa para hacer un update en la base de datos.
     */
    public void actualizarProducto(Productos pro) throws
            java.sql.SQLException, Exception {
        String sql;
        sql = "UPDATE producto "
                + "SET logo=" + pro.getLogo() + ", "
                + "descripcion='" + pro.getDescripcion() + "', "
                + "WHERE nombre='" + pro.getNombre() + "';";
        try {
            Conector.getConector().ejecutarSQL(sql);
        } catch (Exception e) {
            throw new Exception("No se logro actualizar.");
        }
    }

    /**
     *
     * @throws Exception
     * 
     * Metodo para listar producto se hace una colsulta de todo lo que contiene
     * la tabla producto ,para despues colocarlo en el coleccion.
     */
    public static void listarProducto() throws Exception {

        try {

            String sql;
            java.sql.ResultSet rs;
            List<Map<String, String>> listaprod = new ArrayList<>();
            sql = "SELECT * FROM producto";
            rs = Conector.getConector().ejecutarSQL(sql, true);

            // while (rs.next()) {
            Map<String, String> produc = new HashMap<>();
            produc.put("nombre", rs.getString("nombre"));
            produc.put("logo", rs.getString("logo"));
            produc.put("descripcion", rs.getString("descripcion"));

            System.out.println(rs.getString("produc"));
            listaprod.add(produc);

            sql = "SELECT * FROM version";
            rs = Conector.getConector().ejecutarSQL(sql, true);
            Map<String, String> dicVers = new HashMap<>();
            dicVers.put("numero", rs.getString("numero"));
            dicVers.put("fechaCreacion", rs.getString("fechaCreacion"));
        

            System.out.println(rs.getString("dicVers"));
            listaprod.add(dicVers);

            //}
            String prueba = "it works!!";
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

}
