package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class TabelaHashTest14{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        TabelaHash tabela = new TabelaHash();
        assertNotNull(tabela);
    }

    @Test(timeout=1000)
    public void testPesquisa() throws Exception {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("key", "value");
        
        Object result = tabela.pesquisa("key");
        assertNotNull(result);
        assertEquals("value", result);
        
        result = tabela.pesquisa("invalidKey");
        assertNull(result);
    }

    @Test(timeout=1000)
    public void testInsere() throws Exception {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("key", "value");
        
        Object result = tabela.pesquisa("key");
        assertNotNull(result);
        assertEquals("value", result);
    }

    @Test(timeout=1000)
    public void testRetira() throws Exception {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("key", "value");
        
        tabela.retira("key");
        
        Object result = tabela.pesquisa("key");
        assertNull(result);
    }

    @Test(timeout=1000)
    public void testImprime() throws Exception {
        TabelaHash tabela = new TabelaHash();
        tabela.insere("key1", "value1");
        tabela.insere("key2", "value2");
        
        tabela.imprime();
    }
}