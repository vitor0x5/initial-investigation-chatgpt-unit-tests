package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class ArvoreBinariaTest19{


    @Test(expected = NullPointerException.class, timeout = 1000)
    public void testDefaultConstructor() {
        ArvoreBinaria arvore = new ArvoreBinaria();
        assertNotNull(arvore);
    }

    @Test(expected = NullPointerException.class, timeout = 1000)
    public void testPesquisa() {
        ArvoreBinaria arvore = new ArvoreBinaria();
        Item item = new MeuItem(10);
        arvore.insere(item);
        Item result = arvore.pesquisa(item);
        assertNotNull(result);
        assertEquals(item, result);
    }

    @Test(expected = NullPointerException.class, timeout = 1000)
    public void testInsere() {
        ArvoreBinaria arvore = new ArvoreBinaria();
        Item item = new MeuItem(10);
        arvore.insere(item);
        Item result = arvore.pesquisa(item);
        assertNotNull(result);
        assertEquals(item, result);
    }

    @Test(expected = NullPointerException.class, timeout = 1000)
    public void testRetira() {
        ArvoreBinaria arvore = new ArvoreBinaria();
        Item item = new MeuItem(10);
        arvore.insere(item);
        arvore.retira(item);
        Item result = arvore.pesquisa(item);
        assertNull(result);
    }

    @Test(expected = NullPointerException.class, timeout = 1000)
    public void testTesta() {
        ArvoreBinaria arvore = new ArvoreBinaria();
        Item item1 = new MeuItem(10);
        Item item2 = new MeuItem(5);
        Item item3 = new MeuItem(15);
        arvore.insere(item1);
        arvore.insere(item2);
        arvore.insere(item3);
        arvore.testa();
    }
}