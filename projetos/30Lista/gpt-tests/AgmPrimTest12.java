package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class AgmPrimTest12{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        AgmPrim agmPrim = new AgmPrim(null);
    }

    @Test(timeout=1000)
    public void testObterAgm() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 2);
        grafo.insereAresta(0, 3, 6);
        grafo.insereAresta(1, 2, 3);
        grafo.insereAresta(1, 3, 8);
        grafo.insereAresta(1, 4, 5);
        grafo.insereAresta(2, 4, 7);
        grafo.insereAresta(3, 4, 9);

        AgmPrim agmPrim = new AgmPrim(grafo);
        agmPrim.obterAgm(0);
    }

    @Test(timeout=1000)
    public void testAntecessor() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 2);
        grafo.insereAresta(0, 3, 6);
        grafo.insereAresta(1, 2, 3);
        grafo.insereAresta(1, 3, 8);
        grafo.insereAresta(1, 4, 5);
        grafo.insereAresta(2, 4, 7);
        grafo.insereAresta(3, 4, 9);

        AgmPrim agmPrim = new AgmPrim(grafo);
        agmPrim.obterAgm(0);

        assertEquals(-1, agmPrim.antecessor(0));
        assertEquals(0, agmPrim.antecessor(1));
        assertEquals(1, agmPrim.antecessor(2));
        assertEquals(0, agmPrim.antecessor(3));
        assertEquals(1, agmPrim.antecessor(4));
    }

    @Test(timeout=1000)
    public void testPeso() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 2);
        grafo.insereAresta(0, 3, 6);
        grafo.insereAresta(1, 2, 3);
        grafo.insereAresta(1, 3, 8);
        grafo.insereAresta(1, 4, 5);
        grafo.insereAresta(2, 4, 7);
        grafo.insereAresta(3, 4, 9);

        AgmPrim agmPrim = new AgmPrim(grafo);
        agmPrim.obterAgm(0);

        assertEquals(0, agmPrim.peso(0), 0.001);
        assertEquals(2, agmPrim.peso(1), 0.001);
        assertEquals(3, agmPrim.peso(2), 0.001);
        assertEquals(6, agmPrim.peso(3), 0.001);
        assertEquals(5, agmPrim.peso(4), 0.001);
    }

}