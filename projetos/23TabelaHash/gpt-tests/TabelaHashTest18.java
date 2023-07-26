package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class TabelaHashTest18{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        TabelaHash tabela = new TabelaHash();
    }

    @Test(timeout=1000)
    public void testPesquisa() throws Exception {
        TabelaHash tabela = new TabelaHash();
        Object item = tabela.pesquisa("chave");
        assertNull(item);
    }

    @Test(timeout=1000)
    public void testInsere() throws Exception {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("chave", "item");
        Object item = tabela.pesquisa("chave");
        assertEquals("item", item);
    }

    @Test(timeout=1000)
    public void testRetira() throws Exception {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("chave", "item");
        tabela.retira("chave");
        Object item = tabela.pesquisa("chave");
        assertNull(item);
    }

    @Test(timeout=1000)
    public void testRecuperaItens() throws Exception {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("chave1", "item1");
        tabela.insere("chave2", "item2");
        Object[] itens = tabela.recuperaItens();
        assertEquals(2, itens.length);
        assertEquals("item1", itens[0]);
        assertEquals("item2", itens[1]);
    }

    @Test(timeout=1000)
    public void testImprime() throws Exception {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("chave1", "item1");
        tabela.insere("chave2", "item2");
        tabela.imprime();
    }
}