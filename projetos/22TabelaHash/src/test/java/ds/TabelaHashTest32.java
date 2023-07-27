package ds;import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.io.RandomAccessFile;

public class TabelaHashTest32{


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

        assertEquals("item1", tabela.pesquisa("chave1"));
        assertEquals("item2", tabela.pesquisa("chave2"));
        assertEquals("item3", tabela.pesquisa("chave3"));
        assertNull(tabela.pesquisa("chave4"));
    }

    @Test(timeout=1000)
    public void testInsere() throws Exception {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("chave1", "item1");
        tabela.insere("chave2", "item2");
        tabela.insere("chave3", "item3");

        assertEquals("item1", tabela.pesquisa("chave1"));
        assertEquals("item2", tabela.pesquisa("chave2"));
        assertEquals("item3", tabela.pesquisa("chave3"));
    }

    @Test(timeout=1000)
    public void testRetira() throws Exception {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("chave1", "item1");
        tabela.insere("chave2", "item2");
        tabela.insere("chave3", "item3");

        tabela.retira("chave2");
        assertNull(tabela.pesquisa("chave2"));
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