package src.UI;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import src.proyecto.logic.Controller;

public class Ui {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;
    static Controller controller = new Controller();

    public static void main(String[] args) throws IOException, Exception {
        int opc;
        boolean noSalir = true;

        do {
            mostrarMenu();
            opc = leerOpcion();
            noSalir = ejecutarAccion(opc);
        } while (noSalir);

    }

    static void mostrarMenu() {
        out.println();
        out.println("Menu de opciones del Sistema Software Celestial");
        out.println();
        out.println("1.  Registrar clientes.");
        out.println("2.  Registrar empresa.");
        out.println("3.  Registar instalaciones .");
        out.println("4.  Registrar tares");
        out.println("5.  Menu Modificacion Datos.");
        out.println("6.  Salir del Sistema.");
        out.println();
    }

    static int leerOpcion() throws IOException {
        int opcion;

        out.print("Selecciones su opcion: ");
        opcion = Integer.parseInt(in.readLine());
        out.println();

        return opcion;
    }

    public static boolean ejecutarAccion(int popcion) throws IOException, Exception {
        boolean noSalir = true;
        switch (popcion) {
            case 1:

                registrarContactos();

                break;

            case 2:
                registrarEmpresa();

                break;

            case 3:
                registrarInstalaciones();

                break;

            case 4:
                addTareasInsta();

                break;

            case 5:
                menuModificar();

                break;

            case 6:
                noSalir = false;

            default:
                out.println("Opcion Invalidad");
                out.println();
                break;
        }
        return noSalir;
    }

    public static void registrarContactos() {

        try {
            String tipoContacto, identificacion, nombre, puesto, telefono, correo;
            out.println("Ingrese el nombre del contacto : ");
            nombre = in.readLine();
            out.println("Ingrese la cedula del contacto : ");
            identificacion = in.readLine();
            out.println("Ingrese el telefono del contacto : ");
            telefono = in.readLine();
            out.println("Ingrese el tipo de contacto : ");
            tipoContacto = in.readLine();
            out.println("Ingrese el puesto del contacto : ");
            puesto = in.readLine();
            out.println("Ingrese el correo electronico del contacto : ");
            correo = in.readLine();

            controller.addContac(tipoContacto, identificacion, nombre, puesto, telefono, correo);

        } catch (Exception e) {
        }

    }

    public static void registrarEmpresa() {

        try {
            String razonSocial, cedulaJuridica, ubicacion, direccion, logo, telefono;
            out.println("Ingrese la ubicacion de la empresa : ");
            ubicacion = in.readLine();
            out.println("Ingrese la direccion de la empresa : ");
            direccion = in.readLine();
            out.println("Ingrese la cedula juridica de la empresa : ");
            cedulaJuridica = in.readLine();
            out.println("Ingrese la razon social juridica : ");
            razonSocial = in.readLine();
            out.println("Ingrese el logo social : ");
            logo = in.readLine();
            out.println("Ingrese el telefono de la empresa : ");
            telefono = in.readLine();

            controller.addEmpresa(ubicacion, direccion, cedulaJuridica, razonSocial, logo, telefono);

        } catch (Exception e) {
        }

    }

    public static void registrarInstalaciones() {

        try {
            String estado, fecha, hora;
            out.println("Ingrese el estado de la instalacion  : ");
            estado = in.readLine();
            out.println("Ingrese la fecha planeada para la instalacion  : ");
            fecha = in.readLine();
            out.println("Ingrese la hora estimada para la instalacion  : ");
            hora = in.readLine();

            controller.addInsta(estado, fecha, hora);

        } catch (Exception e) {
        }

    }

    public static void addTareasInsta() {
        String tipo, codigo, descripcion, estado, responsable;

        try {
            out.println("Ingrese el tipo de tarea : ");
            tipo = in.readLine();
            out.println("Ingrese el codigo de la tarea : ");
            codigo = in.readLine();
            out.println("Ingrese la descripcion de la tarea : ");
            descripcion = in.readLine();
            out.println("Ingrese el estado : ");
            estado = in.readLine();
            out.println("Ingrese el responsable : ");
            responsable = in.readLine();

            controller.addTareas(tipo, codigo, descripcion, estado, responsable);

        } catch (Exception e) {
        }
    }

    public static void menuModificar() throws IOException, Exception {

        int opc;
        boolean noSalir = true;

        do {
            mostrarMenuMod();
            opc = leerOpcionMod();
            noSalir = ejecutarAccionMod(opc);
        } while (noSalir);

    }

