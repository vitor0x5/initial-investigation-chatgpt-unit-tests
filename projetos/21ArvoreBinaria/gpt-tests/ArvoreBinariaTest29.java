package ds;import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import java.io.*;

public class ArvoreBinariaTest29{


    private ArvoreBinaria arvore;

    @Before
    public void setUp() {
        arvore = new ArvoreBinaria();
    }

    @Test(timeout=1000)
    public void testDefaultConstructor() {
        assertNotNull(arvore);
    }

    @Test(timeout=1000)
    public void testInsere() {
        Item item1 = new MeuItem(10);
        Item item2 = new MeuItem(5);
        Item item3 = new MeuItem(15);

        arvore.insere(item1);
        arvore.insere(item2);
        arvore.insere(item3);

        assertNotNull(arvore.pesquisa(item1));
        assertNotNull(arvore.pesquisa(item2));
        assertNotNull(arvore.pesquisa(item3));
    }

    @Test(timeout=1000)
    public void testRetira() {
        Item item1 = new MeuItem(10);
        Item item2 = new MeuItem(5);
        Item item3 = new MeuItem(15);

        arvore.insere(item1);
        arvore.insere(item2);
        arvore.insere(item3);

        arvore.retira(item2);

        assertNull(arvore.pesquisa(item2));
    }

    @Test(timeout=1000)
    public void testPesquisa() {
        Item item1 = new MeuItem(10);
        Item item2 = new MeuItem(5);
        Item item3 = new MeuItem(15);

        arvore.insere(item1);
        arvore.insere(item2);
        arvore.insere(item3);

        assertNotNull(arvore.pesquisa(item1));
        assertNotNull(arvore.pesquisa(item2));
        assertNotNull(arvore.pesquisa(item3));
    }

    @Test(timeout=1000)
    public void testCentral() {
        Item item1 = new MeuItem(10);
        Item item2 = new MeuItem(5);
        Item item3 = new MeuItem(15);

        arvore.insere(item1);
        arvore.insere(item2);
        arvore.insere(item3);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        arvore.central(arvore.raiz);

        String expectedOutput = "5\n10\n15\n";
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test(timeout=1000)
    public void testAntecessor() {
        Item item1 = new MeuItem(10);
        Item item2 = new MeuItem(5);
        Item item3 = new MeuItem(15);

        arvore.insere(item1);
        arvore.insere(item2);
        arvore.insere(item3);

        ArvoreBinaria.No no = arvore.raiz;
        ArvoreBinaria.No antecessor = arvore.antecessor(no, no.esq);

        assertNotNull(antecessor);
    }

    @Test(timeout=1000)
    public void testRetiraNotFound() {
        Item item1 = new MeuItem(10);
        Item item2 = new MeuItem(5);
        Item item3 = new MeuItem(15);

        arvore.insere(item1);
        arvore.insere(item2);
        arvore.insere(item3);

        Item item4 = new MeuItem(20);
        arvore.retira(item4);

        assertNotNull(arvore.pesquisa(item1));
        assertNotNull(arvore.pesquisa(item2));
        assertNotNull(arvore.pesquisa(item3));
    }

    @Test(timeout=1000)
    public void testTesta() {
        Item item1 = new MeuItem(10);
        Item item2 = new MeuItem(5);
        Item item3 = new MeuItem(15);

        arvore.insere(item1);
        arvore.insere(item2);
        arvore.insere(item3);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        arvore.testa(arvore.raiz);

        String expectedOutput = "";
        assertEquals(expectedOutput, outContent.toString());
    }
}