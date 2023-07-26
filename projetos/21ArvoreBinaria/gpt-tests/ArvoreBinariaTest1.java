package ds;import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class ArvoreBinariaTest1{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        ArvoreBinaria arvore = new ArvoreBinaria();
        assertNotNull(arvore);
    }

    @Test(timeout=1000)
    public void testPesquisa() throws Exception {
        ArvoreBinaria arvore = new ArvoreBinaria();
        Item item1 = new MeuItem(5);
        arvore.insere(item1);
        Item item2 = arvore.pesquisa(item1);
        assertNotNull(item2);
        assertEquals(item1, item2);
    }

    @Test(timeout=1000)
    public void testInsere() throws Exception {
        ArvoreBinaria arvore = new ArvoreBinaria();
        Item item1 = new MeuItem(5);
        arvore.insere(item1);
        Item item2 = arvore.pesquisa(item1);
        assertNotNull(item2);
        assertEquals(item1, item2);
    }

    @Test(timeout=1000)
    public void testRetira() throws Exception {
        ArvoreBinaria arvore = new ArvoreBinaria();
        Item item1 = new MeuItem(5);
        arvore.insere(item1);
        arvore.retira(item1);
        Item item2 = arvore.pesquisa(item1);
        assertNull(item2);
    }
}