package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class ArvoreBinariaTest16{


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
        Item result1 = arvore.pesquisa(item1);
        Item result2 = arvore.pesquisa(item2);
        Item result3 = arvore.pesquisa(item3);
        assertEquals(item1, result1);
        assertEquals(item2, result2);
        assertEquals(item3, result3);
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
        assertNotNull(arvore.pesquisa(item1));
        assertNotNull(arvore.pesquisa(item2));
        assertNotNull(arvore.pesquisa(item3));
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
        arvore.retira(item1);
        arvore.retira(item2);
        arvore.retira(item3);
        assertNull(arvore.pesquisa(item1));
        assertNull(arvore.pesquisa(item2));
        assertNull(arvore.pesquisa(item3));
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