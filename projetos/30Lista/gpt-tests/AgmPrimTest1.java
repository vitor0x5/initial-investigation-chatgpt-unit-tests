package ds;import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class AgmPrimTest1{


    private AgmPrim agmPrim;

    @Before
    public void setUp() {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 2);
        grafo.insereAresta(0, 3, 5);
        grafo.insereAresta(1, 2, 3);
        grafo.insereAresta(1, 3, 3);
        grafo.insereAresta(2, 4, 2);
        grafo.insereAresta(3, 4, 4);
        grafo.insereAresta(4, 1, 1);
        agmPrim = new AgmPrim(grafo);
    }

    @Test(timeout=1000)
    public void testDefaultConstructor() {
        assertNotNull(agmPrim);
    }

    @Test(timeout=1000)
    public void testObterAgm() throws Exception {
        agmPrim.obterAgm(0);
        assertEquals(0, agmPrim.antecessor(0));
        assertEquals(1, agmPrim.antecessor(1));
        assertEquals(4, agmPrim.antecessor(2));
        assertEquals(0, agmPrim.antecessor(3));
        assertEquals(1, agmPrim.antecessor(4));
        assertEquals(0.0, agmPrim.peso(0), 0.001);
        assertEquals(2.0, agmPrim.peso(1), 0.001);
        assertEquals(3.0, agmPrim.peso(2), 0.001);
        assertEquals(5.0, agmPrim.peso(3), 0.001);
        assertEquals(1.0, agmPrim.peso(4), 0.001);
    }

    @Test(timeout=1000)
    public void testImprime() {
        agmPrim.imprime();
        // Verify the output manually
    }
}