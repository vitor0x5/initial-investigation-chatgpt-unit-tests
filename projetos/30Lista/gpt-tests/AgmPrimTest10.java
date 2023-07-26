package ds;import ds.AgmPrim;
import ds.FPHeapMinIndireto;
import ds.Grafo;
import org.junit.Test;

import static org.junit.Assert.*;

public class AgmPrimTest10{


    @Test(timeout = 1000)
    public void testDefaultConstructor() {
        AgmPrim agmPrim = new AgmPrim(new Grafo(1));
        assertNotNull(agmPrim);
    }

    @Test(timeout = 1000)
    public void testObterAgm() throws Exception {
        Grafo grafo = new Grafo(4);
        grafo.insereAresta(0, 1, 2);
        grafo.insereAresta(0, 2, 3);
        grafo.insereAresta(1, 3, 4);
        grafo.insereAresta(1, 2, 1);
        grafo.insereAresta(2, 3, 5);
        AgmPrim agmPrim = new AgmPrim(grafo);
        agmPrim.obterAgm(0);
        assertEquals(0, agmPrim.antecessor(0));
        assertEquals(-1, agmPrim.antecessor(1));
        assertEquals(0, agmPrim.antecessor(2));
        assertEquals(1, agmPrim.antecessor(3));
        assertEquals(0.0, agmPrim.peso(0), 0.01);
        assertEquals(Double.MAX_VALUE, agmPrim.peso(1), 0.01);
        assertEquals(3.0, agmPrim.peso(2), 0.01);
        assertEquals(4.0, agmPrim.peso(3), 0.01);
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testRetiraMinEmptyHeap() throws Exception {
        FPHeapMinIndireto heap = new FPHeapMinIndireto(new double[]{}, new int[]{});
        heap.retiraMin();
    }

    @Test(timeout = 1000)
    public void testRetiraMinOneElement() throws Exception {
        FPHeapMinIndireto heap = new FPHeapMinIndireto(new double[]{0, 5}, new int[]{0, 1});
        int result = heap.retiraMin();
        assertEquals(1, result);
        assertTrue(heap.vazio());
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testRetiraMin() throws Exception {
        FPHeapMinIndireto heap = new FPHeapMinIndireto(new double[]{0, 5, 3}, new int[]{0, 1, 2});
        int result = heap.retiraMin();
        assertEquals(1, result);
        result = heap.retiraMin();
        assertEquals(2, result);
        assertTrue(heap.vazio());
        heap.retiraMin();
    }

    @Test(timeout = 1000)
    public void testDiminuiChave() throws Exception {
        FPHeapMinIndireto heap = new FPHeapMinIndireto(new double[]{0, 5, 3}, new int[]{0, 1, 2});
        heap.diminuiChave(2, 1);
        int result = heap.retiraMin();
        assertEquals(2, result);
        result = heap.retiraMin();
        assertEquals(0, result);
    }

    @Test(timeout = 1000)
    public void testVazio() {
        FPHeapMinIndireto heap = new FPHeapMinIndireto(new double[]{}, new int[]{});
        assertTrue(heap.vazio());

        heap = new FPHeapMinIndireto(new double[]{0, 5, 3}, new int[]{0, 1, 2});
        assertFalse(heap.vazio());
    }
}