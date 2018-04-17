/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.proyecto.logic;

import src.conection.Conector;

public class multiProducto {

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

            throw new Exception("Se agregó correctamente");

        }

        return miProducto;
    }

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
    
      public void actualizarProducto(Productos pro) throws
            java.sql.SQLException, Exception {
        String sql;
        sql="UPDATE producto "+
		"SET logo="+pro.getLogo()+", "+
		"descripcion='"+pro.getDescripcion()+"', "+
		
		"WHERE nombre='"+pro.getNombre()+"';";
        try {
            Conector.getConector().ejecutarSQL(sql);
        } catch (Exception e) {
            throw new Exception("No se logro actualizar.");
        }
    }
      
      public void listarProducto() throws Exception{
           Productos prod = null;
        java.sql.ResultSet rs;
        String sql;
        sql = "SELECT nombre,logo,descripcion"
                + "FROM producto "+ "';";
        
        rs = Conector.getConector().ejecutarSQL(sql, true);
            
      }

}
