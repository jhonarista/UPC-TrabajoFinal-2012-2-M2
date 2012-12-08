
import Admin.AdminUsuario;
import Entity.Usuario;
import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author feral
 */
public class AdminUsuarioTest {
    
  
    
        String codigo = "u70480792";
        String nombre = "Johns";
        String apellidoPaterno = "Rivas";
        String apellidoMaterno = "Gómez";
        String nombreUsuario = "jorgito";
        String mail = "jrivas@upc.edu.pe";
        String fecha = "12/08/1984";
        String posicion = "Ejecutivo de Ventas";
        String rol = "usuario";
        String contrasenha = "loki123";
        boolean mover = true;
    
    Usuario user = new Usuario(codigo, nombre, apellidoPaterno, apellidoMaterno, nombreUsuario, mail, fecha, posicion, rol, contrasenha);
    
    AdminUsuario admUser = new AdminUsuario();
    
    
    @Test
    public void ValidarQueElCodigoSeaMandado(){
        
        Assert.assertNotSame("Debe ingresar un código","", user.getCodigo());
    }
    /*
    @Test
    public void ValidarQueElNombreSeaMandado(){
        
        Assert.assertNotSame("Debe ingresar un nombre","", user.getNombre());
    }
    
    @Test
    public void ValidarQueElApellidoPaternoSeaMandado(){
        
        Assert.assertNotSame("Debe ingresar Apellido Materno","", user.getApellidoPaterno());
    }
   */ 
}
