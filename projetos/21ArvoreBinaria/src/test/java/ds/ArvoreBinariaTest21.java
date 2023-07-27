package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class ArvoreBinariaTest21{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        ArvoreBinaria arvore = new ArvoreBinaria();
        assertNotNull(arvore);
    }

    @Test(timeout=1000)
    public void testPesquisa() throws Exception {
        ArvoreBinaria arvore = new ArvoreBinaria();
        Item item1 = new MeuItem(10);
        Item item2 = new MeuItem(20);
        Item item3 = new MeuItem(30);
        arvore.insere(item1);
        arvore.insere(item2);
        arvore.insere(item3);
        Item result = arvore.pesquisa(item2);
        assertEquals(item2, result);
    }

    @Test(timeout=1000)
    public void testInsere() throws Exception {
        ArvoreBinaria arvore = new ArvoreBinaria();
        Item item1 = new MeuItem(10);
        Item item2 = new MeuItem(20);
        Item item3 = new MeuItem(30);
        arvore.insere(item1);
        arvore.insere(item2);
        arvore.insere(item3);
        Item result = arvore.pesquisa(item2);
        assertEquals(item2, result);
    }

    @Test(timeout=1000)
    public void testRetira() throws Exception {
        ArvoreBinaria arvore = new ArvoreBinaria();
        Item item1 = new MeuItem(10);
        Item item2 = new MeuItem(20);
        Item item3 = new MeuItem(30);
        arvore.insere(item1);
        arvore.insere(item2);
        arvore.insere(item3);
        arvore.retira(item2);
        Item result = arvore.pesquisa(item2);
        assertNull(result);
    }

    @Test(timeout=1000)
    public void testTesta() throws Exception {
        ArvoreBinaria arvore = new ArvoreBinaria();
        Item item1 = new MeuItem(10);
        Item item2 = new MeuItem(20);
        Item item3 = new MeuItem(30);
        arvore.insere(item1);
        arvore.insere(item2);
        arvore.insere(item3);
        arvore.testa();
    }
}