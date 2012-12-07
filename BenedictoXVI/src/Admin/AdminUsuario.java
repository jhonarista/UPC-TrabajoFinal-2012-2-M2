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
    
   
    
    
    
}
