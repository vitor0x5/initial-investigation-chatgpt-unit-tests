package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class AgmPrimTest0{


    // Test for default constructor
    @Test(timeout = 1000)
    public void testDefaultConstructor() throws Exception {
        AgmPrim agmPrim = new AgmPrim(null);
        assertNotNull(agmPrim);
    }

    // Test for obterAgm method
    @Test(timeout = 1000)
    public void testObterAgm() throws Exception {
        Grafo grafo = new Grafo(4);
        grafo.insereAresta(0, 1, 2);
        grafo.insereAresta(0, 2, 3);
        grafo.insereAresta(1, 2, 1);
        grafo.insereAresta(1, 3, 4);
        grafo.insereAresta(2, 3, 5);

        AgmPrim agmPrim = new AgmPrim(grafo);
        agmPrim.obterAgm(0);

        assertEquals(-1, agmPrim.antecessor(0));
        assertEquals(0, agmPrim.antecessor(1));
        assertEquals(1, agmPrim.antecessor(2));
        assertEquals(1, agmPrim.antecessor(3));

        assertEquals(0.0, agmPrim.peso(0), 0.0);
        assertEquals(2.0, agmPrim.peso(1), 0.0);
        assertEquals(1.0, agmPrim.peso(2), 0.0);
        assertEquals(4.0, agmPrim.peso(3), 0.0);
    }

    // Test for imprime method
    @Test(timeout = 1000)
    public void testImprime() throws Exception {
        Grafo grafo = new Grafo(4);
        grafo.insereAresta(0, 1, 2);
        grafo.insereAresta(0, 2, 3);
        grafo.insereAresta(1, 2, 1);
        grafo.insereAresta(1, 3, 4);
        grafo.insereAresta(2, 3, 5);

        AgmPrim agmPrim = new AgmPrim(grafo);
        agmPrim.obterAgm(0);
        agmPrim.imprime();
    }
}