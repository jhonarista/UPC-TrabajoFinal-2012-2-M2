package Entity;

import java.util.Date;

public class Cliente {
    
    private Long codigo;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String nombre;
    private String email;
    private String dni;
    private String telefono;
    private Date fechaDeContacto;
    private Date fechaDePase;

    public Cliente() {
    }

    public Cliente(Long codigo, String apellidoPaterno, String apellidoMaterno, String nombre, String email, String dni, String telefono, Date fechaDeContacto, Date fechaDePase) {
        this.codigo = codigo;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.nombre = nombre;
        this.email = email;
        this.dni = dni;
        this.telefono = telefono;
        this.fechaDeContacto = fechaDeContacto;
        this.fechaDePase = fechaDePase;
    }

    public Long getCodigo() {
        return codigo;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public String getDni() {
        return dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public Date getFechaDeContacto() {
        return fechaDeContacto;
    }

    public Date getFechaDePase() {
        return fechaDePase;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setFechaDeContacto(Date fechaDeContacto) {
        this.fechaDeContacto = fechaDeContacto;
    }

    public void setFechaDePase(Date fechaDePase) {
        this.fechaDePase = fechaDePase;
    }

}
