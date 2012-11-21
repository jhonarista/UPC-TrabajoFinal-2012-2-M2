/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.Date;
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
public class ClienteTest {
    
    public ClienteTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getCodigo method, of class Cliente.
     */
    @Test
    public void testGetCodigo() {
        System.out.println("getCodigo");
        Cliente instance = new Cliente();
        Long expResult = null;
        Long result = instance.getCodigo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getApellidoPaterno method, of class Cliente.
     */
    @Test
    public void testGetApellidoPaterno() {
        System.out.println("getApellidoPaterno");
        Cliente instance = new Cliente();
        String expResult = "";
        String result = instance.getApellidoPaterno();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getApellidoMaterno method, of class Cliente.
     */
    @Test
    public void testGetApellidoMaterno() {
        System.out.println("getApellidoMaterno");
        Cliente instance = new Cliente();
        String expResult = "";
        String result = instance.getApellidoMaterno();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class Cliente.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Cliente instance = new Cliente();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmail method, of class Cliente.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Cliente instance = new Cliente();
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDni method, of class Cliente.
     */
    @Test
    public void testGetDni() {
        System.out.println("getDni");
        Cliente instance = new Cliente();
        String expResult = "";
        String result = instance.getDni();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTelefono method, of class Cliente.
     */
    @Test
    public void testGetTelefono() {
        System.out.println("getTelefono");
        Cliente instance = new Cliente();
        String expResult = "";
        String result = instance.getTelefono();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFechaDeContacto method, of class Cliente.
     */
    @Test
    public void testGetFechaDeContacto() {
        System.out.println("getFechaDeContacto");
        Cliente instance = new Cliente();
        Date expResult = null;
        Date result = instance.getFechaDeContacto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFechaDePase method, of class Cliente.
     */
    @Test
    public void testGetFechaDePase() {
        System.out.println("getFechaDePase");
        Cliente instance = new Cliente();
        Date expResult = null;
        Date result = instance.getFechaDePase();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCodigo method, of class Cliente.
     */
    @Test
    public void testSetCodigo() {
        System.out.println("setCodigo");
        Long codigo = null;
        Cliente instance = new Cliente();
        instance.setCodigo(codigo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setApellidoPaterno method, of class Cliente.
     */
    @Test
    public void testSetApellidoPaterno() {
        System.out.println("setApellidoPaterno");
        String apellidoPaterno = "";
        Cliente instance = new Cliente();
        instance.setApellidoPaterno(apellidoPaterno);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setApellidoMaterno method, of class Cliente.
     */
    @Test
    public void testSetApellidoMaterno() {
        System.out.println("setApellidoMaterno");
        String apellidoMaterno = "";
        Cliente instance = new Cliente();
        instance.setApellidoMaterno(apellidoMaterno);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class Cliente.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Cliente instance = new Cliente();
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmail method, of class Cliente.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "";
        Cliente instance = new Cliente();
        instance.setEmail(email);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDni method, of class Cliente.
     */
    @Test
    public void testSetDni() {
        System.out.println("setDni");
        String dni = "";
        Cliente instance = new Cliente();
        instance.setDni(dni);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTelefono method, of class Cliente.
     */
    @Test
    public void testSetTelefono() {
        System.out.println("setTelefono");
        String telefono = "";
        Cliente instance = new Cliente();
        instance.setTelefono(telefono);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFechaDeContacto method, of class Cliente.
     */
    @Test
    public void testSetFechaDeContacto() {
        System.out.println("setFechaDeContacto");
        Date fechaDeContacto = null;
        Cliente instance = new Cliente();
        instance.setFechaDeContacto(fechaDeContacto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFechaDePase method, of class Cliente.
     */
    @Test
    public void testSetFechaDePase() {
        System.out.println("setFechaDePase");
        Date fechaDePase = null;
        Cliente instance = new Cliente();
        instance.setFechaDePase(fechaDePase);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
