package ds;import org.junit.Test;
import static org.junit.Assert.*;

import java.io.IOException;
import java.io.RandomAccessFile;

public class TabelaHashTest28{


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

    @Test(timeout=1000)
    public void testMeuItemConstructor() throws Exception {
        MeuItem item = new MeuItem(10);
        assertNotNull(item);
    }

    @Test(timeout=1000)
    public void testMeuItemCompara() throws Exception {
        MeuItem item1 = new MeuItem(10);
        MeuItem item2 = new MeuItem(20);
        MeuItem item3 = new MeuItem(10);

        assertEquals(-1, item1.compara(item2));
        assertEquals(1, item2.compara(item1));
        assertEquals(0, item1.compara(item3));
    }

    @Test(timeout=1000)
    public void testMeuItemAlteraChave() throws Exception {
        MeuItem item = new MeuItem(10);
        item.alteraChave(20);
        assertEquals(20, item.recuperaChave());
    }

    @Test(timeout=1000)
    public void testMeuItemRecuperaChave() throws Exception {
        MeuItem item = new MeuItem(10);
        assertEquals(10, item.recuperaChave());
    }

    @Test(timeout=1000)
    public void testMeuItemToString() throws Exception {
        MeuItem item = new MeuItem(10);
        assertEquals("10", item.toString());
    }

    @Test(timeout=1000)
    public void testMeuItemGravaArq() throws Exception {
        MeuItem item = new MeuItem(10);
        RandomAccessFile arq = new RandomAccessFile("test.txt", "rw");
        item.gravaArq(arq);
        arq.close();
    }

    @Test(timeout=1000)
    public void testMeuItemLeArq() throws Exception {
        MeuItem item = new MeuItem(10);
        RandomAccessFile arq = new RandomAccessFile("test.txt", "rw");
        item.leArq(arq);
        arq.close();
    }

    @Test(timeout=1000)
    public void testMeuItemTamanho() throws Exception {
        assertEquals(4, MeuItem.tamanho());
    }
}