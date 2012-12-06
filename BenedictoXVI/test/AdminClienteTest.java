
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import Admin.AdminCliente;
import junit.framework.Assert;
import org.junit.Test;



/**
 *
 * @author feral
 */
public class AdminClienteTest {
    
    AdminCliente admCliente = new AdminCliente();
    
  
    @Test
    public void validarElFuncionamientoPorNombre(){
    
        String validar = admCliente.buscarClientePorNombre("Jhon");
        System.out.println(validar);
        Assert.assertEquals("Jhon", validar);
    }
    
   @Test
   public void validarElFuncionamientoPorApellidoPaterno(){
    
        
       String validar = admCliente.buscarClientePorApellidoPaterno("Arista");
        System.out.println(validar);
        Assert.assertEquals("Arista", validar);
    }
   
    @Test
    public void validarElFuncionamientoDelBotonBuscarPorApellidoMaterno(){
    
        
         String validar = admCliente.buscarClientePorApellidoMaterno("Apolinario");
         System.out.println(validar);
        Assert.assertEquals("Apolinario", validar);
    }
    
    @Test
       public void validarElFuncionamientoDelBotonBuscarPorCorreo(){
          
        String validar = admCliente.buscarClientePorCorreo("jhonarista@gmail.com");
        System.out.println(validar);
        Assert.assertEquals("jhonarista@gmail.com", validar);
    }
  
     @Test
    public void validarElFuncionamientoPorDNI(){
    
       
        String validar = admCliente.buscarClientePorDNI("2643768");
        System.out.println(validar);
        Assert.assertEquals("2643768", validar);
    }
     
     @Test
     public void validarElFuncionamientoDelBotonBuscarPorTelefono(){
    
        
        String validar = admCliente.buscarClientePorTelefono("2258849");
        System.out.println(validar);
        Assert.assertEquals("2258849", validar);
    }

}
     
