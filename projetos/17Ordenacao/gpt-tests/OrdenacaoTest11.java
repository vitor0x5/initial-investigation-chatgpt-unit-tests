package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class OrdenacaoTest11{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Ordenacao ordenacao = new Ordenacao();
        assertNotNull(ordenacao);
    }

    @Test(timeout=1000)
    public void testRefaz() throws Exception {
        Item[] v = new Item[6];
        v[0] = null;
        v[1] = new MeuItem(4);
        v[2] = new MeuItem(2);
        v[3] = new MeuItem(6);
        v[4] = new MeuItem(8);
        v[5] = new MeuItem(3);
        
        FPHeapMax fpHeap = new FPHeapMax(v);
        fpHeap.refaz(1, 5);
        
        assertEquals(8, ((MeuItem)fpHeap.v[1]).chave);
        assertEquals(6, ((MeuItem)fpHeap.v[2]).chave);
        assertEquals(4, ((MeuItem)fpHeap.v[3]).chave);
        assertEquals(3, ((MeuItem)fpHeap.v[4]).chave);
        assertEquals(2, ((MeuItem)fpHeap.v[5]).chave);
    }

    @Test(timeout=1000)
    public void testConstroi() throws Exception {
        Item[] v = new Item[6];
        v[0] = null;
        v[1] = new MeuItem(4);
        v[2] = new MeuItem(2);
        v[3] = new MeuItem(6);
        v[4] = new MeuItem(8);
        v[5] = new MeuItem(3);
        
        FPHeapMax fpHeap = new FPHeapMax(v);
        fpHeap.constroi();
        
        assertEquals(8, ((MeuItem)fpHeap.v[1]).chave);
        assertEquals(6, ((MeuItem)fpHeap.v[2]).chave);
        assertEquals(3, ((MeuItem)fpHeap.v[3]).chave);
        assertEquals(2, ((MeuItem)fpHeap.v[4]).chave);
        assertEquals(4, ((MeuItem)fpHeap.v[5]).chave);
    }

    @Test(timeout=1000)
    public void testParticao() throws Exception {
        Item[] v = new Item[6];
        v[0] = null;
        v[1] = new MeuItem(4);
        v[2] = new MeuItem(2);
        v[3] = new MeuItem(6);
        v[4] = new MeuItem(8);
        v[5] = new MeuItem(3);
        
        LimiteParticoes lp = Ordenacao.particao(v, 1, 5);
        
        assertEquals(3, lp.i);
        assertEquals(4, lp.j);
        assertEquals(8, ((MeuItem)v[3]).chave);
    }

    @Test(timeout=1000)
    public void testOrdena() throws Exception {
        Item[] v = new Item[6];
        v[0] = null;
        v[1] = new MeuItem(4);
        v[2] = new MeuItem(2);
        v[3] = new MeuItem(6);
        v[4] = new MeuItem(8);
        v[5] = new MeuItem(3);
        
        Ordenacao.ordena(v, 1, 5);
        
        assertEquals(2, ((MeuItem)v[1]).chave);
        assertEquals(3, ((MeuItem)v[2]).chave);
        assertEquals(4, ((MeuItem)v[3]).chave);
        assertEquals(6, ((MeuItem)v[4]).chave);
        assertEquals(8, ((MeuItem)v[5]).chave);
    }

    @Test(timeout=1000)
    public void testSelecao() throws Exception {
        Item[] v = new Item[6];
        v[0] = null;
        v[1] = new MeuItem(4);
        v[2] = new MeuItem(2);
        v[3] = new MeuItem(6);
        v[4] = new MeuItem(8);
        v[5] = new MeuItem(3);
        
        Ordenacao.selecao(v, 5);
        
        assertEquals(2, ((MeuItem)v[1]).chave);
        assertEquals(3, ((MeuItem)v[2]).chave);
        assertEquals(4, ((MeuItem)v[3]).chave);
        assertEquals(6, ((MeuItem)v[4]).chave);
        assertEquals(8, ((MeuItem)v[5]).chave);
    }

    @Test(timeout=1000)
    public void testInsercao() throws Exception {
        Item[] v = new Item[6];
        v[0] = null;
        v[1] = new MeuItem(4);
        v[2] = new MeuItem(2);
        v[3] = new MeuItem(6);
        v[4] = new MeuItem(8);
        v[5] = new MeuItem(3);
        
        Ordenacao.insercao(v, 5);
        
        assertEquals(2, ((MeuItem)v[1]).chave);
        assertEquals(3, ((MeuItem)v[2]).chave);
        assertEquals(4, ((MeuItem)v[3]).chave);
        assertEquals(6, ((MeuItem)v[4]).chave);
        assertEquals(8, ((MeuItem)v[5]).chave);
    }

    @Test(timeout=1000)
    public void testShellsort() throws Exception {
        Item[] v = new Item[6];
        v[0] = null;
        v[1] = new MeuItem(4);
        v[2] = new MeuItem(2);
        v[3] = new MeuItem(6);
        v[4] = new MeuItem(8);
        v[5] = new MeuItem(3);
        
        Ordenacao.shellsort(v, 5);
        
        assertEquals(2, ((MeuItem)v[1]).chave);
        assertEquals(3, ((MeuItem)v[2]).chave);
        assertEquals(4, ((MeuItem)v[3]).chave);
        assertEquals(6, ((MeuItem)v[4]).chave);
        assertEquals(8, ((MeuItem)v[5]).chave);
    }

    @Test(timeout=1000)
    public void testQuicksort() throws Exception {
        Item[] v = new Item[6];
        v[0] = null;
        v[1] = new MeuItem(4);
        v[2] = new MeuItem(2);
        v[3] = new MeuItem(6);
        v[4] = new MeuItem(8);
        v[5] = new MeuItem(3);
        
        Ordenacao.quicksort(v, 5);
        
        assertEquals(2, ((MeuItem)v[1]).chave);
        assertEquals(3, ((MeuItem)v[2]).chave);
        assertEquals(4, ((MeuItem)v[3]).chave);
        assertEquals(6, ((MeuItem)v[4]).chave);
        assertEquals(8, ((MeuItem)v[5]).chave);
    }

    @Test(timeout=1000)
    public void testHeapsort() throws Exception {
        Item[] v = new Item[6];
        v[0] = null;
        v[1] = new MeuItem(4);
        v[2] = new MeuItem(2);
        v[3] = new MeuItem(6);
        v[4] = new MeuItem(8);
        v[5] = new MeuItem(3);
        
        Ordenacao.heapsort(v, 5);
        
        assertEquals(2, ((MeuItem)v[1]).chave);
        assertEquals(3, ((MeuItem)v[2]).chave);
        assertEquals(4, ((MeuItem)v[3]).chave);
        assertEquals(6, ((MeuItem)v[4]).chave);
        assertEquals(8, ((MeuItem)v[5]).chave);
    }
}