package ds;import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;

public class AgmPrimTest16{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        AgmPrim agmPrim = new AgmPrim(null);
        assertNotNull(agmPrim);
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

        int[] expectedAntecessor = {-1, 0, 1, 0, 1};
        double[] expectedPeso = {0.0, 2.0, 3.0, 6.0, 5.0};

        assertArrayEquals(expectedAntecessor, Arrays.copyOfRange(agmPrim.antecessor, 0, 5));
        assertArrayEquals(expectedPeso, Arrays.copyOfRange(agmPrim.p, 0, 5), 0.01);
    }

    @Test(timeout=1000)
    public void testAntecessor() throws Exception {
        AgmPrim agmPrim = new AgmPrim(null);
        agmPrim.antecessor = new int[]{1, 2, 3, 4, 5};
        assertEquals(1, agmPrim.antecessor(0));
        assertEquals(2, agmPrim.antecessor(1));
        assertEquals(3, agmPrim.antecessor(2));
        assertEquals(4, agmPrim.antecessor(3));
        assertEquals(5, agmPrim.antecessor(4));
    }

    @Test(timeout=1000)
    public void testPeso() throws Exception {
        AgmPrim agmPrim = new AgmPrim(null);
        agmPrim.p = new double[]{1.0, 2.0, 3.0, 4.0, 5.0};
        assertEquals(1.0, agmPrim.peso(0), 0.01);
        assertEquals(2.0, agmPrim.peso(1), 0.01);
        assertEquals(3.0, agmPrim.peso(2), 0.01);
        assertEquals(4.0, agmPrim.peso(3), 0.01);
        assertEquals(5.0, agmPrim.peso(4), 0.01);
    }

    @Test(timeout=1000)
    public void testImprime() throws Exception {
        AgmPrim agmPrim = new AgmPrim(null);
        agmPrim.antecessor = new int[]{1, 2, -1, 1, 3};
        agmPrim.p = new double[]{0.0, 2.0, 0.0, 3.0, 4.0};

        agmPrim.imprime();
    }
}