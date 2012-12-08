import Admin.AdminProspecto2;
import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class AdminProspecto2Test {
    
    public AdminProspecto2Test() {
    }
    
     /*@Test
   public void validarBotonBuscarPorNombre(){
        AdminProspecto2 miAdmProspecto = new AdminProspecto2();
        String validar = miAdmProspecto.buscarProspectoPorNombre("victor");
        System.out.println("FILTRO POR NOMBRE BUSCADO: " + validar);
        Assert.assertEquals("Victor", validar);
    }*/
    
    /*@Test
    public void validarBotonBuscarPorPaterno(){
        AdminProspecto2 miAdmProspecto = new AdminProspecto2();
        String validar = miAdmProspecto.buscarProspectoPorApellidoPaterno("picapiedra");
        System.out.println("FILTRO POR APELLIDO PATERNO BUSCADO: " + validar);
        Assert.assertEquals("Picapiedra", validar);
    }*/
    
     /*@Test
    public void validarBotonBuscarPorMaterno(){
        AdminProspecto2 miAdmProspecto = new AdminProspecto2();
        String validar = miAdmProspecto.buscarProspectoPorApellidoMaterno("nakamoto");
        System.out.println("FILTRO POR APELLIDO MATERNO BUSCADO: " + validar);
        Assert.assertEquals("Nakamoto", validar);
    }*/
    
    /*@Test
    public void validarBotonBuscarPorCorreo(){
        AdminProspecto2 miAdmProspecto = new AdminProspecto2();
        String validar = miAdmProspecto.buscarProspectoPorCorreo("ayto@hotmail.com");
        System.out.println("FILTRO POR CORREO BUSCADO: " + validar);
        Assert.assertEquals("ayto@hotmail.com", validar);
    }*/
    
  /*  @Test
    public void validarBotonBuscarPorDNI(){
        AdminProspecto2 miAdmProspecto = new AdminProspecto2();
        String validar = miAdmProspecto.buscarProspectoPorDNI("10471398");
        System.out.println("FILTRO POR DNI BUSCADO: " + validar);
        Assert.assertEquals("10471398", validar);
    }*/
    
    /*@Test
    public void validarBotonBuscarPorTelefono(){
        AdminProspecto2 miAdmProspecto = new AdminProspecto2();
        String validar = miAdmProspecto.buscarProspectoPorTelefono("999999999");
        System.out.println("FILTRO POR TELEFONO BUSCADO: " + validar);
        Assert.assertEquals("999999999", validar);
    }*/
    
   /* @Test
    public void validarBotonBuscarPorFechaContacto(){
        AdminProspecto2 miAdmProspecto = new AdminProspecto2();
        String validar = miAdmProspecto.buscarProspectoPorFecha("05/05/2012");
        System.out.println("FILTRO POR FECHA DE CONTACTO BUSCADO: " + validar);
        Assert.assertEquals("05/05/2012", validar);
    }*/ 
    
    /*@Test
    public void validarBotonAgregarProspecto(){
        AdminProspecto2 miAdmProspecto = new AdminProspecto2();
        int validar = miAdmProspecto.agregarProspecto("Aaa", "Bbb", "Ccc", "Ddd@ddd.com", "123", "789", "01/01/2012");
        //System.out.println("FILTRO POR FECHA DE CONTACTO BUSCADO: " + validar);
        Assert.assertEquals(0, validar);
    }*/
         
   /*  @Test
    public void validarBotonEliminarProspecto(){
        AdminProspecto2 miAdmProspecto = new AdminProspecto2();
        int validar = miAdmProspecto.eliminarProspecto("1");
        //System.out.println("FILTRO POR FECHA DE CONTACTO BUSCADO: " + validar);
        Assert.assertEquals(1, validar);
    }*/
    
    @Test
    public void validarBotonAcualizarProspecto(){
        AdminProspecto2 miAdmProspecto = new AdminProspecto2();
        int validar = miAdmProspecto.actualizaProspecto("z", "z", "z", "z@zzz.com", "z", "z", "z");
        System.out.println("FILTRO POR FECHA DE CONTACTO BUSCADO: " + validar);
        Assert.assertEquals(0, validar);
    }
    
  

}
