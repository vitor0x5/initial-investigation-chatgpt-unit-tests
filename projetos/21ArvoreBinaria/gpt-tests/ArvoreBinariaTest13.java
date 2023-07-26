package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class ArvoreBinariaTest13{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        ArvoreBinaria arvore = new ArvoreBinaria();
        assertNotNull(arvore);
    }

    @Test(timeout=1000)
    public void testPesquisa() throws Exception {
        ArvoreBinaria arvore = new ArvoreBinaria();
        Item item1 = new MeuItem(1);
        Item item2 = new MeuItem(2);
        Item item3 = new MeuItem(3);

        arvore.insere(item1);
        arvore.insere(item2);
        arvore.insere(item3);

        Item result = arvore.pesquisa(item2);
        assertEquals(item2, result);
    }

    @Test(timeout=1000)
    public void testInsere() throws Exception {
        ArvoreBinaria arvore = new ArvoreBinaria();
        Item item1 = new MeuItem(1);
        Item item2 = new MeuItem(2);
        Item item3 = new MeuItem(3);

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
    public void testRetira() throws Exception {
        ArvoreBinaria arvore = new ArvoreBinaria();
        Item item1 = new MeuItem(1);
        Item item2 = new MeuItem(2);
        Item item3 = new MeuItem(3);

        arvore.insere(item1);
        arvore.insere(item2);
        arvore.insere(item3);

        arvore.retira(item2);

        Item result1 = arvore.pesquisa(item1);
        Item result2 = arvore.pesquisa(item2);
        Item result3 = arvore.pesquisa(item3);

        assertEquals(item1, result1);
        assertNull(result2);
        assertEquals(item3, result3);
    }

    @Test(timeout=1000)
    public void testBoundaryValues() throws Exception {
        ArvoreBinaria arvore = new ArvoreBinaria();
        Item item1 = new MeuItem(Integer.MAX_VALUE);
        Item item2 = new MeuItem(Integer.MIN_VALUE);

        arvore.insere(item1);
        arvore.insere(item2);

        Item result1 = arvore.pesquisa(item1);
        Item result2 = arvore.pesquisa(item2);

        assertEquals(item1, result1);
        assertEquals(item2, result2);
    }
}