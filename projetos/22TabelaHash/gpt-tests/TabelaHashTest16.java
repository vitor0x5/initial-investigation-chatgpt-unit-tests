package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class TabelaHashTest16{


    @Test(timeout=1000)
    public void testDefaultConstructor() {
        try {
            TabelaHash tabela = new TabelaHash();
            assertNotNull(tabela);
        } catch (Exception e) {
            fail("Exception thrown");
        }
    }

    @Test(timeout=1000)
    public void testPesquisa() {
        try {
            TabelaHash tabela = new TabelaHash();
            tabela.insere("key1", "value1");
            tabela.insere("key2", "value2");
            
            Object result1 = tabela.pesquisa("key1");
            Object result2 = tabela.pesquisa("key2");
            Object result3 = tabela.pesquisa("key3");
            
            assertNotNull(result1);
            assertNotNull(result2);
            assertNull(result3);
        } catch (Exception e) {
            fail("Exception thrown");
        }
    }

    @Test(timeout=1000)
    public void testInsere() {
        try {
            TabelaHash tabela = new TabelaHash();
            tabela.insere("key1", "value1");
            
            Object result = tabela.pesquisa("key1");
            
            assertNotNull(result);
        } catch (Exception e) {
            fail("Exception thrown");
        }
    }

    @Test(timeout=1000)
    public void testRetira() {
        try {
            TabelaHash tabela = new TabelaHash();
            tabela.insere("key1", "value1");
            
            tabela.retira("key1");
            
            Object result = tabela.pesquisa("key1");
            
            assertNull(result);
        } catch (Exception e) {
            fail("Exception thrown");
        }
    }

    @Test(timeout=1000)
    public void testImprime() {
        try {
            TabelaHash tabela = new TabelaHash();
            tabela.insere("key1", "value1");
            tabela.insere("key2", "value2");
            
            tabela.imprime();
        } catch (Exception e) {
            fail("Exception thrown");
        }
    }
}