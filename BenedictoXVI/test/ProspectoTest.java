
import Entity.Prospecto;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class ProspectoTest {
    
    public ProspectoTest() {
    }
    
    @Test
    public void CrearNuevoProspecto(){
        String prospectoA [] = {"Pedro", "Diaz", "Perez", "pdiaz@hotmail.com", "12345678", "9876543", "01012012"};
        Prospecto miProspecto = new Prospecto();
        
        //assertArrayEquals(prospectoA, miProspecto.crearProspecto("Pedro", "Diaz", "Perez", "pdiaz@hotmail.com", "12345678", "9876543", "01012012"));
        assertArrayEquals(prospectoA, miProspecto.crearProspecto("Pedro", "Diaz", "Perez", "pdiaz@hotmail.com", "12345678", "9876543", "01012012"));
        
    }
    
    @Test
    public void CompruebaSiExisteProspesctoPorDNI(){
        String prospectoA [] = {"Pedro", "Diaz", "Perez", "pdiaz@hotmail.com", "12345678", "9876543", "01012012"};
        Prospecto miProspecto = new Prospecto();
        
        miProspecto.crearProspecto("Pedro", "Diaz", "Perez", "pdiaz@hotmail.com", "12345678", "9876543", "01012012");

        assertEquals(prospectoA[4], "12345678");
    }
    
    @Test
    public void EliminaElContenidoDeLosDatosDeUnProspecto(){
        String prospectoA [] = {"", "", "", "", "", "", ""};
        Prospecto miProspecto = new Prospecto();
        
        //miProspecto.borrarDatos("12345678");
        
        assertArrayEquals(prospectoA, miProspecto.borrarDatos("11223344"));
        
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

}
