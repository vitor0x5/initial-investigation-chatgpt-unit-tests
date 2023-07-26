package ds;import static org.junit.Assert.*;
import org.junit.Test;
import java.io.IOException;
import java.io.RandomAccessFile;
import ds.FPHeapMax;
import ds.Item;
import ds.Ordenacao;
import ds.MeuItem;

public class OrdenacaoTest10{


    // Test for default constructor
    @Test(timeout=1000)
    public void testConstructor() throws Exception {
        Item[] v = new Item[10];
        FPHeapMax fpHeap = new FPHeapMax(v);
        assertNotNull(fpHeap);
    }

    // Test for refaz method
    @Test(timeout=1000)
    public void testRefaz() throws Exception {
        // Test with positive values
        Item[] v = new Item[6];
        for (int i = 1; i <= 5; i++) {
            v[i] = new MeuItem(i);
        }

        FPHeapMax fpHeap = new FPHeapMax(v);
        fpHeap.refaz(1, 5);
        
        assertEquals(5, ((MeuItem)fpHeap.v[1]).recuperaChave());
        assertEquals(4, ((MeuItem)fpHeap.v[2]).recuperaChave());
        assertEquals(2, ((MeuItem)fpHeap.v[3]).recuperaChave());
        assertEquals(1, ((MeuItem)fpHeap.v[4]).recuperaChave());
        assertEquals(3, ((MeuItem)fpHeap.v[5]).recuperaChave());

        // Test with negative values
        Item[] v2 = new Item[6];
        for (int i = 1; i <= 5; i++) {
            v2[i] = new MeuItem(-i);
        }

        FPHeapMax fpHeap2 = new FPHeapMax(v2);
        fpHeap2.refaz(1, 5);
        
        assertEquals(-1, ((MeuItem)fpHeap2.v[1]).recuperaChave());
        assertEquals(-2, ((MeuItem)fpHeap2.v[2]).recuperaChave());
        assertEquals(-4, ((MeuItem)fpHeap2.v[3]).recuperaChave());
        assertEquals(-5, ((MeuItem)fpHeap2.v[4]).recuperaChave());
        assertEquals(-3, ((MeuItem)fpHeap2.v[5]).recuperaChave());
    }

    // Test for constroi method
    @Test(timeout=1000)
    public void testConstroi() throws Exception {
        // Test with positive values
        Item[] v = new Item[6];
        for (int i = 1; i <= 5; i++) {
            v[i] = new MeuItem(i);
        }

        FPHeapMax fpHeap = new FPHeapMax(v);
        fpHeap.constroi();
        
        assertEquals(5, ((MeuItem)fpHeap.v[1]).recuperaChave());
        assertEquals(4, ((MeuItem)fpHeap.v[2]).recuperaChave());
        assertEquals(2, ((MeuItem)fpHeap.v[3]).recuperaChave());
        assertEquals(1, ((MeuItem)fpHeap.v[4]).recuperaChave());
        assertEquals(3, ((MeuItem)fpHeap.v[5]).recuperaChave());

        // Test with negative values
        Item[] v2 = new Item[6];
        for (int i = 1; i <= 5; i++) {
            v2[i] = new MeuItem(-i);
        }

        FPHeapMax fpHeap2 = new FPHeapMax(v2);
        fpHeap2.constroi();
        
        assertEquals(-1, ((MeuItem)fpHeap2.v[1]).recuperaChave());
        assertEquals(-2, ((MeuItem)fpHeap2.v[2]).recuperaChave());
        assertEquals(-4, ((MeuItem)fpHeap2.v[3]).recuperaChave());
        assertEquals(-5, ((MeuItem)fpHeap2.v[4]).recuperaChave());
        assertEquals(-3, ((MeuItem)fpHeap2.v[5]).recuperaChave());
    }

    // Test for selecao method
    @Test(timeout=1000)
    public void testSelecao() throws Exception {
        // Test with positive values
        Item[] v = new Item[6];
        for (int i = 1; i <= 5; i++) {
            v[i] = new MeuItem(i);
        }

        Ordenacao.selecao(v, 5);
        
        assertEquals(1, ((MeuItem)v[1]).recuperaChave());
        assertEquals(2, ((MeuItem)v[2]).recuperaChave());
        assertEquals(3, ((MeuItem)v[3]).recuperaChave());
        assertEquals(4, ((MeuItem)v[4]).recuperaChave());
        assertEquals(5, ((MeuItem)v[5]).recuperaChave());

        // Test with negative values
        Item[] v2 = new Item[6];
        for (int i = 1; i <= 5; i++) {
            v2[i] = new MeuItem(-i);
        }

        Ordenacao.selecao(v2, 5);
        
        assertEquals(-5, ((MeuItem)v2[1]).recuperaChave());
        assertEquals(-4, ((MeuItem)v2[2]).recuperaChave());
        assertEquals(-3, ((MeuItem)v2[3]).recuperaChave());
        assertEquals(-2, ((MeuItem)v2[4]).recuperaChave());
        assertEquals(-1, ((MeuItem)v2[5]).recuperaChave());
    }

