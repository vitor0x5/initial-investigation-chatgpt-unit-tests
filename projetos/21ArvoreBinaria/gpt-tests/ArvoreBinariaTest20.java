package ds;import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import java.util.Arrays;
import java.util.Collection;
import ds.ArvoreBinaria;
import ds.Item;
import ds.MeuItem;

@RunWith(Parameterized.class)
public class ArvoreBinariaTest20{

    
    private ArvoreBinaria arvore;
    private Item item;
    
    
    @Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][] { { new MeuItem(1) }, { new MeuItem(-1) } };
        return Arrays.asList(data);
    }
    
    @Test(timeout=1000)
    public void testDefaultConstructor() {
        assertNotNull(arvore);
    }
    
    @Test(timeout=1000)
    public void testPesquisa() {
        assertNull(arvore.pesquisa(item));
    }
    
    @Test(timeout=1000)
    public void testInsere() {
        arvore.insere(item);
        assertNotNull(arvore.pesquisa(item));
    }
    
    @Test(timeout=1000)
    public void testRetira() {
        arvore.insere(item);
        arvore.retira(item);
        assertNull(arvore.pesquisa(item));
    }
    
    @Test(timeout=1000)
    public void testTesta() {
        arvore.testa();
    }
}