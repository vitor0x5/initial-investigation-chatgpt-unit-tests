package ds;import org.junit.Test;
import static org.junit.Assert.*;

import java.io.IOException;
import java.io.RandomAccessFile;

public class TabelaHashTest12{


    @Test(timeout=1000)
    public void testDefaultConstructor() {
        TabelaHash tabela = new TabelaHash();
        assertNotNull(tabela);
    }

    @Test(timeout=1000)
    public void testMetodoPesquisa() {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("chave1", "item1");
        tabela.insere("chave2", "item2");

        Object item1 = tabela.pesquisa("chave1");
        assertEquals("item1", item1);

        Object item2 = tabela.pesquisa("chave2");
        assertEquals("item2", item2);

        Object item3 = tabela.pesquisa("chave3");
        assertNull(item3);
    }

    @Test(timeout=1000)
    public void testMetodoInsere() {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("chave1", "item1");
        tabela.insere("chave2", "item2");

        Object item1 = tabela.pesquisa("chave1");
        assertEquals("item1", item1);

        Object item2 = tabela.pesquisa("chave2");
        assertEquals("item2", item2);
    }

    @Test(timeout=1000)
    public void testMetodoRetira() throws Exception {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("chave1", "item1");
        tabela.insere("chave2", "item2");

        tabela.retira("chave1");
        Object item1 = tabela.pesquisa("chave1");
        assertNull(item1);

        tabela.retira("chave2");
        Object item2 = tabela.pesquisa("chave2");
        assertNull(item2);
    }

    @Test(timeout=1000)
    public void testMetodoImprime() {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("chave1", "item1");
        tabela.insere("chave2", "item2");

        tabela.imprime();
    }
}