    // Test for insercao method
    @Test(timeout=1000)
    public void testInsercao() throws Exception {
        // Test with positive values
        Item[] v = new Item[6];
        for (int i = 1; i <= 5; i++) {
            v[i] = new MeuItem(i);
        }

        Ordenacao.insercao(v, 5);
        
        assertEquals(1, ((MeuItem)v[1]).recuperaChave());
        assertEquals(2, ((MeuItem)v[2]).recuperaChave());
        assertEquals(3, ((MeuItem)v[3]).recuperaChave());
        assertEquals(4, ((MeuItem)v[4]).recuperaChave());
        assertEquals(5, ((MeuItem)v[5]).recuperaChave());

        // Test with negative values
        Item[] v2 = new Item[6];
        for (int i = 1; i <= 5; i++) {
            v2[i] = new MeuItem(-i);
        }

        Ordenacao.insercao(v2, 5);
        
        assertEquals(-5, ((MeuItem)v2[1]).recuperaChave());
        assertEquals(-4, ((MeuItem)v2[2]).recuperaChave());
        assertEquals(-3, ((MeuItem)v2[3]).recuperaChave());
        assertEquals(-2, ((MeuItem)v2[4]).recuperaChave());
        assertEquals(-1, ((MeuItem)v2[5]).recuperaChave());
    }

    // Test for shellsort method
    @Test(timeout=1000)
    public void testShellsort() throws Exception {
        // Test with positive values
        Item[] v = new Item[6];
        for (int i = 1; i <= 5; i++) {
            v[i] = new MeuItem(i);
        }

        Ordenacao.shellsort(v, 5);
        
        assertEquals(1, ((MeuItem)v[1]).recuperaChave());
        assertEquals(2, ((MeuItem)v[2]).recuperaChave());
        assertEquals(3, ((MeuItem)v[3]).recuperaChave());
        assertEquals(4, ((MeuItem)v[4]).recuperaChave());
        assertEquals(5, ((MeuItem)v[5]).recuperaChave());

        // Test with negative values
        Item[] v2 = new Item[6];
        for (int i = 1; i <= 5; i++) {
            v2[i] = new MeuItem(-i);
        }

        Ordenacao.shellsort(v2, 5);
        
        assertEquals(-5, ((MeuItem)v2[1]).recuperaChave());
        assertEquals(-4, ((MeuItem)v2[2]).recuperaChave());
        assertEquals(-3, ((MeuItem)v2[3]).recuperaChave());
        assertEquals(-2, ((MeuItem)v2[4]).recuperaChave());
        assertEquals(-1, ((MeuItem)v2[5]).recuperaChave());
    }

    // Test for quicksort method
    @Test(timeout=1000)
    public void testQuicksort() throws Exception {
        // Test with positive values
        Item[] v = new Item[6];
        for (int i = 1; i <= 5; i++) {
            v[i] = new MeuItem(i);
        }

        Ordenacao.quicksort(v, 5);
        
        assertEquals(1, ((MeuItem)v[1]).recuperaChave());
        assertEquals(2, ((MeuItem)v[2]).recuperaChave());
        assertEquals(3, ((MeuItem)v[3]).recuperaChave());
        assertEquals(4, ((MeuItem)v[4]).recuperaChave());
        assertEquals(5, ((MeuItem)v[5]).recuperaChave());

        // Test with negative values
        Item[] v2 = new Item[6];
        for (int i = 1; i <= 5; i++) {
            v2[i] = new MeuItem(-i);
        }

        Ordenacao.quicksort(v2, 5);
        
        assertEquals(-5, ((MeuItem)v2[1]).recuperaChave());
        assertEquals(-4, ((MeuItem)v2[2]).recuperaChave());
        assertEquals(-3, ((MeuItem)v2[3]).recuperaChave());
        assertEquals(-2, ((MeuItem)v2[4]).recuperaChave());
        assertEquals(-1, ((MeuItem)v2[5]).recuperaChave());
    }

    // Test for heapsort method
    @Test(timeout=1000)
    public void testHeapsort() throws Exception {
        // Test with positive values
        Item[] v = new Item[6];
        for (int i = 1; i <= 5; i++) {
            v[i] = new MeuItem(i);
        }

        Ordenacao.heapsort(v, 5);
        
        assertEquals(1, ((MeuItem)v[1]).recuperaChave());
    }
}
       