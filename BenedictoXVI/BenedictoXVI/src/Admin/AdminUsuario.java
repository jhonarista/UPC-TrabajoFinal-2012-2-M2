/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

import Entity.Usuario;
import java.util.ArrayList;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

/**
 *
 * @author feral
 */
public class AdminUsuario {
    
    private ArrayList<Usuario> data= new ArrayList<Usuario>();
    private boolean resultado;

    public ArrayList<Usuario> getData() {
        return data;
    }
    
    
    public ArrayList<Usuario> tablaDeUsuarios() {
        this.data.add(new Usuario("45434413", "Jorge", "Pereira", "Lopez", "jpereira", "jpereira@upc.com", "12/04/2012", "Asistente de RRHH", "usuario", "a1b2c3"));
        this.data.add(new Usuario("13307922", "Helen", "Alva", "Marquez", "halva", "halva@upc.com", "24/05/2012", "Analista de RRHH", "usuario", "123456"));
        this.data.add(new Usuario("70480792", "Eddie", "Jaime", "Diaz", "ejaimed", "ejaimed@gmail.com", "25/07/2012", "Ventas", "UsuarioComun", "qwer1234"));
        return data;
    }

    public boolean isResultado() {
        return resultado;
    }
    
    
    public int agregarUsuario(String codigo, String nombre, String apellidoPaterno, String apellidoMaterno, String nombreUsuario, String mail, String fecha, String posicion, String rol, String contrasenha){
        
        int condicion = 0;
       
        tablaDeUsuarios();
        for (Usuario Usuario : data){
            if(Usuario.getCodigo().equals(codigo)){
                condicion = 1;
                System.out.println("El usuario ya existe");
                
            }
        }
      
        if(condicion == 0){
            Usuario nuevoUsuario = new Usuario(codigo, nombre, apellidoPaterno, apellidoMaterno, nombreUsuario, mail, fecha, posicion, rol, contrasenha);
            data.add(nuevoUsuario);
            System.out.println("Usuario agregado correctamente");
        }else {
            
            System.out.println("El usuario no se agregó");
        }
        
        return condicion;
        
    }
    
