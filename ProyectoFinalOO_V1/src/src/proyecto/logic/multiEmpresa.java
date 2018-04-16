/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.proyecto.logic;

import src.conection.Conector;

public class multiEmpresa {

    public Empresa insertEmpresa(String razonSocial, String cedulaJuridica, String ubicacion, String direccion, String logo,
            String telefono) throws
            java.sql.SQLException, Exception {
        Empresa empre = null;
        String sql;

        sql = "INSERT INTO EMPRESA "
                + "VALUES ('" + razonSocial + "','" + cedulaJuridica + "','" + ubicacion + "','" + direccion + "','" + logo + "','" + telefono + "');";

        try {

            Conector.getConector().ejecutarSQL(sql);
            empre = new Empresa(razonSocial, cedulaJuridica, ubicacion, direccion, logo, telefono);

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
                + "razonSocial=" + empre.getRazonSocial()+ ", "
                + "cedulaJuridica='" + empre.getCedulaJuridica()+ "', "
                + "ubicacion='" + empre.getUbicacion()+ "', "
                + "direccion='" + empre.getDireccion()+ "', "
                + "logo='" + empre.getLogo()+ "', "
                + "telefono='" + empre.getTelefono()+ "' "
                + "WHERE cedulaJuridica='" + empre.getCedulaJuridica()+ "';";
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
                + "WHERE razonSocial='" + empre.getRazonSocial()+ "';";
        try {
            Conector.getConector().ejecutarSQL(sql);
        } catch (Exception e) {
            throw new Exception("No se ha realizado la limpieza de la tabla");
        }
    }

}
