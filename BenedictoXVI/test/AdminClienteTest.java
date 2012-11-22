/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

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
public class AdminClienteTest {
    
    AdminCliente admCliente = new AdminCliente();
    
    
    @Test
    public void validarElFuncionamientoDelBotonBuscarPorNombre(){
    
        String validar = admCliente.buscarClientePorNombre("Luis");
        System.out.println(validar);
        Assert.assertEquals("Luis", validar);
    }
    
  
   
     @Test
    public void validarElFuncionamientoDelBotonBuscarPorDNI(){
    
       
        String validar = admCliente.buscarClientePorDNI("59038572");
        System.out.println(validar);
        Assert.assertEquals("59038572", validar);
    }

}
