package ds;import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import java.io.*;

public class ArvoreBinariaTest25{

    private ArvoreBinaria arvore;

    @Before
    public void setUp() {
        arvore = new ArvoreBinaria();
    }

    @After
    public void tearDown() {
        arvore = null;
    }

    @Test(timeout=1000)
    public void testDefaultConstructor() {
        assertNotNull(arvore);
    }

    @Test(timeout=1000)
    public void testInsere() {
        Item item1 = new MeuItem(10);
        arvore.insere(item1);
        assertNotNull(arvore.pesquisa(item1));

        Item item2 = new MeuItem(-5);
        arvore.insere(item2);
        assertNotNull(arvore.pesquisa(item2));

        Item item3 = new MeuItem(0);
        arvore.insere(item3);
        assertNotNull(arvore.pesquisa(item3));
    }

    @Test(timeout=1000)
    public void testPesquisa() {
        Item item1 = new MeuItem(10);
        arvore.insere(item1);
        assertEquals(item1, arvore.pesquisa(item1));

        Item item2 = new MeuItem(-5);
        arvore.insere(item2);
        assertEquals(item2, arvore.pesquisa(item2));

        Item item3 = new MeuItem(0);
        arvore.insere(item3);
        assertEquals(item3, arvore.pesquisa(item3));
    }

    @Test(timeout=1000)
    public void testRetira() {
        Item item1 = new MeuItem(10);
        arvore.insere(item1);
        arvore.retira(item1);
        assertNull(arvore.pesquisa(item1));

        Item item2 = new MeuItem(-5);
        arvore.insere(item2);
        arvore.retira(item2);
        assertNull(arvore.pesquisa(item2));

        Item item3 = new MeuItem(0);
        arvore.insere(item3);
        arvore.retira(item3);
        assertNull(arvore.pesquisa(item3));
    }

    @Test(timeout=1000)
    public void testBoundaryValues() {
        Item item1 = new MeuItem(Integer.MAX_VALUE);
        arvore.insere(item1);
        assertEquals(item1, arvore.pesquisa(item1));

        Item item2 = new MeuItem(Integer.MIN_VALUE);
        arvore.insere(item2);
        assertEquals(item2, arvore.pesquisa(item2));
    }
}