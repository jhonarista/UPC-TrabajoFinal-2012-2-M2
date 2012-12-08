
package Entity;

public class Prospecto {
    private String nombres;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String correo;
    private String dni;
    private String telefono;
    private String fechaContacto;
    private boolean esCliente;

    public Prospecto(String nombres, String apellidoPaterno, String apellidoMaterno, String correo, String dni, String telefono, String fechaContacto) {
        this.nombres = nombres;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.correo = correo;
        this.dni = dni;
        this.telefono = telefono;
        this.fechaContacto = fechaContacto;
        this.esCliente = false; 
    }

    public String getNombres() {
        return nombres;
    }
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }
    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }
    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFechaContacto() {
        return fechaContacto;
    }
    public void setFechaContacto(String fechaContacto) {
        this.fechaContacto = fechaContacto;
    }

    public boolean isEsCliente() {
        return esCliente;
    }
    public void setEsCliente(boolean esCliente) {
        this.esCliente = esCliente;
    }
    
}
