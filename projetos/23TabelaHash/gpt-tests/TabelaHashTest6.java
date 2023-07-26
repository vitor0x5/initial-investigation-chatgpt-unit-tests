package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class TabelaHashTest6{


    @Test(expected = Exception.class, timeout = 1000)
    public void testDefaultConstructor() throws Exception {
        TabelaHash tabelaHash = new TabelaHash();
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testPesquisa() throws Exception {
        TabelaHash tabelaHash = new TabelaHash();
        assertNull(tabelaHash.pesquisa("chave_inexistente"));
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testInsere() throws Exception {
        TabelaHash tabelaHash = new TabelaHash();
        tabelaHash.insere("chave_nova", "item_novo");
        assertEquals("item_novo", tabelaHash.pesquisa("chave_nova"));
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testRetira() throws Exception {
        TabelaHash tabelaHash = new TabelaHash();
        tabelaHash.insere("chave_nova", "item_novo");
        tabelaHash.retira("chave_nova");
        assertNull(tabelaHash.pesquisa("chave_nova"));
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testRecuperaItens() throws Exception {
        TabelaHash tabelaHash = new TabelaHash();
        tabelaHash.insere("chave1", "item1");
        tabelaHash.insere("chave2", "item2");
        Object[] itens = tabelaHash.recuperaItens();
        assertEquals(2, itens.length);
        assertArrayEquals(new Object[]{"item1", "item2"}, itens);
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testImprime() throws Exception {
        TabelaHash tabelaHash = new TabelaHash();
        tabelaHash.insere("chave1", "item1");
        tabelaHash.insere("chave2", "item2");
        tabelaHash.imprime();
    }

}