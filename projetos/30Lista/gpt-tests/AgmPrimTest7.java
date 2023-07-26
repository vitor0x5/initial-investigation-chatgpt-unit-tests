package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class AgmPrimTest7{

    
    @Test(expected = Exception.class, timeout = 1000)
    public void testDefaultConstructor() throws Exception {
        AgmPrim agmPrim = new AgmPrim(null);
    }
    
    @Test(expected = Exception.class, timeout = 1000)
    public void testObterAgm() throws Exception {
        Grafo grafo = new Grafo(5);
        AgmPrim agmPrim = new AgmPrim(grafo);
        agmPrim.obterAgm(0);
    }
    
    @Test(expected = Exception.class, timeout = 1000)
    public void testAntecessor() throws Exception {
        AgmPrim agmPrim = new AgmPrim(null);
        assertEquals(-1, agmPrim.antecessor(0));
    }
    
    @Test(expected = Exception.class, timeout = 1000)
    public void testPeso() throws Exception {
        AgmPrim agmPrim = new AgmPrim(null);
        assertEquals(Double.MAX_VALUE, agmPrim.peso(0), 0);
    }
    
    @Test(timeout = 1000)
    public void testImprime() throws Exception {
        AgmPrim agmPrim = new AgmPrim(null);
        agmPrim.imprime();
    }
    
    @Test
    public void testRetiraMin() throws Exception {
        Grafo grafo = new Grafo(5);
        AgmPrim agmPrim = new AgmPrim(grafo);
        agmPrim.obterAgm(0);
        assertEquals(-1, agmPrim.retiraMin());
    }
    
    @Test(expected = Exception.class, timeout = 1000)
    public void testDiminuiChave() throws Exception {
        AgmPrim agmPrim = new AgmPrim(null);
        agmPrim.diminuiChave(0, 5.0);
    }
    
    @Test(timeout = 1000)
    public void testVazio() throws Exception {
        AgmPrim agmPrim = new AgmPrim(null);
        assertTrue(agmPrim.vazio());
    }
}