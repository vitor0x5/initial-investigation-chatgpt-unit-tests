package ds;import org.junit.Test;
import static org.junit.Assert.*;
import java.io.*;

public class OrdenacaoTest18{


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
        FPHeapMax heap = new FPHeapMax(v);
        heap.refaz(1, 4);
        assertEquals(7, ((MeuItem) v[1]).recuperaChave());
        assertEquals(5, ((MeuItem) v[2]).recuperaChave());
        assertEquals(3, ((MeuItem) v[3]).recuperaChave());
        assertEquals(1, ((MeuItem) v[4]).recuperaChave());
    }

    @Test(timeout=1000)
    public void testConstroi() throws Exception {
        Item[] v = new Item[5];
        v[0] = null;
        v[1] = new MeuItem(5);
        v[2] = new MeuItem(3);
        v[3] = new MeuItem(7);
        v[4] = new MeuItem(1);
        FPHeapMax heap = new FPHeapMax(v);
        heap.constroi();
        assertEquals(7, ((MeuItem) v[1]).recuperaChave());
        assertEquals(5, ((MeuItem) v[2]).recuperaChave());
        assertEquals(3, ((MeuItem) v[3]).recuperaChave());
        assertEquals(1, ((MeuItem) v[4]).recuperaChave());
    }

    @Test(timeout=1000)
    public void testSelecao() throws Exception {
        Item[] v = new Item[5];
        v[0] = null;
        v[1] = new MeuItem(5);
        v[2] = new MeuItem(3);
        v[3] = new MeuItem(7);
        v[4] = new MeuItem(1);
        Ordenacao.selecao(v, 4);
        assertEquals(1, ((MeuItem) v[1]).recuperaChave());
        assertEquals(3, ((MeuItem) v[2]).recuperaChave());
        assertEquals(5, ((MeuItem) v[3]).recuperaChave());
        assertEquals(7, ((MeuItem) v[4]).recuperaChave());
    }

    @Test(timeout=1000)
    public void testInsercao() throws Exception {
        Item[] v = new Item[5];
        v[0] = null;
        v[1] = new MeuItem(5);
        v[2] = new MeuItem(3);
        v[3] = new MeuItem(7);
        v[4] = new MeuItem(1);
        Ordenacao.insercao(v, 4);
        assertEquals(1, ((MeuItem) v[1]).recuperaChave());
        assertEquals(3, ((MeuItem) v[2]).recuperaChave());
        assertEquals(5, ((MeuItem) v[3]).recuperaChave());
        assertEquals(7, ((MeuItem) v[4]).recuperaChave());
    }

    @Test(timeout=1000)
    public void testShellsort() throws Exception {
        Item[] v = new Item[5];
        v[0] = null;
        v[1] = new MeuItem(5);
        v[2] = new MeuItem(3);
        v[3] = new MeuItem(7);
        v[4] = new MeuItem(1);
        Ordenacao.shellsort(v, 4);
        assertEquals(1, ((MeuItem) v[1]).recuperaChave());
        assertEquals(3, ((MeuItem) v[2]).recuperaChave());
        assertEquals(5, ((MeuItem) v[3]).recuperaChave());
        assertEquals(7, ((MeuItem) v[4]).recuperaChave());
    }

    @Test(timeout=1000)
    public void testQuicksort() throws Exception {
        Item[] v = new Item[5];
        v[0] = null;
        v[1] = new MeuItem(5);
        v[2] = new MeuItem(3);
        v[3] = new MeuItem(7);
        v[4] = new MeuItem(1);
        Ordenacao.quicksort(v, 4);
        assertEquals(1, ((MeuItem) v[1]).recuperaChave());
        assertEquals(3, ((MeuItem) v[2]).recuperaChave());
        assertEquals(5, ((MeuItem) v[3]).recuperaChave());
        assertEquals(7, ((MeuItem) v[4]).recuperaChave());
    }

    @Test(timeout=1000)
    public void testHeapsort() throws Exception {
        Item[] v = new Item[5];
        v[0] = null;
        v[1] = new MeuItem(5);
        v[2] = new MeuItem(3);
        v[3] = new MeuItem(7);
        v[4] = new MeuItem(1);
        Ordenacao.heapsort(v, 4);
        assertEquals(1, ((MeuItem) v[1]).recuperaChave());
        assertEquals(3, ((MeuItem) v[2]).recuperaChave());
        assertEquals(5, ((MeuItem) v[3]).recuperaChave());
        assertEquals(7, ((MeuItem) v[4]).recuperaChave());
    }
}