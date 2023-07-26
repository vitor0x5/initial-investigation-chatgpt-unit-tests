package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class TabelaHashTest2{


    // Test for default constructor
    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        TabelaHash tabela = new TabelaHash();
        assertNotNull(tabela);
    }

    // Test for method pesquisa
    @Test(timeout=1000)
    public void testPesquisa() throws Exception {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("chave1", "item1");
        tabela.insere("chave2", "item2");

        // Test when key is present in the table
        Object result1 = tabela.pesquisa("chave1");
        assertEquals("item1", result1);

        // Test when key is not present in the table
        Object result2 = tabela.pesquisa("chave3");
        assertNull(result2);
    }

    // Test for method insere
    @Test(timeout=1000)
    public void testInsere() throws Exception {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("chave1", "item1");

        // Test when inserting a new item
        tabela.insere("chave2", "item2");
        Object result1 = tabela.pesquisa("chave2");
        assertEquals("item2", result1);

        // Test when inserting an existing item
        tabela.insere("chave2", "item3");
        Object result2 = tabela.pesquisa("chave2");
        assertEquals("item2", result2);
    }

    // Test for method retira
    @Test(timeout=1000)
    public void testRetira() throws Exception {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("chave1", "item1");

        // Test when key is present in the table
        tabela.retira("chave1");
        Object result1 = tabela.pesquisa("chave1");
        assertNull(result1);

        // Test when key is not present in the table
        tabela.retira("chave2");
        tabela.insere("chave2", "item2");
        tabela.retira("chave2");
        Object result2 = tabela.pesquisa("chave2");
        assertNull(result2);
    }

    // Test for method imprime
    @Test(timeout=1000)
    public void testImprime() throws Exception {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("chave1", "item1");
        tabela.insere("chave2", "item2");

        tabela.imprime();
    }
}