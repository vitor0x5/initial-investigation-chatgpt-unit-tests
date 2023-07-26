package ds;import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.io.RandomAccessFile;

public class TabelaHashTest3{


    @Test(timeout=1000)
    public void testDefaultConstructor() {
        TabelaHash tabela = new TabelaHash();
        assertNotNull(tabela);
    }

    @Test(timeout=1000)
    public void testPesquisa() {
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
    public void testInsere() {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("chave1", "item1");
        tabela.insere("chave2", "item2");
        tabela.insere("chave3", "item3");

        assertEquals(3, tabela.getTamanho());
    }

    @Test(timeout=1000)
    public void testRetira() throws Exception {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("chave1", "item1");
        tabela.insere("chave2", "item2");
        tabela.insere("chave3", "item3");

        tabela.retira("chave1");
        assertNull(tabela.pesquisa("chave1"));
        assertEquals(2, tabela.getTamanho());
    }

    @Test(timeout=1000)
    public void testGravaArq() throws IOException {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("chave1", "item1");
        tabela.insere("chave2", "item2");
        tabela.insere("chave3", "item3");

        RandomAccessFile arq = new RandomAccessFile("test.bin", "rw");
        tabela.gravaArq(arq);
        arq.close();
    }

    @Test(timeout=1000)
    public void testLeArq() throws IOException {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("chave1", "item1");
        tabela.insere("chave2", "item2");
        tabela.insere("chave3", "item3");

        RandomAccessFile arq = new RandomAccessFile("test.bin", "rw");
        tabela.gravaArq(arq);
        arq.close();

        arq = new RandomAccessFile("test.bin", "rw");
        tabela.leArq(arq);
        arq.close();

        assertEquals(3, tabela.getTamanho());
    }
}