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
    
        String validar = admCliente.buscarClientePorNombre("Hernan");
        System.out.println(validar);
        Assert.assertEquals("Hernan", validar);
    }
    
 
  
     @Test
    public void validarElFuncionamientoPorDNI(){
    
       
        String validar = admCliente.buscarClientePorDNI("59038572");
        System.out.println(validar);
        Assert.assertEquals("59038572", validar);
    }

}
