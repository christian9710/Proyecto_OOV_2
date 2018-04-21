package src.proyecto.logic;

import java.sql.SQLException;
import src.conection.Conector;

/**
 *
 * @author Christian Rodriguez Alvarez y Brandn Fernandez
 */
public class MultiIntalacion {

    /**
     *
     * @param estado
     * @param fecha
     * @param hora
     * @return
     * @throws SQLException
     * @throws Exception
     *
     * Metodo para agregar una instalacion en la base de datos
     */
    public Instalacion insertInstalacion(String estado, String fecha, String hora) throws
            java.sql.SQLException, Exception {
        Instalacion insta = null;
        String sql;
        int id=1;
         id++;

        sql = "INSERT INTO instalacion "
                + "VALUES (" + fecha + ",'" + hora + "','" + estado + "');";

        try {

            Conector.getConector().ejecutarSQL(sql);
            insta = new Instalacion(estado, fecha, hora);

            //con.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            throw new Exception("No se ha logrado registar la instalacion, contacte al departamento de IT");
        }
        return insta;
    }

    /**
     *
     * @param estado
     * @return
     * @throws SQLException
     * @throws Exception
     *
     * Metodo para buscar una instalacion con un estado
     */
    public Instalacion buscar(String estado) throws
            java.sql.SQLException, Exception {
        Instalacion insta = null;
        java.sql.ResultSet rs;
        String sql;
        sql = "SELECT nombre,logo,descripcion"
                + "FROM Instalacion "
                + "WHERE estado='" + estado + "';";
        rs = Conector.getConector().ejecutarSQL(sql, true);
        if (rs.next()) {
            insta = new Instalacion(
                    rs.getString("estado"),
                    rs.getString("fecha"),
                    rs.getString("hora"));

        } else {
            throw new Exception("La instalacion no se ha registrado");
        }
        rs.close();
        return insta;
    }

    /**
     *
     * @param miInstala
     * @throws SQLException
     * @throws Exception
     *
     * metodo para borrar todo el objeto instalacion en la base de datos
     */
    public void borrar(Instalacion miInstala) throws
            java.sql.SQLException, Exception {
        java.sql.ResultSet rs;
        String sql;
        sql = "DELETE FROM Instalacion "
                + "WHERE estado='" + miInstala.getEstado() + "';";
        try {
            Conector.getConector().ejecutarSQL(sql);
        } catch (Exception e) {
            throw new Exception("No se ha realizado la limpieza de la tabla");
        }
    }

    /**
     *
     * @param insta
     * @throws SQLException
     * @throws Exception
     *
     * metodo para actualizar el objeto instalacion en la base de datos
     *
     */
    public void actualizarInstalacion(Instalacion insta) throws
            java.sql.SQLException, Exception {
        String sql;
        sql = "UPDATE instalacion "
                + "SET estado=" + insta.getEstado() + ", "
                + "fecha='" + insta.getFecha() + "', "
                + "hora='" + insta.getHora() + "', "
                + "WHERE estado='" + insta.getEstado() + "';";

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
     * Metodo para listar el objeto instalacion
     *
     */
    public static void listarInstalacion() throws Exception {
        Instalacion insta = null;
        java.sql.ResultSet rs;
        String sql;
        sql = "SELECT estado,fecha,hora"
                + "FROM instalacion " + "';";

        rs = Conector.getConector().ejecutarSQL(sql, true);

    }

}
