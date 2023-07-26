package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class OrdenacaoTest4{

    
    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Ordenacao ordenacao = new Ordenacao();
        assertNotNull(ordenacao);
    }
    
    @Test(timeout=1000)
    public void testRefaz() throws Exception {
        Item[] v = new Item[3];
        v[0] = new MeuItem(5);
        v[1] = new MeuItem(3);
        v[2] = new MeuItem(8);
        
        FPHeapMax fpHeapMax = new FPHeapMax(v);
        fpHeapMax.refaz(0, 2);
        
        assertEquals(8, ((MeuItem)v[0]).recuperaChave());
        assertEquals(3, ((MeuItem)v[1]).recuperaChave());
        assertEquals(5, ((MeuItem)v[2]).recuperaChave());
    }
    
    @Test(timeout=1000)
    public void testConstroi() throws Exception {
        Item[] v = new Item[6];
        v[0] = null;
        v[1] = new MeuItem(3);
        v[2] = new MeuItem(1);
        v[3] = new MeuItem(5);
        v[4] = new MeuItem(2);
        v[5] = new MeuItem(4);
        
        FPHeapMax fpHeapMax = new FPHeapMax(v);
        fpHeapMax.constroi();
        
        assertEquals(5, ((MeuItem)v[1]).recuperaChave());
        assertEquals(4, ((MeuItem)v[2]).recuperaChave());
        assertEquals(3, ((MeuItem)v[3]).recuperaChave());
        assertEquals(1, ((MeuItem)v[4]).recuperaChave());
        assertEquals(2, ((MeuItem)v[5]).recuperaChave());
    }
    
    @Test(timeout=1000)
    public void testSelecao() throws Exception {
        Item[] v = new Item[6];
        v[0] = null;
        v[1] = new MeuItem(3);
        v[2] = new MeuItem(1);
        v[3] = new MeuItem(5);
        v[4] = new MeuItem(2);
        v[5] = new MeuItem(4);
        
        Ordenacao.selecao(v, 5);
        
        assertEquals(1, ((MeuItem)v[1]).recuperaChave());
        assertEquals(2, ((MeuItem)v[2]).recuperaChave());
        assertEquals(3, ((MeuItem)v[3]).recuperaChave());
        assertEquals(4, ((MeuItem)v[4]).recuperaChave());
        assertEquals(5, ((MeuItem)v[5]).recuperaChave());
    }
    
    @Test(timeout=1000)
    public void testInsercao() throws Exception {
        Item[] v = new Item[6];
        v[0] = null;
        v[1] = new MeuItem(3);
        v[2] = new MeuItem(1);
        v[3] = new MeuItem(5);
        v[4] = new MeuItem(2);
        v[5] = new MeuItem(4);
        
        Ordenacao.insercao(v, 5);
        
        assertEquals(1, ((MeuItem)v[1]).recuperaChave());
        assertEquals(2, ((MeuItem)v[2]).recuperaChave());
        assertEquals(3, ((MeuItem)v[3]).recuperaChave());
        assertEquals(4, ((MeuItem)v[4]).recuperaChave());
        assertEquals(5, ((MeuItem)v[5]).recuperaChave());
    }
    
    @Test(timeout=1000)
    public void testShellSort() throws Exception {
        Item[] v = new Item[6];
        v[0] = null;
        v[1] = new MeuItem(3);
        v[2] = new MeuItem(1);
        v[3] = new MeuItem(5);
        v[4] = new MeuItem(2);
        v[5] = new MeuItem(4);
        
        Ordenacao.shellsort(v, 5);
        
        assertEquals(1, ((MeuItem)v[1]).recuperaChave());
        assertEquals(2, ((MeuItem)v[2]).recuperaChave());
        assertEquals(3, ((MeuItem)v[3]).recuperaChave());
        assertEquals(4, ((MeuItem)v[4]).recuperaChave());
        assertEquals(5, ((MeuItem)v[5]).recuperaChave());
    }
    
    @Test(timeout=1000)
    public void testQuicksort() throws Exception {
        Item[] v = new Item[6];
        v[0] = null;
        v[1] = new MeuItem(3);
        v[2] = new MeuItem(1);
        v[3] = new MeuItem(5);
        v[4] = new MeuItem(2);
        v[5] = new MeuItem(4);
        
        Ordenacao.quicksort(v, 5);
        
        assertEquals(1, ((MeuItem)v[1]).recuperaChave());
        assertEquals(2, ((MeuItem)v[2]).recuperaChave());
        assertEquals(3, ((MeuItem)v[3]).recuperaChave());
        assertEquals(4, ((MeuItem)v[4]).recuperaChave());
        assertEquals(5, ((MeuItem)v[5]).recuperaChave());
    }
    
    @Test(timeout=1000)
    public void testHeapsort() throws Exception {
        Item[] v = new Item[6];
        v[0] = null;
        v[1] = new MeuItem(3);
        v[2] = new MeuItem(1);
        v[3] = new MeuItem(5);
        v[4] = new MeuItem(2);
        v[5] = new MeuItem(4);
        
        Ordenacao.heapsort(v, 5);
        
        assertEquals(1, ((MeuItem)v[1]).recuperaChave());
        assertEquals(2, ((MeuItem)v[2]).recuperaChave());
        assertEquals(3, ((MeuItem)v[3]).recuperaChave());
        assertEquals(4, ((MeuItem)v[4]).recuperaChave());
        assertEquals(5, ((MeuItem)v[5]).recuperaChave());
    }
}