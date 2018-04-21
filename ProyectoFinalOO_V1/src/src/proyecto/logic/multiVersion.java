package src.proyecto.logic;

import java.sql.SQLException;
import src.conection.*;

/**
 *
 * @author christian Rodriguez y Brandon Fernandez
 */
public class multiVersion {

    /**
     *
     * @param formato
     * @param fechaCreacion
     * @return
     * @throws Exception
     * 
     * 
     * metodo para crear una version en la base de datos
     */
    public Version crearVersion(String formato, String fechaCreacion) throws Exception {
        String sql;
        Version miVersion = null;

        sql = "INSERT INTO version "
                + "(numero,fechaCreacion)"
                + "VALUES( '" + formato + "','" + fechaCreacion + "')";

        try {

            Conector.getConector().ejecutarSQL(sql);
            miVersion = new Version(formato, fechaCreacion);
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }

        return miVersion;

    }

    /**
     *
     * @param formato
     * @return
     * @throws SQLException
     * @throws Exception
     * 
     * metodo para buscar una version en la base de datos
     */
    public Version buscar(String formato) throws
            java.sql.SQLException, Exception {
        Version vers = null;
        java.sql.ResultSet rs;
        String sql;
        sql = "SELECT numero,fechaCreacion"
                + "FROM version "
                + "WHERE numero='" + formato + "';";
        rs = Conector.getConector().ejecutarSQL(sql, true);
        if (rs.next()) {
            vers = new Version(
                    rs.getString("formato"),
                    rs.getString("fechaCreacion"));

        } else {
            throw new Exception("El contacto no se ha registrado");
        }
        rs.close();
        return vers;
    }

    /**
     *
     * @param miVersion
     * @throws SQLException
     * @throws Exception
     * 
     * metodo para borrar una version en la base de datos
     */
    public void borrar(Version miVersion) throws
            java.sql.SQLException, Exception {
        java.sql.ResultSet rs;
        String sql;
        sql = "DELETE FROM version "
                + "WHERE numero='" + miVersion.getFormato() + "';";
        try {
            Conector.getConector().ejecutarSQL(sql);
        } catch (Exception e) {
            throw new Exception("No se ha realizado la limpieza de la tabla");
        }
    }
    
    /**
     *
     * @param version
     * @throws SQLException
     * @throws Exception
     * 
     * metodo para actualizar una version  en la base de datos
     */
    public void actualizarVersion(Version version) throws
            java.sql.SQLException, Exception {
        String sql;
        sql="UPDATE version "+
		"SET formato="+version.getFormato()+", "+
		"fechaCreacion='"+version.getFechaCreacion()+"', "+
		
		"WHERE numero='"+version.getFormato()+"';";
        try {
            Conector.getConector().ejecutarSQL(sql);
        } catch (Exception e) {
            throw new Exception("No se logro actualizar.");
        }
    }

}