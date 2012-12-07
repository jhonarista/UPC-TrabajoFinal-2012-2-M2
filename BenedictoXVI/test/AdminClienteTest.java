
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
    public void validarElFuncionamientoPorDNI(){
    
       
        String validar = admCliente.buscarClientePorDNI("59038572");
        System.out.println(validar);
        Assert.assertEquals("59038572", validar);
    }

}
