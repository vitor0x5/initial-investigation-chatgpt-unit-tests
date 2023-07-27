package ds;import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import java.io.*;

public class ArvoreBinariaTest27{


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
    public void testDefaultConstructor() throws Exception {
        assertNotNull(arvore);
    }

    @Test(timeout=1000)
    public void testInsere() throws Exception {
        Item item1 = new MeuItem(10);
        arvore.insere(item1);
        assertNotNull(arvore.pesquisa(item1));
    }

    @Test(timeout=1000)
    public void testRetira() throws Exception {
        Item item1 = new MeuItem(10);
        arvore.insere(item1);
        arvore.retira(item1);
        assertNull(arvore.pesquisa(item1));
    }

    @Test(timeout=1000)
    public void testPesquisa() throws Exception {
        Item item1 = new MeuItem(10);
        arvore.insere(item1);
        assertNotNull(arvore.pesquisa(item1));
    }

    @Test(timeout=1000)
    public void testPesquisaNull() throws Exception {
        Item item1 = new MeuItem(10);
        assertNull(arvore.pesquisa(item1));
    }

    @Test(timeout=1000)
    public void testInsereDuplicate() throws Exception {
        Item item1 = new MeuItem(10);
        arvore.insere(item1);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        arvore.insere(item1);
        String expectedOutput = "Erro: Registro ja existente\n";
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test(timeout=1000)
    public void testRetiraNotFound() throws Exception {
        Item item1 = new MeuItem(10);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        arvore.retira(item1);
        String expectedOutput = "Erro: Registro nao encontrado\n";
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test(timeout=1000)
    public void testTesta() throws Exception {
        Item item1 = new MeuItem(10);
        Item item2 = new MeuItem(20);
        Item item3 = new MeuItem(30);
        arvore.insere(item2);
        arvore.insere(item1);
        arvore.insere(item3);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        arvore.testa();
        String expectedOutput = "";
        assertEquals(expectedOutput, outContent.toString());
    }
}