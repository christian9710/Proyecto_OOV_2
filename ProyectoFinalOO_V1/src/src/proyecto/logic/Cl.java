package src.proyecto.logic;

import java.util.*;
import src.conection.Conector1.*;
public class Cl {

	private ArrayList<Empresa> clientes = new ArrayList<>();
	private ArrayList<Contactos> contactos = new ArrayList<>();
	private ArrayList<Productos> productos = new ArrayList<>();
	private ArrayList<Version> version = new ArrayList<>();
	private ArrayList<CaracteristicasVer> caracteristicas = new ArrayList<>();
	private ArrayList<Error> error = new ArrayList<>();
	private ArrayList<Mejora> mejora = new ArrayList<>();
	private ArrayList<Instalacion> instalacion = new ArrayList<>();
	private ArrayList<Tarea> tarea = new ArrayList<>();

	public Cl() {

	}

	public void crearCliente(String razonSocial, String cedulaJuridica, String ubicacion, String direccion, String logo,
			String telefono) {
		Empresa miClient = new Empresa(razonSocial, cedulaJuridica, ubicacion, direccion, logo, telefono);
		clientes.add(miClient);
	}

	public void crearContactos(String tipo, String identificacion, String nombre, String puesto, String telefono,
			String correo) {
		Contactos miContact = new Contactos(tipo, identificacion, nombre, puesto, telefono, correo);
		contactos.add(miContact);
	}

	public void crearProductos(String nombre, String logo, String descripcion, String formato,
			CaracteristicasVer caracteristicaVer) {
		Version miVersion = new Version(formato, caracteristicaVer);
		Productos miProduct = new Productos(nombre, logo, descripcion, miVersion);
		productos.add(miProduct);

	}

	public void crearVersion(String formato, CaracteristicasVer caracteristicaVer) {
		Version miVersion = new Version(formato, caracteristicaVer);
		version.add(miVersion);
	}

	public void crearError(String descripcion, String fechaReporte) {
		Error miError = new Error(descripcion, fechaReporte);
		error.add(miError);
	}

	public void crearMejora(String descripcion) {
		Mejora miMejora = new Mejora(descripcion);
		mejora.add(miMejora);
	}

	public void crearInstalacion(String estado, String fecha, String hora, Empresa empresa, Productos producto,
			Version version, Tarea tarea) {

		Instalacion miInstalacion = new Instalacion(estado, fecha, hora, empresa, producto, version, tarea);
		instalacion.add(miInstalacion);
	}

	public void crearTarea(String tipo, String codigo, String descripcion, String estado, String responsable) {
		Tarea miTarea = new Tarea(tipo, codigo, descripcion, estado, responsable);
		tarea.add(miTarea);
	}

	public String[] listClientes() {
		String[] dato;
		int i = 0;
		dato = new String[clientes.size()];
		for (Empresa var : clientes) {
			dato[i] = var.toString();
			i++;
		}
		return dato;
	}

	public String[] listContacto() {
		String[] dato;
		int i = 0;
		dato = new String[contactos.size()];
		for (Contactos var : contactos) {
			dato[i] = var.toString();
			i++;
		}
		return dato;
	}

	public String[] listProductos() {
		String[] dato;
		int i = 0;
		dato = new String[productos.size()];
		for (Productos var : productos) {
			dato[i] = var.toString();
			i++;
		}
		return dato;
	}

	public void clearProductos() {
		productos.clear();
	}

	public String[] listInstalacion() {
		String[] dato;
		int i = 0;
		dato = new String[instalacion.size()];
		for (Instalacion var : instalacion) {
			dato[i] = var.toString();
			i++;
		}
		return dato;
	}

}
