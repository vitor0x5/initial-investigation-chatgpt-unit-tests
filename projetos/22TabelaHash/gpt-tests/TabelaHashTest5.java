package ds;import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class TabelaHashTest5{


    private TabelaHash tabela;

    @Before
    public void setUp() throws Exception {
        tabela = new TabelaHash();
    }

    @Test(timeout=1000)
    public void testDefaultConstructor() {
        assertNotNull(tabela);
    }

    @Test(timeout=1000)
    public void testPesquisa() {
        tabela.insere("chave1", "item1");
        assertEquals("item1", tabela.pesquisa("chave1"));
        assertNull(tabela.pesquisa("chave2"));
    }

    @Test(timeout=1000)
    public void testInsere() {
        tabela.insere("chave1", "item1");
        assertEquals("item1", tabela.pesquisa("chave1"));
    }

    @Test(timeout=1000)
    public void testInsereDuplicate() {
        tabela.insere("chave1", "item1");
        tabela.insere("chave1", "item2");
        assertEquals("item1", tabela.pesquisa("chave1"));
    }

    @Test(timeout=1000)
    public void testRetira() throws Exception {
        tabela.insere("chave1", "item1");
        tabela.retira("chave1");
        assertNull(tabela.pesquisa("chave1"));
    }

    @Test(timeout=1000)
    public void testRetiraNonexistent() throws Exception {
        tabela.insere("chave1", "item1");
        tabela.retira("chave2");
        assertNotNull(tabela.pesquisa("chave1"));
    }

    @Test(timeout=1000)
    public void testImprime() {
        tabela.insere("chave1", "item1");
        tabela.insere("chave2", "item2");
        tabela.insere("chave3", "item3");
        tabela.imprime();
    }
}