package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class AgmPrimTest13{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        AgmPrim agmPrim = new AgmPrim(null);
        assertNotNull(agmPrim);
    }

    @Test(timeout=1000)
    public void testObterAgm() throws Exception {
        Grafo grafo = new Grafo(4);
        grafo.insereAresta(0, 1, 2);
        grafo.insereAresta(0, 2, 3);
        grafo.insereAresta(1, 2, 1);
        grafo.insereAresta(1, 3, 4);
        grafo.insereAresta(2, 3, 2);
        
        AgmPrim agmPrim = new AgmPrim(grafo);
        agmPrim.obterAgm(0);
        
        assertEquals(0, agmPrim.antecessor(0));
        assertEquals(1, agmPrim.antecessor(1));
        assertEquals(0, agmPrim.antecessor(2));
        assertEquals(2, agmPrim.antecessor(3));
        
        assertEquals(0.0, agmPrim.peso(0), 0.001);
        assertEquals(2.0, agmPrim.peso(1), 0.001);
        assertEquals(3.0, agmPrim.peso(2), 0.001);
        assertEquals(5.0, agmPrim.peso(3), 0.001);
    }

    @Test(timeout=1000)
    public void testImprime() throws Exception {
        Grafo grafo = new Grafo(4);
        grafo.insereAresta(0, 1, 2);
        grafo.insereAresta(0, 2, 3);
        grafo.insereAresta(1, 2, 1);
        grafo.insereAresta(1, 3, 4);
        grafo.insereAresta(2, 3, 2);
        
        AgmPrim agmPrim = new AgmPrim(grafo);
        agmPrim.obterAgm(0);
        
        agmPrim.imprime();
    }
}