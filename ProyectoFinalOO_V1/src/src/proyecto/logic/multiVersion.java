package src.proyecto.logic;

import src.conection.*;

public class multiVersion {

    public Version crearVersion(String formato, String fechaCreacion) throws Exception {
        String sql;
        Version miVersion = null;

        sql = "INSERT INTO version "
                + "(numero,fechaCreacion)"
                + "VALUES( '" + formato + "','" + fechaCreacion + "')";

        try {
            miVersion = new Version(formato, fechaCreacion);
            Conector.getConector().ejecutarSQL(sql);
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }

        return miVersion;

    }

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

}
