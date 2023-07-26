package ds;import static org.junit.Assert.*;
import org.junit.Test;

import ds.Ordenacao;
import ds.Item;
import ds.FPHeapMax;

public class OrdenacaoTest15{


    @Test(expected = Exception.class, timeout = 1000)
    public void testDefaultConstructor() throws Exception {
        Ordenacao ordenacao = new Ordenacao();
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testRefaz() throws Exception {
        Item[] v = new Item[6];
        v[0] = null;
        v[1] = new MeuItem(5);
        v[2] = new MeuItem(2);
        v[3] = new MeuItem(7);
        v[4] = new MeuItem(3);
        v[5] = new MeuItem(1);

        FPHeapMax fpHeap = new FPHeapMax(v);
        fpHeap.refaz(1, 5);

        assertEquals(new MeuItem(7), v[1]);
        assertEquals(new MeuItem(5), v[2]);
        assertEquals(new MeuItem(3), v[3]);
        assertEquals(new MeuItem(2), v[4]);
        assertEquals(new MeuItem(1), v[5]);
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testConstroi() throws Exception {
        Item[] v = new Item[6];
        v[0] = null;
        v[1] = new MeuItem(5);
        v[2] = new MeuItem(2);
        v[3] = new MeuItem(7);
        v[4] = new MeuItem(3);
        v[5] = new MeuItem(1);

        FPHeapMax fpHeap = new FPHeapMax(v);
        fpHeap.constroi();

        assertEquals(new MeuItem(7), v[1]);
        assertEquals(new MeuItem(5), v[2]);
        assertEquals(new MeuItem(3), v[3]);
        assertEquals(new MeuItem(2), v[4]);
        assertEquals(new MeuItem(1), v[5]);
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testParticao() throws Exception {
        Item[] v = new Item[6];
        v[0] = null;
        v[1] = new MeuItem(5);
        v[2] = new MeuItem(2);
        v[3] = new MeuItem(7);
        v[4] = new MeuItem(3);
        v[5] = new MeuItem(1);

        LimiteParticoes p = Ordenacao.particao(v, 1, 5);

        assertEquals(3, p.i);
        assertEquals(2, p.j);
        assertEquals(new MeuItem(3), v[1]);
        assertEquals(new MeuItem(2), v[2]);
        assertEquals(new MeuItem(5), v[3]);
        assertEquals(new MeuItem(7), v[4]);
        assertEquals(new MeuItem(1), v[5]);
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testOrdena() throws Exception {
        Item[] v = new Item[6];
        v[0] = null;
        v[1] = new MeuItem(5);
        v[2] = new MeuItem(2);
        v[3] = new MeuItem(7);
        v[4] = new MeuItem(3);
        v[5] = new MeuItem(1);

        Ordenacao.ordena(v, 1, 5);

        assertEquals(new MeuItem(1), v[1]);
        assertEquals(new MeuItem(2), v[2]);
        assertEquals(new MeuItem(3), v[3]);
        assertEquals(new MeuItem(5), v[4]);
        assertEquals(new MeuItem(7), v[5]);
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testSelecao() throws Exception {
        Item[] v = new Item[6];
        v[0] = null;
        v[1] = new MeuItem(5);
        v[2] = new MeuItem(2);
        v[3] = new MeuItem(7);
        v[4] = new MeuItem(3);
        v[5] = new MeuItem(1);

        Ordenacao.selecao(v, 5);

        assertEquals(new MeuItem(1), v[1]);
        assertEquals(new MeuItem(2), v[2]);
        assertEquals(new MeuItem(3), v[3]);
        assertEquals(new MeuItem(5), v[4]);
        assertEquals(new MeuItem(7), v[5]);
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testInsercao() throws Exception {
        Item[] v = new Item[6];
        v[0] = null;
        v[1] = new MeuItem(5);
        v[2] = new MeuItem(2);
        v[3] = new MeuItem(7);
        v[4] = new MeuItem(3);
        v[5] = new MeuItem(1);

        Ordenacao.insercao(v, 5);

        assertEquals(new MeuItem(1), v[1]);
        assertEquals(new MeuItem(2), v[2]);
        assertEquals(new MeuItem(3), v[3]);
        assertEquals(new MeuItem(5), v[4]);
        assertEquals(new MeuItem(7), v[5]);
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testShellsort() throws Exception {
        Item[] v = new Item[6];
        v[0] = null;
        v[1] = new MeuItem(5);
        v[2] = new MeuItem(2);
        v[3] = new MeuItem(7);
        v[4] = new MeuItem(3);
        v[5] = new MeuItem(1);

        Ordenacao.shellsort(v, 5);

        assertEquals(new MeuItem(1), v[1]);
        assertEquals(new MeuItem(2), v[2]);
        assertEquals(new MeuItem(3), v[3]);
        assertEquals(new MeuItem(5), v[4]);
        assertEquals(new MeuItem(7), v[5]);
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testQuicksort() throws Exception {
        Item[] v = new Item[6];
        v[0] = null;
        v[1] = new MeuItem(5);
        v[2] = new MeuItem(2);
        v[3] = new MeuItem(7);
        v[4] = new MeuItem(3);
        v[5] = new MeuItem(1);

        Ordenacao.quicksort(v, 5);

        assertEquals(new MeuItem(1), v[1]);
        assertEquals(new MeuItem(2), v[2]);
        assertEquals(new MeuItem(3), v[3]);
        assertEquals(new MeuItem(5), v[4]);
        assertEquals(new MeuItem(7), v[5]);
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testHeapsort() throws Exception {
        Item[] v = new Item[6];
        v[0] = null;
        v[1] = new MeuItem(5);
        v[2] = new MeuItem(2);
        v[3] = new MeuItem(7);
        v[4] = new MeuItem(3);
        v[5] = new MeuItem(1);

        Ordenacao.heapsort(v, 5);

        assertEquals(new MeuItem(1), v[1]);
        assertEquals(new MeuItem(2), v[2]);
        assertEquals(new MeuItem(3), v[3]);
        assertEquals(new MeuItem(5), v[4]);
        assertEquals(new MeuItem(7), v[5]);
    }
}