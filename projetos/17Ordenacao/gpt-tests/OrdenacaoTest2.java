package ds;import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;

public class OrdenacaoTest2{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Ordenacao ordenacao = new Ordenacao();
    }

    @Test(timeout=1000)
    public void testRefaz() throws Exception {
        Item[] v = {null, new MeuItem(5), new MeuItem(2), new MeuItem(7), new MeuItem(1)};
        FPHeapMax fpHeap = new FPHeapMax(v);
        fpHeap.refaz(1, 3);
        assertEquals(new MeuItem(7), v[1]);
        assertEquals(new MeuItem(2), v[2]);
        assertEquals(new MeuItem(5), v[3]);
        assertEquals(new MeuItem(1), v[4]);
    }

    @Test(timeout=1000)
    public void testConstroi() throws Exception {
        Item[] v = {null, new MeuItem(5), new MeuItem(2), new MeuItem(7), new MeuItem(1)};
        FPHeapMax fpHeap = new FPHeapMax(v);
        fpHeap.constroi();
        assertEquals(new MeuItem(7), v[1]);
        assertEquals(new MeuItem(5), v[2]);
        assertEquals(new MeuItem(2), v[3]);
        assertEquals(new MeuItem(1), v[4]);
    }

    @Test(timeout=1000)
    public void testSelecao() throws Exception {
        Item[] v = {null, new MeuItem(5), new MeuItem(2), new MeuItem(7), new MeuItem(1)};
        Ordenacao.selecao(v, 4);
        assertEquals(new MeuItem(1), v[1]);
        assertEquals(new MeuItem(2), v[2]);
        assertEquals(new MeuItem(5), v[3]);
        assertEquals(new MeuItem(7), v[4]);
    }

    @Test(timeout=1000)
    public void testInsercao() throws Exception {
        Item[] v = {null, new MeuItem(5), new MeuItem(2), new MeuItem(7), new MeuItem(1)};
        Ordenacao.insercao(v, 4);
        assertEquals(new MeuItem(1), v[1]);
        assertEquals(new MeuItem(2), v[2]);
        assertEquals(new MeuItem(5), v[3]);
        assertEquals(new MeuItem(7), v[4]);
    }

    @Test(timeout=1000)
    public void testShellsort() throws Exception {
        Item[] v = {null, new MeuItem(5), new MeuItem(2), new MeuItem(7), new MeuItem(1)};
        Ordenacao.shellsort(v, 4);
        assertEquals(new MeuItem(1), v[1]);
        assertEquals(new MeuItem(2), v[2]);
        assertEquals(new MeuItem(5), v[3]);
        assertEquals(new MeuItem(7), v[4]);
    }

    @Test(timeout=1000)
    public void testQuicksort() throws Exception {
        Item[] v = {null, new MeuItem(5), new MeuItem(2), new MeuItem(7), new MeuItem(1)};
        Ordenacao.quicksort(v, 4);
        assertEquals(new MeuItem(1), v[1]);
        assertEquals(new MeuItem(2), v[2]);
        assertEquals(new MeuItem(5), v[3]);
        assertEquals(new MeuItem(7), v[4]);
    }

    @Test(timeout=1000)
    public void testHeapsort() throws Exception {
        Item[] v = {null, new MeuItem(5), new MeuItem(2), new MeuItem(7), new MeuItem(1)};
        Ordenacao.heapsort(v, 4);
        assertEquals(new MeuItem(1), v[1]);
        assertEquals(new MeuItem(2), v[2]);
        assertEquals(new MeuItem(5), v[3]);
        assertEquals(new MeuItem(7), v[4]);
    }
}