package ds;import static org.junit.Assert.*;
import org.junit.Test;

import java.io.IOException;
import java.io.RandomAccessFile;

public class TabelaHashTest4{


    // Test for default constructor
    @Test(timeout=1000)
    public void testDefaultConstructor() {
        TabelaHash tabelaHash = new TabelaHash();
        assertNotNull(tabelaHash);
    }

    // Test for method pesquisa with null key
    @Test(expected=NullPointerException.class, timeout=1000)
    public void testPesquisaNullKey() {
        TabelaHash tabelaHash = new TabelaHash();
        tabelaHash.pesquisa(null);
    }

    // Test for method pesquisa with empty table
    @Test(timeout=1000)
    public void testPesquisaEmptyTable() {
        TabelaHash tabelaHash = new TabelaHash();
        assertNull(tabelaHash.pesquisa("key"));
    }

    // Test for method pesquisa with existing key
    @Test(timeout=1000)
    public void testPesquisaExistingKey() {
        TabelaHash tabelaHash = new TabelaHash();
        tabelaHash.insere("key", "item");
        assertEquals("item", tabelaHash.pesquisa("key"));
    }

    // Test for method insere with existing key
    @Test(timeout=1000)
    public void testInsereExistingKey() {
        TabelaHash tabelaHash = new TabelaHash();
        tabelaHash.insere("key", "item1");
        tabelaHash.insere("key", "item2");
        assertEquals("item1", tabelaHash.pesquisa("key"));
    }

    // Test for method insere with non-existing key
    @Test(timeout=1000)
    public void testInsereNonExistingKey() {
        TabelaHash tabelaHash = new TabelaHash();
        tabelaHash.insere("key1", "item1");
        tabelaHash.insere("key2", "item2");
        assertEquals("item1", tabelaHash.pesquisa("key1"));
        assertEquals("item2", tabelaHash.pesquisa("key2"));
    }

    // Test for method retira with null key
    @Test(expected=NullPointerException.class, timeout=1000)
    public void testRetiraNullKey() throws Exception {
        TabelaHash tabelaHash = new TabelaHash();
        tabelaHash.retira(null);
    }

    // Test for method retira with non-existing key
    @Test(timeout=1000)
    public void testRetiraNonExistingKey() throws Exception {
        TabelaHash tabelaHash = new TabelaHash();
        tabelaHash.insere("key", "item");
        tabelaHash.retira("wrongkey");
        assertEquals("item", tabelaHash.pesquisa("key"));
    }

    // Test for method retira with existing key
    @Test(timeout=1000)
    public void testRetiraExistingKey() throws Exception {
        TabelaHash tabelaHash = new TabelaHash();
        tabelaHash.insere("key1", "item1");
        tabelaHash.insere("key2", "item2");
        tabelaHash.retira("key1");
        assertNull(tabelaHash.pesquisa("key1"));
        assertEquals("item2", tabelaHash.pesquisa("key2"));
    }

    // Test for method imprime

    // Test for method geraPesos
    @Test(expected=NegativeArraySizeException.class, timeout=1000)
    public void testGeraPesosNegativeSize() {
        TabelaHash tabelaHash = new TabelaHash();
        tabelaHash.geraPesos(-1);
    }

    // Test for method h

    // Test for method equals

    // Test for method toString

    // Test for method compara

    // Test for method alteraChave

    // Test for method recuperaChave

    // Test for method gravaArq
    @Test(timeout=1000)
    public void testGravaArq() throws IOException {
        TabelaHash tabelaHash = new TabelaHash();
        RandomAccessFile arq = new RandomAccessFile("test.txt", "rw");
        tabelaHash.gravaArq(arq);
        arq.close();
    }

    // Test for method leArq
    @Test(timeout=1000)
    public void testLeArq() throws IOException {
        TabelaHash tabelaHash = new TabelaHash();
        RandomAccessFile arq = new RandomAccessFile("test.txt", "rw");
        tabelaHash.leArq(arq);
        arq.close();
    }

    // Test for method tamanho
    @Test(timeout=1000)
    public void testTamanho() {
        assertEquals(4, TabelaHash.tamanho());
    }
}