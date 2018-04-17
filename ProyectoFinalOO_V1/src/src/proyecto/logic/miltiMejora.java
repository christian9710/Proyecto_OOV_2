/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.proyecto.logic;

import src.conection.Conector;

/**
 *
 * @author unicomer
 */
public class miltiMejora {

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

            throw new Exception("Se agregó correctamente");

        }

        return miMejora;
    }
}