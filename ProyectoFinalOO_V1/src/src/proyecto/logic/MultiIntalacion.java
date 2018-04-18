package src.proyecto.logic;

import src.conection.Conector;

public class MultiIntalacion {

    public Instalacion insertInstalacion(String estado, String fecha, String hora) throws
            java.sql.SQLException, Exception {
        Instalacion insta = null;
        String sql;

        sql = "INSERT INTO Instalacion "
                + "VALUES ('" + estado + "','" + fecha + "','" + hora + "');";

        try {

            Conector.getConector().ejecutarSQL(sql);
            insta = new Instalacion(estado, fecha, hora);

            //con.close();
        } catch (Exception ex) {
            throw new Exception("No se ha logrado registar la instalacion, contacte al departamento de IT");
        }
        return insta;
    }

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

    public void actualizarInstalacion(Instalacion insta) throws
            java.sql.SQLException, Exception {
        String sql;
        sql = "UPDATE Instalacion "
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

    public static void listarInstalacion() throws Exception {
        Instalacion insta = null;
        java.sql.ResultSet rs;
        String sql;
        sql = "SELECT estado,fecha,hora"
                + "FROM Instalacion " + "';";

        rs = Conector.getConector().ejecutarSQL(sql, true);

    }

}
