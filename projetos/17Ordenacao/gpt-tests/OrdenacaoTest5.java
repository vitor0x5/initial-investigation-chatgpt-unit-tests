package ds;import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Arrays;
import ds.Ordenacao;
import ds.Item;
import ds.FPHeapMax;

public class OrdenacaoTest5{


    // Test for default constructor
    @Test(expected = Exception.class, timeout = 1000)
    public void testDefaultConstructor() throws Exception {
        Ordenacao ordenacao = new Ordenacao();
    }
  
    // Test for refaz() method
    @Test(expected = Exception.class, timeout = 1000)
    public void testRefaz() throws Exception {
        Item[] v = {null, new MeuItem(1), new MeuItem(2), new MeuItem(3), new MeuItem(4)};
        FPHeapMax fpHeapMax = new FPHeapMax(v);
        fpHeapMax.refaz(1, 4);
    }
  
    // Test for constroi() method
    @Test(expected = Exception.class, timeout = 1000)
    public void testConstroi() throws Exception {
        Item[] v = {null, new MeuItem(4), new MeuItem(3), new MeuItem(2), new MeuItem(1)};
        FPHeapMax fpHeapMax = new FPHeapMax(v);
        fpHeapMax.constroi();
    }
  
    // Test for selecao() method
    @Test(expected = Exception.class, timeout = 1000)
    public void testSelecao() throws Exception {
        Item[] v = {null, new MeuItem(4), new MeuItem(3), new MeuItem(2), new MeuItem(1)};
        int n = 4;
        Ordenacao.selecao(v, n);
    }
  
    // Test for insercao() method
    @Test(expected = Exception.class, timeout = 1000)
    public void testInsercao() throws Exception {
        Item[] v = {null, new MeuItem(4), new MeuItem(3), new MeuItem(2), new MeuItem(1)};
        int n = 4;
        Ordenacao.insercao(v, n);
    }
  
    // Test for shellsort() method
    @Test(expected = Exception.class, timeout = 1000)
    public void testShellsort() throws Exception {
        Item[] v = {null, new MeuItem(4), new MeuItem(3), new MeuItem(2), new MeuItem(1)};
        int n = 4;
        Ordenacao.shellsort(v, n);
    }

    // Test for quicksort() method
    @Test(expected = Exception.class, timeout = 1000)
    public void testQuicksort() throws Exception {
        Item[] v = {null, new MeuItem(4), new MeuItem(3), new MeuItem(2), new MeuItem(1)};
        int n = 4;
        Ordenacao.quicksort(v, n);
    }
  
    // Test for heapsort() method
    @Test(expected = Exception.class, timeout = 1000)
    public void testHeapsort() throws Exception {
        Item[] v = {null, new MeuItem(4), new MeuItem(3), new MeuItem(2), new MeuItem(1)};
        int n = 4;
        Ordenacao.heapsort(v, n);
    }
  
    // Test for MeuItem class
    @Test(expected = Exception.class, timeout = 1000)
    public void testMeuItem() throws Exception {
        MeuItem meuItem = new MeuItem(1);
    }
}