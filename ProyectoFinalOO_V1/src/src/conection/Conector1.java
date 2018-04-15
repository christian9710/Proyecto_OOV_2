//package src.conection;
//
//import java.io.IOException;
//import src.proyecto.logic.*;
//import java.sql.*;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//public class Conector1 {
//
//	private PreparedStatement insert;
//	private Statement stmt;
//	private Connection con;
//
//	public void insertContact(Contactos conta) throws Exception {// metodo para guardar dentro de la tabla contactos
//
//		try {
//			String url = ("jdbc:mysql://localhost/softwareCelestial?" + "user=root&password=root");// direccion de BD
//			con = DriverManager.getConnection(url);
//			stmt = con.createStatement();
//
//			insert = con.prepareStatement(
//					"INSERT INTO CONTACTO (IDCONTACTO,NOMBRE,PUESTO,TELEFONOS,CORREO)" + " values(?,?,?,?,?)");
//			insert.setInt(1, Integer.parseInt(conta.getIdentificacion()));
//			insert.setString(2, conta.getNombre());
//			insert.setString(3, conta.getPuesto());
//			insert.setString(4, conta.getTelefono());
//			insert.setString(5, conta.getCorreo());
//
//			insert.execute();
//
//			con.close();
//
//		} catch (Exception ex) {
//			throw ex;
//		}
//
//	}
//
//	public void insertEmpresa(Empresa em) throws Exception {// metodo para guardar dentro de la tabla contactos
//
//		try {
//			String url = ("jdbc:mysql://localhost/softwareCelestial?" + "user=root&password=");// direccion de BD
//
//			con = DriverManager.getConnection(url);
//			stmt = con.createStatement();
//
//			insert = con
//					.prepareStatement("INSERT INTO EMPRESA (IDEMPRESA,RAZONSOCIAL,TELEFONOS,UBICACION,LOGO,DIRECCION"
//							+ " values(?,?,?,?,?,?)");
//			insert.setInt(1, Integer.parseInt(em.getCedulaJuridica()));
//			insert.setString(2, em.getRazonSocial());
//			insert.setString(3, em.getTelefono());
//			insert.setString(4, em.getUbicacion());
//			insert.setString(5, em.getLogo());
//			insert.setString(6, em.getDireccion());
//
//			insert.execute();
//
//			con.close();
//
//		} catch (Exception e) {
//			throw e;
//		}
//
//	}
//
//	public void insertCaracteristicaMejor(CaracteristicasVer caraVerMejora) throws Exception {// metodo para guardar
//																								// dentro de la tabla
//																								// contactos
//
//		try {
//			String url = ("jdbc:mysql://localhost/softwareCelestial?" + "user=root&password=");// direccion de BD
//			con = DriverManager.getConnection(url);
//			stmt = con.createStatement();
//
//			insert = con.prepareStatement("INSERT INTO CARACTERISTICAMEJORA (DESCRIPCIO)" + " values(?)");
//
//			insert.setString(2, caraVerMejora.getDescripcion());
//
//			insert.execute();
//
//			con.close();
//
//		} catch (Exception ex) {
//			throw ex;
//		}
//
//	}
//
//	public void insertInstalacion(Instalacion insta) throws Exception {// metodo para guardar dentro de la tabla
//																		// contactos
//
//		try {
//			String url = ("jdbc:mysql://localhost/softwareCelestial?" + "user=root&password=");// direccion de BD
//			con = DriverManager.getConnection(url);
//			stmt = con.createStatement();
//
//			insert = con.prepareStatement("INSERT INTO INSTALACION (FECHA,HORA,ESTADO)" + " values(?,?,?)");
//
//			insert.setString(2, insta.getFecha());
//			insert.setString(3, insta.getHora());
//			insert.setString(4, insta.getEstado());
//
//			insert.execute();
//
//			con.close();
//
//		} catch (Exception ex) {
//			throw ex;
//		}
//
//	}
//
//	public void insertProducto(Productos produ) throws Exception {// metodo para guardar dentro de la tabla contactos
//
//		try {
//			String url = ("jdbc:mysql://localhost/softwareCelestial?" + "user=root&password=");// direccion de BD
//			con = DriverManager.getConnection(url);
//			stmt = con.createStatement();
//
//			insert = con.prepareStatement("INSERT INTO PRODUCTO (NOMBRE,DESCRIPCION)" + " values(?,?)");
//
//			insert.setString(2, produ.getNombre());
//			insert.setString(3, produ.getDescripcion());
//
//			insert.execute();
//
//			con.close();
//
//		} catch (Exception ex) {
//			throw ex;
//		}
//
//	}
//
//	public void insertTareas(Tarea tarea) throws Exception {// metodo para guardar dentro de la tabla contactos
//
//		try {
//			String url = ("jdbc:mysql://localhost/softwareCelestial?" + "user=root&password=");// direccion de BD
//			con = DriverManager.getConnection(url);
//			stmt = con.createStatement();
//
//			insert = con.prepareStatement("INSERT INTO TAREAS (CODIGO,DESCRIPCION,ESTADO)" + " values(?,?,?)");
//
//			insert.setString(2, tarea.getCodigo());
//			insert.setString(3, tarea.getDescripcion());
//			insert.setString(3, tarea.getEstado());
//
//			insert.execute();
//
//			con.close();
//
//		} catch (Exception ex) {
//			throw ex;
//		}
//
//	}
//
//	public void insertVersion(Version version) throws Exception {// metodo para guardar dentro de la tabla contactos
//
//		try {
//			String url = ("jdbc:mysql://localhost/softwareCelestial?" + "user=root&password=");// direccion de BD
//			con = DriverManager.getConnection(url);
//			stmt = con.createStatement();
//
//			insert = con.prepareStatement("INSERT INTO VERSION (NUMERO)" + " values(?)");
//
//			insert.setString(2, version.getFormato());
//
//			insert.execute();
//
//			con.close();
//
//		} catch (Exception ex) {
//			throw ex;
//		}
//
//	}
//
//	public static void listContact() {
//		try {
//
//			Class.forName("com.mysql.jdbc.Driver").newInstance();
//			Connection conn = conn = DriverManager
//					.getConnection("jdbc:mysql://localhost/softwareCelestial?" + "user=root&password=");
//			Statement stmt = conn.createStatement();
//			ResultSet rs = rs = stmt.executeQuery("SELECT * FROM contacto");
//			List<Map<String, String>> listContacto = new ArrayList<>();
//			while (rs.next()) {
//				System.out.println(rs.getString("nombre"));
//				Map<String, String> dicContacto = new HashMap<>();
//				dicContacto.put("idcontacto", rs.getString("idcontacto"));
//				dicContacto.put("nombre", rs.getString("nombre"));
//				dicContacto.put("puesto", rs.getString("puesto"));
//				dicContacto.put("telefonos", rs.getString("telefonos"));
//				dicContacto.put("correo", rs.getString("correo"));
//
//				listContacto.add(dicContacto);
//			}
//			String prueba = "hola";
//		} catch (Exception ex) {
//			System.out.println(ex.getMessage());
//		}
//	}
//
//}
