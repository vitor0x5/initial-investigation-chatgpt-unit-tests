package ds;import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Random;
import java.io.*;

public class TabelaHashTest8{


    private TabelaHash tabela;

    @Before
    public void setUp() {
        tabela = new TabelaHash();
    }

    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        assertNotNull(tabela);
    }

    @Test(timeout=1000)
    public void testPesquisaEmptyTable() throws Exception {
        assertNull(tabela.pesquisa("chave"));
    }

    @Test(timeout=1000)
    public void testInsereAndPesquisa() throws Exception {
        Object item = "item";
        tabela.insere("chave", item);
        assertEquals(item, tabela.pesquisa("chave"));
    }

    @Test(timeout=1000)
    public void testInsereDuplicate() throws Exception {
        String chave = "chave";
        Object item1 = "item1";
        Object item2 = "item2";
        tabela.insere(chave, item1);
        tabela.insere(chave, item2);
        assertEquals(item1, tabela.pesquisa(chave));
    }

    @Test(timeout=1000)
    public void testRetiraNotFound() throws Exception {
        try {
            tabela.retira("chave");
            fail("Exception not thrown");
        } catch (Exception e) {
            assertEquals("Registro nao esta presente", e.getMessage());
        }
    }

    @Test(timeout=1000)
    public void testRetira() throws Exception {
        String chave = "chave";
        Object item = "item";
        tabela.insere(chave, item);
        tabela.retira(chave);
        assertNull(tabela.pesquisa(chave));
    }

    @Test(timeout=1000)
    public void testImprime() throws Exception {
        String chave1 = "chave1";
        String chave2 = "chave2";
        Object item1 = "item1";
        Object item2 = "item2";
        tabela.insere(chave1, item1);
        tabela.insere(chave2, item2);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        tabela.imprime();
        String expectedOutput = "Entrada: 0\n  item1\nEntrada: 1\n  item2\n";
        assertEquals(expectedOutput, outContent.toString());
    }
}