/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.proyecto.logic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import src.conection.Conector;

public class multiEmpresa {

    public Empresa insertEmpresa(String nombre,String razonSocial, String cedulaJuridica, String ubicacion, String direccion, String logo,
            String telefono) throws
            java.sql.SQLException, Exception {
        Empresa empre = null;
        String sql;

        sql = "INSERT INTO EMPRESA "
                + "VALUES ('" + nombre + "'+'" + razonSocial + "','" + cedulaJuridica + "','" + ubicacion + "','" + direccion + "','" + logo + "','" + telefono + "');";

        try {

            Conector.getConector().ejecutarSQL(sql);
            empre = new Empresa(nombre,razonSocial, cedulaJuridica, ubicacion, direccion, logo, telefono);

            //con.close();
        } catch (Exception ex) {
            throw new Exception("La empresa ya ha sido registrado previamente, por favor ingrese otro dato");
        }
        return empre;
    }

    public Empresa buscar(String razonSocial) throws
            java.sql.SQLException, Exception {
        Empresa empre = null;
        java.sql.ResultSet rs;
        String sql;
        sql = "SELECT razonSocial, cedulaJuridica, ubicacion, direccion, logo, telefono "
                + "FROM EMPRESA "
                + "WHERE razonSocial='" + razonSocial + "';";
        rs = Conector.getConector().ejecutarSQL(sql, true);
        if (rs.next()) {
            empre = new Empresa(
                    rs.getString("nombre"),
                    rs.getString("razonSocial"),
                    rs.getString("cedulaJuridica"),
                    rs.getString("ubicacion"),
                    rs.getString("direccion"),
                    rs.getString("logo"),
                    rs.getString("telefono"));
        } else {
            throw new Exception("La empresa no se ha registrado");
        }
        rs.close();
        return empre;
    }

    public void actualizarEmpresa(Empresa empre) throws
            java.sql.SQLException, Exception {
        String sql;
        sql = "UPDATE EMPRESA "
                 + "nombre=" + empre.getNombre() + ", "
                + "razonSocial=" + empre.getRazonSocial() + ", "
                + "cedulaJuridica='" + empre.getCedulaJuridica() + "', "
                + "ubicacion='" + empre.getUbicacion() + "', "
                + "direccion='" + empre.getDireccion() + "', "
                + "logo='" + empre.getLogo() + "', "
                + "telefono='" + empre.getTelefono() + "' "
                + "WHERE cedulaJuridica='" + empre.getCedulaJuridica() + "';";
        try {
            Conector.getConector().ejecutarSQL(sql);
        } catch (Exception e) {
            throw new Exception("No se logro actualizar.");
        }
    }

    public void borrar(Empresa empre) throws
            java.sql.SQLException, Exception {
        java.sql.ResultSet rs;
        String sql;
        sql = "DELETE FROM EMPRESA "
                + "WHERE razonSocial='" + empre.getRazonSocial() + "';";
        try {
            Conector.getConector().ejecutarSQL(sql);
        } catch (Exception e) {
            throw new Exception("No se ha realizado la limpieza de la tabla");
        }
    }

    public static void listEmpresa() {
        try {

            String sql;
            java.sql.ResultSet rs;
            List<Map<String, String>> listEmpresa = new ArrayList<>();
            sql = "SELECT * FROM Empresa";
            rs = Conector.getConector().ejecutarSQL(sql, true);

           // while (rs.next()) {

                sql = "SELECT * FROM Empresa";
                rs = Conector.getConector().ejecutarSQL(sql, true);

                Map<String, String> dicContacto = new HashMap<>();
                dicContacto.put("nombre", rs.getString("nombre"));
                dicContacto.put("razonSocial", rs.getString("razonSocial"));
                dicContacto.put("cedulaJuridica", rs.getString("cedulaJuridica"));
                dicContacto.put("ubicacion", rs.getString("ubicacion"));
                dicContacto.put("direccion", rs.getString("direccion"));
                dicContacto.put("logo", rs.getString("logo"));
                dicContacto.put("telefono", rs.getString("telefono"));
                System.out.println(rs.getString("dicContacto"));
                listEmpresa.add(dicContacto);

                sql = "SELECT * FROM Contacto";
                rs = Conector.getConector().ejecutarSQL(sql, true);
                Map<String, String> dicEmpre = new HashMap<>();
                dicEmpre.put("tipo", rs.getString("cedulaJuridica"));
                dicEmpre.put("identificacion", rs.getString("ubicacion"));
                dicEmpre.put("nombre", rs.getString("direccion"));
                dicEmpre.put("puesto", rs.getString("logo"));
                dicEmpre.put("telefono", rs.getString("telefono"));
                dicEmpre.put("correo", rs.getString("correo"));
                System.out.println(rs.getString("dicEmpre"));
                listEmpresa.add(dicEmpre);
                
               
            //}
            String prueba = "it works!!";
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

}
