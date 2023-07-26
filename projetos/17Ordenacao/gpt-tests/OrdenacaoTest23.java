package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class OrdenacaoTest23{


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
        v[4] = new MeuItem(1);
        FPHeapMax fpHeap = new FPHeapMax(v);
        fpHeap.refaz(1, 3);
        assertEquals(7, ((MeuItem)fpHeap.v[1]).chave);
        assertEquals(3, ((MeuItem)fpHeap.v[2]).chave);
        assertEquals(5, ((MeuItem)fpHeap.v[3]).chave);
    }

    @Test(timeout=1000)
    public void testConstroi() throws Exception {
        Item[] v = new Item[6];
        v[0] = null;
        v[1] = new MeuItem(5);
        v[2] = new MeuItem(3);
        v[3] = new MeuItem(7);
        v[4] = new MeuItem(1);
        v[5] = new MeuItem(4);
        FPHeapMax fpHeap = new FPHeapMax(v);
        fpHeap.constroi();
        assertEquals(7, ((MeuItem)fpHeap.v[1]).chave);
        assertEquals(5, ((MeuItem)fpHeap.v[2]).chave);
        assertEquals(4, ((MeuItem)fpHeap.v[3]).chave);
        assertEquals(1, ((MeuItem)fpHeap.v[4]).chave);
        assertEquals(3, ((MeuItem)fpHeap.v[5]).chave);
    }

    @Test(timeout=1000)
    public void testParticao() throws Exception {
        Item[] v = new Item[6];
        v[0] = null;
        v[1] = new MeuItem(5);
        v[2] = new MeuItem(3);
        v[3] = new MeuItem(7);
        v[4] = new MeuItem(1);
        v[5] = new MeuItem(4);
        LimiteParticoes p = Ordenacao.particao(v, 1, 5);
        assertEquals(3, p.i);
        assertEquals(2, p.j);
        assertEquals(5, ((MeuItem)v[1]).chave);
        assertEquals(4, ((MeuItem)v[2]).chave);
        assertEquals(7, ((MeuItem)v[3]).chave);
        assertEquals(1, ((MeuItem)v[4]).chave);
        assertEquals(3, ((MeuItem)v[5]).chave);
    }

    @Test(timeout=1000)
    public void testOrdena() throws Exception {
        Item[] v = new Item[6];
        v[0] = null;
        v[1] = new MeuItem(5);
        v[2] = new MeuItem(3);
        v[3] = new MeuItem(7);
        v[4] = new MeuItem(1);
        v[5] = new MeuItem(4);
        Ordenacao.ordena(v, 1, 5);
        assertEquals(1, ((MeuItem)v[1]).chave);
        assertEquals(3, ((MeuItem)v[2]).chave);
        assertEquals(4, ((MeuItem)v[3]).chave);
        assertEquals(5, ((MeuItem)v[4]).chave);
        assertEquals(7, ((MeuItem)v[5]).chave);
    }

    @Test(timeout=1000)
    public void testSelecao() throws Exception {
        Item[] v = new Item[6];
        v[0] = null;
        v[1] = new MeuItem(5);
        v[2] = new MeuItem(3);
        v[3] = new MeuItem(7);
        v[4] = new MeuItem(1);
        v[5] = new MeuItem(4);
        Ordenacao.selecao(v, 5);
        assertEquals(1, ((MeuItem)v[1]).chave);
        assertEquals(3, ((MeuItem)v[2]).chave);
        assertEquals(4, ((MeuItem)v[3]).chave);
        assertEquals(5, ((MeuItem)v[4]).chave);
        assertEquals(7, ((MeuItem)v[5]).chave);
    }

    @Test(timeout=1000)
    public void testInsercao() throws Exception {
        Item[] v = new Item[6];
        v[0] = null;
        v[1] = new MeuItem(5);
        v[2] = new MeuItem(3);
        v[3] = new MeuItem(7);
        v[4] = new MeuItem(1);
        v[5] = new MeuItem(4);
        Ordenacao.insercao(v, 5);
        assertEquals(1, ((MeuItem)v[1]).chave);
        assertEquals(3, ((MeuItem)v[2]).chave);
        assertEquals(4, ((MeuItem)v[3]).chave);
        assertEquals(5, ((MeuItem)v[4]).chave);
        assertEquals(7, ((MeuItem)v[5]).chave);
    }

    @Test(timeout=1000)
    public void testShellsort() throws Exception {
        Item[] v = new Item[6];
        v[0] = null;
        v[1] = new MeuItem(5);
        v[2] = new MeuItem(3);
        v[3] = new MeuItem(7);
        v[4] = new MeuItem(1);
        v[5] = new MeuItem(4);
        Ordenacao.shellsort(v, 5);
        assertEquals(1, ((MeuItem)v[1]).chave);
        assertEquals(3, ((MeuItem)v[2]).chave);
        assertEquals(4, ((MeuItem)v[3]).chave);
        assertEquals(5, ((MeuItem)v[4]).chave);
        assertEquals(7, ((MeuItem)v[5]).chave);
    }

    @Test(timeout=1000)
    public void testQuicksort() throws Exception {
        Item[] v = new Item[6];
        v[0] = null;
        v[1] = new MeuItem(5);
        v[2] = new MeuItem(3);
        v[3] = new MeuItem(7);
        v[4] = new MeuItem(1);
        v[5] = new MeuItem(4);
        Ordenacao.quicksort(v, 5);
        assertEquals(1, ((MeuItem)v[1]).chave);
        assertEquals(3, ((MeuItem)v[2]).chave);
        assertEquals(4, ((MeuItem)v[3]).chave);
        assertEquals(5, ((MeuItem)v[4]).chave);
        assertEquals(7, ((MeuItem)v[5]).chave);
    }

    @Test(timeout=1000)
    public void testHeapsort() throws Exception {
        Item[] v = new Item[6];
        v[0] = null;
        v[1] = new MeuItem(5);
        v[2] = new MeuItem(3);
        v[3] = new MeuItem(7);
        v[4] = new MeuItem(1);
        v[5] = new MeuItem(4);
        Ordenacao.heapsort(v, 5);
        assertEquals(1, ((MeuItem)v[1]).chave);
        assertEquals(3, ((MeuItem)v[2]).chave);
        assertEquals(4, ((MeuItem)v[3]).chave);
        assertEquals(5, ((MeuItem)v[4]).chave);
        assertEquals(7, ((MeuItem)v[5]).chave);
    }
}