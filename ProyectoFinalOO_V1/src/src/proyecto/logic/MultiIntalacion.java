
package src.proyecto.logic;

import src.conection.Conector;

public class MultiIntalacion {

    public Instalacion insertInstalacion(String estado, String fecha,String hora) throws
            java.sql.SQLException, Exception {
        Instalacion insta = null;
        String sql;

        sql = "INSERT INTO Instalacion "
                + "VALUES ('" + estado + "','" + fecha + "','" + hora + "');";

        try {

            Conector.getConector().ejecutarSQL(sql);
            insta=new Instalacion(estado,fecha,hora);

            //con.close();
        } catch (Exception ex) {
            throw new Exception("No se ha logrado registar la instalacion, contacte al departamento de IT");
        }
        return insta;
    }

}
