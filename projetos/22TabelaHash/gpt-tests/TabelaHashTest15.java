package ds;import org.junit.Test;
import static org.junit.Assert.*;
import java.io.*;

public class TabelaHashTest15{


    @Test(timeout = 1000)
    public void testDefaultConstructor() throws Exception {
        TabelaHash tabelaHash = new TabelaHash();
        assertNotNull(tabelaHash);
    }

    @Test(timeout = 1000)
    public void testPesquisa() throws Exception {
        TabelaHash tabelaHash = new TabelaHash();
        tabelaHash.insere("key1", "value1");
        tabelaHash.insere("key2", "value2");
        tabelaHash.insere("key3", "value3");

        assertEquals("value1", tabelaHash.pesquisa("key1"));
        assertEquals("value2", tabelaHash.pesquisa("key2"));
        assertEquals("value3", tabelaHash.pesquisa("key3"));
        assertNull(tabelaHash.pesquisa("key4"));
    }

    @Test(timeout = 1000)
    public void testInsere() throws Exception {
        TabelaHash tabelaHash = new TabelaHash();
        tabelaHash.insere("key1", "value1");
        tabelaHash.insere("key2", "value2");
        tabelaHash.insere("key3", "value3");

        assertEquals("value1", tabelaHash.pesquisa("key1"));
        assertEquals("value2", tabelaHash.pesquisa("key2"));
        assertEquals("value3", tabelaHash.pesquisa("key3"));
    }

    @Test(timeout = 1000)
    public void testRetira() throws Exception {
        TabelaHash tabelaHash = new TabelaHash();
        tabelaHash.insere("key1", "value1");
        tabelaHash.insere("key2", "value2");
        tabelaHash.insere("key3", "value3");

        tabelaHash.retira("key2");
        assertNull(tabelaHash.pesquisa("key2"));
        assertEquals("value1", tabelaHash.pesquisa("key1"));
        assertEquals("value3", tabelaHash.pesquisa("key3"));
    }

    @Test(timeout = 1000)
    public void testImprime() throws Exception {
        TabelaHash tabelaHash = new TabelaHash();
        tabelaHash.insere("key1", "value1");
        tabelaHash.insere("key2", "value2");
        tabelaHash.insere("key3", "value3");

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        tabelaHash.imprime();
        String expectedOutput = "Entrada: 0\n  value1\nEntrada: 1\n  value2\nEntrada: 2\n  value3\n";
        assertEquals(expectedOutput, outContent.toString());
    }
}