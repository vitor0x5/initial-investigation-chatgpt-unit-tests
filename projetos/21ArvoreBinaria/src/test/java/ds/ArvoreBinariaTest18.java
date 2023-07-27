package ds;import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import java.io.*;
import ds.*;

public class ArvoreBinariaTest18{


    private ArvoreBinaria arvore;

    @Before
    public void setUp() throws Exception {
        arvore = new ArvoreBinaria();
    }

    @After
    public void tearDown() throws Exception {
        arvore = null;
    }

    @Test(timeout=1000)
    public void testDefaultConstructor() {
        assertNotNull(arvore);
    }

    @Test(timeout=1000)
    public void testInsere() {
        Item item1 = new MeuItem(5);
        Item item2 = new MeuItem(10);
        Item item3 = new MeuItem(3);

        arvore.insere(item1);
        arvore.insere(item2);
        arvore.insere(item3);

        assertNotNull(arvore.pesquisa(item1));
        assertNotNull(arvore.pesquisa(item2));
        assertNotNull(arvore.pesquisa(item3));
    }

    @Test(timeout=1000)
    public void testRetira() {
        Item item1 = new MeuItem(5);
        Item item2 = new MeuItem(10);
        Item item3 = new MeuItem(3);

        arvore.insere(item1);
        arvore.insere(item2);
        arvore.insere(item3);

        arvore.retira(item1);
        assertNull(arvore.pesquisa(item1));

        arvore.retira(item2);
        assertNull(arvore.pesquisa(item2));

        arvore.retira(item3);
        assertNull(arvore.pesquisa(item3));
    }

    @Test(timeout=1000)
    public void testPesquisa() {
        Item item1 = new MeuItem(5);
        Item item2 = new MeuItem(10);
        Item item3 = new MeuItem(3);

        arvore.insere(item1);
        arvore.insere(item2);
        arvore.insere(item3);

        assertNotNull(arvore.pesquisa(item1));
        assertNotNull(arvore.pesquisa(item2));
        assertNotNull(arvore.pesquisa(item3));
    }

    @Test(timeout=1000)
    public void testTesta() {
        Item item1 = new MeuItem(5);
        Item item2 = new MeuItem(10);
        Item item3 = new MeuItem(3);

        arvore.insere(item1);
        arvore.insere(item2);
        arvore.insere(item3);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        arvore.testa();

        String expectedOutput = "";
        assertEquals(expectedOutput, outContent.toString());
    }
}