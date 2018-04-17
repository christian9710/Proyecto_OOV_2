package src.conection;

/**
 *Clase Conector
 *@version 1.0
 *@author Laura Monge Izaguirre
 *Clase que inicializa la conexi�n con
 *los valores correctos y
 *permite manejar una �nica
 *conexi�n para todo el proyecto y
 *
 */
 
public class Conector{
	//atributo de la clase	
	private static AccesoBD conectorBD = null;
	
	
	public static AccesoBD getConector() throws java.sql.SQLException,Exception{
		if(conectorBD==null){
                        String driver="com.mysql.jdbc.Driver";
                        String conexion="jdbc:mysql://localhost/prueba?" + "user=root&password=";
			conectorBD = new AccesoBD("com.mysql.jdbc.Driver","jdbc:mysql://localhost/softwareCelestial?" + "user=root&password=");
		}
		return conectorBD;
	}
	
}