package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class TabelaHashTest8{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        TabelaHash tabelaHash = new TabelaHash();
        assertNotNull(tabelaHash);
    }

    @Test(timeout=1000)
    public void testInsere() throws Exception {
        TabelaHash tabelaHash = new TabelaHash();
        tabelaHash.insere("key1", "item1");
        tabelaHash.insere("key2", "item2");
        tabelaHash.insere("key3", "item3");
        tabelaHash.insere("key4", "item4");

        assertEquals("item1", tabelaHash.pesquisa("key1"));
        assertEquals("item2", tabelaHash.pesquisa("key2"));
        assertEquals("item3", tabelaHash.pesquisa("key3"));
        assertEquals("item4", tabelaHash.pesquisa("key4"));
    }

    @Test(timeout=1000)
    public void testRetira() throws Exception {
        TabelaHash tabelaHash = new TabelaHash();
        tabelaHash.insere("key1", "item1");
        tabelaHash.insere("key2", "item2");
        tabelaHash.insere("key3", "item3");
        tabelaHash.insere("key4", "item4");

        tabelaHash.retira("key1");
        assertNull(tabelaHash.pesquisa("key1"));
        
        tabelaHash.retira("key2");
        assertNull(tabelaHash.pesquisa("key2"));
    }

    @Test(timeout=1000)
    public void testRecuperaItens() throws Exception {
        TabelaHash tabelaHash = new TabelaHash();
        tabelaHash.insere("key1", "item1");
        tabelaHash.insere("key2", "item2");
        tabelaHash.insere("key3", "item3");
        tabelaHash.insere("key4", "item4");

        Object[] items = tabelaHash.recuperaItens();
        
        assertEquals(4, items.length);
        assertArrayEquals(new String[] {"item1", "item2", "item3", "item4"}, items);
    }

    @Test(timeout=1000)
    public void testImprime() throws Exception {
        TabelaHash tabelaHash = new TabelaHash();
        tabelaHash.insere("key1", "item1");
        tabelaHash.insere("key2", "item2");
        tabelaHash.insere("key3", "item3");
        tabelaHash.insere("key4", "item4");

        tabelaHash.imprime();
    }
}