package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class OrdenacaoTest31{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Ordenacao ordenacao = new Ordenacao();
        assertNotNull(ordenacao);
    }

    @Test(timeout=1000)
    public void testRefaz() throws Exception {
        Item[] v = new Item[5];
        v[0] = null;
        v[1] = new MeuItem(5);
        v[2] = new MeuItem(3);
        v[3] = new MeuItem(7);
        v[4] = new MeuItem(2);
        FPHeapMax fpHeap = new FPHeapMax(v);
        fpHeap.refaz(1, 3);
        assertEquals(7, ((MeuItem) v[1]).recuperaChave());
        assertEquals(3, ((MeuItem) v[2]).recuperaChave());
        assertEquals(5, ((MeuItem) v[3]).recuperaChave());
    }

    @Test(timeout=1000)
    public void testConstroi() throws Exception {
        Item[] v = new Item[6];
        v[0] = null;
        v[1] = new MeuItem(5);
        v[2] = new MeuItem(3);
        v[3] = new MeuItem(7);
        v[4] = new MeuItem(2);
        v[5] = new MeuItem(1);
        FPHeapMax fpHeap = new FPHeapMax(v);
        fpHeap.constroi();
        assertEquals(7, ((MeuItem) v[1]).recuperaChave());
        assertEquals(5, ((MeuItem) v[2]).recuperaChave());
        assertEquals(3, ((MeuItem) v[3]).recuperaChave());
        assertEquals(2, ((MeuItem) v[4]).recuperaChave());
        assertEquals(1, ((MeuItem) v[5]).recuperaChave());
    }

    @Test(timeout=1000)
    public void testSelecao() throws Exception {
        Item[] v = new Item[6];
        v[0] = null;
        v[1] = new MeuItem(5);
        v[2] = new MeuItem(3);
        v[3] = new MeuItem(7);
        v[4] = new MeuItem(2);
        v[5] = new MeuItem(1);
        Ordenacao.selecao(v, 5);
        assertEquals(1, ((MeuItem) v[1]).recuperaChave());
        assertEquals(2, ((MeuItem) v[2]).recuperaChave());
        assertEquals(3, ((MeuItem) v[3]).recuperaChave());
        assertEquals(5, ((MeuItem) v[4]).recuperaChave());
        assertEquals(7, ((MeuItem) v[5]).recuperaChave());
    }

    @Test(timeout=1000)
    public void testInsercao() throws Exception {
        Item[] v = new Item[6];
        v[0] = null;
        v[1] = new MeuItem(5);
        v[2] = new MeuItem(3);
        v[3] = new MeuItem(7);
        v[4] = new MeuItem(2);
        v[5] = new MeuItem(1);
        Ordenacao.insercao(v, 5);
        assertEquals(1, ((MeuItem) v[1]).recuperaChave());
        assertEquals(2, ((MeuItem) v[2]).recuperaChave());
        assertEquals(3, ((MeuItem) v[3]).recuperaChave());
        assertEquals(5, ((MeuItem) v[4]).recuperaChave());
        assertEquals(7, ((MeuItem) v[5]).recuperaChave());
    }

    @Test(timeout=1000)
    public void testShellsort() throws Exception {
        Item[] v = new Item[6];
        v[0] = null;
        v[1] = new MeuItem(5);
        v[2] = new MeuItem(3);
        v[3] = new MeuItem(7);
        v[4] = new MeuItem(2);
        v[5] = new MeuItem(1);
        Ordenacao.shellsort(v, 5);
        assertEquals(1, ((MeuItem) v[1]).recuperaChave());
        assertEquals(2, ((MeuItem) v[2]).recuperaChave());
        assertEquals(3, ((MeuItem) v[3]).recuperaChave());
        assertEquals(5, ((MeuItem) v[4]).recuperaChave());
        assertEquals(7, ((MeuItem) v[5]).recuperaChave());
    }

    @Test(timeout=1000)
    public void testQuicksort() throws Exception {
        Item[] v = new Item[6];
        v[0] = null;
        v[1] = new MeuItem(5);
        v[2] = new MeuItem(3);
        v[3] = new MeuItem(7);
        v[4] = new MeuItem(2);
        v[5] = new MeuItem(1);
        Ordenacao.quicksort(v, 5);
        assertEquals(1, ((MeuItem) v[1]).recuperaChave());
        assertEquals(2, ((MeuItem) v[2]).recuperaChave());
        assertEquals(3, ((MeuItem) v[3]).recuperaChave());
        assertEquals(5, ((MeuItem) v[4]).recuperaChave());
        assertEquals(7, ((MeuItem) v[5]).recuperaChave());
    }

    @Test(timeout=1000)
    public void testHeapsort() throws Exception {
        Item[] v = new Item[6];
        v[0] = null;
        v[1] = new MeuItem(5);
        v[2] = new MeuItem(3);
        v[3] = new MeuItem(7);
        v[4] = new MeuItem(2);
        v[5] = new MeuItem(1);
        Ordenacao.heapsort(v, 5);
        assertEquals(1, ((MeuItem) v[1]).recuperaChave());
        assertEquals(2, ((MeuItem) v[2]).recuperaChave());
        assertEquals(3, ((MeuItem) v[3]).recuperaChave());
        assertEquals(5, ((MeuItem) v[4]).recuperaChave());
        assertEquals(7, ((MeuItem) v[5]).recuperaChave());
    }
}