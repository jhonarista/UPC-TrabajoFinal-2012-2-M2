/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author feral
 */
public class Usuario {
     private String codigo;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String nombreUsuario;
    private String mail;
    private String fecha;
    private String posicion;
    private String rol;
    private String contraseña;
    private boolean mover;

    public Usuario(String codigo, String nombre, String apellidoPaterno, String apellidoMaterno, String nombreUsuario, String mail, String fecha, String posicion, String rol, String contraseña) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.nombreUsuario = nombreUsuario;
        this.mail = mail;
        this.fecha = fecha;
        this.posicion = posicion;
        this.rol = rol;
        this.contraseña = contraseña;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
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

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
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

    public void setApellidoMaterno(String apellidoPaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public boolean isMover() {
        return mover;
    }  
    
 }
    

