package src.proyecto.logic;

import java.sql.SQLException;
import src.conection.Conector;

/**
 *
 * @author christian  Rodriguez y Brandon fernandez
 */
public class multiTarea {

    /**
     *
     * @param tipo
     * @param codigo
     * @param descripcion
     * @param estado
     * @param responsable
     * @return
     * @throws Exception
     * 
     * metodo para insertar una tarea a la instalacion en la base de datos
     */
    public Tarea agregarTarea(String tipo, String codigo, String descripcion, String estado, String responsable) throws Exception {
        Tarea miTarea = null;
        String sql;
        Productos miProducto = null;

        sql = "INSERT INTO tareas "
                + "(codigo,tipo,descripcion,estado,responsable)"
                + "VALUES( '" + codigo + "','" + tipo + "','" + descripcion + "','" + estado + "','" + responsable + "')";

        try {

            Conector.getConector().ejecutarSQL(sql);
            miTarea = new Tarea(tipo, codigo, descripcion, estado, responsable);
        } catch (Exception ex) {

            throw new Exception("Se agregÃ³ correctamente");

        }

        return miTarea;

    }

    /**
     *
     * @param codigo
     * @return
     * 
     * metodo para buscar una tarea mediante el codigo
     * @throws Exception
     */
    public Tarea buscarTarea(String codigo) throws Exception {
        Tarea tar = null;
        java.sql.ResultSet rs;
        String sql;
        sql = "SELECT codigo,tipo,descripcion,estado,responsable"
                + "FROM tareas "
                + "WHERE codigo='" + codigo + "';";
        rs = Conector.getConector().ejecutarSQL(sql, true);
        if (rs.next()) {
            tar = new Tarea(
                    rs.getString("codgigo"),
                    rs.getString("tipo"),
                    rs.getString("descripcion"),
                    rs.getString("estado"),
                    rs.getString("responsable")
            );

        } else {
            throw new Exception("La tarea no se ha registrado");
        }
        rs.close();
        return tar;

    }

    /**
     *
     * @param tar
     * @throws SQLException
     * @throws Exception
     * 
     * Metodo para actualizar el objeto tarea en la base de datos
     */
    public void actualizarTareaEstado(Tarea tar) throws
            java.sql.SQLException, Exception {
        String sql;
        sql = "UPDATE tareas "
                + "SET estado=" + tar.getEstado() + ", "
                + "WHERE codigo='" + tar.getCodigo() + "';";
        try {
            Conector.getConector().ejecutarSQL(sql);
        } catch (Exception e) {
            throw new Exception("No se logro actualizar.");
        }
    }

    Tarea agregarTarea(String tipo, String codigo, String descripcion, String estado, String responsable, String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}