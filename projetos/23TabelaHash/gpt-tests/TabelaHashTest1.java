package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class TabelaHashTest1{


    // Test for default constructor
    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        TabelaHash tabela = new TabelaHash();
        assertNotNull(tabela);
    }

    // Test for pesquisa method with valid input
    @Test(timeout=1000)
    public void testPesquisaValidInput() throws Exception {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("chave1", "item1");
        assertEquals("item1", tabela.pesquisa("chave1"));
    }

    // Test for pesquisa method with invalid input
    @Test(timeout=1000)
    public void testPesquisaInvalidInput() throws Exception {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("chave1", "item1");
        assertNull(tabela.pesquisa("chave2"));
    }

    // Test for insere method with valid input
    @Test(timeout=1000)
    public void testInsereValidInput() throws Exception {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("chave1", "item1");
        assertEquals("item1", tabela.pesquisa("chave1"));
    }

    // Test for insere method with invalid input
    @Test(timeout=1000)
    public void testInsereInvalidInput() throws Exception {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("chave1", "item1");
        tabela.insere("chave1", "item2");
        assertEquals("item1", tabela.pesquisa("chave1"));
    }

    // Test for retira method with valid input
    @Test(timeout=1000)
    public void testRetiraValidInput() throws Exception {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("chave1", "item1");
        tabela.retira("chave1");
        assertNull(tabela.pesquisa("chave1"));
    }

    // Test for retira method with invalid input
    @Test(timeout=1000, expected=Exception.class)
    public void testRetiraInvalidInput() throws Exception {
        TabelaHash tabela = new TabelaHash();
        tabela.retira("chave1");
    }

    // Test for recuperaItens method
    @Test(timeout=1000)
    public void testRecuperaItens() throws Exception {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("chave1", "item1");
        tabela.insere("chave2", "item2");
        Object[] items = tabela.recuperaItens();
        assertEquals(2, items.length);
    }

    // Test for imprime method
    @Test(timeout=1000)
    public void testImprime() throws Exception {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("chave1", "item1");
        tabela.insere("chave2", "item2");
        tabela.imprime();
    }
}