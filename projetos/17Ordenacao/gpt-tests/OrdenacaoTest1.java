package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class OrdenacaoTest1{


    @Test(timeout = 1000)
    public void testDefaultConstructor() throws Exception {
        Ordenacao ordenacao = new Ordenacao();
        assertNotNull(ordenacao);
    }

    @Test(timeout = 1000)
    public void testRefaz() throws Exception {
        Item[] v = new Item[5];
        v[1] = new MeuItem(10);
        v[2] = new MeuItem(5);
        v[3] = new MeuItem(15);
        v[4] = new MeuItem(8);
        FPHeapMax fpHeap = new FPHeapMax(v);
        fpHeap.refaz(1, 3);
        assertEquals(new MeuItem(15), v[1]);
        assertEquals(new MeuItem(8), v[2]);
        assertEquals(new MeuItem(10), v[3]);
    }

    @Test(timeout = 1000)
    public void testConstroi() throws Exception {
        Item[] v = new Item[5];
        v[1] = new MeuItem(10);
        v[2] = new MeuItem(5);
        v[3] = new MeuItem(15);
        v[4] = new MeuItem(8);
        FPHeapMax fpHeap = new FPHeapMax(v);
        fpHeap.constroi();
        assertEquals(new MeuItem(15), v[1]);
        assertEquals(new MeuItem(10), v[2]);
        assertEquals(new MeuItem(5), v[3]);
    }

    @Test(timeout = 1000)
    public void testSelecao() throws Exception {
        Item[] v = new Item[5];
        v[1] = new MeuItem(10);
        v[2] = new MeuItem(5);
        v[3] = new MeuItem(15);
        v[4] = new MeuItem(8);
        Ordenacao.selecao(v, 4);
        assertEquals(new MeuItem(5), v[1]);
        assertEquals(new MeuItem(8), v[2]);
        assertEquals(new MeuItem(10), v[3]);
        assertEquals(new MeuItem(15), v[4]);
    }

    @Test(timeout = 1000)
    public void testInsercao() throws Exception {
        Item[] v = new Item[5];
        v[1] = new MeuItem(10);
        v[2] = new MeuItem(5);
        v[3] = new MeuItem(15);
        v[4] = new MeuItem(8);
        Ordenacao.insercao(v, 4);
        assertEquals(new MeuItem(5), v[1]);
        assertEquals(new MeuItem(8), v[2]);
        assertEquals(new MeuItem(10), v[3]);
        assertEquals(new MeuItem(15), v[4]);
    }

    @Test(timeout = 1000)
    public void testShellsort() throws Exception {
        Item[] v = new Item[5];
        v[1] = new MeuItem(10);
        v[2] = new MeuItem(5);
        v[3] = new MeuItem(15);
        v[4] = new MeuItem(8);
        Ordenacao.shellsort(v, 4);
        assertEquals(new MeuItem(5), v[1]);
        assertEquals(new MeuItem(8), v[2]);
        assertEquals(new MeuItem(10), v[3]);
        assertEquals(new MeuItem(15), v[4]);
    }

    @Test(timeout = 1000)
    public void testQuicksort() throws Exception {
        Item[] v = new Item[5];
        v[1] = new MeuItem(10);
        v[2] = new MeuItem(5);
        v[3] = new MeuItem(15);
        v[4] = new MeuItem(8);
        Ordenacao.quicksort(v, 4);
        assertEquals(new MeuItem(5), v[1]);
        assertEquals(new MeuItem(8), v[2]);
        assertEquals(new MeuItem(10), v[3]);
        assertEquals(new MeuItem(15), v[4]);
    }

    @Test(timeout = 1000)
    public void testHeapsort() throws Exception {
        Item[] v = new Item[5];
        v[1] = new MeuItem(10);
        v[2] = new MeuItem(5);
        v[3] = new MeuItem(15);
        v[4] = new MeuItem(8);
        Ordenacao.heapsort(v, 4);
        assertEquals(new MeuItem(5), v[1]);
        assertEquals(new MeuItem(8), v[2]);
        assertEquals(new MeuItem(10), v[3]);
        assertEquals(new MeuItem(15), v[4]);
    }

}