    static void mostrarMenuMod() {
        out.println();
        out.println("Menu de opciones del sistema");
        out.println();
        out.println("1.  Modificar Clientes");
        out.println("2.  Modificar productos.");
        out.println("3.  Modificar instalaciones.");
        out.println("4.  Modificar estado de las tareas");
        out.println("5.  Modificar estado de las instalaciones");
        out.println("6.  Menu Listar");
        out.println("7.  Regresar la menu principal");
        out.println("8.  Salir.");
        out.println();
    }

    static int leerOpcionMod() throws IOException {
        int opcion;

        out.print("Selecciones su opcion: ");
        opcion = Integer.parseInt(in.readLine());
        out.println();

        return opcion;
    }

    public static boolean ejecutarAccionMod(int popcion) throws IOException, Exception {
        boolean noSalir = true;
        switch (popcion) {
            case 1:

                modificarContact();

                break;

            case 2:
                modificarProduct();

                break;

            case 3:
                modificarInsta();

                break;

            case 4:
                modificarTarea();

                break;
            case 5:
                modificarEstadoInst();

                break;

            case 6:
                menuList();

                break;

            case 7:
                mostrarMenu();

                break;
            case 8:
                noSalir = false;
                break;

            default:
                out.println("Opcion Invalidad");
                out.println();
                break;
        }
        return noSalir;
    }

    public static void modificarContact() {

        try {
            String identificacion, nombre;
            out.println("Ingrese la cedula del contacto a modificar");
            identificacion = in.readLine();
            out.println("Ingrese el nombre del contacto a modificar");
            nombre = in.readLine();
            controller.contacActuali(identificacion, nombre);
        } catch (Exception ex) {

        }
    }

    public static void modificarProduct() {
        try {
            String nombre, logo, descripcion;
            out.println("Ingrese el nombre");
            nombre = in.readLine();
            out.println("Ingrese el logo");
            logo = in.readLine();
            out.println("Ingrese la nueva descripcion a modificar");
            descripcion = in.readLine();
            controller.productAct(nombre, logo, descripcion);
        } catch (Exception ex) {

        }
    }

    public static void modificarInsta() {
        try {
            String estado, fecha, hora;
            out.println("Ingrese el estado");
            estado = in.readLine();
            out.println("Ingrese la fecha");
            fecha = in.readLine();
            out.println("Ingrese la hora");
            hora = in.readLine();
            controller.instaAct(estado, fecha, hora);
        } catch (Exception ex) {

        }

    }

    public static void modificarTarea() throws IOException, Exception {
        String codigo, estado;
        out.println("Ingrese el codigo");
        codigo = in.readLine();
        out.println("Ingrese el estado");
        estado = in.readLine();

        controller.tareaAc(codigo, estado);

    }

    public static void modificarEstadoInst() throws IOException, Exception {

        String estado, fecha, hora;
        out.println("Ingrese el estado");
        estado = in.readLine();
        out.println("Ingrese la fecha");
        fecha = in.readLine();
        out.println("Ingrese la hora");
        hora = in.readLine();
        controller.instaAct(estado, fecha, hora);

    }

    public static void menuList() throws IOException, Exception {

        int opc;
        boolean noSalir = true;

        do {
            mostrarMenuMod();
            opc = leerOpcionMod();
            noSalir = ejecutarAccionMod(opc);
        } while (noSalir);

    }

    static void mostrarMenuList() {
        out.println();
        out.println("Menu de opciones del sistema");
        out.println();
        out.println("1.  Modificar Clientes");
        out.println("2.  Modificar productos.");
        out.println("3.  Modificar instalaciones.");
        out.println("4.  Modificar estado de las tareas");
        out.println("5.  Modificar estado de las instalaciones");
        out.println("6.  Menu Listar");
        out.println("7.  Regresar la menu principal");
        out.println("8.  Salir.");
        out.println();
    }

    static int leerOpcionList() throws IOException {
        int opcion;

        out.print("Selecciones su opcion: ");
        opcion = Integer.parseInt(in.readLine());
        out.println();

        return opcion;
    }

    public static boolean ejecutarAccionList(int popcion) throws IOException, Exception {
        boolean noSalir = true;
        switch (popcion) {
            case 1:

                listContact();
                ListEmpre();

                break;

            case 2:
                listProduct();

                break;

            case 3:
                listInstala();

                break;

            case 4:
                menuModificar();

                break;
            case 5:
                noSalir = false;
                break;

            default:
                out.println("Opcion Invalidad");
                out.println();
                break;
        }
        return noSalir;
    }

    public static void listContact() {
        try {
            controller.listContact();
        } catch (Exception ex) {
            Logger.getLogger(Ui.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void ListEmpre() {
    controller.listEmpre();
    }

    public static void listProduct() {
        try {
            controller.listProducto();
        } catch (Exception ex) {
            Logger.getLogger(Ui.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void listInstala() {

    }

}
