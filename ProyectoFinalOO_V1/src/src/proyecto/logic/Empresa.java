package src.proyecto.logic;

public class Empresa {

    @Override
    public String toString() {
        return "Clientes [razonSocial=" + razonSocial + ", cedulaJuridica=" + cedulaJuridica + ", ubicacion="
                + ubicacion + ", direccion=" + direccion + ", logo=" + logo + ", telefono=" + telefono + ", contacto="
                + contacto + ", producto=" + producto + ", instalacion=" + instalacion + "]";
    }

    String nombre, razonSocial, cedulaJuridica, ubicacion, direccion, logo, telefono;
    Contactos contacto;
    Productos producto;
    Instalacion instalacion;

    public Empresa() {

    }

    public Empresa(String razonSocial, String cedulaJuridica, String ubicacion, String direccion, String logo,
            String telefono) {
        this.razonSocial = razonSocial;
        this.cedulaJuridica = cedulaJuridica;
        this.ubicacion = ubicacion;
        this.direccion = direccion;
        this.logo = logo;
        this.telefono = telefono;
    }

    public Empresa(String razonSocial, String cedulaJuridica, String ubicacion, String direccion, String logo,
            String telefono, Contactos contacto, Productos producto, Instalacion instalacion) {
        this.razonSocial = razonSocial;
        this.cedulaJuridica = cedulaJuridica;
        this.ubicacion = ubicacion;
        this.direccion = direccion;
        this.logo = logo;
        this.telefono = telefono;
        this.contacto = contacto;
        this.producto = producto;
        this.instalacion = instalacion;
    }
    
    public void agregarContact(String tipo, String identificacion, String nombre, String puesto, String telefono, String correo) throws Exception {

		Contactos contacto;
		contacto = (new multiContactos()).insertContact(tipo, identificacion, nombre, puesto, telefono, correo, this.getId());
	}

    public String getRazonSocial() {
        return razonSocial;
    }
    
    public String getId() {
		return contacto.getIdentificacion();
	}

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getCedulaJuridica() {
        return cedulaJuridica;
    }

    public void setCedulaJuridica(String cedulaJuridica) {
        this.cedulaJuridica = cedulaJuridica;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Contactos getContacto() {
        return contacto;
    }

    public void setContacto(Contactos contacto) {
        this.contacto = contacto;
    }

    public Productos getProducto() {
        return producto;
    }

    public void setProducto(Productos producto) {
        this.producto = producto;
    }

    public Instalacion getInstalacion() {
        return instalacion;
    }

    public void setInstalacion(Instalacion instalacion) {
        this.instalacion = instalacion;
    }

}
