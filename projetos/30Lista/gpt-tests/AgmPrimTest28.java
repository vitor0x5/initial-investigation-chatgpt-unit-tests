package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class AgmPrimTest28{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        AgmPrim agmPrim = new AgmPrim(null);
    }

    @Test(timeout=1000)
    public void testObterAgm() throws Exception {
        Grafo grafo = new Grafo(5);
        grafo.insereAresta(0, 1, 2);
        grafo.insereAresta(0, 2, 3);
        grafo.insereAresta(1, 2, 1);
        grafo.insereAresta(1, 3, 4);
        grafo.insereAresta(2, 3, 2);
        grafo.insereAresta(2, 4, 3);
        grafo.insereAresta(3, 4, 1);

        AgmPrim agmPrim = new AgmPrim(grafo);
        agmPrim.obterAgm(0);
    }

    @Test(timeout=1000)
    public void testAntecessor() throws Exception {
        AgmPrim agmPrim = new AgmPrim(null);
        int result = agmPrim.antecessor(0);
        assertEquals(-1, result);
    }

    @Test(timeout=1000)
    public void testPeso() throws Exception {
        AgmPrim agmPrim = new AgmPrim(null);
        double result = agmPrim.peso(0);
        assertEquals(Double.MAX_VALUE, result, 0.001);
    }

    @Test(timeout=1000)
    public void testImprime() throws Exception {
        AgmPrim agmPrim = new AgmPrim(null);
        agmPrim.imprime();
    }
}