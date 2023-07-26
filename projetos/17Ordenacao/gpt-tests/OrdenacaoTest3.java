package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class OrdenacaoTest3{

    
    @Test(timeout=1000, expected=Exception.class)
    public void testDefaultConstructor() throws Exception {
        Ordenacao ordenacao = new Ordenacao();
    }
    
    @Test(timeout=1000, expected=Exception.class)
    public void testRefaz() throws Exception {
        Item[] v = new Item[6];
        v[1] = new MeuItem(5);
        v[2] = new MeuItem(3);
        v[3] = new MeuItem(8);
        v[4] = new MeuItem(1);
        v[5] = new MeuItem(9);
        FPHeapMax heap = new FPHeapMax(v);
        
        heap.refaz(2, 4);
    }
    
    @Test(timeout=1000, expected=Exception.class)
    public void testConstroi() throws Exception {
        Item[] v = new Item[6];
        v[1] = new MeuItem(5);
        v[2] = new MeuItem(3);
        v[3] = new MeuItem(8);
        v[4] = new MeuItem(1);
        v[5] = new MeuItem(9);
        FPHeapMax heap = new FPHeapMax(v);
        
        heap.constroi();
    }
    
    @Test(timeout=1000, expected=Exception.class)
    public void testSelecao() throws Exception {
        Item[] v = new Item[6];
        v[1] = new MeuItem(5);
        v[2] = new MeuItem(3);
        v[3] = new MeuItem(8);
        v[4] = new MeuItem(1);
        v[5] = new MeuItem(9);
        
        Ordenacao.selecao(v, 5);
    }
    
    @Test(timeout=1000, expected=Exception.class)
    public void testInsercao() throws Exception {
        Item[] v = new Item[6];
        v[1] = new MeuItem(5);
        v[2] = new MeuItem(3);
        v[3] = new MeuItem(8);
        v[4] = new MeuItem(1);
        v[5] = new MeuItem(9);
        
        Ordenacao.insercao(v, 5);
    }
    
    @Test(timeout=1000, expected=Exception.class)
    public void testShellsort() throws Exception {
        Item[] v = new Item[6];
        v[1] = new MeuItem(5);
        v[2] = new MeuItem(3);
        v[3] = new MeuItem(8);
        v[4] = new MeuItem(1);
        v[5] = new MeuItem(9);
        
        Ordenacao.shellsort(v, 5);
    }
    
    @Test(timeout=1000, expected=Exception.class)
    public void testQuicksort() throws Exception {
        Item[] v = new Item[6];
        v[1] = new MeuItem(5);
        v[2] = new MeuItem(3);
        v[3] = new MeuItem(8);
        v[4] = new MeuItem(1);
        v[5] = new MeuItem(9);
        
        Ordenacao.quicksort(v, 5);
    }
    
    @Test(timeout=1000, expected=Exception.class)
    public void testHeapsort() throws Exception {
        Item[] v = new Item[6];
        v[1] = new MeuItem(5);
        v[2] = new MeuItem(3);
        v[3] = new MeuItem(8);
        v[4] = new MeuItem(1);
        v[5] = new MeuItem(9);
        
        Ordenacao.heapsort(v, 5);
    }
}