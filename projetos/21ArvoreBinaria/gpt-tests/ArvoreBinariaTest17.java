package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class ArvoreBinariaTest17{


    @Test(expected = NullPointerException.class, timeout = 1000)
    public void testDefaultConstructor() {
        ArvoreBinaria arvore = new ArvoreBinaria();
    }

    @Test(expected = NullPointerException.class, timeout = 1000)
    public void testPesquisa() {
        ArvoreBinaria arvore = new ArvoreBinaria();
        Item item = new MeuItem(10);
        arvore.insere(item);
        Item result = arvore.pesquisa(item);
        assertEquals(item, result);
    }

    @Test(expected = NullPointerException.class, timeout = 1000)
    public void testInsere() {
        ArvoreBinaria arvore = new ArvoreBinaria();
        Item item = new MeuItem(10);
        arvore.insere(item);
        Item result = arvore.pesquisa(item);
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
        Item item2 = new MeuItem(20);
        arvore.insere(item1);
        arvore.insere(item2);
        arvore.testa();
    }
}