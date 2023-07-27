package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class OrdenacaoTest6{


    @Test(timeout=1000)
    public void testDefaultConstructor() {
        Ordenacao o = new Ordenacao();
    }

    @Test(timeout=1000)
    public void testRefaz() throws Exception {
        Item[] v = new Item[2];
        v[0] = new MeuItem(1);
        v[1] = new MeuItem(2);
        FPHeapMax fpHeap = new FPHeapMax(v);
        fpHeap.refaz(0, 1);
    }

    @Test(timeout=1000)
    public void testConstroi() throws Exception {
        Item[] v = new Item[2];
        v[0] = new MeuItem(1);
        v[1] = new MeuItem(2);
        FPHeapMax fpHeap = new FPHeapMax(v);
        fpHeap.constroi();
    }

    @Test(timeout=1000)
    public void testSelecao() throws Exception {
        Item[] v = new Item[2];
        v[0] = new MeuItem(1);
        v[1] = new MeuItem(2);
        Ordenacao.selecao(v, 1);
    }

    @Test(timeout=1000)
    public void testInsercao() throws Exception {
        Item[] v = new Item[2];
        v[0] = new MeuItem(1);
        v[1] = new MeuItem(2);
        Ordenacao.insercao(v, 1);
    }

    @Test(timeout=1000)
    public void testShellsort() throws Exception {
        Item[] v = new Item[2];
        v[0] = new MeuItem(1);
        v[1] = new MeuItem(2);
        Ordenacao.shellsort(v, 1);
    }

    @Test(timeout=1000)
    public void testQuicksort() throws Exception {
        Item[] v = new Item[2];
        v[0] = new MeuItem(1);
        v[1] = new MeuItem(2);
        Ordenacao.quicksort(v, 1);
    }

    @Test(timeout=1000)
    public void testHeapsort() throws Exception {
        Item[] v = new Item[2];
        v[0] = new MeuItem(1);
        v[1] = new MeuItem(2);
        Ordenacao.heapsort(v, 1);
    }
}