package ds;import org.junit.Test;

import static org.junit.Assert.*;

public class TabelaHashTest2{


    @Test(timeout = 1000)
    public void testDefaultConstructor() {
        TabelaHash tabelaHash = new TabelaHash();
        assertNotNull(tabelaHash);
    }

    @Test(timeout = 1000)
    public void testPesquisaIndice() {
        TabelaHash tabelaHash = new TabelaHash();
        tabelaHash.insere("chave1", "item1");
        tabelaHash.insere("chave2", "item2");
        assertEquals(0, tabelaHash.pesquisaIndice("chave1"));
        assertEquals(1, tabelaHash.pesquisaIndice("chave2"));
        assertEquals(7, tabelaHash.pesquisaIndice("chave3"));
    }

    @Test(timeout = 1000)
    public void testPesquisa() {
        TabelaHash tabelaHash = new TabelaHash();
        tabelaHash.insere("chave1", "item1");
        tabelaHash.insere("chave2", "item2");
        assertEquals("item1", tabelaHash.pesquisa("chave1"));
        assertEquals("item2", tabelaHash.pesquisa("chave2"));
        assertNull(tabelaHash.pesquisa("chave3"));
    }

    @Test(timeout = 1000)
    public void testInsere() {
        TabelaHash tabelaHash = new TabelaHash();
        tabelaHash.insere("chave1", "item1");
        tabelaHash.insere("chave2", "item2");
        tabelaHash.insere("chave3", "item3");
        assertEquals("item1", tabelaHash.pesquisa("chave1"));
        assertEquals("item2", tabelaHash.pesquisa("chave2"));
        assertEquals("item3", tabelaHash.pesquisa("chave3"));
    }

    @Test(timeout = 1000)
    public void testRetira() throws Exception {
        TabelaHash tabelaHash = new TabelaHash();
        tabelaHash.insere("chave1", "item1");
        tabelaHash.insere("chave2", "item2");
        tabelaHash.retira("chave1");
        assertNull(tabelaHash.pesquisa("chave1"));
        assertEquals("item2", tabelaHash.pesquisa("chave2"));
    }

    @Test(timeout = 1000)
    public void testRecuperaItens() {
        TabelaHash tabelaHash = new TabelaHash();
        tabelaHash.insere("chave1", "item1");
        tabelaHash.insere("chave2", "item2");
        tabelaHash.insere("chave3", "item3");
        tabelaHash.retira("chave2");
        Object[] itens = tabelaHash.recuperaItens();
        assertEquals(2, itens.length);
        assertArrayEquals(new Object[]{"item1", "item3"}, itens);
    }

    @Test(timeout = 1000)
    public void testImprime() {
        TabelaHash tabelaHash = new TabelaHash();
        tabelaHash.insere("chave1", "item1");
        tabelaHash.insere("chave2", "item2");
        tabelaHash.insere("chave3", "item3");
        tabelaHash.retira("chave2");
        tabelaHash.imprime();
    }
}