package ds;import org.junit.Test;
import static org.junit.Assert.*;
import java.io.*;

public class ArvoreBinariaTest9{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        ArvoreBinaria tree = new ArvoreBinaria();
        assertNotNull(tree);
    }

    @Test(timeout=1000)
    public void testPesquisa() throws Exception {
        ArvoreBinaria tree = new ArvoreBinaria();
        Item item1 = new MeuItem(10);
        Item item2 = new MeuItem(5);
        Item item3 = new MeuItem(15);
        Item item4 = new MeuItem(20);

        assertNull(tree.pesquisa(item1));

        tree.insere(item1);
        tree.insere(item2);
        tree.insere(item3);
        tree.insere(item4);

        assertEquals(item1, tree.pesquisa(item1));
        assertEquals(null, tree.pesquisa(null));
    }

    @Test(timeout=1000)
    public void testInsere() throws Exception {
        ArvoreBinaria tree = new ArvoreBinaria();
        Item item1 = new MeuItem(10);
        Item item2 = new MeuItem(20);
        Item item3 = new MeuItem(5);

        tree.insere(item1);
        tree.insere(item2);

        assertEquals(item1, tree.pesquisa(item1));
        assertEquals(item2, tree.pesquisa(item2));
        assertEquals(null, tree.pesquisa(item3));
    }

    @Test(timeout=1000)
    public void testRetira() throws Exception {
        ArvoreBinaria tree = new ArvoreBinaria();
        Item item1 = new MeuItem(10);
        Item item2 = new MeuItem(5);
        Item item3 = new MeuItem(15);
        Item item4 = new MeuItem(20);

        assertNull(tree.pesquisa(item1));

        tree.insere(item1);
        tree.insere(item2);
        tree.insere(item3);
        tree.insere(item4);

        assertNotNull(tree.pesquisa(item1));

        tree.retira(item1);

        assertNull(tree.pesquisa(item1));
    }
}