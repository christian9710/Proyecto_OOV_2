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
     static Controller controller = new Controller();
     static multiEmpresa empre=new multiEmpresa();

    public static void main(String[] args) throws Exception {
//        String descripcion = "falla inicio sesión";
//        String fecha = "2018_04_04";
//        log.insertar(descripcion, fecha);
        
        String razonSocial="gdgd";
        String cedulaJuridica="gdgf";
        String ubicacion="egfdsg";
         String direccion="gdfg";
         String logo="dggf"; 
         String ptelefono="555";
         controller.addEmpresa(razonSocial, cedulaJuridica, ubicacion, direccion, logo, ptelefono);
        
        
        String tipo = "contacto principal";
        String identificacion = "115790860";
        String nombre = "Brandon";
        String puesto = "IT";
        String telefono = "61316145";
        String correo = "bfernandez@data.com";
        controller.addContac(tipo, identificacion, nombre, puesto, telefono, correo);
        
        
        controller.listEmpre();
        
        
    }

}
