package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class OrdenacaoTest12{


    @Test(timeout = 1000)
    public void testDefaultConstructor() throws Exception {
        Ordenacao ordenacao = new Ordenacao();
        assertNotNull(ordenacao);
    }

    @Test(timeout = 1000)
    public void testRefaz() throws Exception {
        Item[] v = new Item[6];
        v[1] = new MeuItem(5);
        v[2] = new MeuItem(2);
        v[3] = new MeuItem(7);
        v[4] = new MeuItem(1);
        v[5] = new MeuItem(3);
        FPHeapMax fpHeap = new FPHeapMax(v);

        fpHeap.refaz(1, 5);
        assertEquals(new MeuItem(7), v[1]);
        assertEquals(new MeuItem(3), v[2]);
        assertEquals(new MeuItem(5), v[3]);
        assertEquals(new MeuItem(1), v[4]);
        assertEquals(new MeuItem(2), v[5]);
    }

    @Test(timeout = 1000)
    public void testConstroi() throws Exception {
        Item[] v = new Item[6];
        v[1] = new MeuItem(5);
        v[2] = new MeuItem(2);
        v[3] = new MeuItem(7);
        v[4] = new MeuItem(1);
        v[5] = new MeuItem(3);
        FPHeapMax fpHeap = new FPHeapMax(v);

        fpHeap.constroi();
        assertEquals(new MeuItem(7), v[1]);
        assertEquals(new MeuItem(5), v[2]);
        assertEquals(new MeuItem(3), v[3]);
        assertEquals(new MeuItem(1), v[4]);
        assertEquals(new MeuItem(2), v[5]);
    }

    @Test(timeout = 1000)
    public void testSelecao() throws Exception {
        Item[] v = new Item[6];
        v[1] = new MeuItem(5);
        v[2] = new MeuItem(2);
        v[3] = new MeuItem(7);
        v[4] = new MeuItem(1);
        v[5] = new MeuItem(3);
        Ordenacao.selecao(v, 5);

        assertEquals(new MeuItem(1), v[1]);
        assertEquals(new MeuItem(2), v[2]);
        assertEquals(new MeuItem(3), v[3]);
        assertEquals(new MeuItem(5), v[4]);
        assertEquals(new MeuItem(7), v[5]);
    }

    @Test(timeout = 1000)
    public void testInsercao() throws Exception {
        Item[] v = new Item[6];
        v[1] = new MeuItem(5);
        v[2] = new MeuItem(2);
        v[3] = new MeuItem(7);
        v[4] = new MeuItem(1);
        v[5] = new MeuItem(3);
        Ordenacao.insercao(v, 5);

        assertEquals(new MeuItem(1), v[1]);
        assertEquals(new MeuItem(2), v[2]);
        assertEquals(new MeuItem(3), v[3]);
        assertEquals(new MeuItem(5), v[4]);
        assertEquals(new MeuItem(7), v[5]);
    }

    @Test(timeout = 1000)
    public void testShellsort() throws Exception {
        Item[] v = new Item[6];
        v[1] = new MeuItem(5);
        v[2] = new MeuItem(2);
        v[3] = new MeuItem(7);
        v[4] = new MeuItem(1);
        v[5] = new MeuItem(3);
        Ordenacao.shellsort(v, 5);

        assertEquals(new MeuItem(1), v[1]);
        assertEquals(new MeuItem(2), v[2]);
        assertEquals(new MeuItem(3), v[3]);
        assertEquals(new MeuItem(5), v[4]);
        assertEquals(new MeuItem(7), v[5]);
    }

    @Test(timeout = 1000)
    public void testQuicksort() throws Exception {
        Item[] v = new Item[6];
        v[1] = new MeuItem(5);
        v[2] = new MeuItem(2);
        v[3] = new MeuItem(7);
        v[4] = new MeuItem(1);
        v[5] = new MeuItem(3);
        Ordenacao.quicksort(v, 5);

        assertEquals(new MeuItem(1), v[1]);
        assertEquals(new MeuItem(2), v[2]);
        assertEquals(new MeuItem(3), v[3]);
        assertEquals(new MeuItem(5), v[4]);
        assertEquals(new MeuItem(7), v[5]);
    }

    @Test(timeout = 1000)
    public void testHeapsort() throws Exception {
        Item[] v = new Item[6];
        v[1] = new MeuItem(5);
        v[2] = new MeuItem(2);
        v[3] = new MeuItem(7);
        v[4] = new MeuItem(1);
        v[5] = new MeuItem(3);
        Ordenacao.heapsort(v, 5);

        assertEquals(new MeuItem(1), v[1]);
        assertEquals(new MeuItem(2), v[2]);
        assertEquals(new MeuItem(3), v[3]);
        assertEquals(new MeuItem(5), v[4]);
        assertEquals(new MeuItem(7), v[5]);
    }
}