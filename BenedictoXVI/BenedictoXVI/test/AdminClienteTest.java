
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
    
  /*
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
     
    
      @Test
      public void validarElFuncionamientoPorTelefono(){
    
        
         String validar = admCliente.buscarClientePorTelefono("2258849");
         System.out.println(validar);
         Assert.assertEquals("2258849", validar);
     }
    
      @Test
     public void validarElFuncionamientoPorFechaDeContacto(){
    
         String validar = admCliente.buscarClientePorFecha("19/04/2012");
        System.out.println(validar);
        Assert.assertEquals("19/04/2012", validar);
     }
   */
      @Test
    public void validarElFuncionamientoDelBotonNuevo(){
       
        int validar = admCliente.agregarCliente("Cesar", "Meneses", "Medina", "cmeneses@gmail.com", "70670398", "5337667", "10/03/2012", "no");
        Assert.assertEquals(0, validar);
    }
    /*
      @Test
      public void validarElFuncionamientoDelBotonEliminar(){
        
        int validar = admCliente.eliminarCliente("59038572");
        Assert.assertEquals(1, validar);
    }*/

}
