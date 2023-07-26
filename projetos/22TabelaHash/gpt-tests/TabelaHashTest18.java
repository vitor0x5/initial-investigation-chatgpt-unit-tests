package ds;import org.junit.Test;
import static org.junit.Assert.*;

import java.io.IOException;
import java.io.RandomAccessFile;

public class TabelaHashTest18{


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

        assertEquals("value1", tabela.pesquisa("key1"));
        assertEquals("value2", tabela.pesquisa("key2"));
        assertNull(tabela.pesquisa("key3"));
    }

    @Test(timeout=1000)
    public void testInsere() throws Exception {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("key1", "value1");
        tabela.insere("key2", "value2");

        assertEquals("value1", tabela.pesquisa("key1"));
        assertEquals("value2", tabela.pesquisa("key2"));
    }

    @Test(timeout=1000)
    public void testRetira() throws Exception {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("key1", "value1");
        tabela.insere("key2", "value2");

        tabela.retira("key1");
        assertNull(tabela.pesquisa("key1"));
        assertEquals("value2", tabela.pesquisa("key2"));
    }

    @Test(timeout=1000)
    public void testImprime() throws Exception {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("key1", "value1");
        tabela.insere("key2", "value2");

        tabela.imprime();
    }

    @Test(timeout=1000)
    public void testGeraPesos() throws Exception {
        TabelaHash tabela = new TabelaHash();
        int[] pesos = tabela.geraPesos(7);
        assertNotNull(pesos);
        assertEquals(7, pesos.length);
    }

    @Test(timeout=1000)
    public void testH() throws Exception {
        TabelaHash tabela = new TabelaHash();
        int[] pesos = {1, 2, 3, 4, 5, 6, 7};
        tabela.M = 7;

        assertEquals(0, tabela.h("key1", pesos));
        assertEquals(1, tabela.h("key2", pesos));
        assertEquals(2, tabela.h("key3", pesos));
        assertEquals(3, tabela.h("key4", pesos));
        assertEquals(4, tabela.h("key5", pesos));
        assertEquals(5, tabela.h("key6", pesos));
        assertEquals(6, tabela.h("key7", pesos));
    }

    @Test(timeout=1000)
    public void testCelulaEquals() throws Exception {
        TabelaHash.Celula celula1 = new TabelaHash.Celula("key1", "value1");
        TabelaHash.Celula celula2 = new TabelaHash.Celula("key1", "value2");
        TabelaHash.Celula celula3 = new TabelaHash.Celula("key2", "value1");

        assertTrue(celula1.equals(celula2));
        assertFalse(celula1.equals(celula3));
    }

    @Test(timeout=1000)
    public void testCelulaToString() throws Exception {
        TabelaHash.Celula celula = new TabelaHash.Celula("key1", "value1");
        assertEquals("  value1", celula.toString());
    }

    @Test(timeout=1000)
    public void testMeuItemConstrutor() throws Exception {
        MeuItem item = new MeuItem(1);
        assertNotNull(item);
    }

    @Test(timeout=1000)
    public void testMeuItemCompara() throws Exception {
        MeuItem item1 = new MeuItem(1);
        MeuItem item2 = new MeuItem(2);

        assertEquals(-1, item1.compara(item2));
        assertEquals(1, item2.compara(item1));
        assertEquals(0, item1.compara(item1));
    }

    @Test(timeout=1000)
    public void testMeuItemAlteraChave() throws Exception {
        MeuItem item = new MeuItem(1);
        item.alteraChave(2);
        assertEquals(2, item.recuperaChave());
    }

    @Test(timeout=1000)
    public void testMeuItemRecuperaChave() throws Exception {
        MeuItem item = new MeuItem(1);
        assertEquals(1, item.recuperaChave());
    }

    @Test(timeout=1000)
    public void testMeuItemToString() throws Exception {
        MeuItem item = new MeuItem(1);
        assertEquals("1", item.toString());
    }

    @Test(timeout=1000)
    public void testMeuItemGravaArq() throws Exception {
        MeuItem item = new MeuItem(1);
        RandomAccessFile arq = new RandomAccessFile("test.txt", "rw");

        item.gravaArq(arq);
        arq.seek(0);
        assertEquals(1, arq.readInt());
        arq.close();
    }

    @Test(timeout=1000)
    public void testMeuItemLeArq() throws Exception {
        MeuItem item = new MeuItem(1);
        RandomAccessFile arq = new RandomAccessFile("test.txt", "rw");
        arq.writeInt(2);
        arq.seek(0);

        item.leArq(arq);
        assertEquals(2, item.recuperaChave());
        arq.close();
    }

    @Test(timeout=1000)
    public void testMeuItemTamanho() throws Exception {
        assertEquals(4, MeuItem.tamanho());
    }
}