package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class TabelaHashTest17{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        TabelaHash tabelaHash = new TabelaHash();
        assertNotNull(tabelaHash);
    }

    @Test(timeout=1000)
    public void testPesquisa() throws Exception {
        TabelaHash tabelaHash = new TabelaHash();
        tabelaHash.insere("key1", "value1");
        tabelaHash.insere("key2", "value2");
        tabelaHash.insere("key3", "value3");

        Object result1 = tabelaHash.pesquisa("key1");
        assertEquals("value1", result1);

        Object result2 = tabelaHash.pesquisa("key2");
        assertEquals("value2", result2);

        Object result3 = tabelaHash.pesquisa("key3");
        assertEquals("value3", result3);

        Object result4 = tabelaHash.pesquisa("key4");
        assertNull(result4);
    }

    @Test(timeout=1000)
    public void testInsere() throws Exception {
        TabelaHash tabelaHash = new TabelaHash();
        tabelaHash.insere("key1", "value1");
        tabelaHash.insere("key2", "value2");
        tabelaHash.insere("key3", "value3");

        Object result1 = tabelaHash.pesquisa("key1");
        assertEquals("value1", result1);

        Object result2 = tabelaHash.pesquisa("key2");
        assertEquals("value2", result2);

        Object result3 = tabelaHash.pesquisa("key3");
        assertEquals("value3", result3);

        tabelaHash.insere("key1", "newValue1");
        Object result4 = tabelaHash.pesquisa("key1");
        assertEquals("value1", result4);
    }

    @Test(timeout=1000)
    public void testRetira() throws Exception {
        TabelaHash tabelaHash = new TabelaHash();
        tabelaHash.insere("key1", "value1");
        tabelaHash.insere("key2", "value2");
        tabelaHash.insere("key3", "value3");

        tabelaHash.retira("key1");
        Object result1 = tabelaHash.pesquisa("key1");
        assertNull(result1);

        tabelaHash.retira("key2");
        Object result2 = tabelaHash.pesquisa("key2");
        assertNull(result2);

        tabelaHash.retira("key3");
        Object result3 = tabelaHash.pesquisa("key3");
        assertNull(result3);
    }

    @Test(timeout=1000)
    public void testRecuperaItens() throws Exception {
        TabelaHash tabelaHash = new TabelaHash();
        tabelaHash.insere("key1", "value1");
        tabelaHash.insere("key2", "value2");
        tabelaHash.insere("key3", "value3");

        Object[] result = tabelaHash.recuperaItens();
        assertEquals(3, result.length);
        assertEquals("value1", result[0]);
        assertEquals("value2", result[1]);
        assertEquals("value3", result[2]);

        tabelaHash.retira("key2");
        Object[] result2 = tabelaHash.recuperaItens();
        assertEquals(2, result2.length);
        assertEquals("value1", result2[0]);
        assertEquals("value3", result2[1]);
    }

    @Test(timeout=1000)
    public void testImprime() throws Exception {
        TabelaHash tabelaHash = new TabelaHash();
        tabelaHash.insere("key1", "value1");
        tabelaHash.insere("key2", "value2");
        tabelaHash.insere("key3", "value3");

        tabelaHash.imprime();
    }
}