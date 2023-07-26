package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class OrdenacaoTest9{


    @Test(expected = NullPointerException.class, timeout = 1000)
    public void testDefaultConstructor() throws Exception {
        Ordenacao ordenacao = new Ordenacao();
    }

    @Test(expected = NullPointerException.class, timeout = 1000)
    public void testRefaz_True() throws Exception {
        Item[] v = {null, new MeuItem(1), new MeuItem(2), new MeuItem(3)};
        FPHeapMax fpHeap = new FPHeapMax(v);
        fpHeap.refaz(1, 3);
    }

    @Test(expected = NullPointerException.class, timeout = 1000)
    public void testRefaz_False() throws Exception {
        Item[] v = {null, new MeuItem(3), new MeuItem(2), new MeuItem(1)};
        FPHeapMax fpHeap = new FPHeapMax(v);
        fpHeap.refaz(1, 3);
    }

    @Test(expected = NullPointerException.class, timeout = 1000)
    public void testConstroi() throws Exception {
        Item[] v = {null, new MeuItem(3), new MeuItem(2), new MeuItem(1)};
        FPHeapMax fpHeap = new FPHeapMax(v);
        fpHeap.constroi();
    }

    @Test(expected = NullPointerException.class, timeout = 1000)
    public void testParticao_True() throws Exception {
        Item[] v = {null, new MeuItem(3), new MeuItem(2), new MeuItem(1)};
        LimiteParticoes p = Ordenacao.particao(v, 1, 3);
    }

    @Test(expected = NullPointerException.class, timeout = 1000)
    public void testParticao_False() throws Exception {
        Item[] v = {null, new MeuItem(1), new MeuItem(2), new MeuItem(3)};
        LimiteParticoes p = Ordenacao.particao(v, 1, 3);
    }

    @Test(expected = NullPointerException.class, timeout = 1000)
    public void testOrdena_True() throws Exception {
        Item[] v = {null, new MeuItem(3), new MeuItem(2), new MeuItem(1)};
        Ordenacao.ordena(v, 1, 3);
    }

    @Test(expected = NullPointerException.class, timeout = 1000)
    public void testOrdena_False() throws Exception {
        Item[] v = {null, new MeuItem(1), new MeuItem(2), new MeuItem(3)};
        Ordenacao.ordena(v, 1, 3);
    }

    @Test(expected = NullPointerException.class, timeout = 1000)
    public void testSelecao() throws Exception {
        Item[] v = {null, new MeuItem(3), new MeuItem(2), new MeuItem(1)};
        Ordenacao.selecao(v, 3);
    }

    @Test(expected = NullPointerException.class, timeout = 1000)
    public void testInsercao() throws Exception {
        Item[] v = {null, new MeuItem(3), new MeuItem(2), new MeuItem(1)};
        Ordenacao.insercao(v, 3);
    }

    @Test(expected = NullPointerException.class, timeout = 1000)
    public void testShellsort() throws Exception {
        Item[] v = {null, new MeuItem(3), new MeuItem(2), new MeuItem(1)};
        Ordenacao.shellsort(v, 3);
    }

    @Test(expected = NullPointerException.class, timeout = 1000)
    public void testQuicksort() throws Exception {
        Item[] v = {null, new MeuItem(3), new MeuItem(2), new MeuItem(1)};
        Ordenacao.quicksort(v, 3);
    }

    @Test(expected = NullPointerException.class, timeout = 1000)
    public void testHeapsort() throws Exception {
        Item[] v = {null, new MeuItem(3), new MeuItem(2), new MeuItem(1)};
        Ordenacao.heapsort(v, 3);
    }
}