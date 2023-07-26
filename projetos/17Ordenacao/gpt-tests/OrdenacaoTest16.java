package ds;import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class OrdenacaoTest16{


    private Item[] v;

    public OrdenacaoTest(Item[] v) {
        this.v = v;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testCases() {
        return Arrays.asList(new Object[][]{
                {new Item[]{new MeuItem(5), new MeuItem(3), new MeuItem(8), new MeuItem(1)}},
                {new Item[]{new MeuItem(10), new MeuItem(7), new MeuItem(2), new MeuItem(6)}},
                {new Item[]{new MeuItem(4), new MeuItem(9), new MeuItem(12), new MeuItem(11)}}
        });
    }

    @Test(timeout = 1000)
    public void testDefaultConstructor() {
        Ordenacao ordenacao = new Ordenacao();
        assertNotNull(ordenacao);
    }

    @Test(timeout = 1000)
    public void testRefaz() throws Exception {
        FPHeapMax heap = new FPHeapMax(v);
        heap.refaz(0, v.length - 1);
        // Assert statements
    }

    @Test(timeout = 1000)
    public void testConstroi() throws Exception {
        FPHeapMax heap = new FPHeapMax(v);
        heap.constroi();
        // Assert statements
    }

    @Test(timeout = 1000)
    public void testParticao() throws Exception {
        LimiteParticoes p = Ordenacao.particao(v, 0, v.length - 1);
        // Assert statements
    }

    @Test(timeout = 1000)
    public void testOrdena() throws Exception {
        Ordenacao.ordena(v, 0, v.length - 1);
        // Assert statements
    }

    @Test(timeout = 1000)
    public void testSelecao() throws Exception {
        Ordenacao.selecao(v, v.length - 1);
        // Assert statements
    }

    @Test(timeout = 1000)
    public void testInsercao() throws Exception {
        Ordenacao.insercao(v, v.length - 1);
        // Assert statements
    }

    @Test(timeout = 1000)
    public void testShellsort() throws Exception {
        Ordenacao.shellsort(v, v.length - 1);
        // Assert statements
    }

    @Test(timeout = 1000)
    public void testQuicksort() throws Exception {
        Ordenacao.quicksort(v, v.length - 1);
        // Assert statements
    }

    @Test(timeout = 1000)
    public void testHeapsort() throws Exception {
        Ordenacao.heapsort(v, v.length - 1);
        // Assert statements
    }
}