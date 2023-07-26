package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class TabelaHashTest26{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        TabelaHash tabelaHash = new TabelaHash();
        assertNotNull(tabelaHash);
    }


    @Test(timeout=1000)
    public void testPesquisa() throws Exception {
        TabelaHash tabelaHash = new TabelaHash();
        tabelaHash.insere("chave1", "item1");
        tabelaHash.insere("chave2", "item2");
        tabelaHash.insere("chave3", "item3");

        Object item1 = tabelaHash.pesquisa("chave1");
        assertEquals("item1", item1);

        Object item2 = tabelaHash.pesquisa("chave2");
        assertEquals("item2", item2);

        Object item3 = tabelaHash.pesquisa("chave3");
        assertEquals("item3", item3);

        Object item4 = tabelaHash.pesquisa("chave4");
        assertNull(item4);
    }

    @Test(timeout=1000)
    public void testInsere() throws Exception {
        TabelaHash tabelaHash = new TabelaHash();
        tabelaHash.insere("chave1", "item1");
        tabelaHash.insere("chave2", "item2");
        tabelaHash.insere("chave3", "item3");

        Object item1 = tabelaHash.pesquisa("chave1");
        assertEquals("item1", item1);

        Object item2 = tabelaHash.pesquisa("chave2");
        assertEquals("item2", item2);

        Object item3 = tabelaHash.pesquisa("chave3");
        assertEquals("item3", item3);

        tabelaHash.insere("chave4", "item4");
        Object item4 = tabelaHash.pesquisa("chave4");
        assertEquals("item4", item4);

        tabelaHash.insere("chave1", "item5");
        Object item5 = tabelaHash.pesquisa("chave1");
        assertEquals("item1", item5);
    }

    @Test(timeout=1000)
    public void testRetira() throws Exception {
        TabelaHash tabelaHash = new TabelaHash();
        tabelaHash.insere("chave1", "item1");
        tabelaHash.insere("chave2", "item2");
        tabelaHash.insere("chave3", "item3");

        tabelaHash.retira("chave2");
        Object item2 = tabelaHash.pesquisa("chave2");
        assertNull(item2);

        tabelaHash.retira("chave4");
        Object item4 = tabelaHash.pesquisa("chave4");
        assertNull(item4);
    }

    @Test(timeout=1000)
    public void testRecuperaItens() throws Exception {
        TabelaHash tabelaHash = new TabelaHash();
        tabelaHash.insere("chave1", "item1");
        tabelaHash.insere("chave2", "item2");
        tabelaHash.insere("chave3", "item3");

        Object[] itens = tabelaHash.recuperaItens();
        assertEquals(3, itens.length);
        assertEquals("item1", itens[0]);
        assertEquals("item2", itens[1]);
        assertEquals("item3", itens[2]);

        tabelaHash.retira("chave2");
        Object[] itens2 = tabelaHash.recuperaItens();
        assertEquals(2, itens2.length);
        assertEquals("item1", itens2[0]);
        assertEquals("item3", itens2[1]);
    }

    @Test(timeout=1000)
    public void testImprime() throws Exception {
        TabelaHash tabelaHash = new TabelaHash();
        tabelaHash.insere("chave1", "item1");
        tabelaHash.insere("chave2", "item2");
        tabelaHash.insere("chave3", "item3");

        tabelaHash.imprime();
    }
}