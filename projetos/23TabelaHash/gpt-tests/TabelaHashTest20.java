package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class TabelaHashTest20{


    @Test(expected = Exception.class, timeout = 1000)
    public void testDefaultConstructor() throws Exception {
        TabelaHash tabela = new TabelaHash();
    }

    @Test(timeout = 1000)
    public void testPesquisa() throws Exception {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("chave1", "item1");
        tabela.insere("chave2", "item2");
        tabela.insere("chave3", "item3");

        Object item1 = tabela.pesquisa("chave1");
        assertEquals("item1", item1);

        Object item2 = tabela.pesquisa("chave2");
        assertEquals("item2", item2);

        Object item3 = tabela.pesquisa("chave3");
        assertEquals("item3", item3);

        Object item4 = tabela.pesquisa("chave4");
        assertNull(item4);
    }

    @Test(timeout = 1000)
    public void testInsere() throws Exception {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("chave1", "item1");
        tabela.insere("chave2", "item2");
        tabela.insere("chave3", "item3");

        Object item1 = tabela.pesquisa("chave1");
        assertEquals("item1", item1);

        Object item2 = tabela.pesquisa("chave2");
        assertEquals("item2", item2);

        Object item3 = tabela.pesquisa("chave3");
        assertEquals("item3", item3);

        tabela.insere("chave1", "item4");
        Object item4 = tabela.pesquisa("chave1");
        assertEquals("item1", item4);

        tabela.insere("chave4", "item4");
        Object item5 = tabela.pesquisa("chave4");
        assertEquals("item4", item5);
    }

    @Test(timeout = 1000)
    public void testRetira() throws Exception {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("chave1", "item1");
        tabela.insere("chave2", "item2");
        tabela.insere("chave3", "item3");

        tabela.retira("chave1");
        Object item1 = tabela.pesquisa("chave1");
        assertNull(item1);

        tabela.retira("chave2");
        Object item2 = tabela.pesquisa("chave2");
        assertNull(item2);

        tabela.retira("chave3");
        Object item3 = tabela.pesquisa("chave3");
        assertNull(item3);

        tabela.retira("chave4");
        Object item4 = tabela.pesquisa("chave4");
        assertNull(item4);
    }

    @Test(timeout = 1000)
    public void testRecuperaItens() throws Exception {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("chave1", "item1");
        tabela.insere("chave2", "item2");
        tabela.insere("chave3", "item3");

        Object[] itens = tabela.recuperaItens();
        assertEquals(3, itens.length);
        assertEquals("item1", itens[0]);
        assertEquals("item2", itens[1]);
        assertEquals("item3", itens[2]);

        tabela.retira("chave1");
        Object[] itens2 = tabela.recuperaItens();
        assertEquals(2, itens2.length);
        assertEquals("item2", itens2[0]);
        assertEquals("item3", itens2[1]);
    }

    @Test(timeout = 1000)
    public void testImprime() throws Exception {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("chave1", "item1");
        tabela.insere("chave2", "item2");
        tabela.insere("chave3", "item3");

        tabela.imprime();
    }
}