   public String buscarUsuariosPorCodigo(String codigo){
        
        String resultBusqueda = "No se encuentra registro";
        tablaDeUsuarios();
        for(int i = 0; i<data.size();i++){
            String codigoBuscado = data.get(i).getCodigo();
            if (codigoBuscado.equals(codigo)){
                resultBusqueda = data.get(i).getCodigo();
                System.out.println("SU BÚSQUEDA POR CÓDIGO MUESTRA LOS SIGUIENTES RESULTADOS\t" + "\n");
                System.out.println("Código: \t" + "\t" + data.get(i).getCodigo());
                System.out.println("Nombre: \t" + "\t" + data.get(i).getNombre());
                System.out.println("Apellido Paterno: \t" + data.get(i).getApellidoPaterno());
                System.out.println("Apellido Materno: \t" + data.get(i).getApellidoMaterno());
                System.out.println("Nombre de usuario: \t" + data.get(i).getNombreUsuario());
                System.out.println("Email: \t" + "\t" + "\t" + data.get(i).getMail());
                System.out.println("Fecha de ingreso: \t" + data.get(i).getFecha());
                System.out.println("Cargo: \t" + "\t" + "\t" + data.get(i).getPosicion());
                System.out.println("Rol: \t" + "\t" + "\t" + data.get(i).getRol());
                
                
            }else{
                resultBusqueda = "La busqueda no produjo ningún resultado";
            }
        }
        return resultBusqueda;
    }

    
    public String buscarUsuariosPorNombre(String nombre){
        String cadena;
        String resultBusqueda = "No se encuentra registro";
        tablaDeUsuarios();
        cadena = nombre.substring(0,1).toUpperCase() + nombre.substring(1, nombre.length());
        for(int i = 0; i<data.size();i++){
            String NombreBuscado = data.get(i).getNombre();
            
            if (NombreBuscado.equals(cadena)){
                resultBusqueda = data.get(i).getNombre();
                System.out.println("SU BÚSQUEDA POR NOMBRE MUESTRA LOS SIGUIENTES RESULTADOS\t" + "\n");
                System.out.println("Código: \t" + "\t" + data.get(i).getCodigo());
                System.out.println("Nombre: \t" + "\t" + data.get(i).getNombre());
                System.out.println("Apellido Paterno: \t" + data.get(i).getApellidoPaterno());
                System.out.println("Apellido Materno: \t" + data.get(i).getApellidoMaterno());
                System.out.println("Nombre de usuario: \t" + data.get(i).getNombreUsuario());
                System.out.println("Email: \t" + "\t" + "\t" + data.get(i).getMail());
                System.out.println("Fecha de ingreso: \t" + data.get(i).getFecha());
                System.out.println("Cargo: \t" + "\t" + "\t" + data.get(i).getPosicion());
                System.out.println("Rol: \t" + "\t" + "\t" + data.get(i).getRol());
                
                
            }else{
                resultBusqueda = "La busqueda por nombre no produjo ningún resultado";
            }
        }
        return resultBusqueda;
    }

    
    public int ValidarNombreUsuario(String nombreUsuario){
        int condicion = 0;
        tablaDeUsuarios();
        for(Usuario Usuario:data){
            if(Usuario.getNombreUsuario().equals(nombreUsuario)){
                condicion = 1;
                System.out.println(nombreUsuario + " No está disponible");
            }
            
        }
        if(condicion == 0){
            System.out.println("'"+nombreUsuario+"'" + " NOMBRE DE USUARIO DISPONIBLE");
        }
        
        return condicion;
    }
    
    
    public boolean validarEliminar(boolean mover){
       boolean movimiento;
                if(mover == false){
                System.out.println("El registro puede ser eliminado");
                movimiento = true;
                }else{
                    movimiento = false;
                    System.out.println("El registro no puede ser eliminado, ya que tiene transacciones realizadas");
                }
        return movimiento;
    }
    
    
    public int eliminarUsuario(String codigo){
        
        int condicion = 0;
        tablaDeUsuarios();
        
        for(int i = 0; i < data.size();i++){
            
            String valorEliminar = data.get(i).getCodigo();
            
                
                if(valorEliminar.equals(codigo)){
                System.out.println("El registro " + "'" + data.get(i).getNombre() + "'" + " ha sido eliminado satisfactoriamente");
                condicion = 1;
                data.remove(i);
            }
      
        }
        if(condicion == 0){
            
            System.out.println("El usuario con código: " + "'" + codigo + "'" + " no ha sido eliminado");
        }
           
        return condicion;
    }
    
    
    public String editarUsuario(String codigo, String nombre, String apellidoPaterno, String apellidoMaterno, String nombreUsuario, String mail, String fecha, String posicion, String rol, String contrasenha) {
        Usuario user = null;
        ArrayList<Usuario> dbUsuario = tablaDeUsuarios();
        String result="";
        int index=0;
        for (int i = 0; i < dbUsuario.size() ; i++){
            if(dbUsuario.get(i).getCodigo().equalsIgnoreCase(codigo)){
                user = dbUsuario.get(i);
                index = dbUsuario.indexOf(user);
                user.setNombre(nombre);
                user.setApellidoPaterno(apellidoPaterno);
                user.setApellidoMaterno(apellidoMaterno);
                user.setNombreUsuario(nombreUsuario);
                user.setMail(mail);
                user.setFecha(fecha);
                user.setPosicion(posicion);
                user.setRol(rol);
                user.setContrasenha(contrasenha);
                 
            } 
        }
        if (user!=null){
            result+="El Usuario ha sido modificado correctamente: "+"\nNombre "+user.getNombre();
            result+="\nApellido Paterno: "+user.getApellidoPaterno();
            result+="\nApellido Materno: "+user.getApellidoMaterno();
            result+="\nUsername: "+user.getNombreUsuario();
            result+="\nCorreo: "+user.getMail();
            result+="\nFecha: "+user.getFecha();
            result+="\nPosicion: "+user.getPosicion();
            result+="\nRol: "+user.getRol();
            result+="\nPassword: "+user.getContrasenha();
            dbUsuario.add(index, user);
        }else {
            result="No existe el rol ingresado: "+nombre;
        }
        return result;
    }
    
    public void loginUser(String user, String pass) {
        int cond=0;
        
        if (user.equals("") || pass.equals("")){
            System.out.println("No Ha ingresado Usuario y/o contraseña...");
            //cond=1;
            //return false;
            resultado = false;
        } else {
            
            tablaDeUsuarios();
            for (int i = 0; i < this.data.size(); i++){
            String unombre=data.get(i).getNombreUsuario();
            String pd=data.get(i).getContrasenha();
            if (user.equals(unombre)){
                if (pass.equals(pd)){
                    System.out.println("Ingreso Correcto");
                    resultado = true;
                    cond=1;
                    break;
                    
                } else {
                    System.out.println("Contraseña Incorrecta");
                    cond=1;
                    resultado = false;
                    break;
                }
                
            } 
            
            }
            if (cond == 0){
                System.out.println("No existe el usuario ingresado...");
                //return false;
            }
        }
          
    }
    
}
