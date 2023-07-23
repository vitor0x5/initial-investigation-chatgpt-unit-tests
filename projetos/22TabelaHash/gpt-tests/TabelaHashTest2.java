package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class TabelaHashTest2{


    @Test
    public void testPesquisa() {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("chave1", "item1");
        tabela.insere("chave2", "item2");
        tabela.insere("chave3", "item3");

        assertEquals("item1", tabela.pesquisa("chave1"));
        assertEquals("item2", tabela.pesquisa("chave2"));
        assertEquals("item3", tabela.pesquisa("chave3"));
        assertNull(tabela.pesquisa("chave4"));
    }

    @Test
    public void testInsere() {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("chave1", "item1");
        tabela.insere("chave2", "item2");

        assertEquals("item1", tabela.pesquisa("chave1"));
        assertEquals("item2", tabela.pesquisa("chave2"));
    }

    @Test
    public void testInsereDuplicate() {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("chave1", "item1");

        tabela.insere("chave1", "item2");

        assertEquals("item1", tabela.pesquisa("chave1"));
    }

    @Test
    public void testRetira() throws Exception {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("chave1", "item1");
        tabela.insere("chave2", "item2");

        tabela.retira("chave1");

        assertNull(tabela.pesquisa("chave1"));
        assertEquals("item2", tabela.pesquisa("chave2"));
    }

    @Test(expected = Exception.class)
    public void testRetiraInvalidKey() throws Exception {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("chave1", "item1");

        tabela.retira("chave2");
    }

}
