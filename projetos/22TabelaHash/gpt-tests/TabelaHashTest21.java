package ds;import org.junit.Test;
import static org.junit.Assert.*;

import java.io.IOException;
import java.io.RandomAccessFile;

public class TabelaHashTest21{


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

        tabela.retira("key2");
        assertNull(tabela.pesquisa("key2"));
    }

    @Test(timeout=1000)
    public void testImprime() throws Exception {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("key1", "value1");
        tabela.insere("key2", "value2");
        tabela.insere("key3", "value3");

        tabela.imprime();
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
    public void testGeraPesos() throws Exception {
        TabelaHash tabela = new TabelaHash();
        int[] pesos = tabela.geraPesos(5);
        assertEquals(5, pesos.length);
    }

    @Test(timeout=1000)
    public void testH() throws Exception {
        TabelaHash tabela = new TabelaHash();
        int[] pesos = {1, 2, 3, 4, 5};
        assertEquals(0, tabela.h("key1", pesos));
        assertEquals(1, tabela.h("key2", pesos));
        assertEquals(3, tabela.h("key3", pesos));
    }

    @Test(timeout=1000)
    public void testMeuItem() throws Exception {
        MeuItem item = new MeuItem(10);
        assertEquals(0, item.compara(new MeuItem(10)));
        item.alteraChave(20);
        assertEquals(1, item.compara(new MeuItem(10)));
        assertEquals(20, item.recuperaChave());
        assertEquals("20", item.toString());

        RandomAccessFile arq = new RandomAccessFile("test.txt", "rw");
        item.gravaArq(arq);
        arq.seek(0);
        MeuItem item2 = new MeuItem(0);
        item2.leArq(arq);
        assertEquals(20, item2.recuperaChave());
        arq.close();
    }

    @Test(timeout=1000)
    public void testLista() throws Exception {
        Lista lista = new Lista();
        assertTrue(lista.vazia());

        lista.insere("value1");
        lista.insere("value2");
        lista.insere("value3");

        assertFalse(lista.vazia());
        assertTrue(lista.estaNaLista("value1"));
        assertTrue(lista.estaNaLista("value2"));
        assertTrue(lista.estaNaLista("value3"));
        assertFalse(lista.estaNaLista("value4"));

        assertEquals("value1", lista.primeiro());
        assertEquals("value2", lista.proximo());
        assertEquals("value3", lista.proximo());

        assertEquals("value1", lista.retiraPrimeiro());
        assertFalse(lista.vazia());
        assertEquals("value2", lista.primeiro());
        assertEquals("value3", lista.proximo());

        assertEquals("value2", lista.retira("value2"));
        assertFalse(lista.vazia());
        assertEquals("value3", lista.primeiro());
        assertNull(lista.proximo());
    }
}