package ds;import static org.junit.Assert.*;
import org.junit.Test;
import java.io.IOException;
import java.io.RandomAccessFile;

public class TabelaHashTest26{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        TabelaHash tabela = new TabelaHash();
        assertNotNull(tabela);
    }

    @Test(timeout=1000)
    public void testPesquisa() throws Exception {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("key1", "value1");
        tabela.insere("key2", "value2");
        tabela.insere("key3", "value3");

        assertEquals("value1", tabela.pesquisa("key1"));
        assertEquals("value2", tabela.pesquisa("key2"));
        assertEquals("value3", tabela.pesquisa("key3"));
        assertNull(tabela.pesquisa("key4"));
    }

    @Test(timeout=1000)
    public void testInsere() throws Exception {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("key1", "value1");
        tabela.insere("key2", "value2");
        tabela.insere("key3", "value3");

        assertEquals("value1", tabela.pesquisa("key1"));
        assertEquals("value2", tabela.pesquisa("key2"));
        assertEquals("value3", tabela.pesquisa("key3"));
    }

    @Test(timeout=1000)
    public void testRetira() throws Exception {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("key1", "value1");
        tabela.insere("key2", "value2");
        tabela.insere("key3", "value3");

        tabela.retira("key1");
        assertNull(tabela.pesquisa("key1"));
        assertEquals("value2", tabela.pesquisa("key2"));
        assertEquals("value3", tabela.pesquisa("key3"));

        tabela.retira("key2");
        assertNull(tabela.pesquisa("key2"));
        assertEquals("value3", tabela.pesquisa("key3"));

        tabela.retira("key3");
        assertNull(tabela.pesquisa("key3"));
    }
}