package src.proyecto.logic;

import src.conection.Conector;

/**
 *
 * @author unicomer
 */
public class multiTarea {

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

            throw new Exception("Se agregó correctamente");

        }

        return miTarea;

    }

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

}