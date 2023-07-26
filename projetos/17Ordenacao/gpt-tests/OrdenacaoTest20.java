package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class OrdenacaoTest20{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Ordenacao ordenacao = new Ordenacao();
        assertNotNull(ordenacao);
    }

    @Test(timeout=1000)
    public void testFPHeapMaxConstructor() throws Exception {
        Item[] v = new Item[5];
        FPHeapMax fpHeapMax = new FPHeapMax(v);
        assertNotNull(fpHeapMax);
    }

    @Test(timeout=1000)
    public void testRefaz() throws Exception {
        Item[] v = new Item[5];
        FPHeapMax fpHeapMax = new FPHeapMax(v);
        fpHeapMax.refaz(0, 4);
        // Add assertions here
    }

    @Test(timeout=1000)
    public void testConstroi() throws Exception {
        Item[] v = new Item[5];
        FPHeapMax fpHeapMax = new FPHeapMax(v);
        fpHeapMax.constroi();
        // Add assertions here
    }

    @Test(timeout=1000)
    public void testParticao() throws Exception {
        Item[] v = new Item[5];
        LimiteParticoes p = Ordenacao.particao(v, 0, 4);
        assertNotNull(p);
    }

    @Test(timeout=1000)
    public void testOrdena() throws Exception {
        Item[] v = new Item[5];
        Ordenacao.ordena(v, 0, 4);
        // Add assertions here
    }

    @Test(timeout=1000)
    public void testSelecao() throws Exception {
        Item[] v = new Item[5];
        Ordenacao.selecao(v, 5);
        // Add assertions here
    }

    @Test(timeout=1000)
    public void testInsercao() throws Exception {
        Item[] v = new Item[5];
        Ordenacao.insercao(v, 5);
        // Add assertions here
    }

    @Test(timeout=1000)
    public void testShellsort() throws Exception {
        Item[] v = new Item[5];
        Ordenacao.shellsort(v, 5);
        // Add assertions here
    }

    @Test(timeout=1000)
    public void testQuicksort() throws Exception {
        Item[] v = new Item[5];
        Ordenacao.quicksort(v, 5);
        // Add assertions here
    }

    @Test(timeout=1000)
    public void testHeapsort() throws Exception {
        Item[] v = new Item[5];
        Ordenacao.heapsort(v, 5);
        // Add assertions here
    }
}