package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class TabelaHashTest21{


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

        Object item1 = tabela.pesquisa("chave1");
        assertNotNull(item1);

        Object item2 = tabela.pesquisa("chave2");
        assertNotNull(item2);

        Object item3 = tabela.pesquisa("chave3");
        assertNotNull(item3);

        Object item4 = tabela.pesquisa("chave4");
        assertNull(item4);
    }

    @Test(timeout=1000)
    public void testInsere() throws Exception {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("chave1", "item1");
        tabela.insere("chave2", "item2");
        tabela.insere("chave3", "item3");

        Object item1 = tabela.pesquisa("chave1");
        assertNotNull(item1);

        Object item2 = tabela.pesquisa("chave2");
        assertNotNull(item2);

        Object item3 = tabela.pesquisa("chave3");
        assertNotNull(item3);

        Object item4 = tabela.pesquisa("chave4");
        assertNull(item4);
    }

    @Test(timeout=1000)
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
    }

    @Test(timeout=1000)
    public void testRecuperaItens() throws Exception {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("chave1", "item1");
        tabela.insere("chave2", "item2");
        tabela.insere("chave3", "item3");

        Object[] itens = tabela.recuperaItens();
        assertEquals(3, itens.length);
    }

    @Test(timeout=1000)
    public void testImprime() throws Exception {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("chave1", "item1");
        tabela.insere("chave2", "item2");
        tabela.insere("chave3", "item3");

        tabela.imprime();
    }
}