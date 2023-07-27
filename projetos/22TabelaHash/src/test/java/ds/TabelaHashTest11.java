package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class TabelaHashTest11{


    // Test for the default constructor
    @Test(timeout=1000)
    public void testDefaultConstructor() {
        try {
            TabelaHash tabelaHash = new TabelaHash();
            assertNotNull(tabelaHash);
        } catch (Exception e) {
            fail("Exception should not be thrown");
        }
    }
    
    // Test for method pesquisa
    @Test(timeout=1000)
    public void testPesquisa() {
        try {
            TabelaHash tabelaHash = new TabelaHash();
            Object item = tabelaHash.pesquisa("abc");
            assertNull(item);
        } catch (Exception e) {
            fail("Exception should not be thrown");
        }
    }
    
    // Test for method insere
    @Test(timeout=1000)
    public void testInsere() {
        try {
            TabelaHash tabelaHash = new TabelaHash();
            tabelaHash.insere("abc", new Object());
            Object item = tabelaHash.pesquisa("abc");
            assertNotNull(item);
        } catch (Exception e) {
            fail("Exception should not be thrown");
        }
    }
    
    // Test for method retira
    @Test(timeout=1000)
    public void testRetira() {
        try {
            TabelaHash tabelaHash = new TabelaHash();
            tabelaHash.insere("abc", new Object());
            tabelaHash.retira("abc");
            Object item = tabelaHash.pesquisa("abc");
            assertNull(item);
        } catch (Exception e) {
            fail("Exception should not be thrown");
        }
    }
    
    // Test for method imprime
    @Test(timeout=1000)
    public void testImprime() {
        try {
            TabelaHash tabelaHash = new TabelaHash();
            tabelaHash.insere("abc", new Object());
            tabelaHash.insere("def" ,new Object());
            tabelaHash.insere("ghi", new Object());
            tabelaHash.imprime();
        } catch (Exception e) {
            fail("Exception should not be thrown");
        }
    }
}