package src.proyecto.logic;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import src.conection.*;

public class MultiError {

    public Error insertar(String descripcion, String fecha) throws Exception {

        String sql;
        Error myError = null;

        sql = "INSERT INTO caracteristicaerror "
                + "(descripcion,fecha)"
                + "VALUES( '" + descripcion + "','" + fecha + "')";

        try {
            myError = new Error(descripcion, fecha);
            Conector.getConector().ejecutarSQL(sql);
        } catch (Exception e) {

            throw new Exception("Se agregó correctamente");

        }

        return myError;
    }

}
