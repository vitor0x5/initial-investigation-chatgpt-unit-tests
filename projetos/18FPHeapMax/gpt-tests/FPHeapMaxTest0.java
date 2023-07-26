package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class FPHeapMaxTest0{


    @Test(expected = Exception.class, timeout = 1000)
    public void testDefaultConstructor() throws Exception {
        FPHeapMax heap = new FPHeapMax(10);
        assertEquals(0, heap.n);
    }

    @Test(timeout = 1000)
    public void testRefaz() throws Exception {
        FPHeapMax heap = new FPHeapMax(10);
        heap.v[1] = new MeuItem(10);
        heap.v[2] = new MeuItem(20);
        heap.v[3] = new MeuItem(30);
        heap.refaz(1, 3);
        assertEquals(30, heap.v[1].recuperaChave());
    }

    @Test(timeout = 1000)
    public void testConstroi() throws Exception {
        FPHeapMax heap = new FPHeapMax(10);
        heap.v[1] = new MeuItem(30);
        heap.v[2] = new MeuItem(20);
        heap.v[3] = new MeuItem(10);
        heap.n = 3;
        heap.constroi();
        assertEquals(30, heap.v[1].recuperaChave());
    }

    @Test(timeout = 1000)
    public void testMax() throws Exception {
        FPHeapMax heap = new FPHeapMax(10);
        heap.v[1] = new MeuItem(30);
        heap.v[2] = new MeuItem(20);
        heap.v[3] = new MeuItem(10);
        heap.n = 3;
        assertEquals(30, heap.max().recuperaChave());
    }

    @Test(timeout = 1000)
    public void testRetiraMax() throws Exception {
        FPHeapMax heap = new FPHeapMax(10);
        heap.v[1] = new MeuItem(30);
        heap.v[2] = new MeuItem(20);
        heap.v[3] = new MeuItem(10);
        heap.n = 3;
        assertEquals(30, heap.retiraMax().recuperaChave());
        assertEquals(2, heap.n);
    }

    @Test(timeout = 1000)
    public void testAumentaChave() throws Exception {
        FPHeapMax heap = new FPHeapMax(10);
        heap.v[1] = new MeuItem(30);
        heap.v[2] = new MeuItem(20);
        heap.v[3] = new MeuItem(10);
        heap.n = 3;
        heap.aumentaChave(2, 40);
        assertEquals(40, heap.v[1].recuperaChave());
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testInsere() throws Exception {
        FPHeapMax heap = new FPHeapMax(10);
        heap.v[1] = new MeuItem(30);
        heap.v[2] = new MeuItem(20);
        heap.v[3] = new MeuItem(10);
        heap.n = 3;
        heap.insere(new MeuItem(40));
        assertEquals(40, heap.v[1].recuperaChave());
    }

    @Test(timeout = 1000)
    public void testImprime() throws Exception {
        FPHeapMax heap = new FPHeapMax(10);
        heap.v[1] = new MeuItem(30);
        heap.v[2] = new MeuItem(20);
        heap.v[3] = new MeuItem(10);
        heap.n = 3;
        heap.imprime();
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testThrowsException() throws Exception {
        FPHeapMax heap = new FPHeapMax(10);
        heap.retiraMax();
    }
}