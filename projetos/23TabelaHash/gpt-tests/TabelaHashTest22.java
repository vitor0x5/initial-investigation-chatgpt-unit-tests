package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class TabelaHashTest22{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        TabelaHash tabela = new TabelaHash();
        assertNotNull(tabela);
    }

    @Test(timeout=1000)
    public void testPesquisa() throws Exception {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("chave1", "item1");
        tabela.insere("chave2", "item2");
        tabela.insere("chave3", "item3");
        tabela.insere("chave4", "item4");
        tabela.insere("chave5", "item5");

        Object item = tabela.pesquisa("chave1");
        assertEquals("item1", item);

        item = tabela.pesquisa("chave2");
        assertEquals("item2", item);

        item = tabela.pesquisa("chave3");
        assertEquals("item3", item);

        item = tabela.pesquisa("chave4");
        assertEquals("item4", item);

        item = tabela.pesquisa("chave5");
        assertEquals("item5", item);

        item = tabela.pesquisa("chave6");
        assertNull(item);
    }

    @Test(timeout=1000)
    public void testInsere() throws Exception {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("chave1", "item1");
        tabela.insere("chave2", "item2");
        tabela.insere("chave3", "item3");
        tabela.insere("chave4", "item4");
        tabela.insere("chave5", "item5");

        Object item = tabela.pesquisa("chave1");
        assertEquals("item1", item);

        item = tabela.pesquisa("chave2");
        assertEquals("item2", item);

        item = tabela.pesquisa("chave3");
        assertEquals("item3", item);

        item = tabela.pesquisa("chave4");
        assertEquals("item4", item);

        item = tabela.pesquisa("chave5");
        assertEquals("item5", item);
    }

    @Test(timeout=1000)
    public void testRetira() throws Exception {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("chave1", "item1");
        tabela.insere("chave2", "item2");
        tabela.insere("chave3", "item3");
        tabela.insere("chave4", "item4");
        tabela.insere("chave5", "item5");

        tabela.retira("chave1");
        Object item = tabela.pesquisa("chave1");
        assertNull(item);

        tabela.retira("chave2");
        item = tabela.pesquisa("chave2");
        assertNull(item);

        tabela.retira("chave3");
        item = tabela.pesquisa("chave3");
        assertNull(item);

        tabela.retira("chave4");
        item = tabela.pesquisa("chave4");
        assertNull(item);

        tabela.retira("chave5");
        item = tabela.pesquisa("chave5");
        assertNull(item);
    }

    @Test(timeout=1000)
    public void testRecuperaItens() throws Exception {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("chave1", "item1");
        tabela.insere("chave2", "item2");
        tabela.insere("chave3", "item3");
        tabela.insere("chave4", "item4");
        tabela.insere("chave5", "item5");

        Object[] itens = tabela.recuperaItens();
        assertEquals(5, itens.length);

        assertEquals("item1", itens[0]);
        assertEquals("item2", itens[1]);
        assertEquals("item3", itens[2]);
        assertEquals("item4", itens[3]);
        assertEquals("item5", itens[4]);
    }

    @Test(timeout=1000)
    public void testImprime() throws Exception {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("chave1", "item1");
        tabela.insere("chave2", "item2");
        tabela.insere("chave3", "item3");
        tabela.insere("chave4", "item4");
        tabela.insere("chave5", "item5");

        tabela.imprime();
    }
}