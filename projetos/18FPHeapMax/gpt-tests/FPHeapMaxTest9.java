package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class FPHeapMaxTest9{


    @Test(timeout=1000)
    public void testConstructor() {
        FPHeapMax heap = new FPHeapMax(10);
        assertNotNull(heap);
    }

    @Test(timeout=1000)
    public void testRefaz() {
        FPHeapMax heap = new FPHeapMax(5);
        heap.copia(new Item[]{});   // Ignore this method in the tests
        heap.refaz(1, 1);   // Test with esq and dir being the same index
        assertEquals(0, heap.n);
        
        heap.copia(new Item[]{null, new MeuItem(1), new MeuItem(2)});
        heap.refaz(1, 2);   // Test with the only decision, j < dir, being false
        assertEquals(2, heap.v[1].chave);
        
        heap.refaz(1, 2);   // Test with the only decision, j < dir, being true
        assertEquals(1, heap.v[1].chave);
    }

    @Test(timeout=1000)
    public void testConstroi() {
        FPHeapMax heap = new FPHeapMax(5);
        heap.copia(new Item[]{null, new MeuItem(10), new MeuItem(5), new MeuItem(8)});
        heap.constroi();
        assertEquals(10, heap.v[1].chave);
        assertEquals(8, heap.v[2].chave);
        assertEquals(5, heap.v[3].chave);
    }

    @Test(timeout=1000)
    public void testMax() {
        FPHeapMax heap = new FPHeapMax(5);
        heap.copia(new Item[]{null, new MeuItem(10)});
        assertEquals(10, heap.max().chave);
    }

    @Test(timeout=1000)
    public void testRetiraMax() {
        FPHeapMax heap = new FPHeapMax(5);
        Exception exception = null;
        try {
            heap.retiraMax();
        } catch (Exception e) {
            exception = e;
        }
        assertNotNull(exception);
        
        heap.copia(new Item[]{null, new MeuItem(10), new MeuItem(5), new MeuItem(8)});
        heap.retiraMax();
        assertEquals(8, heap.v[1].chave);
    }

    @Test(timeout=1000)
    public void testAumentaChave() {
        FPHeapMax heap = new FPHeapMax(5);
        heap.copia(new Item[]{null, new MeuItem(10), new MeuItem(5), new MeuItem(8)});
        Exception exception = null;
        try {
            heap.aumentaChave(0, new Object());
        } catch (Exception e) {
            exception = e;
        }
        assertNotNull(exception);
        
        heap.aumentaChave(1, new MeuItem(15));
        assertEquals(15, heap.v[1].chave);
    }

    @Test(timeout=1000)
    public void testInsere() {
        FPHeapMax heap = new FPHeapMax(10);
        heap.copia(new Item[]{null, new MeuItem(10), new MeuItem(5), new MeuItem(8)});
        Exception exception = null;
        try {
            heap.insere(new MeuItem(20));
        } catch (Exception e) {
            exception = e;
        }
        assertNull(exception);
        assertEquals(20, heap.v[heap.n].chave);
    }

    @Test(timeout=1000)
    public void testImprime() {
        FPHeapMax heap = new FPHeapMax(3);
        heap.copia(new Item[]{null, new MeuItem(10), new MeuItem(5), new MeuItem(8)});
        heap.imprime();
    }
}