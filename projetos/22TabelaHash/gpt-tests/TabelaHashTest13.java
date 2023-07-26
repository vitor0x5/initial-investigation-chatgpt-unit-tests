package ds;import org.junit.Test;
import static org.junit.Assert.*;
import java.io.*;

public class TabelaHashTest13{


    @Test(expected = Exception.class)
    public void testDefaultConstructor() throws Exception {
        TabelaHash tabela = new TabelaHash();
    }

    @Test(timeout = 1000)
    public void testPesquisa() throws Exception {
        TabelaHash tabela = new TabelaHash();
        assertNull(tabela.pesquisa("chave1"));
    }

    @Test(timeout = 1000)
    public void testInsere() throws Exception {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("chave1", "item1");
        assertEquals("item1", tabela.pesquisa("chave1"));
        assertNull(tabela.pesquisa("chave2"));
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testRetira() throws Exception {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("chave1", "item1");
        tabela.retira("chave1");
        assertNull(tabela.pesquisa("chave1"));
        tabela.retira("chave2");
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