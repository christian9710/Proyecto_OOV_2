/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.main;

import java.io.*;

import src.proyecto.logic.*;

public class UI {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;
    
    static MultiError log = new MultiError();

    public static void main(String[] args) throws Exception {
        String descripcion = "falla inicio sesión";
        String fecha = "2018_04_04";
        log.insertar(descripcion, fecha);
    }

}
