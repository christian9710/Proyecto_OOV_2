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
	
	/**
	 *M�todo est�tico que devuelve el 
	 *objeto AccesoBD para que sea utilizado
	 *por las clases
	 *@return objeto del tipo AccesoBD del paquete 
	 *CapaAccesoDatos
     * @throws java.sql.SQLException
	 */
	 
//	public static AccesoBD getConector() throws 
//	java.sql.SQLException,Exception{
//		if (conectorBD == null){			
////			conectorBD = new AccesoBD("sun.jdbc.odbc.JdbcOdbcDriver","jdbc:odbc:BDCxC","sa","jass2002");
//			conectorBD = new AccesoBD("sun.jdbc.odbc.JdbcOdbcDriver","jdbc:odbc:BDCxCAccess","","");
//		}
//		return conectorBD;
//	}
//	
	
	public static AccesoBD getConector() throws java.sql.SQLException,Exception{
		if(conectorBD==null){
                        String driver="com.mysql.jdbc.Driver";
                        //String conexion="jdbc:mysql://localhost/softwarecelestial?" + "user=root&password=root";
                        String conexion="jdbc:mysql://localhost/prueba?" + "user=root&password=root";
			conectorBD = new AccesoBD("com.mysql.jdbc.Driver","jdbc:mysql://localhost/softwarecelestial?" + "user=root&password=root");
		}
		return conectorBD;
	}
	
}