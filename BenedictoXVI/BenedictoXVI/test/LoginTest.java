
import Admin.AdminUsuario;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author feral
 */
public class LoginTest {
    
        AdminUsuario admin = new AdminUsuario();
    
    @Test
    public void testDeLoginValidandoUsuarioYContrasenyaEnLaBD() {
        String user = "jpereira";
        String pass = "a1b2c3";
        
        admin.loginUser(user, pass);
        Assert.assertEquals(true, admin.isResultado());
    }
   
    @Test
    public void testDeLoginValidandoUsuarioYContrasenyaNoNulos() {
        String user = "jvaldivia";
        String pass = "12345";
        
        admin.loginUser(user,pass);
        Assert.assertEquals(true, admin.isResultado());
    }
}
