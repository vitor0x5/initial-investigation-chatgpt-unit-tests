package ds;import org.junit.Test;
import static org.junit.Assert.*;

//import statements for Item and FPHeapMax classes go here

public class OrdenacaoTest8{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Ordenacao ordenacao = new Ordenacao();
        assertNotNull(ordenacao);
    }
    
    @Test(timeout=1000)
    public void testRefaz_True() throws Exception {
        Item[] v = new Item[5];
        v[1] = new MeuItem(10);
        v[2] = new MeuItem(15);
        v[3] = new MeuItem(5);
        v[4] = new MeuItem(20);
        FPHeapMax fpHeap = new FPHeapMax(v);
        fpHeap.refaz(1, 3);
        assertEquals(20, ((MeuItem)v[1]).recuperaChave());
    }
    
    @Test(timeout=1000)
    public void testRefaz_False() throws Exception {
        Item[] v = new Item[5];
        v[1] = new MeuItem(10);
        v[2] = new MeuItem(15);
        v[3] = new MeuItem(5);
        v[4] = new MeuItem(20);
        FPHeapMax fpHeap = new FPHeapMax(v);
        fpHeap.refaz(1, 3);
        assertEquals(10, ((MeuItem)v[2]).recuperaChave());
    }
    
    @Test(timeout=1000)
    public void testConstroi() throws Exception {
        Item[] v = new Item[5];
        v[1] = new MeuItem(10);
        v[2] = new MeuItem(15);
        v[3] = new MeuItem(5);
        v[4] = new MeuItem(20);
        FPHeapMax fpHeap = new FPHeapMax(v);
        fpHeap.constroi();
        assertEquals(20, ((MeuItem)v[1]).recuperaChave());
    }
    
    //tests for other methods in the Ordenacao class go here
    
}