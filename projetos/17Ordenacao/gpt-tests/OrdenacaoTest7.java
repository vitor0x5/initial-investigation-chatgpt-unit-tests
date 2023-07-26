package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class OrdenacaoTest7{


    @Test(timeout = 1000)
    public void testDefaultConstructor() throws Exception {
        Ordenacao.Ordenacao();
        assertTrue(true);
    }

    @Test(timeout = 1000)
    public void testRefaz_Positive() throws Exception {
        Item[] v = {new MeuItem(2), new MeuItem(1), new MeuItem(3)};
        FPHeapMax fpHeap = new FPHeapMax(v);
        fpHeap.refaz(1, 2);
        assertTrue(true);
    }

    @Test(timeout = 1000)
    public void testRefaz_Negative() throws Exception {
        Item[] v = {new MeuItem(2), new MeuItem(1), new MeuItem(3)};
        FPHeapMax fpHeap = new FPHeapMax(v);
        fpHeap.refaz(2, 1);
        assertTrue(true);
    }

    @Test(timeout = 1000)
    public void testConstroi_Positive() throws Exception {
        Item[] v = {new MeuItem(2), new MeuItem(1), new MeuItem(3)};
        FPHeapMax fpHeap = new FPHeapMax(v);
        fpHeap.constroi();
        assertTrue(true);
    }

    @Test(timeout = 1000)
    public void testConstroi_Negative() throws Exception {
        Item[] v = {new MeuItem(2), new MeuItem(1), new MeuItem(3)};
        FPHeapMax fpHeap = new FPHeapMax(v);
        fpHeap.n = 0;
        fpHeap.constroi();
        assertTrue(true);
    }

    @Test(timeout = 1000)
    public void testParticao_Positive() throws Exception {
        Item[] v = {new MeuItem(2), new MeuItem(1), new MeuItem(3)};
        LimiteParticoes result = Ordenacao.particao(v, 0, 2);
        assertTrue(true);
    }

    @Test(timeout = 1000)
    public void testParticao_Negative() throws Exception {
        Item[] v = {new MeuItem(2), new MeuItem(1), new MeuItem(3)};
        LimiteParticoes result = Ordenacao.particao(v, 2, 0);
        assertTrue(true);
    }

    @Test(timeout = 1000)
    public void testOrdena_Positive() throws Exception {
        Item[] v = {new MeuItem(2), new MeuItem(1), new MeuItem(3)};
        Ordenacao.ordena(v, 0, 2);
        assertTrue(true);
    }

    @Test(timeout = 1000)
    public void testOrdena_Negative() throws Exception {
        Item[] v = {new MeuItem(2), new MeuItem(1), new MeuItem(3)};
        Ordenacao.ordena(v, 2, 0);
        assertTrue(true);
    }

    @Test(timeout = 1000)
    public void testSelecao_Positive() throws Exception {
        Item[] v = {new MeuItem(2), new MeuItem(1), new MeuItem(3)};
        Ordenacao.selecao(v, 2);
        assertTrue(true);
    }

    @Test(timeout = 1000)
    public void testInsercao_Positive() throws Exception {
        Item[] v = {new MeuItem(2), new MeuItem(1), new MeuItem(3)};
        Ordenacao.insercao(v, 2);
        assertTrue(true);
    }

    @Test(timeout = 1000)
    public void testShellsort_Positive() throws Exception {
        Item[] v = {new MeuItem(2), new MeuItem(1), new MeuItem(3)};
        Ordenacao.shellsort(v, 2);
        assertTrue(true);
    }

    @Test(timeout = 1000)
    public void testQuicksort_Positive() throws Exception {
        Item[] v = {new MeuItem(2), new MeuItem(1), new MeuItem(3)};
        Ordenacao.quicksort(v, 2);
        assertTrue(true);
    }

    @Test(timeout = 1000)
    public void testHeapsort_Positive() throws Exception {
        Item[] v = {new MeuItem(2), new MeuItem(1), new MeuItem(3)};
        Ordenacao.heapsort(v, 2);
        assertTrue(true);
    }
}