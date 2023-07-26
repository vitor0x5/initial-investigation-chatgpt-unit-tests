package ds;import org.junit.Test;
import static org.junit.Assert.*;
import java.io.*;

public class TabelaHashTest6{


    // Test for the default constructor
    @Test(timeout=1000)
    public void testDefaultConstructor() {
        TabelaHash tabelaHash = new TabelaHash();
        assertNotNull(tabelaHash);
    }

    // Test for method pesquisa when the table is empty
    @Test(timeout=1000)
    public void testPesquisaEmptyTable() {
        TabelaHash tabelaHash = new TabelaHash();
        assertNull(tabelaHash.pesquisa("chave"));
    }

    // Test for method pesquisa when the table is not empty but the entry is not found
    @Test(timeout=1000)
    public void testPesquisaEntryNotFound() {
        TabelaHash tabelaHash = new TabelaHash();
        tabelaHash.insere("chave1", "item1");
        tabelaHash.insere("chave2", "item2");
        assertNull(tabelaHash.pesquisa("chave3"));
    }

    // Test for method pesquisa when the entry is found
    @Test(timeout=1000)
    public void testPesquisaEntryFound() {
        TabelaHash tabelaHash = new TabelaHash();
        tabelaHash.insere("chave1", "item1");
        tabelaHash.insere("chave2", "item2");
        assertEquals("item1", tabelaHash.pesquisa("chave1"));
    }

    // Test for method insere when the entry is not already present
    @Test(timeout=1000)
    public void testInsereEntryNotPresent() {
        TabelaHash tabelaHash = new TabelaHash();
        tabelaHash.insere("chave1", "item1");
        tabelaHash.insere("chave2", "item2");
        assertEquals("item2", tabelaHash.pesquisa("chave2"));
    }

    // Test for method insere when the entry is already present
    @Test(timeout=1000)
    public void testInsereEntryAlreadyPresent() {
        TabelaHash tabelaHash = new TabelaHash();
        tabelaHash.insere("chave1", "item1");
        tabelaHash.insere("chave2", "item2");
        tabelaHash.insere("chave1", "item3");
        assertEquals("item1", tabelaHash.pesquisa("chave1"));
    }

    // Test for method retira when the entry is not present
    @Test(timeout=1000)
    public void testRetiraEntryNotPresent() throws Exception {
        TabelaHash tabelaHash = new TabelaHash();
        tabelaHash.insere("chave1", "item1");
        tabelaHash.insere("chave2", "item2");
        tabelaHash.retira("chave3");
        assertEquals("item1", tabelaHash.pesquisa("chave1"));
    }

    // Test for method retira when the entry is present
    @Test(timeout=1000)
    public void testRetiraEntryPresent() throws Exception {
        TabelaHash tabelaHash = new TabelaHash();
        tabelaHash.insere("chave1", "item1");
        tabelaHash.insere("chave2", "item2");
        tabelaHash.retira("chave1");
        assertNull(tabelaHash.pesquisa("chave1"));
    }

    // Test for method imprime when the table is empty
    @Test(timeout=1000)
    public void testImprimeEmptyTable() {
        TabelaHash tabelaHash = new TabelaHash();
        tabelaHash.imprime();
    }

    // Test for method imprime when the table is not empty
    @Test(timeout=1000)
    public void testImprimeNonEmptyTable() {
        TabelaHash tabelaHash = new TabelaHash();
        tabelaHash.insere("chave1", "item1");
        tabelaHash.insere("chave2", "item2");
        tabelaHash.imprime();
    }
}