package ds;import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import java.io.*;

public class ArvoreBinariaTest31{


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
    public void testPesquisa() {
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
    public void testInsere() {
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
    public void testRetira() {
        Item item1 = new MeuItem(10);
        Item item2 = new MeuItem(20);
        Item item3 = new MeuItem(30);

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
    public void testTesta() {
        Item item1 = new MeuItem(10);
        Item item2 = new MeuItem(20);
        Item item3 = new MeuItem(30);

        arvore.insere(item1);
        arvore.insere(item2);
        arvore.insere(item3);

        arvore.testa();
    }
}