package src.proyecto.logic;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import src.conection.*;

/**
 *
 * @author Christian Rodriguez y Brandon Fernandez
 */
public class MultiError {

    /**
     *
     * @param descripcion
     * @param fecha
     * @return
     * @throws Exception
     * 
     * Metodo para insertar un objeto Error en la base de datos
     */
    public Error insertar(String descripcion, String fecha) throws Exception {

        String sql;
       Error myError = null;

        sql = "INSERT INTO caracteristicaerror "
                + "(descripcion,fecha)"
                + "VALUES( '" + descripcion + "','" + fecha + "')";

        try {
            
            Conector.getConector().ejecutarSQL(sql);
              myError = new Error(descripcion, fecha);
        } catch (Exception ex) {

            throw new Exception("Se agregÃ³ correctamente");

        }

        return myError;
    }

}