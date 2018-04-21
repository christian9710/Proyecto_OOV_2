/*
 *dClase parainsertar una caracteristica de mejora
 */
package src.proyecto.logic;

import src.conection.Conector;

/**
 *
 * @author Christian Rodriguez y Brandon Fernandez
 *
 *
 *
 */
public class miltiMejora {

    /**
     *
     * @author Christian Rodriguez y Brandon Fernandez
     *
     *
     * Metodo para agregar un objeto de tipo mejora a la base de datos 
     */
    public Mejora agregarMejora(String descripcion) throws Exception {

        String sql;
        Mejora miMejora = null;

        sql = "INSERT INTO caracteriscamejora"
                + "(descripcion)"
                + "VALUES( '" + descripcion + "')";

        try {

            Conector.getConector().ejecutarSQL(sql);
            miMejora = new Mejora(descripcion);
        } catch (Exception ex) {

            throw new Exception("Se agregÃ³ correctamente");

        }

        return miMejora;
    }
}
