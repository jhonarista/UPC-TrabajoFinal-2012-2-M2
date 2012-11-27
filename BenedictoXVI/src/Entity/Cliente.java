package Entity;

import java.util.Date;

public class Cliente {
    
     
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String mail;
    private String DNI;
    private String telefono;
    private String contact_date;
    private String transaccion;
    
    public Cliente (String nombre, String apellidoPaterno, String apellidoMaterno, String mail, String DNI, String telefono, String contact_date, String transaccion) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.mail = mail;
        this.DNI = DNI;
        this.telefono = telefono;
        this.contact_date = contact_date;
        this.transaccion = transaccion;
    }

    public Cliente() {
    }
    
    

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getTransaccion() {
        return transaccion;
    }

    public void setTransaccion(String transaccion) {
        this.transaccion = transaccion;
    }

    public String getContact_date() {
        return contact_date;
    }

    public void setContact_date(String contact_date) {
        this.contact_date = contact_date;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
    
}
